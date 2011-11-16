(ns Euler3)
;	The prime factors of 13195 are 5, 7, 13 and 29.
;	What is the largest prime factor of the number 600851475143?

(defn largest-prime-factor 
  ([num] (largest-prime-factor num 2))
  ([num div]
     (if (== num div)
       num
       (if (zero? (rem num div))
         (recur (/ num div) div)
         (recur num (inc div))
        )
      )
    )
)

(println (largest-prime-factor 600851475143))