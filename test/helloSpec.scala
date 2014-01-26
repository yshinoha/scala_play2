package hello

//import org.specs2._
import org.specs2.mutable._
//import specification._

class HelloSpec extends Specification {
//class SampleSpec extends Specification {
  "helloという変数に関数に関して" should {
    "equals" in {
      Hello.hello mustEqual "hello, world."
    }
  }

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
    "start with 'Hello'" in {
    "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }

    "1 !== 2" in {
      1 must not be equalTo(2)
      1 must_!= 2
      1 mustNotEqual 2
      1 must be_!=(2)
      1 !== 2
    }
  }
}

