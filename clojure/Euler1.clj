(ns Euler1)
;problem: Add all the natural numbers below one thousand that are multiples of 3 or 5.
(reduce + (filter #(or (zero? (rem % 3))(zero? (rem % 5)))(range 1000)))