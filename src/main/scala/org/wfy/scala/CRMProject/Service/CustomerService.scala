package org.wfy.scala.CRMProject.Service

import org.wfy.scala.CRMProject.Bean.Customer

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

/*
* @Author wfy
* @Date 2020/10/7 22:10
* org.wfy.scala.CRMProject.Service
*/

//客户业务逻辑处理
class CustomerService {
  var customerNum = 1
  val customers = ArrayBuffer(new Customer(1, "Tom", '男', 10, "110", "tom@sohu.com"))

  def list(): ArrayBuffer[Customer] = {
    this.customers
  }

  //添加客户
  def add(customer: Customer): Boolean = {
    customerNum += 1
    customer.id = customerNum

    //加入到customers中
    customers.append(customer)
    true
  }

  //根据索引找到id
  def findIndexById(id: Int): Int = {
    var index = -1
    breakable {
      for (i <- customers.indices) {
        if (customers(i).id == id) {
          index = i
          break()
        }
      }
    }
    index
  }

  //删除客户信息
  def delCustomer(id: Int): Boolean = {
    val index = findIndexById(id)
    if (index != -1) {
      customers.remove(index)
      true
    } else {
      false
    }
  }
}
