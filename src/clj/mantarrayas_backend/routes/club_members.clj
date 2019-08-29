(ns mantarrayas-backend.routes.club_members 
  (:require 
   [ring.util.http-response :as response]
   [mantarrayas-backend.db.core :as db]
   [mantarrayas-backend.middleware :as middleware]))


(defn get-club-members [request]
  (response/ok (db/get-club-members)))


(defn club-member-routes []
  [""
   {:middleware [middleware/wrap-csrf 
                 middleware/wrap-formats
                 middleware/wrap-json]}
   ["/club-members" {:get get-club-members}]])
