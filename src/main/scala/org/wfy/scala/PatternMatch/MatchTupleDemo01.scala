package org.wfy.scala.PatternMatch

/*
* @Author wfy
* @Date 2020/10/6 16:45
* org.wfy.scala.Collection
*/

object MatchTupleDemo01 {
  def main(args: Array[String]): Unit = {
    val tuples = Array(0, (0, 1), (1, 0), (10, 30), (0, 1, 0), (1, 0, 0))
    for (tuple <- tuples) {
      val result = tuple match {
        case (0, _) => "0..."
        case (a, 0) => a
        case (a, b) => (b, a)
        case _ => "other"
      }
      println("result = " + result)
    }
  }
}