package org.wfy.scala

/*
* @Author wfy
* @Date 2020/9/22 16:42
* org.wfy.scala
*/

object ScalaFieldOverride {
  def main(args: Array[String]): Unit = {
    val obj1: A2 = new B2
    val obj2: B2 = new B2

    //由于动态绑定机制obj1.age会调用B2地址对应的age方法，就会返回B2中age的值，20
    println("obj1.age = " + obj1.age)

    //本身的引用就是B2自己，返回20
    println("obj2.age = " + obj2.age)

    val obj3: A3 = new B3
    println("obj3.sal = " + obj3.sal())
  }
}

class A2 {
  val age: Int = 10 //会生成public age()方法
}

class B2 extends A2 {
  override val age: Int = 20 //会生成public age()方法
}

class A3 {
  def sal(): Int = {
    return 10
  }
}

class B3 extends A3 {
  override val sal: Int = 0
}