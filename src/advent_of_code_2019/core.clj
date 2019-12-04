(ns advent-of-code-2019.core
  (:gen-class)
  (:require [advent-of-code-2019.day-01 :as day1]
            [advent-of-code-2019.day-02 :as day2]))

(defn -main [& args]
  (day1/solve (day1/load-input "day_01.txt"))
  (day2/solve))
