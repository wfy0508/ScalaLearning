package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/6 16:39
* org.wfy.scala.Collection
*/

object MatchListDemo01 {
  def main(args: Array[String]): Unit = {
    val lists = Array(List(0), List(0, 1), List(0, 1, 0), List(1, 0, 0))
    for (lst <- lists) {
      val result = lst match {
        case 0 :: Nil => "0"
        case a :: b :: Nil => a + " " + b
        case 0 :: tail => "0..."
        case _ => "something else"
      }
      println("result = " + result)
    }
  }
}
