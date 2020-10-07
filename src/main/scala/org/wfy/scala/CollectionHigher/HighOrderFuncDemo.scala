package org.wfy.scala.CollectionHigher

/*
* @Author wfy
* @Date 2020/10/4 21:16
* org.wfy.scala.CollectionHigherDemo
*/

object HighOrderFuncDemo {
  def main(args: Array[String]): Unit = {
    test(sayOk)
    val f1 = sayOk _ //加上一个下划线表示，将一个函数赋值给一个变量，但是不执行该函数
  }

  //定义一个高阶函数，接收一个无参函数作为入参
  def test(f: () => Unit): Unit = {
    f()
  }

  def sayOk(): Unit = {
    println("Ok!")
  }

  def sayHello(n: Int): Unit = {
    println("n: " + n)
  }
}
