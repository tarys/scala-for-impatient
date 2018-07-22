package ch7

import java.util.{HashMap => JavaMap}
import scala.collection.mutable.{HashMap => ScalaMap}

object MapCopyApp extends App {
  val jm = new JavaMap[Object, Object]()
  val sm = ScalaMap[Object, Object]()

  jm.put("hi", "there")
  jm.put("sence of life", "42")
  jm.forEach((k, v) => sm.put(k, v))
  print(sm)
}
