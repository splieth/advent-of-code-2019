(ns advent-of-code-2019.core
  (:gen-class)
  (:require [advent-of-code-2019.day-01 :as day1]))

(defn -main [& args]
  (let [data (day1/load-input "day_01.txt")]
    (->> data
         day1/solve)))
