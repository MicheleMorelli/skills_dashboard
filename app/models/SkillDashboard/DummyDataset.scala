package models.SkillDashboard

import models.{Skill, SkillGroup, User, UserSkill}

import scala.collection.mutable.ArrayBuffer

object DummyDataset {
  def users: Seq[User] = usersBuffer.toSeq
  def skills: Seq[Skill] = skillsBuffer.toSeq
  def usersSkills: Seq[UserSkill] = usersSkillsBuffer.toSeq
  def skillGroups: Seq[SkillGroup] = skillGroupsBuffer.toSeq

  private val usersBuffer: ArrayBuffer[User] = new ArrayBuffer[User]()
  private val skillsBuffer: ArrayBuffer[Skill] = new ArrayBuffer[Skill]()
  private val usersSkillsBuffer: ArrayBuffer[UserSkill] = new ArrayBuffer[UserSkill]()
  private val skillGroupsBuffer: ArrayBuffer[SkillGroup] = new ArrayBuffer[SkillGroup]()


  private val SG1:SkillGroup = SkillGroup("SG1", "Programming Languages")
  private val SG2:SkillGroup = SkillGroup("SG2", "Operations")
  private val SG3:SkillGroup = SkillGroup("SG3", "Various")
  for (s <- Seq(SG1,SG2,SG3)) skillGroupsBuffer.append(s)

  private val S1:Skill =  Skill("S1", "Scala", SG1)
  private val S2:Skill = Skill("S2", "Bash", SG1)
  private val S3:Skill = Skill("S3", "XSLT", SG1)
  private val S4:Skill = Skill("S4", "AWS", SG2)
  private val S5:Skill = Skill("S5", "Terraform", SG2)
  private val S6:Skill = Skill("S6", "Mentoring", SG3)
  private val S7:Skill = Skill("S7", "Public speaking", SG3)
  for (s <- Seq(S1,S2,S3,S4, S5,S6,S7)) skillsBuffer.append(s)

}
