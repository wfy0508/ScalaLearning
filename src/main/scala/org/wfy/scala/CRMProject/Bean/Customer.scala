package org.wfy.scala.CRMProject.Bean

/*
* @Author wfy
* @Date 2020/10/7 21:42
* org.wfy.scala.CRMProject
*/

//客户信息
class Customer {
  //属性
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var tel: String = _
  var email: String = _

  //辅助构造器1
  def this(id: Int, name: String, gender: Char, age: Short, tel: String, email: String) {
    this
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }

  //辅助构造器2
  def this(name: String, gender: Char, age: Short, tel: String, email: String) {
    this
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }

  //格式化输出Customer
  override def toString: String = {
    this.id + "\t\t" + this.name + "\t\t" + this.gender + "\t\t" + this.age + "\t\t" + this.tel + "\t\t" + this.email
  }
}
