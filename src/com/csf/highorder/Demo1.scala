package com.csf.highorder

object Demo1 {
  def main(args: Array[String]): Unit = {
//    val salaries = Seq(200,233,444);
//    val doubleMethod = (x : Int) => 2 * x
//    val newSalaries = salaries.map(doubleMethod)
//    newSalaries.foreach(x => println(x))

    println(factorial(444))
  }

  def factorial(x: Int) = {
    def fact(x : Int, result : Double): Double = {
      if (x <= 1) result
      else  fact(x-1, x*result)
    }
    fact(x,1)
  }
}


