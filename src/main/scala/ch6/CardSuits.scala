package ch6

/**
  *
  */
object CardSuits extends Enumeration {
  val Spade = Value("♠")
  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")

  def isRed(suit: CardSuits.Value): Boolean = {
    suit.equals(Heart) || suit.equals(Diamond)
  }
}
