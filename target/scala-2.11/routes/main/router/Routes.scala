
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/judy_chen.HTCTAIPEI/todo-demo/conf/routes
// @DATE:Fri Mar 11 02:31:06 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:11
  Assets_1: controllers.Assets,
  // @LINE:14
  Todo_0: controllers.Todo,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:11
    Assets_1: controllers.Assets,
    // @LINE:14
    Todo_0: controllers.Todo
  ) = this(errorHandler, Application_2, Assets_1, Todo_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Assets_1, Todo_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cleanup""", """controllers.Application.cleanup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos""", """controllers.Application.todos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos""", """controllers.Todo.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/$id<[^/]+>""", """controllers.Todo.read(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todo""", """controllers.Todo.create"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/$id<[^/]+>""", """controllers.Todo.delete(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/$id<[^/]+>""", """controllers.Todo.done(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_cleanup1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cleanup")))
  )
  private[this] lazy val controllers_Application_cleanup1_invoker = createInvoker(
    Application_2.cleanup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "cleanup",
      Nil,
      "GET",
      """""",
      this.prefix + """cleanup"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_todos2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos")))
  )
  private[this] lazy val controllers_Application_todos2_invoker = createInvoker(
    Application_2.todos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "todos",
      Nil,
      "GET",
      """""",
      this.prefix + """todos"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Todo_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos")))
  )
  private[this] lazy val controllers_Todo_index4_invoker = createInvoker(
    Todo_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Todo",
      "index",
      Nil,
      "GET",
      """Todo""",
      this.prefix + """api/todos"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Todo_read5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Todo_read5_invoker = createInvoker(
    Todo_0.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Todo",
      "read",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/todos/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Todo_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todo")))
  )
  private[this] lazy val controllers_Todo_create6_invoker = createInvoker(
    Todo_0.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Todo",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """api/todo"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Todo_delete7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Todo_delete7_invoker = createInvoker(
    Todo_0.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Todo",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """api/todos/$id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Todo_done8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Todo_done8_invoker = createInvoker(
    Todo_0.done(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Todo",
      "done",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """api/todos/$id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:7
    case controllers_Application_cleanup1_route(params) =>
      call { 
        controllers_Application_cleanup1_invoker.call(Application_2.cleanup)
      }
  
    // @LINE:8
    case controllers_Application_todos2_route(params) =>
      call { 
        controllers_Application_todos2_invoker.call(Application_2.todos)
      }
  
    // @LINE:11
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_Todo_index4_route(params) =>
      call { 
        controllers_Todo_index4_invoker.call(Todo_0.index)
      }
  
    // @LINE:15
    case controllers_Todo_read5_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Todo_read5_invoker.call(Todo_0.read(id))
      }
  
    // @LINE:16
    case controllers_Todo_create6_route(params) =>
      call { 
        controllers_Todo_create6_invoker.call(Todo_0.create)
      }
  
    // @LINE:17
    case controllers_Todo_delete7_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Todo_delete7_invoker.call(Todo_0.delete(id))
      }
  
    // @LINE:18
    case controllers_Todo_done8_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Todo_done8_invoker.call(Todo_0.done(id))
      }
  }
}