package ch6

/**
  *
  */
object Runner extends App {
  CardSuits.values.foreach(cs => println(cs.toString))

  println(CardSuits.isRed(CardSuits.Heart))
  println(CardSuits.isRed(CardSuits.Spade))
}
