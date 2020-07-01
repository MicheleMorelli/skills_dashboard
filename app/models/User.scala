package models

import play.api.libs.json.{Format, Json}

case class User(
                 id: String,
                 firstName: String,
                 familyName: String,
               ) extends SkillDashboardResource

object User {
  implicit val format: Format[User] = Json.format[User]
}
