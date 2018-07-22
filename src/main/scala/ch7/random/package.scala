package ch7

package object random {
  var next = 1
  val a = 1664525
  val b = 1013904223
  val n = 32

  def nextInt(): Int = {
    next = (next * a + b) % math.pow(2, n).toInt
    next
  }

  def nextDouble(): Double = nextInt()

  def setSeed(seed: Int): Unit = {
    this.next = seed
  }
}
