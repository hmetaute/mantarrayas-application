(ns mantarrayas-backend.app
  (:require [mantarrayas-backend.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
