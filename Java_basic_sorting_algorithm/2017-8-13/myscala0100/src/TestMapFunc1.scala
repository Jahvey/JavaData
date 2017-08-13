object TestMapFunc1 {



  def  map01(): Unit ={

    val map=Map("jack"->18,"wang"->19)
    val m1=map("jack")
    println(s"m1 is:=${m1}")
    val m2=map.get("wang")
    println(s"m2 is:=${m2}")
    //get or else
    //if map contain this key,get value from map
    ///else if map not contain this key,put this value into map.
    val m3=map.getOrElse("jack1",22)
    println(s"m3 is:=${m3}")
    //keys() this function return all of key in the map collection
    println(s"keys() is:=${map.keys}")
    //values() this fucntion return all of value in the map collection
    println(s"values() is:=${map.values}")

  }


/**
  *
  *result:
map key contains :=Set(jim, tom)
map contains:=Map(jim -> 22, tom -> 16)
keys is:=jim,values is;=22
keys is:=tom,values is;=16
  *
  * */
  def map02(): Unit ={
    //use this collection.map can alter map.length

    val map=scala.collection.mutable.Map("tom"->16)
    map+=("jim"->22)
    println(s"map key contains :=${map.keys}")
    println(s"map contains:=${map}")

    //foreach every elem of this map
    for((k,v)<- map){
      println(s"keys is:=${k},values is;=${v}")
    }

    //only foreach every elem of this map key
    for((_,v)<- map){
      println(s"keys is;=,values is;=${v}")
    }

    //only get foreach every elem of this map value
    for((k,_)<- map){
      println(s"keys is;=${k}")
    }



  }



  def  tuple01(): Unit ={
    val tuple01=(1,2,3,4,5,6,7)
    println(s"tuple01 first elem is;="+tuple01._7)


    //foreach elem of tuple
    //use this .productIterator function get each elem of this tuple
    for( i <- tuple01.productIterator)println(s"tuple of this elem:=${i}")




  }






  def main(args: Array[String]): Unit = {
    //map02
    tuple01
  }

}
