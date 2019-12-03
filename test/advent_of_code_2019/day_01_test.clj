(ns advent-of-code-2019.day-01-test
  (:require [clojure.test :refer :all])
  (:require [advent-of-code-2019.day-01 :refer [fuel total-fuel]]))

; part 1
(deftest fuel-test
  (testing "Matches example for mass 12"
    (is (= 2 (fuel 12))))
  (testing "Matches example for mass 14"
    (is (= 2 (fuel 14))))
  (testing "Matches example for mass 1969"
    (is (= 654 (fuel 1969))))
  (testing "Matches example for mass 100756"
    (is (= 33583 (fuel 100756)))))

; part 2
(deftest total-fuel-test
  (testing "Matches example for mass 14"
    (is (= 2 (total-fuel 14))))
  (testing "Matches example for mass 1969"
    (is (= 966 (total-fuel 1969))))
  (testing "Matches example for mass 100756"
    (is (= 50346 (total-fuel 100756)))))
