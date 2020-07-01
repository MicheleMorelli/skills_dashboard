package models

case class User(
                 username:String,
                 firstName: String,
                 familyName: String,
                 skills:Seq[UserSkill],
               )
