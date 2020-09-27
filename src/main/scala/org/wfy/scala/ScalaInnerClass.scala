package org.wfy.scala

/*
* @Author wfy
* @Date 2020/9/25 10:46
* org.wfy.scala
*/

object ScalaInnerClass {
  def main(args: Array[String]): Unit = {
    //创建外部类实例
    val outer1: ScalaOuterClass = new ScalaOuterClass
    val outer2: ScalaOuterClass = new ScalaOuterClass

    //创建内部类实例，默认情况下，内部类实例和外部类实例对象关联
    val inner1 = new outer1.ScalaInnerClass
    val inner2 = new outer2.ScalaInnerClass
    println(inner1)
    println(inner2)

    //内部类访问外部类的属性
    inner1.info()

    //创建静态内部类实例
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass
    println(staticInner)

    //类型投影
    inner2.test(inner1)

  }
}

//伴生对象
object ScalaOuterClass {

  class ScalaStaticInnerClass {

  }

}

//外部类
class ScalaOuterClass {

  myOuter =>

  class ScalaInnerClass {
    def info(): Unit = {
      //内部类如果想要访问外部类的属性，可以通过外部类对象访问，方法为：外部类名.this.属性名
      println("name=" + myOuter.name + ", sal=" + myOuter.salary)
    }

    //这个方法使用了类型投影，可以屏蔽外部对象对内部对象的影响，使用时只要满足是ScalaInnerClass类型即可
    def test(ic: ScalaOuterClass#ScalaInnerClass): Unit = {
      println("使用了类型投影 " + ic)
    }
  }

  val name = "scott"
  private val salary: Double = 10000.90
}