(ns Euler1)
(reduce + (filter #(or (zero? (rem % 3))(zero? (rem % 5)))(range 1000)))