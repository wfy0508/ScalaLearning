package org.wfy.scala.Function

/*
* @Author wfy
* @Date 2020/10/7 10:43
* org.wfy.scala.Function
*/

object ClosureDemo01 {
  def main(args: Array[String]): Unit = {
    val f1 = minusXY(20)
    println("f1: " + f1(1))
    println("f2: " + f1(2))

    val f2 = makeSuffix(".jpg")
    println("f3: "+ f2("hello.jpg"))
  }

  def minusXY(x: Int): Int => Int = (y: Int) => x + y

  //检查文件后缀名的闭包
  def makeSuffix(suffix: String): String => String = {
    (filename: String) => {
      if (filename.endsWith(suffix)) filename else filename + suffix
    }
  }

}
