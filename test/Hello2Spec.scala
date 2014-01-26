package user

import org.specs2.mutable._
import org.specs2.specification.Scope
//import org.specs2.matcher.Matcher

class UsersSpec extends Specification {

  "helloという変数に関数に関して" should {
    "equals" in new before{
      val test = Users.getName()
      test mustEqual "test2"

      Users.putName("test3")
      Users.getName() mustEqual "test3"
    }

    trait before extends Scope{
      Users.func1()
    }
  }

  "usersに関して" should {
    "keyチェック" in {
      val users = Users.getAll()
      users.map { users =>
        users must have key('name)
        users must have key('age)
      }
    }

    "nameの値をチェック" in {
      val users = Users.getAll()
      users.map { users =>
        //users.get('name) mustEqual "shinofara"
        //だとSome(shinofara)が帰ってくるので、更にget
        //正規表現
        val name = users.get('name).get
        name must beMatching("[a-z]+")
        name must be matching("[a-z]+")
        name must startWith("s")
        name must endWith("a")
      }
    }
  }
}
