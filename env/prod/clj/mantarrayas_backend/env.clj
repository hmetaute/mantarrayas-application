(ns mantarrayas-backend.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[mantarrayas_backend started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[mantarrayas_backend has shut down successfully]=-"))
   :middleware identity})
