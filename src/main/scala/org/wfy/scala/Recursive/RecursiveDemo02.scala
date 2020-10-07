package org.wfy.scala.Recursive

import java.text.SimpleDateFormat
import java.util.Date

import scala.annotation.tailrec

/*
* @Author wfy
* @Date 2020/10/7 11:58
* org.wfy.scala.Recursive
*/

object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {
    val dateFormat2: SimpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    val date = dateFormat2.format(new Date())
    println("执行前的时间为: " + date)

    val num = BigInt(1)
    val sum = BigInt(0)
    //尾递归方式
    val result2 = tailSum(num, sum)
    println("result2 = " + result2)

    val date1 = dateFormat2.format(new Date())
    println("执行完成后时间: " + date1)
  }


  //尾递归
  @tailrec
  def tailSum(num: BigInt, sum: BigInt): BigInt = {
    if (num <= 99999999L) tailSum(num + 1, sum + num) else sum
  }
}
