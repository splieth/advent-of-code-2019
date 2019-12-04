(ns advent-of-code-2019.core
  (:gen-class)
  (:require [advent-of-code-2019.day-01 :as day1]
            [advent-of-code-2019.day-02 :as day2]))

(defn -main [& args]
  (day1/solve)
  (day2/solve))
