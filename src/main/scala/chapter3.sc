import scala.util.Random
import scala.collection.JavaConverters.{asScalaBuffer}
import java.awt.datatransfer._

import scala.collection.mutable.Buffer

// #1
val n = 10
val array = for (_ <- 0 until n) yield Random.nextInt(n) - (.5 * n).toInt

// #2
val arr2 = Array(1,2,3,4,5)
for (i <- 1 until (arr2.length, 2)) {
  val tmp = arr2(i - 1)
  arr2(i - 1) = arr2(i)
  arr2(i) = tmp
}
arr2

// #3
val arr31 = Array(1,2,3,4,5)
val arr32 = for (i <- 0 until arr31.length) yield {
  if (i % 2 == 1) arr31(i - 1)
  else if (i + 1 != arr31.length) arr31(i + 1)
  else arr31(i)
}

// #4
val arr41 = array.filter(_ > 0) ++ array.filter(_ <= 0)

// #5
val arr5 = arr41.map(_.toDouble)
arr5.sum
arr5.length
arr5.sum / arr5.length

// #6
array.toBuffer.sorted.reverse

// #7
array
array.distinct

// #8
val a = array.toBuffer
var first = true
val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
val ind = indexes.reverse.dropRight(1)
for (j <- 0 until ind.length) {
  a.remove(ind(j))
}
a

// #9
val zones = java.util.TimeZone
  .getAvailableIDs()
  .filter(_.startsWith("America"))
    .map(_.replace("America/",""))
zones.foreach(println(_))

// #10
val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]

val natives: Buffer[String] = asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))