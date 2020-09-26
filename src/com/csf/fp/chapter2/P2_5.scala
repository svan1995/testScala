package com.csf.fp.chapter2

class P2_5 {
  def compose[A,B,C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))
}
