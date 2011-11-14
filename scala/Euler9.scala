/*
A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc
*/
object Euler9 extends App {
println (( for ( c <- 1 to 500; b <- 1 to c; a <- 1 to b if((a+b+c==1000)&&((a*a+b*b) == c*c))) yield(a*b*c)))

}