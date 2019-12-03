(ns advent-of-code-2019.day-01
  (:gen-class)
  (:require [clojure.java.io :as io]))

(defn load-input [file-name]
  (with-open [rdr (-> file-name
                      io/resource
                      (clojure.java.io/reader))]
    (->> rdr
         line-seq
         doall
         (map #(Integer/parseInt %)))))

; part 1
(defn fuel [mass]
  (- (quot mass 3) 2))

; part 2
(defn total-fuel [mass]
  (->> mass
       (iterate fuel)
       (take-while pos?)
       rest
       (reduce +)))

(defn solve [input]
  (let [part1 (->> input
                   (map fuel)
                   (reduce +))
        part2 (->> input
                   (map total-fuel)
                   (reduce +))]
    (println "Result for Day 1 / Part 1:" part1)
    (println "Result for Day 1 / Part 2:" part2)))
