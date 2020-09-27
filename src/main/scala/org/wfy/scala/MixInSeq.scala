package org.wfy.scala

/*
* @Author wfy
* @Date 2020/9/24 15:03
* org.wfy.scala
*/

object MixInSeq {
  def main(args: Array[String]): Unit = {
    val ff = new FF()
    //输出顺序
    //    E...
    //    A...
    //    B...
    //    C...
    //    D...
    //    F...
    println(ff)

    val kk = new KK with CC with DD

    //输出顺序
    //    E...
    //    K...
    //    A...
    //    B...
    //    C...
    //    D...
    println(kk)
  }
}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B...")
}

trait CC extends BB {
  println("C...")
}

trait DD extends BB {
  println("D...")
}

class EE {
  println("E...")
}

class FF extends EE with CC with DD {
  println("F...")
}

class KK extends EE {
  println("K...")
}

trait LoggedException extends Exception {
  def log(): Unit = {
    println(getMessage)
  }
}

// UnhappyException 继承了Exception
//而LoggedException继承了Exception
//UnhappyException就成为了Exception的子类
class UnhappyException extends LoggedException {
  override def getMessage: String = {
    "错误"
  }
}

class UnhappyException2 extends IndexOutOfBoundsException with LoggedException {
  override def getMessage: String = {
    "Error!"
  }
}

class CCC{

}

//错误！原因是CCC不是Exception的子类
//class UnhappyException3 extends CCC with LoggedException{
//  override def getMessage: String = {
//    "Error!"
//  }
//}

//Logger就是自身类型，等价于trait Logger extends Exception
//要求混入该特质的类，也是Exception的子类
trait Logger {
  //明确告诉编译器，Logger就是Exception，如果没有这句话，getMessage不能调用
  this: Exception => {
    def log(): Unit = {
      //既然明确自身是Exception，就可以调用Exception的方法
      println(getMessage)
    }
  }
}

class Console extends Exception with Logger{} //正确