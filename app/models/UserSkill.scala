package models

import play.api.libs.json.{Format, Json}

case class UserSkill(
                      id: String,
                      skillId: String,
                      userId: String,
                      level: Int = 0
                    ) extends SkillDashboardResource

object UserSkill {
  implicit val format: Format[UserSkill] = Json.format[UserSkill]
}
