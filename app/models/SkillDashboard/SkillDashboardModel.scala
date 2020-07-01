package models.SkillDashboard

import models.{Skill, SkillGroup, User, UserSkill}

import scala.concurrent.Future

trait SkillDashboardModel {

  def getAllUsers: Future[Seq[User]] = {
    Future.successful(allUsers)
  }

  def getAllSkills: Future[Seq[Skill]] = {
    Future.successful(allSkills)
  }

  def getAllUserSkills: Future[Seq[UserSkill]]

  def getAllSkillGroups: Future[Seq[SkillGroup]]

def allUsers:Seq[User]
}


