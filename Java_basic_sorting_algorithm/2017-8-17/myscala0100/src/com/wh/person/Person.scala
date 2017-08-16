package com.wh.person


class Person{
  private[this] var _name: String = "jack"

  def name: String = _name

  def name_=(value: String): Unit = {
    _name = value
  }

  private[this] var _age: Int = 21

  def age: Int = _age

  def age_=(value: Int): Unit = {
    _age = value
  }



  def sayhello(): Unit ={
    println(_name+":"+_age)
  }



}

object Person {
  def TestPerson(): Unit ={
    var person=new Person
    person.sayhello()
  }
  def main(args: Array[String]): Unit = {
    TestPerson
  }

}
