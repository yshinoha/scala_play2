package controllers
import play.api._
import play.api.mvc._

import play.api.Play.current
import play.api.mvc.Results._
import play.api.db._
import anorm._ 

import models.User

object TemplateController extends Controller {
  def show = Action {
    /*implicit val connection = DB.getConnection()
    val selectUsers = SQL("Select * from user")
    val users = selectUsers().map(row => 
      Map('name -> row[String]("name"), 
          'email -> row[String]("email"))).toList
          */
                           
    //for(user <- users) println(user)

    println(User.countAll())
                                
    Ok(views.html.index("anorm"))
    //Ok(views.html.mydb("DBつないでみたよ", users))

   // val list = List[String]("lemon", "mikan", "budou", "ringo")

// readFileToStringはファイル全体を一度に読み込む
//  val str = FileUtils.readFileToString( new File("/tmp/tmp.txt") )
//println( str )


    //Ok(views.html.show("Hello Scala Templates!あ", list))
  }
}
