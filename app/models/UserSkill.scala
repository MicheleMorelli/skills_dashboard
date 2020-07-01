package models

import play.api.libs.json.{Format, Json}

case class UserSkill(
                      skill: Skill,
                      user: User,
                      level: Int = 0
                    )

object UserSkill {
  implicit val format: Format[UserSkill] = Json.format[UserSkill]
}
