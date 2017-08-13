object TestFuncParam1 {

  def  array01(): Unit ={
    var arr=new Array[String](6)
    for(i <- 0 until arr.length) arr(i)=i+""
    for(i <- 0 until arr.length)println(arr(i))
  }


  def  array02(): Unit ={
    var arr=new Array[String](6)
    //arr.foreach(i => "" + i)
    for(i <- 0 until(arr.length)) arr(i)=i+""
    for(i <- arr)println(i)
  }



  def main(args: Array[String]): Unit = {
    array02
  }
}
