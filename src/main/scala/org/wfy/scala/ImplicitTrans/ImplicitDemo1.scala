package org.wfy.scala.ImplicitTrans

/*
* @Author wfy
* @Date 2020/9/25 17:39
* org.wfy.scala
*/

object ImplicitDemo1 {
  def main(args: Array[String]): Unit = {

    implicit def doubleToInt(d: Double): Int = d.toInt

    val a: Int = 3.14
    println(a)
  }
}
