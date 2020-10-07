package org.wfy.scala.Class

/*
* @Author wfy
* @Date 2020/9/10 17:55
* org.wfy.scala
*/

object TestScala {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("Jack", 20)
    println(p1)
  }
}

//Constructor构造器
class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  override def toString: String = {
    "name=" + this.name + "," + "age=" + this.age
  }

  def this(name: String){
    this("Jack", 10) //调用主构造器
    this.name = name
  }
}

