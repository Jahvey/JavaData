package com.wh.person


//class有一个默认的无参构造器
//带参数的构造器，语法就是直接在类名后面直接跟参数
//而且，构造器的形参会被编译器直接编译成成员变量

class Book(val name:String,var price:Float){
  //Scala中的一些特性
  //类中定义的语句其实就是在主类的构造器方法中
  //

  println("这是Book类的主要构造器")

  def sayHello(): Unit ={

    println("这就是我要求的效果,")
  }


  sayHello()
}

object Book{
  def main(args: Array[String]): Unit = {
    var b=new Book("spark",32)



  }
}
