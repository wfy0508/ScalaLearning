package org.wfy.scala.traitCode

/*
* @Author wfy
* @Date 2020/9/23 16:09
* org.wfy.scala
*/

object AddTrait {
  def main(args: Array[String]): Unit = {
    // 创建myDb时动态混入Data和File
    // 创建一个对象时，执行顺序是怎样的
    //1. Operate
    //2. Data
    //3. DB
    //4. File
    val myDb = new MySQL with DB with File
    println(myDb)


    myDb.insert(100)
  }
}

trait Operate {
  println("Operate")

  def insert(id: Int)
}

trait Data extends Operate { //继承了Operate
  println("Data4")

  override def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB extends Data {
  println("DB")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File extends Data {
  println("File")

  override def insert(id: Int): Unit = {
    println("向文件")
    super[Data].insert(id) //调用insert方法，这里的super是在动态混入时，不一定是父类
  }
}

class MySQL {

}