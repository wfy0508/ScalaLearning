package org.wfy.scala.AbstractClass

/*
* @Author wfy
* @Date 2020/9/23 14:30
* 
*/

object AbstractClass {
  def main(args: Array[String]): Unit = {
    val animal = new Animal { //匿名子类实现
      override def sayHello(): Unit = {
        println("hello")
      }

      override val food: String = ""
    }
    animal.sayHello()
  }
}

abstract class Animal {
  def sayHello()

  val food: String
}
