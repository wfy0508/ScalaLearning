package org.wfy.scala.Collection

import scala.collection.mutable._
import scala.collection.mutable

/*
* @Author wfy
* @Date 2020/9/30 11:24
* org.wfy.scala.collection
*/

object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {

    //1. Scala ArrayBuffer转换成Java List
    val arrBuf = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arrBuf)
    val arrList = javaArr.command()
    println(arrList)

    //2. Java List转换成Scala ArrayBuffer
    //asScalaBuffer是一个隐式转换
    import scala.collection.JavaConversions.asScalaBuffer
    val scalaArr: mutable.Buffer[String] = arrList
    scalaArr.append("Hello")
    println(scalaArr)
  }
}
