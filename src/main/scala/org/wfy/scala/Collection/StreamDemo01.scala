package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/5 19:33
* org.wfy.scala.Collection
*/

object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    val stream1 = numGenerate(1)
    println(stream1.head)
    println(stream1.tail)
    println(stream1)

  }

  def numGenerate(n: BigInt): Stream[BigInt] = n #:: numGenerate(n + 1)

  //生成斐波那契序列
  def fibFrom(a: Int, b: Int): Stream[BigInt] = {
    a #:: fibFrom(a, a + b)
  }
}
