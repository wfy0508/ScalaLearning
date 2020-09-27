package org.wfy.scala

/*
* @Author wfy
* @Date 2020/9/27 10:56
* org.wfy.scala
*/

object ImplicitDemo2 {
  def main(args: Array[String]): Unit = {
    import JosProfs._
    Greeter.greet("Joe")
    println("*********")
    Greeter.greet("jack")(prompt, drink)

    println("maxValue=" + maxListOrdering(List(1, 7, 3, 4, 9, 5)) +
      ", 类型为：" + maxListOrdering(List(1, 7, 3, 4, 9, 5)).getClass)

    println("maxValue=" + maxListOrdering(List(1.0, 70.0, 3.5, 4.2, 9.9, 5.8)) +
      ", 类型为：" + maxListOrdering(List(1.0, 70.0, 3.5, 4.2, 9.9, 5.8)).getClass)

    println("maxValue=" + maxListOrdering(List("a", "abc", "tg", "like", "scala")) +
      ", 类型为：" + maxListOrdering(List("a", "abc", "tg", "like", "scala")).getClass)
  }

  //将第二个参数声明为隐式参数，这样在编译时从第一个参数elements就可以知道参数的类型
  //就可以根据类型，比如像String, Int，给出正确的排序
  def maxListOrdering[T](elements: List[T])(implicit ordering: Ordering[T]): T = elements match {
    case List() => throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest => val maxRest = maxListOrdering(rest)(ordering)
      if (ordering.gt(x, maxRest)) x else maxRest
  }
}

case class PreferredPrompt(val preference: String)

case class PreferredDrink(val preference: String)

object Greeter {
  def greet(name: String)(implicit prompt: PreferredPrompt, drink: PreferredDrink): Unit = {
    println("Welcome, " + name + ". The System is ready!")
    println("Would you like drink a cup of " + drink.preference)
    println(prompt.preference)
  }
}

object JosProfs {
  implicit val prompt: PreferredPrompt = new PreferredPrompt("Yes, Master!")
  implicit val drink: PreferredDrink = new PreferredDrink("tea")
}

