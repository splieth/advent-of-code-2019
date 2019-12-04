(ns advent-of-code-2019.day-02
  (:require [clojure.string :as str]))

(def input
  (mapv #(Long/parseLong %) (-> "day_02.txt"
                                clojure.java.io/resource
                                slurp
                                (str/split #","))))

(def opcodes
  {1 +
   2 *})

(defn run-step [[opcode pos next-pos output-pos] program]
  (let [operation (get opcodes opcode)
        p1 (nth program pos)
        p2 (nth program next-pos)
        result (operation p1 p2)]
    (assoc program output-pos result)))

(defn run-program
  ([program] (run-program 0 program))
  ([pos program] (if (= 99 (nth program pos))
                   program
                   (let [next-pos (+ 4 pos)
                         instruction (subvec program pos next-pos)]
                     (recur next-pos (run-step instruction program))))))

(defn part-1 [noun verb]
  (first (run-program (assoc input 1 noun 2 verb))))

(defn part-2 [expected]
  (for [noun (range 0 99)
        verb (range 0 99)
        :when (= (part-1 noun verb) expected)]
    (str/join [noun verb])))

(defn solve []
  (println "Result for Day 2 / Part 1:" (part-1 12 2))
  (println "Result for Day 2 / Part 2:" (first (part-2 19690720))))
