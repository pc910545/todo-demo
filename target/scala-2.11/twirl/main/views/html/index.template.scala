
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
	"""),format.raw/*6.2*/("""<script id="todo-template" type="text/x-handlebars-template">
		<ul class="list-unstyled">
		"""),format.raw/*8.3*/("""{"""),format.raw/*8.4*/("""{"""),format.raw/*8.5*/("""#each Todos"""),format.raw/*8.16*/("""}"""),format.raw/*8.17*/("""}"""),format.raw/*8.18*/("""
			"""),format.raw/*9.4*/("""<li class="ui-state-default" id=""""),format.raw/*9.37*/("""{"""),format.raw/*9.38*/("""{"""),format.raw/*9.39*/("""_id.$oid"""),format.raw/*9.47*/("""}"""),format.raw/*9.48*/("""}"""),format.raw/*9.49*/("""">
				<div class="checkbox">
                    <label """),format.raw/*11.28*/("""{"""),format.raw/*11.29*/("""{"""),format.raw/*11.30*/("""#if isDone"""),format.raw/*11.40*/("""}"""),format.raw/*11.41*/("""}"""),format.raw/*11.42*/("""class="done""""),format.raw/*11.54*/("""{"""),format.raw/*11.55*/("""{"""),format.raw/*11.56*/("""/if"""),format.raw/*11.59*/("""}"""),format.raw/*11.60*/("""}"""),format.raw/*11.61*/(""" """),format.raw/*11.62*/(""">
						"""),format.raw/*12.7*/("""{"""),format.raw/*12.8*/("""{"""),format.raw/*12.9*/("""#unless isDone"""),format.raw/*12.23*/("""}"""),format.raw/*12.24*/("""}"""),format.raw/*12.25*/("""
                        """),format.raw/*13.25*/("""<input type="checkbox" />
						"""),format.raw/*14.7*/("""{"""),format.raw/*14.8*/("""{"""),format.raw/*14.9*/("""/unless"""),format.raw/*14.16*/("""}"""),format.raw/*14.17*/("""}"""),format.raw/*14.18*/("""
						"""),format.raw/*15.7*/("""{"""),format.raw/*15.8*/("""{"""),format.raw/*15.9*/("""title"""),format.raw/*15.14*/("""}"""),format.raw/*15.15*/("""}"""),format.raw/*15.16*/("""
					"""),format.raw/*16.6*/("""</label>
					<button class="remove-item btn btn-default btn-xs pull-right"><span class="glyphicon glyphicon-remove"></span></button>
                </div>
			</li>
		"""),format.raw/*20.3*/("""{"""),format.raw/*20.4*/("""{"""),format.raw/*20.5*/("""/each"""),format.raw/*20.10*/("""}"""),format.raw/*20.11*/("""}"""),format.raw/*20.12*/("""
		"""),format.raw/*21.3*/("""</ul>
	</script>
	<script type="text/javascript">
	var app = function () """),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""
	 """),format.raw/*25.3*/("""return """),format.raw/*25.10*/("""{"""),format.raw/*25.11*/("""
		"""),format.raw/*26.3*/("""init: function () """),format.raw/*26.21*/("""{"""),format.raw/*26.22*/("""
			"""),format.raw/*27.4*/("""app.select().then(function()"""),format.raw/*27.32*/("""{"""),format.raw/*27.33*/("""
				"""),format.raw/*28.5*/("""//bind create 
				$(".add-todo").on("keypress",function (e) """),format.raw/*29.47*/("""{"""),format.raw/*29.48*/("""
					"""),format.raw/*30.6*/("""e.preventDefault;
					if (e.which == 13) """),format.raw/*31.25*/("""{"""),format.raw/*31.26*/("""
						"""),format.raw/*32.7*/("""var title = $(this).val().trim();
						app.create(title); 
					"""),format.raw/*34.6*/("""}"""),format.raw/*34.7*/("""
				"""),format.raw/*35.5*/("""}"""),format.raw/*35.6*/(""");
				//bind delete
				$(".todolist").on("click",".remove-item", function()"""),format.raw/*37.57*/("""{"""),format.raw/*37.58*/("""
					"""),format.raw/*38.6*/("""app.delete($(this).closest(".ui-state-default").attr("id"));
				"""),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""); 
				//bind done
				$(".todolist").on("change",".ui-state-default input[type='checkbox']",function()"""),format.raw/*41.85*/("""{"""),format.raw/*41.86*/("""
					"""),format.raw/*42.6*/("""if($(this).prop("checked"))"""),format.raw/*42.33*/("""{"""),format.raw/*42.34*/("""
						"""),format.raw/*43.7*/("""app.done($(this).closest(".ui-state-default").attr("id"))
					"""),format.raw/*44.6*/("""}"""),format.raw/*44.7*/("""
				"""),format.raw/*45.5*/("""}"""),format.raw/*45.6*/(""");
			"""),format.raw/*46.4*/("""}"""),format.raw/*46.5*/(""");
		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/(""",
		select: function()"""),format.raw/*48.21*/("""{"""),format.raw/*48.22*/("""
			"""),format.raw/*49.4*/("""return $.ajax("""),format.raw/*49.18*/("""{"""),format.raw/*49.19*/("""
                """),format.raw/*50.17*/("""url: "/api/todos",
				type: "GET",
				dataType: "json",
			"""),format.raw/*53.4*/("""}"""),format.raw/*53.5*/(""").done(function(todos)"""),format.raw/*53.27*/("""{"""),format.raw/*53.28*/("""
				"""),format.raw/*54.5*/("""var source   = $("#todo-template").html();
				var template = Handlebars.compile(source);
				var unDone = $.grep(todos, function(todo, index)"""),format.raw/*56.53*/("""{"""),format.raw/*56.54*/("""
					"""),format.raw/*57.6*/("""return todo.isDone == false;
				"""),format.raw/*58.5*/("""}"""),format.raw/*58.6*/(""");
				$(".todo-content").html(template("""),format.raw/*59.38*/("""{"""),format.raw/*59.39*/("""Todos: todos"""),format.raw/*59.51*/("""}"""),format.raw/*59.52*/("""));
				$(".count-todos").html(todos.length);
				$(".count-undone").html(unDone.length);
				$(".add-todo").val("");
			"""),format.raw/*63.4*/("""}"""),format.raw/*63.5*/(""");
		"""),format.raw/*64.3*/("""}"""),format.raw/*64.4*/(""",
		create: function(text) """),format.raw/*65.26*/("""{"""),format.raw/*65.27*/("""
			"""),format.raw/*66.4*/("""return $.ajax("""),format.raw/*66.18*/("""{"""),format.raw/*66.19*/("""
                """),format.raw/*67.17*/("""url: "/api/todo",
				type: "POST",
				data : JSON.stringify("""),format.raw/*69.27*/("""{"""),format.raw/*69.28*/("""Title: text"""),format.raw/*69.39*/("""}"""),format.raw/*69.40*/("""),
				contentType: "application/json",
				statusCode: """),format.raw/*71.17*/("""{"""),format.raw/*71.18*/("""
					"""),format.raw/*72.6*/("""500: function() """),format.raw/*72.22*/("""{"""),format.raw/*72.23*/("""
						"""),format.raw/*73.7*/("""alert("falied");
					"""),format.raw/*74.6*/("""}"""),format.raw/*74.7*/(""",
					201: function() """),format.raw/*75.22*/("""{"""),format.raw/*75.23*/("""
						"""),format.raw/*76.7*/("""app.select();
					"""),format.raw/*77.6*/("""}"""),format.raw/*77.7*/("""
				"""),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/(""");
		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/(""",
		done: function(id) """),format.raw/*81.22*/("""{"""),format.raw/*81.23*/("""
			"""),format.raw/*82.4*/("""return $.ajax("""),format.raw/*82.18*/("""{"""),format.raw/*82.19*/("""
                """),format.raw/*83.17*/("""url: "/api/todos/"+id,
				type: "PUT",
				contentType: "application/json",
				data : JSON.stringify("""),format.raw/*86.27*/("""{"""),format.raw/*86.28*/("""}"""),format.raw/*86.29*/("""),
				statusCode: """),format.raw/*87.17*/("""{"""),format.raw/*87.18*/("""
					"""),format.raw/*88.6*/("""500: function() """),format.raw/*88.22*/("""{"""),format.raw/*88.23*/("""
						"""),format.raw/*89.7*/("""alert("falied");
					"""),format.raw/*90.6*/("""}"""),format.raw/*90.7*/(""",
					202: function() """),format.raw/*91.22*/("""{"""),format.raw/*91.23*/("""
						"""),format.raw/*92.7*/("""app.select();
					"""),format.raw/*93.6*/("""}"""),format.raw/*93.7*/("""
				"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""
			"""),format.raw/*95.4*/("""}"""),format.raw/*95.5*/(""");
		"""),format.raw/*96.3*/("""}"""),format.raw/*96.4*/(""",
		delete: function(id) """),format.raw/*97.24*/("""{"""),format.raw/*97.25*/("""
			"""),format.raw/*98.4*/("""return $.ajax("""),format.raw/*98.18*/("""{"""),format.raw/*98.19*/("""
                """),format.raw/*99.17*/("""url: "/api/todos/"+id,
				type: "DELETE",
				statusCode: """),format.raw/*101.17*/("""{"""),format.raw/*101.18*/("""
					"""),format.raw/*102.6*/("""500: function() """),format.raw/*102.22*/("""{"""),format.raw/*102.23*/("""
						"""),format.raw/*103.7*/("""alert("falied");
					"""),format.raw/*104.6*/("""}"""),format.raw/*104.7*/(""",
					202: function() """),format.raw/*105.22*/("""{"""),format.raw/*105.23*/("""
						"""),format.raw/*106.7*/("""app.select();
					"""),format.raw/*107.6*/("""}"""),format.raw/*107.7*/("""
				"""),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
			"""),format.raw/*109.4*/("""}"""),format.raw/*109.5*/(""");
		"""),format.raw/*110.3*/("""}"""),format.raw/*110.4*/("""
	 """),format.raw/*111.3*/("""}"""),format.raw/*111.4*/("""
	"""),format.raw/*112.2*/("""}"""),format.raw/*112.3*/("""();
	$(document).ready(app.init());
    </script>

    <div class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="todolist">
             <h1>Todos</h1>
                <input type="text" class="form-control add-todo" placeholder="Add todo...">
                <hr>
                <div class="todo-content"></div>
                <div class="todo-footer">
                    <strong><span class="count-undone"></span></strong> / <span class="count-todos"></span>
                </div>
            </div>
        </div>
    </div>
</div>
""")))}),format.raw/*131.2*/("""
"""))
      }
    }
  }

  def render(messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(messages)

  def f:((Messages) => play.twirl.api.HtmlFormat.Appendable) = (messages) => apply(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Mar 11 03:08:37 CST 2016
                  SOURCE: C:/Users/judy_chen.HTCTAIPEI/todo-demo/app/views/index.scala.html
                  HASH: 890c47942f28d6411b8447bd7ab6566dfd784e51
                  MATRIX: 529->1|668->30|696->49|723->51|748->68|787->70|815->72|934->165|961->166|988->167|1026->178|1054->179|1082->180|1112->184|1172->217|1200->218|1228->219|1263->227|1291->228|1319->229|1404->286|1433->287|1462->288|1500->298|1529->299|1558->300|1598->312|1627->313|1656->314|1687->317|1716->318|1745->319|1774->320|1809->328|1837->329|1865->330|1907->344|1936->345|1965->346|2018->371|2077->403|2105->404|2133->405|2168->412|2197->413|2226->414|2260->421|2288->422|2316->423|2349->428|2378->429|2407->430|2440->436|2635->604|2663->605|2691->606|2724->611|2753->612|2782->613|2812->616|2913->689|2942->690|2972->693|3007->700|3036->701|3066->704|3112->722|3141->723|3172->727|3228->755|3257->756|3289->761|3378->822|3407->823|3440->829|3510->871|3539->872|3573->879|3665->944|3693->945|3725->950|3753->951|3858->1028|3887->1029|3920->1035|4012->1100|4040->1101|4172->1205|4201->1206|4234->1212|4289->1239|4318->1240|4352->1247|4442->1310|4470->1311|4502->1316|4530->1317|4563->1323|4591->1324|4623->1329|4651->1330|4701->1352|4730->1353|4761->1357|4803->1371|4832->1372|4877->1389|4965->1450|4993->1451|5043->1473|5072->1474|5104->1479|5274->1621|5303->1622|5336->1628|5396->1661|5424->1662|5492->1702|5521->1703|5561->1715|5590->1716|5738->1837|5766->1838|5798->1843|5826->1844|5881->1871|5910->1872|5941->1876|5983->1890|6012->1891|6057->1908|6147->1970|6176->1971|6215->1982|6244->1983|6328->2039|6357->2040|6390->2046|6434->2062|6463->2063|6497->2070|6546->2092|6574->2093|6625->2116|6654->2117|6688->2124|6734->2143|6762->2144|6794->2149|6822->2150|6853->2154|6881->2155|6913->2160|6941->2161|6992->2184|7021->2185|7052->2189|7094->2203|7123->2204|7168->2221|7299->2324|7328->2325|7357->2326|7404->2345|7433->2346|7466->2352|7510->2368|7539->2369|7573->2376|7622->2398|7650->2399|7701->2422|7730->2423|7764->2430|7810->2449|7838->2450|7870->2455|7898->2456|7929->2460|7957->2461|7989->2466|8017->2467|8070->2492|8099->2493|8130->2497|8172->2511|8201->2512|8246->2529|8334->2588|8364->2589|8398->2595|8443->2611|8473->2612|8508->2619|8558->2641|8587->2642|8639->2665|8669->2666|8704->2673|8751->2692|8780->2693|8813->2698|8842->2699|8874->2703|8903->2704|8936->2709|8965->2710|8996->2713|9025->2714|9055->2716|9084->2717|9698->3300
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|31->8|31->8|31->8|31->8|31->8|31->8|32->9|32->9|32->9|32->9|32->9|32->9|32->9|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|35->12|35->12|35->12|35->12|35->12|35->12|36->13|37->14|37->14|37->14|37->14|37->14|37->14|38->15|38->15|38->15|38->15|38->15|38->15|39->16|43->20|43->20|43->20|43->20|43->20|43->20|44->21|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|50->27|50->27|50->27|51->28|52->29|52->29|53->30|54->31|54->31|55->32|57->34|57->34|58->35|58->35|60->37|60->37|61->38|62->39|62->39|64->41|64->41|65->42|65->42|65->42|66->43|67->44|67->44|68->45|68->45|69->46|69->46|70->47|70->47|71->48|71->48|72->49|72->49|72->49|73->50|76->53|76->53|76->53|76->53|77->54|79->56|79->56|80->57|81->58|81->58|82->59|82->59|82->59|82->59|86->63|86->63|87->64|87->64|88->65|88->65|89->66|89->66|89->66|90->67|92->69|92->69|92->69|92->69|94->71|94->71|95->72|95->72|95->72|96->73|97->74|97->74|98->75|98->75|99->76|100->77|100->77|101->78|101->78|102->79|102->79|103->80|103->80|104->81|104->81|105->82|105->82|105->82|106->83|109->86|109->86|109->86|110->87|110->87|111->88|111->88|111->88|112->89|113->90|113->90|114->91|114->91|115->92|116->93|116->93|117->94|117->94|118->95|118->95|119->96|119->96|120->97|120->97|121->98|121->98|121->98|122->99|124->101|124->101|125->102|125->102|125->102|126->103|127->104|127->104|128->105|128->105|129->106|130->107|130->107|131->108|131->108|132->109|132->109|133->110|133->110|134->111|134->111|135->112|135->112|154->131
                  -- GENERATED --
              */
          