(ns advent-of-code-2019.day-01
  (:gen-class))

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
