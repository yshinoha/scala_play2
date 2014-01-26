package models

import scalikejdbc._, SQLInterpolation._
import skinny.orm._, feature._
import org.joda.time.DateTime

case class User(
    id: Int,
    name: String,
    email: String,
    password: String,
    createdAt: DateTime,
    updatedAt: Option[DateTime] = None,
    deletedAt: Option[DateTime] = None)

object User extends SkinnyCRUDMapper[User]
with TimestampsFeature[User]
with SoftDeleteWithTimestampFeature[User] {

    override val defaultAlias = createAlias("c")

    override def extract(rs: WrappedResultSet, c: ResultName[User]): User = new User(
        id = rs.int(c.id),
        name = rs.string(c.name),
        email = rs.string(c.email),
        password = rs.string(c.password),
        createdAt = rs.dateTime(c.createdAt),
        updatedAt = rs.dateTimeOpt(c.updatedAt)
        )
}
