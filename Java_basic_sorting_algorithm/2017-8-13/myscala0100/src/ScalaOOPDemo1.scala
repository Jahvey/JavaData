

//在scala中，类默认是public 得，
// 而且一个源文件 中可以包含多个public类，
// 源文件名可以与文件中定义得类名不一致
class Person{


 var name: String = "Jack"




  //在普通类中，不允许声明一个未指定值的成员变量，
  // 如果不想给初始值，也必须使用占位符指定
  var age:Int=_
  //定义一个私有的成员，
  private [this] val gender:String="man"
//可以对外提供一个getter方法来对外提供访问
  def  getGender:String={
    this.gender
  }



  def sayHello(msg:String): Unit ={
    println(msg)
  }


}



object Person{

  def main(args: Array[String]): Unit = {
    //默认无参构造函数，可以不使用括号
    val p=new Person
    p.name="Jack2"
    p.age=11
    //跟Java一样，不能对私有成员变量进行访问
    println(p.getGender)
    println(p.name)
    println(p.age)

  }

}


class ScalaOOPDemo1 {

}
object  ScalaOOPDemo1{



  def main(args: Array[String]): Unit = {
    //println(32)
  }

}


