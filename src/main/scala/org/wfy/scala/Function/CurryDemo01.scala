package org.wfy.scala.Function

/*
* @Author wfy
* @Date 2020/10/7 11:09
* org.wfy.scala.Function
*/

object CurryDemo01 {
  def main(args: Array[String]): Unit = {


    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }

    //checkEq完成大小写转换， eq完成比较
    implicit class TestEq(s: String) {
      // 首先将s（下面实例中的str）和ss（下面实例中的Hello）转换为小写传给f(s.toLowerCase, ss.toLowerCase)
      // 然后再调用后面一个参数(f: (String, String) => Boolean)做比较操作
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }
    }

    val str = "HellO"
    println(str.checkEq("Hello")(eq))

    //简化形式
    str.checkEq("helLo")(_.equals(_))
  }
}
