object myfirstscala01 {

  def  getValue={

    val a=List(1,2,3,4,5,6,5,4,3,99,11,23,15)
    val b=a.filter(x=>x%2==1)
    println(s"a is:=${b}")
    val c="Red boolean get value x12 is my best favor."
    val d=c.toList
    println(s"d is:=${d}")
    val e=d.filter(x=>Character.isDigit(x))
    println(s"e is:=${e}")
  }


  def add1(x:Int,y:Int)={

   // println(x+":"+y)
  x+y
  }

  def main(args: Array[String]): Unit = {
    println(add1(2,3))
  }

}
