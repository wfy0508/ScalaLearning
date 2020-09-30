package org.wfy.scala.PackageTest

/*
* @Author wfy
* @Date 2020/9/20 16:00
* org.wfy.scala
*/

object packageTest {
  def main(args: Array[String]): Unit = {
    val p1 = new Person1
    println(p1.name)
  }
}

class Person1{
  private[scala] var name: String = "Jack"
  private var age: Int = 10
}