package org.wfy.scala.PatternMatch

/*
* @Author wfy
* @Date 2020/10/5 20:37
* org.wfy.scala.Collection
*/

object PatternMatchGuardDemo02 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3 //模式匹配中的模式守卫
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }
  }
}
