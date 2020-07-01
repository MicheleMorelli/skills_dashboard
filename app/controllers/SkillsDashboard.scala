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
    Ok(views.html.index(sdm.users))
  }

  def getAllUsers: Action[AnyContent] = Action.async {
    sdm.getAllUsers.map(x => Ok(Json.toJson(x)))
  }

  def getAllUserSkills: Action[AnyContent] = Action.async {
    sdm.getAllUserSkills.map(x => Ok(Json.toJson(x)))
  }

  def getAllSkills: Action[AnyContent] = Action.async {
    sdm.getAllSkills.map(x => Ok(Json.toJson(x)))
  }

  def getAllSkillGroups: Action[AnyContent] = Action.async {
    sdm.getAllSkillGroups.map(x => Ok(Json.toJson(x)))
  }
}
