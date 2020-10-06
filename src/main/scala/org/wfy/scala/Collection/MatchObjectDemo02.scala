package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/6 17:21
* org.wfy.scala.Collection
*/

object MatchObjectDemo02 {
  def main(args: Array[String]): Unit = {
    val str = "Alice,Bob,Jack"
    str match {
      case Names(first, second, third) => {
        println("The string contains three people's name:")
        println(s"$first $second $third")
      }
      case _ => println("Nothing matched.")
    }
  }
}


object Names {
  //unapplySeq处理变长参数
  def unapplySeq(arg: String): Option[Seq[String]] = {
    if (arg.contains(",")) Some(arg.split(",")) else None
  }
}