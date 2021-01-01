(ns game.core.memory
  (:require
    [game.core.card :refer [get-card program? virus-program?]]
    [game.core.effects :refer [gather-effects sum-effects]]
    [game.core.eid :refer [make-eid]]
    [game.core.toasts :refer [toast]]))

(defn- sum-available-mu
  [state]
  (+ (or (get-in @state [:runner :memory :base]) 0)
     (sum-effects state :runner nil :user-available-mu nil)
     (sum-effects state :runner nil :available-mu nil)))

(defn- sum-non-virus-programs-mu
  [state]
  (let [eid (make-eid state)]
    (->> (gather-effects state :runner :used-mu)
         (keep #(when-let [card (get-card state (:card %))]
                  (assoc % :card card)))
         (remove #(virus-program? (:card %)))
         (filter #(if-not (:req %)
                    true
                    ((:req %) state :runner eid (:card %) nil)))
         (map #(if-not (fn? (:value %))
                           (:value %)
                           ((:value %) state :runner eid (:card %) nil)))
         (filter number?)
         (reduce +))))

(defn- sum-available-virus-mu
  [state]
  (sum-effects state :runner nil :available-virus-mu nil))

(defn- sum-virus-programs-mu
  [state]
  (let [eid (make-eid state)]
    (->> (gather-effects state :runner :used-mu)
         (map #(assoc % :card (get-card state (:card %))))
         (filter #(virus-program? (:card %)))
         (filter #(if-not (:req %)
                    true
                    ((:req %) state :runner eid (:card %) nil)))
         (map #(if-not (fn? (:value %))
                           (:value %)
                           ((:value %) state :runner eid (:card %) nil)))
         (filter number?)
         (reduce +))))

(defn available-mu
  "Returns the available MU the runner has"
  [state]
  (- (get-in @state [:runner :memory :available] 0)
     (get-in @state [:runner :memory :used] 0)))

(defn update-mu
  ([state] (update-mu state nil))
  ([state _]
   (let [;; non-virus memory
         available-mu- (sum-available-mu state)
         used-mu (sum-non-virus-programs-mu state)
         ;; virus memory
         available-virus-mu (sum-available-virus-mu state)
         used-virus-mu (sum-virus-programs-mu state)
         ;; if this is negative, there's more virus programs than available virus-specific MU
         virus-mu-diff (- available-virus-mu used-virus-mu)
         ;; total available memory (both non-virus and virus)
         total-available (+ available-mu-
                            ;; when diff is positive, there's MU left over
                            (if (pos? virus-mu-diff)
                              available-virus-mu
                              ;; otherwise, add nothing
                              0))
         ;; total used memory (both non-virus and virus)
         total-used (+ used-mu
                       (cond
                         ;; when diff is positive, there's MU left over so we want to
                         ;; add only the used virus memory
                         (pos? virus-mu-diff) used-virus-mu
                         ;; otherwise, the virus memory "overflowed" and we want to add
                         ;; the overflow to the total used
                         (neg? virus-mu-diff) (- virus-mu-diff)
                         :else 0))
         new-mu {:available-virus available-virus-mu
                 :used-virus used-virus-mu
                 :available total-available
                 :used total-used}
         old-mu (select-keys (get-in @state [:runner :memory]) [:available-virus :used-virus :available :used])
         changed? (not= old-mu new-mu)]
     (when (neg? total-used)
       (toast state :runner "You have exceeded your memory units!"))
     (when changed?
       (swap! state update-in [:runner :memory] merge new-mu))
     changed?)))

(defn mu+
  "For use in :constant-effects and register-floating-effect.
  Returns an effect map for :available-mu.
  Takes either the mu value or a :req 5-fn and the value."
  ([value] (mu+ (constantly true) value))
  ([req value]
   {:type :available-mu
    :req req
    :value value}))

(defn virus-mu+
  "For use in :constant-effects and register-floating-effect.
  Returns an effect map for :available-virus-mu.
  Takes either the mu value or a :req 5-fn and the value."
  ([value] (virus-mu+ (constantly true) value))
  ([req value]
   {:type :available-virus-mu
    :req req
    :value value}))
