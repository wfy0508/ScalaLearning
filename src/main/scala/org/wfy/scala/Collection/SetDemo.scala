package org.wfy.scala.Collection

import scala.collection.mutable

/*
* @Author wfy
* @Date 2020/10/4 16:45
* org.wfy.scala.Collection
*/

object SetDemo {
  def main(args: Array[String]): Unit = {
    val array = "See Spot run. Run, Spot. Run!".split("[ !,.]+")
    val set1 = mutable.Set.empty[String]
    //添加元素
    for (arr <- array) set1 += arr.toLowerCase
    set1.add("Hello")
    set1.add("world")
    println(set1)

    //删除元素
    set1.remove("Hello")
    set1 -= "Hello"
    println(set1)
  }
}
