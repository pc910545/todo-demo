package controllers

import javax.inject.Inject
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.Json
import play.api.mvc._
import play.api.i18n._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.{BSONObjectID, BSONDocument}
import play.api.Logger
import controllers.TodoFields._
import repos.WidgetRepoImpl

class Todo  @Inject()  (val reactiveMongoApi: ReactiveMongoApi) extends Controller with MongoController with ReactiveMongoComponents {

  def widgetRepo = new WidgetRepoImpl(reactiveMongoApi)

  def index = Action.async { implicit request =>
	widgetRepo.find().map(todos => Ok(Json.toJson(todos)))
  }
  
  def read(id: String) = Action.async { implicit request =>
	widgetRepo.select(BSONDocument(Id -> BSONObjectID(id))).map(todo => Ok(Json.toJson(todo)))
  }
 
  def create = Action.async(BodyParsers.parse.json) { implicit request =>
	val text = (request.body \ "Title").as[String]
    widgetRepo.save(BSONDocument(
		Title -> text,
		IsDone -> false
    )).map(result => Created)
  }
 
  def done(id: String) = Action.async(BodyParsers.parse.json) { implicit request =>
	widgetRepo.update(BSONDocument(Id -> BSONObjectID(id)),
		BSONDocument("$set" -> BSONDocument(IsDone -> true)))
		.map(result => Accepted)
  }
 
  def delete(id: String) = Action.async {
	widgetRepo.remove(BSONDocument(Id -> BSONObjectID(id)))
      .map(result => Accepted)
  }

}

object TodoFields {
  val Id = "_id"
  val Title ="title"
  val IsDone = "isDone"
}
