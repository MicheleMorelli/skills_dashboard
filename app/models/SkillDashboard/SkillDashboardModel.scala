package models.SkillDashboard

import models.{Skill, SkillGroup, User, UserSkill}

import scala.concurrent.Future

trait SkillDashboardModel {

  def getAllUsers: Future[Seq[User]] = {
    Future.successful(users)
  }

  def getAllSkills: Future[Seq[Skill]] = {
    Future.successful(skills)
  }

  def getAllUserSkills: Future[Seq[UserSkill]] = {
    Future.successful(userSkills)
  }

  def getAllSkillGroups: Future[Seq[SkillGroup]] = {
    Future.successful(skillGroups)
  }

  def users:Seq[User]
  def skills:Seq[Skill]
  def userSkills:Seq[Seq[UserSkill]]
  def skillGroups:Seq[SkillGroup]
}


