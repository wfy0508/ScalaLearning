package org.wfy.scala.TraitCode

/*
* @Author wfy
* @Date 2020/9/24 11:01
* org.wfy.scala
*/

object MixedTrait {
  def main(args: Array[String]): Unit = {
    val mysql1 = new MySQL1 with DB1 with File1

    //将数据保存到文件中...
    //将数据保存到数据库中...
    mysql1.insert(666)

    //这个混入方式是错误的，在File1中调用super去查找父特质，发现它是抽象的，无法调用
    val mysql2 = new MySQL1 with DB1
    mysql2.insert(999)
  }

}

trait Operate1 {
  def insert(id: Int)
}

trait File1 extends Operate1 {
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中...")
    super.insert(id)
  }
}

trait DB1 extends Operate1 {
  override def insert(id: Int): Unit = {
    println("将数据保存到数据库中...")
  }
}

class MySQL1 {

}