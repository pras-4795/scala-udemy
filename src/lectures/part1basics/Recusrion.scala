package lectures.part1basics

import scala.annotation.tailrec

object Recusrion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
  //  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(n:Int, acc: BigInt): BigInt = {
      if ( n<=1 ) acc
      else factHelper(n-1, n * acc) // TAIL RECURSION = use recursive call as the LAST expression
    }

    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factHelper(10, 1)
  = factHelper(9, 10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = ...
  = factHelper(2, 3 * 4 * ... * 10 * 1)
  = factHelper(1, 1 * 2 * 3 * 4 * ... * 10)
  = 1 * 2 * 3 * 4 * ... * 10
 */

  println(anotherFactorial(20000))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  /*
    1.  Concatenate a string n times
    2.  IsPrime function tail recursive
    3.  Fibonacci function, tail recursive.
   */

  @tailrec
  def concatenateTailrec(aString: String, n: Int, acc: String): String = {
    if(n <= 0) acc
    else concatenateTailrec(aString, n-1, acc + aString)
  }

  println(concatenateTailrec("Hi", 5, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  def fibanoacci(n: Int): Int = {
    @tailrec
    def fibHelper(i: Int, last: Int, nextToLast : Int): Int = {
      if(i >= n) last
      else {
        fibHelper(i+1, last + nextToLast, last)
      }
    }

    fibHelper(2, 1, 1)
  }

  println(fibanoacci(8))

}
