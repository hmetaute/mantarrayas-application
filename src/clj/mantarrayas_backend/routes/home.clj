(ns mantarrayas-backend.routes.home
  (:require
    [mantarrayas-backend.layout :as layout]
    [mantarrayas-backend.db.core :as db]
    [clojure.java.io :as io]
    [mantarrayas-backend.middleware :as middleware]
    [ring.util.http-response :as response]))

(defn home-page [request]
  (layout/render request "home.html"))

(defn other-func [request]
(layout/render request "index.html"))

(defn home-routes []
  [""
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get home-page}]
   ["/docs" {:get (fn [_]
                    (-> (response/ok (-> "docs/docs.md" io/resource slurp))
                        (response/header "Content-Type" "text/plain; charset=utf-8")))}]])

