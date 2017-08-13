
class User {
  private[this] var _name: Any ="javac"

  def name: Any = _name

def name_=(value: Any): Unit = {
    _name = value
  }

  private[this] var _age: Any = _

   def age: Any = _age

  def age_=(value: Any): Unit = {
    _age = value
  }


  override def toString = s"User($name, $age)"
}

object User {


  def  getUserParam1(): Unit ={

    var user=new User
    var name=user.name
    println(name)

  }


  def main(args: Array[String]): Unit = {
  getUserParam1
  }

}
