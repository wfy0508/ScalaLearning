package org.wfy.scala.PackageTest

/*
* @Author wfy
* @Date 2020/9/13 20:43
* org.wfy.scala
*/

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.age = 10
    cat.color = "white"
    cat.name = "cat"
    print("ok")
  }

}

class Cat {
  var name: String = ""
  var age: Int = 0
  var color: String = _
}
