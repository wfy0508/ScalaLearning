package org.wfy.scala.ImplicitDemo

/*
* @Author wfy
* @Date 2020/9/29 14:11
* org.wfy.scala.implicitDemo
*/

object ImplicitClass {
  def main(args: Array[String]): Unit = {
    //ImpDB会对应生成隐式类
    implicit class DB(val m: MysqlDB) {
      def addSuffix(): Unit = {
        m + "Scala"
      }
    }

    val mysql = new MysqlDB
    mysql.sayOk()
    mysql.addSuffix() //如何关联的？？？
    //通过反编译代码后查看，会生成DB$2(mysql).addSuffix
  }

}

class MysqlDB {
  def sayOk(): Unit = {
    println("Ok!")
  }
}
