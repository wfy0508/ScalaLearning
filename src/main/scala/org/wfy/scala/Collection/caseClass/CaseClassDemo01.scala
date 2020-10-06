package org.wfy.scala.Collection.caseClass

/*
* @Author wfy
* @Date 2020/10/6 17:52
* org.wfy.scala.Collection.caseClass
*/

object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
    //1. 使用样例类做对象匹配
    val amount = Array(Dollar(1000.0), Currency(2000.0, "RMB"), NoAmount)
    for (amt <- amount) {
      val result = amt match {
        case Dollar(x) => "$" + x
        case Currency(x, y) => x + " " + y
        case NoAmount => ""
        case _ => "Nothing matched!"
      }
      println(amt + ": " + result)
    }

    println("-----------------------------------------------")

    //2. 克隆：copy
    val amt1 = new Currency(3000.0, "USD")
    println("amt1: " + amt1)

    val amt2 = amt1.copy() //不加参数，默认使用已有参数值
    println("amt2: " + amt2)

    val amt3 = amt1.copy(unit = "RMB") //copy并修改unit值
    println("amt3: " + amt3)
  }
}


abstract sealed class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount
