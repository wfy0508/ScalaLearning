package org.wfy.scala.CRMProject.App

import org.wfy.scala.CRMProject.View.CustomerView

/*
* @Author wfy1
* @Date 2020/10/7 22:04
* org.wfy.scala.CRMProject.App
*/

//主程序
object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }

}
