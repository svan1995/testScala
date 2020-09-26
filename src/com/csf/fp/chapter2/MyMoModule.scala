package com.csf.fp.chapter2

object MyMoModule {
  def abs(n: Int) : Int = {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, factorial(x))
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int) : Int = {
      if (n <= 0) acc
      else go(n-1, n * acc)
    }
    go(n,1)
  }

  def fib(n : Int) : Int = {
    if (n == 1) 0
    else if (n == 2) 1
    else fib(n-1) + fib(n-2)
  }

  def formatResult(name : String, n : Int, f : Int => Int): String = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-66))
    println(formatFactorial(30))
    println(formatResult("abs", -88, abs))
    println(formatResult("factorial", 10, factorial))

  }
}
