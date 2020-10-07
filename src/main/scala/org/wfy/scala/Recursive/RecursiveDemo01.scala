package org.wfy.scala.Recursive

import java.text.SimpleDateFormat
import java.util.Date

/*
* @Author wfy
* @Date 2020/10/7 11:46
* org.wfy.scala.Recursive
*/

object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
    val dateFormat1: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat1.format(new Date())
    println("执行前的时间为: " + date)

    var result = BigInt(0)
    var num = BigInt(1)
    val maxVal = BigInt(99999999L)

    //while循环方式
    while (num <= maxVal) {
      result += num
      num += 1
    }
    println("result = " + result)

    val date1 = dateFormat1.format(new Date())
    println("执行完成后时间: " + date1)
  }
}
