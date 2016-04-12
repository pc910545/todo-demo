package controllers

import javax.inject.{Inject, Singleton}
 
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n._
import play.api.data.validation.Constraints._
import play.modules.reactivemongo.json.collection.JSONCollection
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.api.collections.bson.BSONCollection
import reactivemongo.api.commands.bson.BSONCountCommand.{ Count, CountResult }
import reactivemongo.api.commands.bson.BSONCountCommandImplicits._
import reactivemongo.bson.BSONDocument
 
import scala.concurrent.Future

@Singleton
class Application  @Inject()  (val messagesApi: MessagesApi, val reactiveMongoApi: ReactiveMongoApi) extends Controller with I18nSupport with MongoController with ReactiveMongoComponents{

  def jsonCollection = reactiveMongoApi.db.collection[JSONCollection]("todos");
  def bsonCollection = reactiveMongoApi.db.collection[BSONCollection]("todos");

  def index = Action {
	Logger.info("Application startup...")
    val todos = List(
      Json.obj(
        "title" -> "Prepare JAVA env.",
        "isDone" -> true
      ),
      Json.obj(
        "title" -> "Install Scala-2.11.7",
        "isDone" -> true
      ),
	  Json.obj(
        "title" -> "Install Play Framework 2.4.6",
        "isDone" -> true
      ),
	  Json.obj(
        "title" -> "Install Monog 3.2.3",
        "isDone" -> true
      ),
	  Json.obj(
        "title" -> "Install IntelliJ IDEA 15.0.4",
        "isDone" -> true
      ),
	  Json.obj(
        "title" -> "Simple example: Play Intro in Scala",
        "isDone" -> true
      ),
	  Json.obj(
        "title" -> "Building REST APIs in Play on top of Reactive Mongo",
        "isDone" -> true
      ))
 
    val query = BSONDocument("title" -> BSONDocument("$exists" -> true))
    val command = Count(query)
    val result: Future[CountResult] = bsonCollection.runCommand(command)
 
    result.map { res =>
      val numberOfDocs: Int = res.value
      if(numberOfDocs < 1) {
        jsonCollection.bulkInsert(todos.toStream, ordered = true).foreach(i => Logger.info("Record added."))
      }
    }
    Redirect(routes.Application.todos())
  }
  
  def cleanup = Action {
    jsonCollection.drop().onComplete {
      case _ => Logger.info("Database collection dropped")
    }
    Ok("Your database is clean.")
  }

  def todos = Action {
    Ok(views.html.index(null))
  }
}
