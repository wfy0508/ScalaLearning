package org.wfy.scala.Function

/*
* @Author wfy
* @Date 2020/10/7 10:18
* org.wfy.scala.Function
*/

object HigherOrderFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    val res1 = test(sum, 10.0)
    println("res1 = " + res1)

    val res2 = test1(sum, mod, 9.0)
    println("res2 = " + res2)
  }

  def sum(d: Double): Double = {
    d + d
  }

  def mod(d: Double): Int = {
    d.toInt % 2
  }

  //接收1个函数和1个参数，并返回一个Double值
  def test(f: Double => Double, n: Double): Double = {
    f(n)
  }

  //接收2个函数和1个参数，并返回一个Double值
  def test1(f1: Double => Double, f2: Double => Double, n: Double): Double = {
    f1(f2(n))
  }
}
