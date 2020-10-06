package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/6 17:10
* org.wfy.scala.Collection
*/

object MatchObjectDemo01 {
  def main(args: Array[String]): Unit = {
    val number: Double = 36.0 //写成Square(6.0)是一样的
    number match {
      case Square(arg) => println(arg) //当Square(arg)返回Some(x)时就算匹配成功，如果返回None表示匹配失败
      case _ => println("nothing matched!")
    }
  }
}

object Square {
  def unapply(arg: Double): Option[Double] = {
    println("unapply被调用, arg = " + arg)
    Some(math.sqrt(arg))
  }

  def apply(arg: Double): Double = {
    println("apply被调用, arg = " + arg)
    arg * arg
  }
}
