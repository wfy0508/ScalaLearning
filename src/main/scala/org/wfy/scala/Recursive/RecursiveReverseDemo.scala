package org.wfy.scala.Recursive

/*
* @Author wfy
* @Date 2020/10/7 12:23
* org.wfy.scala.Recursive
*/

object RecursiveReverseDemo {
  def main(args: Array[String]): Unit = {
    val string = "helloWorld"
    println(reverse(string))

    val x = 10
    println(factorial(x))
  }

  //使用递归实现字符串翻转操作
  def reverse(s: String): String = {
    if (s.length == 1) s else reverse(s.tail) + s.head
  }

  //使用递归实现阶乘
  def factorial(x: Int): BigInt = {
    if (x == 1) 1 else factorial(x - 1) * x
  }

  //(注意事项！！！)当时用递归实现斐波那契序列时，下面代码会出现大量的重复计算
  def fibonacci(x: BigInt): BigInt = {
    if (x == 1 || x == 2) 1 else fibonacci(x - 1) + fibonacci(x - 2)
  }

}
