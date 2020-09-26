package com.csf.patternMatch

import scala.util.Random

object Demo1 {

  def mathTest(x:Int):String = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }

  def main(args: Array[String]): Unit = {
    val x = Random.nextInt(10);
    println(mathTest(x))

  }
}
