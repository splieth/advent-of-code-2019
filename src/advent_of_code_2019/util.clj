(ns advent-of-code-2019.util
  (:require [clojure.java.io :as io]))

(defn load-masses [file-name]
  (with-open [rdr (-> file-name
                      io/resource
                      (clojure.java.io/reader))]
    (->> rdr
         line-seq
         doall
         (map #(Integer/parseInt %)))))
