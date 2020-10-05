package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/5 20:04
* org.wfy.scala.Collection
*/

object ParallelDemo01 {
  def main(args: Array[String]): Unit = {
    //串行执行
    (1 to 5).foreach(println(_))

    println()

    //并行执行
    (1 to 5).par.foreach(println(_))
  }
}
