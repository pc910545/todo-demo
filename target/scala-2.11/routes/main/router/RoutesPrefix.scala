
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/judy_chen.HTCTAIPEI/todo-demo/conf/routes
// @DATE:Fri Mar 11 02:31:06 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
