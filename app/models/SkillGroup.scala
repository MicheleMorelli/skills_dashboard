package models

import play.api.libs.json.{Format, Json}

case class SkillGroup(
                       id: String,
                       name: String,
                       skills: Seq[String]
                     ) extends SkillDashboardResource

object SkillGroup {
  implicit val format: Format[SkillGroup] = Json.format[SkillGroup]
}
