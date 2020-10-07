package org.wfy.scala.Inherit

import scala.beans.BeanProperty

/*
* @Author wfy
* @Date 2020/9/18 16:26
* org.wfy.scala
*/

object AttributeTest {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("Jack")
    worker.name //不能访问inName

    val worker1 = new Worker1("Smith")
    worker1.inName //可以访问inName

    val worker2 = new Worker2("Tom")
    worker2.inName = "Jack"
    println(worker2.inName)
  }
}

//1 如果主构造器是Worker(inName: String)，那么inName是主构造器的一个局部变量
class Worker(inName: String) {
  var name: String = inName
}

//2 如果主构造器是Worker(val inName: String)，那么inName是主构造器的一个私有、只读属性
class Worker1(val inName: String) {
  var name: String = inName
}

//3 如果主构造器是Worker(val inName: String)，那么inName是主构造器的一个私有、只读属性
class Worker2(var inName: String) {
  var name: String = inName
}

class Car{
  @BeanProperty var name: String = null
}

class Manager(var name: String){
  //第一种形式，使用相对路径
  @BeanProperty var age: Int = _
  //第二种形式，和第一种一样，也是使用相对路径
  @scala.beans.BeanProperty var age2: Int = _
  //第三种情况，使用绝对路径，已解决包名冲突
  @_root_.scala.beans.BeanProperty var age3: Int = _
}
