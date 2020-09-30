package org.wfy.scala.Collection.TupleDemo

/*
* @Author wfy
* @Date 2020/9/30 11:44
* org.wfy.scala.Collection.TupleDemo
*/

object TupleDemo1 {
  def main(args: Array[String]): Unit = {
    val tuple1 = (1, 2, 3, "hello", 4)
    println(tuple1)
    println(tuple1._1) //元组访问，下标访问方式，_1开始
    println(tuple1.productElement(0)) // 模式匹配方式访问，0开始
    println(tuple1.getClass)

    //遍历元组，要使用迭代器
    for (i <- tuple1.productIterator) {
      println(i)
    }

  }
}
