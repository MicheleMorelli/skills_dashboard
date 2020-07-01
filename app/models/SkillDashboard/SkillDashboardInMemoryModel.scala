package models.SkillDashboard

import models.{Skill, SkillGroup, User, UserSkill}

class SkillDashboardInMemoryModel extends SkillDashboardModel {
  val dataSource = DummyDataset

  override def users: Seq[User] = dataSource.users

  override def skills: Seq[Skill] = dataSource.skills

  override def userSkills: Seq[UserSkill] = dataSource.usersSkills

  override def skillGroups: Seq[SkillGroup] = dataSource.skillGroups
}
