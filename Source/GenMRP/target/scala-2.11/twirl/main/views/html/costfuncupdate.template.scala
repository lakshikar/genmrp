
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object costfuncupdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Costfunction],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(costfuncForm : Form[Costfunction]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update Cost functions")/*4.31*/{_display_(Seq[Any](format.raw/*4.32*/("""
	 """),format.raw/*5.3*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
	
	<h2>Update cost function</h2>

	"""),_display_(/*15.3*/form(action = routes.Application.costfuncupdate,'id -> "updateform")/*15.71*/{_display_(Seq[Any](format.raw/*15.72*/("""
		
		"""),_display_(/*17.4*/inputText(costfuncForm("Company ID"))),format.raw/*17.41*/("""
		"""),_display_(/*18.4*/inputText(costfuncForm("Part ID"))),format.raw/*18.38*/("""
		"""),_display_(/*19.4*/inputText(costfuncForm("Function ID"),'size -> 10)),format.raw/*19.54*/("""
		"""),_display_(/*20.4*/inputText(costfuncForm("Function"),'size -> 40)),format.raw/*20.51*/("""
		
		"""),format.raw/*22.3*/("""<input type="submit" value="Update function"/>
		
	""")))}),format.raw/*24.3*/("""
	
""")))}))}
  }

  def render(costfuncForm:Form[Costfunction]): play.twirl.api.HtmlFormat.Appendable = apply(costfuncForm)

  def f:((Form[Costfunction]) => play.twirl.api.HtmlFormat.Appendable) = (costfuncForm) => apply(costfuncForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/costfuncupdate.scala.html
                  HASH: c752b5cb2e511e67174f56be0d324987f11bf56c
                  MATRIX: 526->1|664->36|691->54|718->56|755->85|793->86|822->89|1198->439|1275->507|1314->508|1347->515|1405->552|1435->556|1490->590|1520->594|1591->644|1621->648|1689->695|1722->701|1804->753
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|35->15|35->15|35->15|37->17|37->17|38->18|38->18|39->19|39->19|40->20|40->20|42->22|44->24
                  -- GENERATED --
              */
          