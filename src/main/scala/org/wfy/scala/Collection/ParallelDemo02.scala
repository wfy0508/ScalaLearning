package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/5 20:08
* org.wfy.scala.Collection
*/

object ParallelDemo02 {
  def main(args: Array[String]): Unit = {
    val result1 = (0 to 100).map { _ => Thread.currentThread().getName }.distinct
    val result2 = (0 to 100).par.map { _ => Thread.currentThread().getName }.distinct
    println("常规执行线程名称：" + result1)
    println()
    println("并行执行线程名称：" + result2)
  }
}
