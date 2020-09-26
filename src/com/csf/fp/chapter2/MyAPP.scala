package com.csf.fp.chapter2

object MyAPP {

//  def findFirst(ss: Array[String], key: String): Int = {
//    def loop(n: Int) : Int = {
//      if (n >= ss.length) -1
//      else if (ss(n) == key) n
//      else loop(n + 1)
//    }
//    loop(0)
//  }

  def findFirst[A](as: Array[A], p: A => Boolean) : Int = {
    @scala.annotation.tailrec
    def loop(n: Int) : Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }
    loop(0)
  }

  def isSorted[A](as : Array[A], ordered: (A, A) => Boolean) : Boolean = {
    @scala.annotation.tailrec
    def sort(n:Int) : Boolean = {
      if(n >= as.length-1) true
      else if(!ordered(as(n), as(n+1))) false
      else sort(n+1)
    }
    sort(0)
  }

}
