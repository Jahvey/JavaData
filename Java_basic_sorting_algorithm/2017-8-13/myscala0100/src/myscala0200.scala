object myscala0200 {

  def  adds(x:Int*)={x.sum}



  def if01(): Unit ={

    var result=0
    var a=99
    var b=11
    result=if(a>b) 1 else -1//if can get result
    //
    println(s"result is:=${result}")

  }

  def  for01(): Unit ={

    for(x<- 1 to 10){
      println(x)//[1,10]
    }
  }


  def for02(): Unit ={
    for(i <- 1 until  10){//[1,10)
      println(i)
    }
  }



  def   for03(): Unit ={
    //for can contain if statement

    for(i<- 1 to 10 if(i%2==1)){
      println(s"i :=${i}")
    }
  }




  def main(args: Array[String]): Unit = {
   // println(2)
    //println(adds(1,3,4,8,44))
    //if01
    //for02
    for03
  }

}
