package org.wfy.scala.CollectionHigherDemo

/*
* @Author wfy
* @Date 2020/10/4 17:09
* org.wfy.scala.CollectionHigherDemo
*/

object mapOperateDemo1 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 3, 4, 7, 9)
    println("list1: " + list1)

    //匿名函数
    val list2 = list1.map(x => x * 3)
    println("list2: " + list2)

    //使用高阶函数
    val list3 = list1.map(multiple)
    println("list3: " + list3)

  }

  def multiple(n: Int): Int = {
    n * 2
  }
}
