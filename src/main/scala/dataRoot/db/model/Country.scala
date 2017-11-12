package dataRoot.db.model

import slick.jdbc.PostgresProfile.api._

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

case class Country(id: Option[Long], title: String)

final class CountryTable(tag: Tag) extends Table[Country](tag, "country") {
  def id = column[Option[Long]]("id", O.PrimaryKey, O.AutoInc)

  def title = column[String]("title")

  def * = (id, title).mapTo[Country]
}