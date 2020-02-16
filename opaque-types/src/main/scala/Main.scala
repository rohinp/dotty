import points._

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world! from opaque types")

    val a = Point(1,2)
    val b = Point(4,3)

    println(a + b)

    //will not compile
//    val (y,z) = Point(a._1, b._1)

  }
}
