package org.wfy.scala.Collection

/*
* @Author wfy
* @Date 2020/9/30 15:08
* org.wfy.scala.Collection
*/

object ListDemo {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1, 2, 3, "hello", "world")
    println(lst1)

    //lst1作为元素，加入列表中
    //返回 List(0, List(1, 2, 3, hello, world))
    val lst2 = 0 :: lst1 :: Nil
    println(lst2)

    //lst1中的每个元素逐个取出放入列表中
    //返回 List(0, 1, 2, 3, hello, world)
    val lst3 = 0 :: lst1 ::: Nil
    println(lst3)
    println(lst3.head)
    println(lst3.tail)
  }

}
