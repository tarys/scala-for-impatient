package ch6

/**
  *
  */
class Point(x: Int, y: Int) {}

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}
