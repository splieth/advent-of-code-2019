(ns advent-of-code-2019.core
  (:gen-class)
  (:require [advent-of-code-2019.util :as util]
            [advent-of-code-2019.day-01 :as day1]))

(defn -main [& args]
  (let [data (util/load-masses "day_01.txt")]
    (->> data
         day1/solve)))
