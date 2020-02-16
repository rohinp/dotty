package points

opaque type Point = (Int, Int)

object Point {
  def apply(x: Int, y: Int): Point = (x, y)
}

// Extension methods define opaque types' public APIs
extension logarithmOps on (a: Point) {
  def + (b: Point): Point = (a._1 + b._1, a._2 + b._2)
  def * (b: Point): Point = (a._1 * b._1, a._2 * b._2)
}