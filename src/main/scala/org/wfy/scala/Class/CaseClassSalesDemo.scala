package org.wfy.scala.Class

/*
* @Author wfy
* @Date 2020/10/6 18:14
* org.wfy.scala.Collection.caseClass
*/

//书籍打折销售案例

object SalesDemo {
  def main(args: Array[String]): Unit = {
    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("围城", 80), Book("秋", 30)))

    //准备工作1. 只匹配“漫画”这个词汇，_*表示屏蔽掉所有不关心的情况
    val res1 = sale match {
      case Bundle(_, _, Book(desc, _), _*) => desc
    }
    println("res1: " + res1)

    //准备工作2. @表示法：表示将嵌套绑定到变量book， _*将剩余的Item绑定到rest
    val res2 = sale match {
      case Bundle(_, _, book@Book(_, _), rest@_*) => (book, rest)
    }
    println("res2: " + res2)

    //准备工作3. 不想接收某些值，使用_*将剩余的Item绑定到rest，去掉外层的WrappedArray
    val res3 = sale match {
      case Bundle(_, _, book@Book(_, _), rest) => (book, rest)
    }
    println("res3: " + res3)

    //调用discountPrice计算打折后的价格
    println("打折后的价格=" + discountPrice(sale))
  }


  def discountPrice(it: Item): Double = {
    it match {
      case Book(_, p) => p
      //生成一个新的集合，_*是将its中每个循环的元素传递到price中it中，递归操作
      case Bundle(_, discount, its@_*) => its.map(discountPrice).sum - discount
    }
  }

}

//设计样例类
abstract sealed class Item

case class Book(desc: String, price: Double) extends Item

case class Bundle(desc: String, discount: Double, item: Item*) extends Item //Item*接收一个Item类型的变长参数
