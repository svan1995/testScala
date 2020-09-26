object Test {

  def main(args: Array[String]): Unit = {

//    var array = Array(1.3 , 4.0, 4.5);
//    for (x <- array){
//      println(x);
//    }
//
//    println(IdFactory.create())
//    println(IdFactory.create())

    val list: List[Any] = List(
      "a string",
      732,  // an integer
      'c',  // a character
      true, // a boolean value
      () => "an anonymous function returning a string"
    )

    list.foreach(element => println(element));

    val x: Long = 987654321
    val y: Float = x  // 9.8765434E8 (note that some precision is lost in this case)

    val face: Char = '☺'
    val number: Int = face  // 9786
    println(number);


  }
  def addInt( a:Int, b:Int ) : Int = {
    var sum : Int = 0;
    sum = a + b;
    return sum;
  }
}

object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}
