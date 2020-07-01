package models.SkillDashboard

import models.{Skill, SkillDashboardResource, SkillGroup, User, UserSkill}

import scala.collection.mutable.ArrayBuffer

object DummyDataset {

  final val MAX_LEVEL = 5

  def users: Seq[User] = usersBuffer.toSeq

  def skills: Seq[Skill] = skillsBuffer.toSeq

  def usersSkills: Seq[Seq[UserSkill]] = userSkillsBuffer.toSeq

  def skillGroups: Seq[SkillGroup] = skillGroupsBuffer.toSeq

  private val usersBuffer: ArrayBuffer[User] = new ArrayBuffer[User]()
  private val skillsBuffer: ArrayBuffer[Skill] = new ArrayBuffer[Skill]()
  private val userSkillsBuffer: ArrayBuffer[Seq[UserSkill]] = new ArrayBuffer[Seq[UserSkill]]()
  private val skillGroupsBuffer: ArrayBuffer[SkillGroup] = new ArrayBuffer[SkillGroup]()



  private val S1: Skill = Skill("S1", "Scala")
  private val S2: Skill = Skill("S2", "Bash")
  private val S3: Skill = Skill("S3", "XSLT")
  private val S4: Skill = Skill("S4", "AWS")
  private val S5: Skill = Skill("S5", "Terraform")
  private val S6: Skill = Skill("S6", "Mentoring")
  private val S7: Skill = Skill("S7", "Public speaking")
  for (s <- Seq(S1, S2, S3, S4, S5, S6, S7)) skillsBuffer.append(s)

  private val SG1: SkillGroup = SkillGroup("SG1", "Programming Languages", getId(S1,S2,S3))
  private val SG2: SkillGroup = SkillGroup("SG2", "Operations", getId(S4,S5))
  private val SG3: SkillGroup = SkillGroup("SG3", "Various", getId(S6,S7))
  for (s <- Seq(SG1, SG2, SG3)) skillGroupsBuffer.append(s)

  private val S1_US: Seq[UserSkill] = ()
  private val S2_US: Seq[UserSkill] = (0 to MAX_LEVEL).map(UserSkill(S2, _))
  private val S3_US: Seq[UserSkill] = (0 to MAX_LEVEL).map(UserSkill(S3, _))
  private val S4_US: Seq[UserSkill] = (0 to MAX_LEVEL).map(UserSkill(S4, _))
  private val S5_US: Seq[UserSkill] = (0 to MAX_LEVEL).map(UserSkill(S5, _))
  private val S6_US: Seq[UserSkill] = (0 to MAX_LEVEL).map(UserSkill(S6, _))
  private val S7_US: Seq[UserSkill] = (0 to MAX_LEVEL).map(UserSkill(S7, _))
  for (s <- Seq(S1_US, S2_US, S3_US, S4_US, S5_US, S6_US, S7_US)) userSkillsBuffer.append(s)

  private val U1: User = User("tomsmith1", "Tom", "Smith", Seq(S1_US(3), S2_US(4), S3_US(2), S4_US(1)))
  private val U2: User = User("susanblack1", "Susan", "Black", Seq(S1_US(5), S2_US(3), S3_US(1), S4_US(4), S5_US(4), S6_US(2)))
  for (s <- Seq(U1, U2)) usersBuffer.append(s)

  private def getId(user: SkillDashboardResource*):Seq[String] = user.map(_.id)
}
