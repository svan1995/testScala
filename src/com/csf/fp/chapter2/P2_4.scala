package com.csf.fp.chapter2

class P2_4 {
  def uncurry[A,B,C](f: A => B=> C) : (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }
}
