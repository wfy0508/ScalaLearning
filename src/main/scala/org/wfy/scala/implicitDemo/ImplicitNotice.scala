package org.wfy.scala.implicitDemo

/*
* @Author wfy
* @Date 2020/9/29 14:48
* org.wfy.scala.implicitDemo
*/

object ImplicitNotice {
  def main(args: Array[String]): Unit = {
    implicit def Double2Int(d: Double): Int = {
      d.toInt
      //val num: Int = 2.3 //错误！！！，隐式转换不能出现二义性，这样调用就是出现了递归调用
    }
  }
}
