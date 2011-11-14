(ns Euler3)
;	The prime factors of 13195 are 5, 7, 13 and 29.
;	What is the largest prime factor of the number 600851475143?
;(largest-prime-factor(rem a-num div)) (largest-prime-factor a-num div+1)
(defn largest-prime-factor
  ([a](largest-prime-factor a-num 2))
  ([a div]
    (if(== a div) num (if(zero? (mod a div)) "insert code here" ))
  )  
)

(println largest-prime-factor 600851475143)