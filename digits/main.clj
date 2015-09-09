; Convert number to reversed array of digits
; Link: http://www.codewars.com/kata/convert-number-to-reversed-array-of-digits/clojure

(defn digitize [n]
  (into [] (reverse (map (fn [x] (read-string (str x))) (str n))))
)

(println (= (digitize 35231) [1 3 2 5 3]))
