package org.wfy.scala.ImplicitTrans

/*
* @Author wfy
* @Date 2020/9/29 10:58
* org.wfy.scala
*/

object ImplicitDemo4 {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "Jack"

    def hello(implicit name: String = "John"): Unit = { //生成hello$1
      println("Hello " + name)
    }

    hello //底层会生成hello$1(str1)，
  }
}
