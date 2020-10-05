package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/10/5 19:46
* org.wfy.scala.Collection
*/

object ViewDemo01 {
  def main(args: Array[String]): Unit = {

    //没有使用View
    val sequences1 = (0 to 100)
      .filter(eq)
    println(sequences1)

    //使用View，返回SeqViewF(...)，不使用时不进行计算
    val sequences2 = (0 to 100)
      .view
      .filter(eq)
    println(sequences2)
  }

  //正序和逆序的数字相同
  def eq(i: Int): Boolean = {
    i.toString.equals(i.toString.reverse)
  }
}
