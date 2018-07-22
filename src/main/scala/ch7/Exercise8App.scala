package ch7

object Exercise8App extends App {

  private val userName: String = System.getProperty("user.name")
  private val password: String = Console.in.readLine()

  if ("secret".equals(password)) {
    Console.out.println("Hi, " + userName + "!")
  } else {
    Console.err.println("Password is not \"secret\"")
  }
}
