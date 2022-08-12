(ns user
  (:require [portal.api :as p]))

(defn portal
  ([] (portal :intellij))
  ([l]
   (add-tap #'portal.api/submit)
   (p/open {:launcher l})))
