package org.wfy.scala.Class

/*
* @Author wfy
* @Date 2020/9/20 16:24
* org.wfy.scala
*/

object AbstractBankTest {
  def main(args: Array[String]): Unit = {
    val b = new Bank("123456", 1000.0, "111111")
    b.query("111111")
    println("取款金额为：" + b.withdraw("111111", 200.0))
    b.query("111111")

  }
}

class Bank(inAccount: String, inBalance: Double, inPasswd: String) {
  private val accNo: String = inAccount
  private var balance: Double = inBalance
  private val passWd: String = inPasswd

  //查询
  def query(pwd: String): Unit = {
    if (!this.inPasswd.equals(pwd)) {
      println("密码错误")
      return
    }
    printf("账号%s, 当前余额为%.2f\n", this.accNo, this.balance)
  }

  //取款
  def withdraw(pwd: String, money: Double): Any = {
    if (!this.inPasswd.equals(pwd)) {
      println("密码错误")
      return
    }

    if (this.balance < money) {
      println("余额不足")
      return
    }

    this.balance = this.balance - money
    money
  }
}
