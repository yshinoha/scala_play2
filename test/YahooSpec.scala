import org.specs2.mutable._

//before,afterする場合
//import org.specs2.mutable.{After, Specification}
import org.specs2.specification.Scope

import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class BeforeAfterSpec extends Specification {

  //varは再代入可能
  var sample = "test1"
  
  //valは再代入不可能
  val sample1 = "aaa"

  "変数の中身が変わるか" should {

    "事前処理後" in new scop{
      println("say exec")
      sample must beEqualTo("test2")
    }

    "事後処理後" in {
      sample must beEqualTo("test3")
    }
  }

  trait scop extends Scope with After{
    sample = "test2"
    // 事前処理
    def after = {
      // 事後処理
      sample = "test3"
    }
  }
}

