
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
		 <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("images/favicon.png")),format.raw/*8.99*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*9.95*/(""""/>
		<link rel="stylesheet" href=""""),_display_(/*10.33*/routes/*10.39*/.Assets.versioned("stylesheets/site.css")),format.raw/*10.80*/(""""/>
        <script type="text/javascript" src=""""),_display_(/*11.46*/routes/*11.52*/.Assets.versioned("javascripts/jquery-2.1.1.min.js")),format.raw/*11.104*/("""" ></script>
		<script type="text/javascript" src=""""),_display_(/*12.40*/routes/*12.46*/.Assets.versioned("javascripts/jquery-ui-1.10.3.min.js")),format.raw/*12.102*/("""" ></script>
		<script type="text/javascript" src=""""),_display_(/*13.40*/routes/*13.46*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*13.95*/("""" ></script>
		<script type="text/javascript" src=""""),_display_(/*14.40*/routes/*14.46*/.Assets.versioned("javascripts/handlebars-v4.0.5.js")),format.raw/*14.99*/("""" ></script>
		<script type="text/javascript" src=""""),_display_(/*15.40*/routes/*15.46*/.Assets.versioned("javascripts/handlebars-helper.js")),format.raw/*15.99*/("""" ></script>
    </head>
    <body>
        """),_display_(/*18.10*/content),format.raw/*18.17*/("""
    """),format.raw/*19.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Mar 10 20:39:42 CST 2016
                  SOURCE: C:/Users/judy_chen.HTCTAIPEI/todo-demo/app/views/main.scala.html
                  HASH: 65c108ee0f7b76ec6207afc569c8266d83a0a0df
                  MATRIX: 530->1|655->31|683->33|760->84|785->89|873->151|887->157|946->196|1014->238|1028->244|1098->294|1161->330|1176->336|1238->377|1314->426|1329->432|1403->484|1482->536|1497->542|1575->598|1654->650|1669->656|1739->705|1818->757|1833->763|1907->816|1986->868|2001->874|2075->927|2147->972|2175->979|2207->984
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|42->18|42->18|43->19
                  -- GENERATED --
              */
          