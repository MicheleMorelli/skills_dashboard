package models.SkillDashboard

import models.{Skill, SkillGroup, User, UserSkill}

import scala.collection.mutable.ArrayBuffer

object DummyDataset {
  val usersBuffer: ArrayBuffer[User] = new ArrayBuffer[User]()
  val skillsBuffer: ArrayBuffer[Skill] = new ArrayBuffer[Skill]()
  val usersSkillsBuffer: ArrayBuffer[UserSkill] = new ArrayBuffer[UserSkill]()
  val skillGroupsBuffer: ArrayBuffer[SkillGroup] = new ArrayBuffer[SkillGroup]()
  val users: Seq[User] = usersBuffer.toSeq
  val skills: Seq[Skill] = skillsBuffer.toSeq
  val usersSkills: Seq[UserSkill] = usersSkillsBuffer.toSeq
  val skillGroups: Seq[SkillGroup] = skillGroups.toSeq
}
