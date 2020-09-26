package com.csf.multiparamlist

object Demo1 {


  def main(args: Array[String]): Unit = {
//    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val res = numbers.foldLeft(0)((m, n) => m + n)
//    println(res)

    var numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberFunc = numbers.foldLeft(List[Int]()) _
    numberFunc((xs, x) => xs :+ x*x)

  }

}
