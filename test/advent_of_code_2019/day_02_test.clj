(ns advent-of-code-2019.day-02-test
  (:require [clojure.test :refer :all])
  (:require [advent-of-code-2019.day-02 :refer [run-program]]))

(deftest run-program-test
  (testing "Test inputs work"
    (is (= (run-program [1,0,0,0,99]) [2,0,0,0,99]))
    (is (= (run-program [2,3,0,3,99]) [2,3,0,6,99]))
    (is (= (run-program [2,4,4,5,99,0]) [2,4,4,5,99,9801]))
    (is (= (run-program [1,1,1,4,99,5,6,0,99]) [30,1,1,4,2,5,6,0,99]))))
