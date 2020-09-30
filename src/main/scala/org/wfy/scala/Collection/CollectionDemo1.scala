package org.wfy.scala.Collection

import scala.collection.mutable.ArrayBuffer

/*
* @Author wfy
* @Date 2020/9/29 16:08
* org.wfy.scala.collection
*/

object CollectionDemo1 {
  def main(args: Array[String]): Unit = {
    val a = new ArrayBuffer[Int]()
    a += 10
    println(a.hashCode())
    a += 20
    println(a.hashCode())

    for (i <- a) {
      println(i)
    }

    println("********")

    val b = new Array[Int](5)
    b(0) = 10
    println(b.hashCode())
    b(1) = 20
    println(b.hashCode())

    val arr = Array.ofDim[Int](3, 4)
    for (i <- arr) {
      for (j <- i) {
        print(j + "\t")
        i equals()
      }
      println()
    }


  }

}
