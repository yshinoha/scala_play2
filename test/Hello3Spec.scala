package user

import org.specs2._
class User2Spec extends Specification {

  def is = s2"""
  This is a specification to check the 'Hello world' string

  The 'Hello world' string should
  contain 11 characters            $e1
  """

  def e1 = {
    Users.putName("test3")
    val test = Users.getName()
    test mustEqual "test3"
  }

}
