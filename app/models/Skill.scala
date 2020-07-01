package models

import play.api.libs.json.{Format, Json}

case class Skill(
                  id: String,
                  name: String,
                ) extends SkillDashboardResource


object Skill {
  implicit val format: Format[Skill] = Json.format[Skill]
}
