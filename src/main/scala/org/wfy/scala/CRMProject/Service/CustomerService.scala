package org.wfy.scala.CRMProject.Service

import org.wfy.scala.CRMProject.Bean.Customer

import scala.collection.mutable.ArrayBuffer

/*
* @Author wfy
* @Date 2020/10/7 22:10
* org.wfy.scala.CRMProject.Service
*/

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
}
