package controllers

import play.api._
import play.api.mvc._

import play.api.libs.json._

object Application extends Controller {

  def index = Action {

   val JsValue = Json.parse("""
  { 
    "title": "チューリップ",
    "image": "https://farm3.staticflickr.com/2901/14053822803_b2f446ea3b_h.jpg",
    "dt": "2014/04/17"
  }
""") 


    Ok(views.html.index("Your new application is ready.", JsValue))
  }

}
