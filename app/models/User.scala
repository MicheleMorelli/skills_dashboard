package models

import play.api.libs.json.{Format, Json}

case class User(
                 username: String,
                 firstName: String,
                 familyName: String,
                 skills: Seq[UserSkill],
               )

object User {
  implicit val format: Format[User] = Json.format[User]
}
