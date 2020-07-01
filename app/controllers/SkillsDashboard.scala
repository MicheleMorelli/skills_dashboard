package controllers

import javax.inject._
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.Future

@Singleton
class SkillsDashboard @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def getAllUsers(): Action[AnyContent] = Action.async {
    val DS = SkillsDashboardInMemoryModel()
    Ok(Json.toJson())
  }
}
