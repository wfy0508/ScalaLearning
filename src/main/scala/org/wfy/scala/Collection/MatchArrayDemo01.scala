package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/6 16:28
* org.wfy.scala.Collection
*/

object MatchArrayDemo01 {
  def main(args: Array[String]): Unit = {
    val arrays1 = Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))
    for (arr <- arrays1) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + " = " + y
        case Array(0, _*) => "以0开始的数组"
        case _ => "什么集合都不是"
      }
      println("result = " + result)
    }

    //交换两个元素位置
    for (arr <- arrays1) {
      val result1 = arr match {
        case Array(x, y) => Array(y, x)
        case _ => "不处理"
      }
      println("result1 = " + result1)
    }


  }
}
