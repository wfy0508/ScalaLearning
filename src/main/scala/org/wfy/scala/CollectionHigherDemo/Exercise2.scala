package org.wfy.scala.CollectionHigherDemo

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable

/*
* @Author wfy
* @Date 2020/10/5 18:44
* org.wfy.scala.CollectionHigherDemo
*/

object Exercise2 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAABBBBBBCCCCCCDDDDDD"

    //flatMap
    val arrayBuffer: ArrayBuffer[Char] = new ArrayBuffer[Char]()
    sentence.foldLeft(arrayBuffer)(putArrayBuffer)
    println("flatMap: arrayBuffer = " + arrayBuffer)

    //immutable Map
    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)
    println("immutable: map2 = " + map2)

    //mutable Map
    val map3 = mutable.Map[Char, Int]()
    sentence.foldLeft(map3)(charCount2)
    println("mutable: map3 = " + map3)

    //wordCount
    val list = List("hello world", "hello scala", "hello world", "word power")
    println("wordCount = " + wordCount(list))
  }

  //foldLeft练习
  def putArrayBuffer(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

  //charCount练习(immutable)，每次计算都要返回一个新的Map，效率低下
  def charCount(map: Map[Char, Int], c: Char): Map[Char, Int] = {
    map + (c -> (map.getOrElse(c, 0) + 1))
  }

  //charCount练习(mutable)
  def charCount2(map: mutable.Map[Char, Int], c: Char): mutable.Map[Char, Int] = {
    map += (c -> (map.getOrElse(c, 0) + 1))
  }

  def wordCount(list: List[String]): mutable.Map[String, Int] = {
    val wc = mutable.Map[String, Int]()
    val splitList = list.flatMap(x => x.split("[ ,.!]+"))
    for (i <- splitList) {
      if (splitList.contains(i)) {
        wc += (i -> (wc.getOrElse(i, 0) + 1))
      }
    }
    wc
  }
}
