package models.SkillDashboard

import models.{Skill, SkillGroup, User, UserSkill}

class SkillsDashboardInMemoryModel {
  val dataSource = DummyDataset

  def getUsers:Seq[User] = dataSource.users
  def getSkills:Seq[Skill] = dataSource.skills
  def getUserSkills:Seq[UserSkill] = dataSource.usersSkills
  def getSkillGroups:Seq[SkillGroup] = dataSource.skillGroups
}
