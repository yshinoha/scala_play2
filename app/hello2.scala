package user

object Users extends App {
  var _name = "test1"

  def func1() = {
    _name = "test2"
  }

  def putName(name: String) = {
    _name = name
  }

  def getName(): String  = {
    _name

    //他に対象が存在しない場合は、return省略可能？
    //return _name
  }

  def getAll() : List[Map[Symbol,String]] = {
    List(Map('name -> "shinofara", 'age -> "12"),
         Map('name -> "shinohara", 'age -> "12"),
         Map('name -> "sinofara", 'age -> "20")
         )
  }
}
