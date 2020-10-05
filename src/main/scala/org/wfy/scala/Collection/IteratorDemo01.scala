package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/5 19:27
* org.wfy.scala.Collection
*/

object IteratorDemo01 {
  def main(args: Array[String]): Unit = {
    val iterator = List(1, 2, 3, 4, 5).iterator
    println("第一种遍历方式：")
    for (i <- iterator) println(i)

    val iterator1 = List(1, 2, 3, 4, 5).iterator
    println("第二种遍历方式：")
    while(iterator1.hasNext) println(iterator1.next())
  }

}
