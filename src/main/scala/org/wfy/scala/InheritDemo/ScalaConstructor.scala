package org.wfy.scala.InheritDemo

/*
* @Author wfy
* @Date 2020/9/22 14:09
* org.wfy.scala
*/

object ScalaConstructor {
  def main(args: Array[String]): Unit = {

    val stu = new Student("Tom")
  }

}

class Person2(pName: String) {
  var name: String = pName
  println(name)

  def this() {
    this("Jack")
    println("Person辅助构造器")
  }
}

class Student extends Person2 {
  println("Student")

  def this(sName: String) {
    this
    this.name = sName
    println("Student constructor")
  }
}