package controllers

import javax.inject._
import models.SkillDashboard.SkillDashboardModel
import play.api._
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import scala.concurrent.ExecutionContext

@Singleton
class SkillsDashboard @Inject()(val cc: ControllerComponents, sdm: SkillDashboardModel)
                               (implicit ec:ExecutionContext)
  extends AbstractController(cc) {

  def index(): Action[AnyContent] = Action {
    Ok(views.html.index())
  }

  def getAllUsers: Action[AnyContent] = Action.async {
    sdm.getAllUsers.map(x => Ok(Json.toJson(x)))
  }
}
