import java.util
import java.util.Scanner

import scala.collection.mutable

// #1
val gizmos = Map("Telecaster"-> 1500.0, "Java Concurrency in Practice" -> 44.5, "MacBook Pro 15.1'" -> 2700.0)
val discountedGizmos = for((k, v) <- gizmos) yield (k, .9 * v)

// #2
val in = new Scanner("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
var wordsStats = mutable.HashMap[String, Int]()
while (in.hasNext()){
  val word = in.next()
  val currentWordOccurences = wordsStats.getOrElse(word, 0)
  wordsStats(word) = currentWordOccurences + 1
}

println(wordsStats.mkString("\n"))

// #3
val in2 = new Scanner("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
var wordsStats2 = Map[String, Int]()
while (in2.hasNext()){
  val word = in2.next()
  val currentWordOccurrences = wordsStats2.getOrElse(word, 0)
  wordsStats2 = wordsStats2 + (word -> (currentWordOccurrences + 1))
}

println(wordsStats2.mkString("\n"))

// #4
val in3 = new Scanner("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
var wordsStats3 = mutable.SortedMap[String, Int]()
while (in3.hasNext()){
  val word = in3.next()
  val currentWordOccurrences = wordsStats3.getOrElse(word, 0)
  wordsStats3 = wordsStats3 + (word -> (currentWordOccurrences + 1))
}

println(wordsStats3.mkString("\n"))

// #5
val in4 = new Scanner("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
var wordsStats4 = scala.collection.JavaConverters.mapAsScalaMap(new util.TreeMap[String, Integer]())
while (in4.hasNext()){
  val word = in4.next()
  val currentWordOccurrences = wordsStats.getOrElse(word, 0)
  wordsStats4(word) = currentWordOccurrences + 1
}

println(wordsStats4.mkString("\n"))

// #6
val daysMap = mutable.LinkedHashMap[String, Int]()

daysMap += ("Tuesday" -> java.util.Calendar.TUESDAY)
daysMap += ("Saturday" -> java.util.Calendar.SATURDAY)
daysMap += ("Thursday" -> java.util.Calendar.THURSDAY)
daysMap += ("Monday" -> java.util.Calendar.MONDAY)
daysMap += ("Friday" -> java.util.Calendar.FRIDAY)
daysMap += ("Wednesday" -> java.util.Calendar.WEDNESDAY)
daysMap += ("Sunday" -> java.util.Calendar.SUNDAY)

for ( (k, v) <- daysMap) println(k + ": " + v)

// #7
import scala.collection.JavaConverters.propertiesAsScalaMap
val props: scala.collection.Map[String, String] = propertiesAsScalaMap(System.getProperties())

val maxKey = props.keys.map(_.length).max
for ((k, v) <- props) println(k.padTo(maxKey, ' ') + " | " + v)

// #8
def minmax(values: Array[Int]): (Int, Int) = {
  (values.min, values.max)
}

minmax(Array(4, -42, 8, 13, 0))

// #9
def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
  (values.count(_ < v), values.count(_ == v), values.count(_ > v))
}

lteqgt(Array(-5, 8, 0, 13, 3, 0, 0, 17), 8)

// #10
val zipped = "Hello".zip("World")