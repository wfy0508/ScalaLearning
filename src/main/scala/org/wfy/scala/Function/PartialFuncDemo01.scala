package org.wfy.scala.Function

/*
* @Author wfy
* @Date 2020/10/6 20:59
* org.wfy.scala.Collection
*/

object PartialFuncDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, "abc")

    // PartialFunction[Any, Int]表示偏函数接收的类型为Any，返回类型为Int
    val partialFunc = new PartialFunction[Any, Int] {
      //如果返回true，就会调用apply方法构建对象实例，如果是false则过滤掉传入的x
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    //使用偏函数，不能使用map，要是用connect
    val list2 = list1.collect(partialFunc)
    println("默认偏函数实现：" + list2)

    //简化形式1
    def partialFunc1: PartialFunction[Any, Any] = {
      case i: Int => i + 1
      case j: Double => j * 2 //可以添加对不同类型不同的处理逻辑
      case k: String => k.toUpperCase //可以添加对不同类型不同的处理逻辑
    }

    val list3 = list1.collect(partialFunc1)
    println("简化形式1：" + list3)

    //简化形式2
    val list4 = list1.collect {
      case i: Int => i + 1
      case j: Double => j * 2 //可以添加对不同类型不同的处理逻辑
      case k: String => k.toUpperCase //可以添加对不同类型不同的处理逻辑
    }
    println("简化形式2：" + list4)
  }
}
