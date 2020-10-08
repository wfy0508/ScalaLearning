package org.wfy.scala.CRMProject.View

import org.wfy.scala.CRMProject.Bean.Customer
import org.wfy.scala.CRMProject.Service.CustomerService

import scala.io.StdIn

/*
* @Author wfy
* @Date 2020/10/7 21:54
* org.wfy.scala.CRMProject.View
*/

//客户展示界面
class CustomerView {

  //定义一个循环变量，控制是否退出while循环
  var loop = true
  //定义一个key，用于接收用户输入
  var key = ' '

  val customerService = new CustomerService()

  def mainMenu(): Unit = {
    do {
      println("---------------客户信息管理软件---------------")
      println("               1 添 加 客 户")
      println("               2 修 改 客 户")
      println("               3 删 除 客 户")
      println("               4 客 户 列 表")
      println("               5 退      出")
      println("请选择（1-5）：")
      key = StdIn.readChar()
      key match {
        case '1' => this.addCustomer()
        case '2' => println("修 改 客 户")
        case '3' => this.delCustomer()
        case '4' => this.showDetails()
        case '5' => this.loop = false
        case _ => this.loop = false
      }
    } while (loop)
    println("您退出了软件")
  }

  def showDetails(): Unit = {
    println()
    println("-----------------------客 户 列 表-----------------------")
    println("编号\t姓名\t性别\t年龄\t电话\t邮箱")
    //for遍历
    val customers = customerService.list()
    for (customer <- customers) {
      println(customer)
    }
    println("-----------------------客户列表完成-----------------------")
    println()
  }

  //添加客户
  def addCustomer(): Unit = {
    println()
    println("-----------------添加客户-----------------")
    println("姓名：")
    val name = StdIn.readLine()
    println("性别：")
    val gender = StdIn.readChar()
    println("年龄：")
    val age = StdIn.readShort()
    println("电话：")
    val tel = StdIn.readLine()
    println("邮箱：")
    val email = StdIn.readLine()

    val customer = new Customer(name, gender, age, tel, email)
    customerService.add(customer)
    println("----------------添加客户完成----------------")
    println()
  }

  //删除客户
  def delCustomer(): Unit = {
    println()
    println("-----------------删除客户-----------------")
    println("请选择待删除的编号（1-5）：")
    val id = StdIn.readInt()
    if (id == -1) {
      println("删除没有完成")
      return
    }
    println("确认是否删除（Y/N）：")
    val choice = StdIn.readChar().toLower
    if (choice == 'y') {
      if (customerService.delCustomer(id)) {
        println("删除完成")
        return
      }
    }
    println("删除没有完成")
  }
}
