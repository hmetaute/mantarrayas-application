(ns mantarrayas-backend.routes.club_members 
  (:require 
   [ring.util.http-response :as response]
   [mantarrayas-backend.db.core :as db]
   [mantarrayas-backend.middleware :as middleware]))


(defn get-club-members [request]
  (response/ok (db/get-club-members)))

(defn insert-club-member [request]
  (let [body (get-in request [:body-params])
        id (java.util.UUID/fromString (get-in body [:id]))]
    (do (println id)
        (db/create-club-member! (assoc body :id id))
        (response/ok {:status "ok"}))))

(defn club-member-routes []
  [""
   {:middleware [middleware/wrap-formats
                 middleware/wrap-json-resp
                 middleware/wrap-json-req]}
   ["/club-members" {:get get-club-members
                     :post insert-club-member}]])
