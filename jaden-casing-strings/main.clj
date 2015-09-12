; Jaden Casing Strings
; Link: http://www.codewars.com/kata/jaden-casing-strings/clojure
(require '[clojure.string :as str])

(defn jaden-case
  [s]
    (str/join " " (map str/capitalize (str/split s #" "))))

(println (= "How Can Mirrors Be Real If Our Eyes Aren't Real"
         (jaden-case "How can mirrors be real if our eyes aren't real")))
