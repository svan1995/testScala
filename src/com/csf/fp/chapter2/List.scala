package com.csf.fp.chapter2


sealed trait List[+A]

case object Nil extends List[Nothing]
case class Cons[+A](head:A, tail: List[A]) extends List[A]

object List {
  def sum(ints : List[Int]) : Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds : List[Double]) : Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty ) Nil
    else Cons(as.head, apply(as.tail: _*))
  }

  val x = List(1,2,3,4,5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
//    case Cons(h, t) => h + sum(t)
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }

  //P3.2
  def tail[A](list: List[A]) : List[A] = {
    list match {
      case Nil => sys.error("错误")
      case Cons(head, tail) => tail
    }
  }

  //P3.3
  def setHead[A](list: List[A], h: A) : List[A] = {
    list match {
      case Nil => sys.error("错误")
      case Cons(head, tail) => Cons(h, tail)
    }
  }

  //P3.4
  def drop[A](l: List[A], n: Int): List[A] = {
    if (n > 0){
      l match {
        case Nil => sys.error("error")
        case Cons(head, tail) => drop(tail,n-1)
      }
    }
    else l
  }

  //P3.5
  def dropWhile[A](l:List[A], f:A => Boolean) : List[A] = {

    l match {
      case Nil => Nil
      case Cons(head, tail) =>  {
        if (f(head)) dropWhile(tail, f)
        else l
      }
    }
  }

  def main(args: Array[String]): Unit = {
    var l = List(1,2,3,4,5)
    var l2 = dropWhile(l, (x:Int) => (x <= 3))
    println(l2)
  }
}
