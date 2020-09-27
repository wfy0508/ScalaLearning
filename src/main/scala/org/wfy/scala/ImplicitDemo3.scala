package org.wfy.scala

/*
* @Author wfy
* @Date 2020/9/27 17:31
* org.wfy.scala
*/

object ImplicitDemo3 {
  def main(args: Array[String]): Unit = {
    implicit def addDelete(db: ImpMysql): ImpDB = {
      new ImpDB
    }

    val mysql = new ImpMysql
    mysql.insert()
    mysql.delete() //通过隐式转换增加ImpMysql的delete功能，后台执行addDelete(ImpMysql).delete()
  }

}

class ImpMysql {
  def insert(): Unit = {
    println("insert")
  }

  //  def delete(): Unit = {
  //    println("MysqlDB")
  //  }
}

class ImpDB {
  def delete(): Unit = {
    println("DB")
  }
}