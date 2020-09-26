class Point {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x : Int = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning()
  }

  def y: Int = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning()
  }

  private def printWarning(): Unit = println("WARNING: Out of bounds")

}

object Demo2{
  def main(args: Array[String]): Unit = {
    var point = new Point
    println(point.x);
    point.x = 22;
    println(point.x)
  }
}
