; Find the Slope
; Link: http://www.codewars.com/kata/find-the-slope/clojure

(defn slope
  [v]
    (let [n (apply map - (split-at 2 v))]
      (if (zero? (first n))
        "undefined"
        (str (apply / (reverse n)))
        )
      )
    )

(println (= (slope [19,3,20,3]) "0"))
(println (= (slope [-7,2,-7,4]) "undefined"))
(println (= (slope [10,50,30,150]) "5"))
