package org.wfy.scala.PatternMatch

/*
* @Author wfy
* @Date 2020/10/5 20:25
* org.wfy.scala.Collection
*/

object PatternMatchDemo01 {
  def main(args: Array[String]): Unit = {
    val operate = '+'
    val n1 = 20
    val n2 = 10
    var res = 0

    operate match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("operate error!")
    }
    println("res = " + res)

  }
}
