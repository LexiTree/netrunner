(ns translations.ja)

(def translations
  {:missing ":ja missing text"
   :side {:corp "コーポ"
          :runner "ランナー"
          :any-side "Any Side"
          :all "全部"}
   :faction {:all "全部"
             :any-faction "Any Faction"
             :anarch "アナーク"
             :criminal "クリミナル"
             :shaper "シェイパー"
             :adam "アダム"
             :apex "エイペックス"
             :sunny-lebeau "サニー・ルボー"
             :jinteki "ジンテキ"
             :haas-bioroid "ハース＝バイオロイド"
             :nbn "NBN"
             :weyland-consortium "ウェイランド・コンソーシアム"
             :neutral "中立"}
   :format {:all "全部"
            :any-format "Any Format"
            :standard "スタンダード"
            :eternal "エターナル"
            :core-experience "Core Experience"
            :snapshot "スナップショット"
            :snapshot-plus "Snapshot Plus"
            :socr "SOCR"
            :sunset "Sunset"
            :neo "Neo"
            :classic "Classic"
            :casual "Casual"
            :system-gateway "システムゲートウェイ"
            :startup "スタートアップ"}
   :card-type {:all "全部"
               :identity "ID"
               :agenda "計画書"
               :asset "資材"
               :upgrade "強化"
               :operation "任務"
               :ice "アイス"
               :event "イベント"
               :hardware "ハードウェア"
               :resource "リソース"
               :program "プログラム"}
   :pronouns {:none "Unspecified"
              :any "Any"
              :myodb "Prefer not to say"
              :blank "[blank]"
              :they "They/them"
              :she "She/her"
              :shethey "She/they"
              :he "He/him"
              :hethey "He/they"
              :it "It"
              :ne "Ne/nem"
              :ve "Ve/ver"
              :ey "Ey/em"
              :zehir "Ze/hir"
              :zezir "Ze/zir"
              :xe "Xe/xem"}
   :chat {:title "Play Netrunner in your browser"
          :channels "Channels"
          :send "Send"
          :placeholder "Say something..."
          :delete "Delete Message"
          :delete-all "Delete All Messages From User"
          :block "Block User"
          :cancel "Cancel"}
   :nav {:chat "チャット"
         :cards "カード"
         :deck-builder "デッキビルダー"
         :play "対戦"
         :help "ヘルプ"
         :settings "設定"
         :stats "統計"
         :about "このサイトについて"
         :tournaments "大会"
         :admin "Admin"
         :users "Users"
         :features "Features"
         :game-count (fn [[cnt]] (str "ルーム数 " cnt))}
   :menu {:settings :ja.nav/settings
          :logout "ジャックアウト"
          :admin :ja.nav/admin
          :moderator "Moderator"
          :donor "Donor"}
   :card-browser {:search-hint "カード名検索"
                  :sort "並び順"
                  :format "フォーマット"
                  :set "カードセット"
                  :side "プレイヤーサイド"
                  :faction "派閥"
                  :type "カードタイプ"
                  :clear "クリア"
                  :select-art "Select Art"
                  :selected-art "Selected Alt Art"
                  :update-success "Updated Art"
                  :update-failure "Failed to Update Art"
                  :memory "MU"
                  :cost "コスト"
                  :trash-cost "トラッシュコスト"
                  :strength "強度"
                  :advancement "アドバンス要求"
                  :agenda-points "計画ポイント"
                  :min-deck "最小デッキ枚数"
                  :inf-limit "影響値上限"
                  :influence "影響値"
                  :sort-by {:faction "派閥"
                            :name "カード名"
                            :type "タイプ"
                            :influence "影響値"
                            :cost "コスト"
                            :set-number "セット番号"}}
   :deck-builder {:loading-msg "デッキ一覧を読み込み中……"
                  :new-corp "新規コーポ"
                  :new-runner "新規ランナー"
                  :import-button "デッキのインポート"
                  :reset "リセット"
                  :import-title "公開済みNetrunnerDB Deck ID or URL"
                  :import "インポート"
                  :cancel "キャンセル"
                  :import-placeholder "NetrunnerDB ID"
                  :deck-count (fn [[cnt]] (str "デッキ数 " cnt))
                  :filtered "(絞り込み)"
                  :save "保存"
                  :confirm-delete "削除の実行"
                  :edit "編集"
                  :delete "削除"
                  :copy "コピー"
                  :deck-copy-suffix "コピー"
                  :clear-stats "統計を削除"
                  :create-game "対戦の開始"
                  :deck-name "デッキ名"
                  :format "フォーマット"
                  :identity "ID"
                  :deck-notes "メモ"
                  :decklist "カードリスト"
                  :decklist-inst "({枚数}[半角スペース]{カード名（英語）}で入力)"
                  :notes "メモ"
                  :add-to-deck "追加"
                  :add-cards "カードの追加"
                  :card-name "カード名"
                  :no-decks "デッキ未登録"
                  :cards "枚"
                  :min "下限"
                  :max "上限"
                  :influence "影響値"
                  :agenda-points "計画ポイント"
                  :deck-points "デッキポイント"
                  :hash "大会ハッシュ"
                  :why "Why?"
                  :legal "適正"
                  :illegal "違反"
                  :games "ゲーム"
                  :completed "完了"
                  :won "勝利"
                  :lost "敗北"}
   :lobby {:no-games "No games"
           :tournament "Tournament"
           :competitive "Competitive"
           :casual "Casual"
           :new-game "ルーム作成"
           :reload "リロード"
           :load-replay "リプレイ読込"
           :start-replay "再生"
           :save-replay "リプレイの保存"
           :replay-link-error "Replay link invalid."
           :replay-invalid-file "Select a valid replay file."
           :create "作成"
           :cancel "キャンセル"
           :title "ルーム名"
           :side "サイド"
           :format "フォーマット"
           :options "設定"
           :spectators "観戦の許可"
           :hidden "非公開情報を観戦者に公開"
           :password-protected "パスワードを設定する"
           :password "パスワード"
           :start "開始"
           :leave "退出"
           :swap "サイド変更"
           :waiting "デッキ選択待ち"
           :players "プレイヤー"
           :deck-selected "デッキ選択完了"
           :select-deck "デッキ選択"
           :chat "チャット"
           :select-title "デッキを選択"
           :spectator-count (fn [[cnt]] (str "観戦中 " cnt "人"))
           :closed-msg "操作が行われていないルームを閉じました。"
           :title-error "ルーム名を修正してください。"
           :password-error "パスワードを修正してください。"
           :too-little-data "Too little data"
           :completion-rate "対戦完了率"
           :watch "観戦"
           :join "入室"
           :rejoin "再入室"
           :as-corp "コーポとして"
           :as-runner "ランナーとして"
           :private "非公開"
           :reset "Reset Game Name"
           :delete "Delete Game"
           :password-for "パスワード"
           :invalid-password "不正なパスワード"
           :not-allowed "Not allowed"
           :aborted "Connection aborted"
           :api-access "Allow API access to game information"
           :api-requires-key "(Requires an API Key in Settings)"
           :game-count (fn [[cnt]] (str "ルーム数 " cnt))
           :filtered "(絞り込み)"}
   :settings {:invalid-password "Invalid login or password"
              :invalid-email "No account with that email address exists"
              :updated "Profile updated - Please refresh your browser"
              :updating "Updating profile..."
              :get-log-width "Get current log width"
              :get-log-top "Get current log top"
              :email-title "Change email address"
              :current-email "Current email"
              :desired-email "Desired email"
              :email-placeholder "Email address"
              :enter-valid "Please enter a valid email address"
              :update "Update"
              :cancel "Cancel"
              :email "Email"
              :change-email "Change email"
              :avatar "Avatar"
              :change-avatar "Change on gravatar.com"
              :pronouns "Pronouns"
              :language "Language"
              :sounds "Sounds"
              :enable-lobby-sounds "Enable lobby sounds"
              :enable-game-sounds "Enable game sounds"
              :volume "Volume"
              :layout-options "Layout options"
              :stacked-cards "Card stacking (on by default)"
              :runner-layout "Runner layout from Corp perspective"
              :runner-classic "Runner rig layout is classic jnet (Top to bottom: Programs, Hardware, Resources)"
              :runner-reverse "Runner rig layout is reversed (Top to bottom: Resources, Hardware, Programs)"
              :background "Game board background"
              :card-backs "Card backs"
              :game-stats "Game Win/Lose statistics"
              :deck-stats "Deck statistics"
              :always "Always"
              :comp-only "Competitive Lobby Only"
              :none "None"
              :alt-art "Alt arts"
              :show-alt "Show alternate card arts"
              :high-res "Enable high-resolution card images"
              :card-images "Card images"
              :set-all "Set all cards to"
              :set "Set"
              :reset "Reset All to Official Art"
              :blocked "Blocked users"
              :user-name "User name"
              :block "Block user"
              :update-profile "Update Profile"
              :nsg "NSG"
              :ffg "FFG"
              :api-keys "API Keys"
              :delete-api-key "Delete"
              :create-api-key "Create API Key"}
   :stats {:game-stats "対戦統計"
           :corp-stats "コーポ統計"
           :runner-stats "ランナー統計"
           :clear-stats "統計を削除"
           :no-log "No log available"
           :view-log "ログを見る"
           :winner "勝者"
           :no-games "No games"
           :all-games "全てのログを表示"
           :shared-games "シェアログのみ表示"
           :started "開始"
           :ended "終了"
           :completed "完了"
           :not-completed "未完了"
           :won "勝利"
           :lost "敗北"
           :turn-count (fn [[cnt]] (str "ターン数 " cnt))
           :lobby "ロビー"
           :format "フォーマット"
           :win-method "勝利方法"
           :view-games "統計画面に戻る"
           :share "Share Replay"
           :launch "Launch Replay"
           :download "Download Replay"
           :unavailable "Replay unavailable"
           :filtered "(絞り込み)"
           :log-count (fn [[cnt]] (str "ログ数 " cnt))
           :clicks-gained "得たクリック"
           :credits-gained "得たクレジット"
           :credits-spent "消費したクレジット"
           :credits-click "クリックで得たクレジット"
           :cards-drawn "ドロー"
           :cards-click "クリックでしたドロー"
           :damage-done "与えたダメージ"
           :cards-rezzed "レゾしたカード"
           :tags-gained "受けたタグ"
           :runs-made "行ったラン"
           :cards-accessed "アクセスしたカード"}
   :log {:game-log "Game Log"
         :annotating "Annotating"
         :shared "Shared Annotations"
         :remote-annotations-fail "Could not get remote annotations."}
   :annotations {:turn-placeholder "Notes for this turn"
                 :click-placeholder "Notes for this click"
                 :available-annotations "Available annotations"
                 :no-published-annotations "No published annotations."
                 :publish "Publish"
                 :import-local "Import local annotation file"
                 :load-local "Load"
                 :save-local "Save"
                 :clear "Clear local annotations"}
   :game {:keep "キープ"
          :mulligan "マリガン"
          :close "閉じる"
          :start "ゲーム開始"
          :remove-tag "タグを除去"
          :run "ラン"
          :purge "ウィルスカウンター破棄"
          :trash-resource "リソースをトラッシュ"
          :draw "ドロー"
          :gain-credit "クレジットを得る"
          :game-start "ゲーム開始"
          :start-turn "ターンの開始"
          :end-turn "ターンの終了"
          :mandatory-draw "強制ドロー"
          :take-clicks "クリックを受け取る"
          :hq "HQ"
          :grip "グリップ"
          :rfg "除外"
          :play-area "プレイエリア"
          :current "現状"
          :scored-area "得点エリア"
          :archives "アーカイブ"
          :max-hand "手札上限"
          :brain-damage "コアダメージ"
          :tag-count (fn [[base additional total]] (str base (when (pos? additional) (str " + " additional)) " タグ"))
          :agenda-count (fn [[agenda-point]] (str agenda-point " 計画点"))
          :link-strength "リンク強度"
          :credit-count (fn [[credit run-credit]] (str credit " クレジット") (when (pos? run-credit) (str " (ランの間のみ " run-credit ")")))
          :click-count (fn [[click]] (str click " クリック"))
          :bad-pub-count (fn [[base additional]] (str base (when (pos? additional) (str "+" additional)) " 悪名"))
          :mu-count (fn [[unused available]] (str unused "/" available " 未使用MU"))
          :special-mu-count (fn [[unused available mu-type]] (str unused "/" available " 未使用 " mu-type " MU"))
          :indicate-action "アクションします！"
          :spec-count (fn [[c]] (str "観戦中 " c "人"))
          :spec-view "観戦者視点"
          :runner-view "ランナー視点"
          :corp-view "コーポ視点"
          :leave-replay "リプレイから退出"
          :leave "ルームを退出"
          :unmute "Unmute spectators"
          :mute "Mute spectators"
          :concede "降参する"
          :inactivity "操作が行われていないルームを閉じました。"
          :server "サーバー"
          :unimplemented "未実装"
          :abilities "能力"
          :let-subs-fire "未ブレイクサブルーチン解決を許可"
          :subs "サブルーチン"
          :actions "アクション"
          :fire-unbroken "未ブレイクサブルーチンを解決する"
          :stack "スタック"
          :r&d "R&D"
          :shuffle "シャッフルする"
          :show "中を確認する"
          :close-shuffle "閉じてシャフルする"
          :heap "ヒープ"
          :card-count (fn [[size]] (str size " 枚"))
          :face-down-count (fn [[total face-up]] (str total " 枚(裏向き " (- total face-up) " 枚)"))
          :up-down-count (fn [[total face-up]] (str face-up "↑ " (- total face-up) "↓"))
          :initiation "ラン開始"
          :approach-ice "アイスにアプローチ"
          :encounter-ice "エンカウント中"
          :movement "移動"
          :breach-server "サーバーに侵入"
          :success "ランの成功"
          :run-ends "ラン終了"
          :no-current-run "ラン以外"
          :current-phase "現在のフェーズ"
          :unknown-phase "不明フェーズ"
          :rez "レゾ"
          :no-further "これ以上アクションしない"
          :continue "次へ進む"
          :continue-to "次へ："
          :stop-auto-pass "自動通過処理を停止"
          :auto-pass "自動通過処理"
          :jack-out "ジャックアウト"
          :trace "トレース"
          :credits "クレジット"
          :card "カード"
          :time-taken (fn [[t]] (str "経過した時間: " t "分"))
          :win-decked (fn [[turn]] (str "コーポのデッキ切れによる勝利 " turn " ターン"))
          :win-flatlined (fn [[turn]] (str "フラットラインによる勝利 " turn " ターン"))
          :win-conceded (fn [[turn]] (str "降参による勝利 " turn " ターン"))
          :win-claimed (fn [[turn]] (str "wins by claim on turn " turn))
          :win-points (fn [[turn]] (str "計画ポイントによる勝利 " turn " ターン"))
          :win-other (fn [[turn reason]] (str "wins by " reason " on turn " turn))}})
