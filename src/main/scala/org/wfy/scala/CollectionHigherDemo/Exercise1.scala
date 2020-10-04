package org.wfy.scala.CollectionHigherDemo

/*
* @Author wfy
* @Date 2020/10/4 21:35
* org.wfy.scala.CollectionHigherDemo
*/

object Exercise1 {
  def main(args: Array[String]): Unit = {
    val list1 = List("Alice", "Bob", "Tom")
    val list2 = list1.map(x => x.toUpperCase)
    println("list2: " + list2 + "\n")

    //flatMap操作，将所有元素打散
    println(list2.flatMap(x => x.toUpperCase) + "\n")

    //过滤
    println(list2.filter(filterStartA) + "\n")

    //化简--求和
    val list3 = List(1, 20, 89, 4, 8)
    println("The result of SUM is : " + list3.reduce(sum) + "\n")

    //fold
    val list4 = List(1, 2, 3, 4)
    println("Fold left: " + list4.foldLeft(5)(minus))
    println("Fold right: " + list4.foldRight(5)(minus) + "\n")
  }

  def filterStartA(s: String): Boolean = {
    s.startsWith("A")
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def minus(a: Int, b: Int): Int = {
    a - b
  }

}
