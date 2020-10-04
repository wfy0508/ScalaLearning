package org.wfy.scala.Collection

import scala.collection.mutable

/*
* @Author wfy
* @Date 2020/10/3 20:20
* org.wfy.scala.Collection
*/

object MapDemo {
  def main(args: Array[String]): Unit = {

    val map1 = mutable.Map("China" -> "Beijing", "America" -> "Washington")
    println(map1)

    // 获取Map中的值
    println(map1("China"))
    println(map1.get("China")) //存在，返回Some(Beijing)
    println(map1.get("Germany")) //不存在，返回None
    println(map1.getOrElse("Germany", "默认值为<.)))><<")) //不存在，设置默认返回值

    //添加元素，已有的key会更新
    map1 += ("French" -> "Paris")

    //删除元素，key不存在也不会报错
    map1 -= ("America")

    //遍历Map
    for (v <- map1.keys) println(v)
    for (v <- map1.values) println(v)
    for ((k, v) <- map1) println(k + " is mapped to " + v)

    //创建空Map
    val map2 = new mutable.HashMap[String, Int]
    println(map2)
  }
}
