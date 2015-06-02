
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
object orderupdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Order],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(orderform :Form[Order]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update order")/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
	 """),format.raw/*5.3*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
	<h2>Update Order</h2>

"""),_display_(/*14.2*/form(action = routes.Application.orderupdate, 'id -> "updateform")/*14.68*/{_display_(Seq[Any](format.raw/*14.69*/("""
	"""),_display_(/*15.3*/inputText(orderform("Company ID"))),format.raw/*15.37*/("""
	"""),_display_(/*16.3*/inputText(orderform("Part ID"))),format.raw/*16.34*/("""
	"""),_display_(/*17.3*/inputText(orderform("Order Id"),'size-> 10)),format.raw/*17.46*/("""
	"""),_display_(/*18.3*/inputText(orderform("Schedule ID"),'size -> 10)),format.raw/*18.50*/("""
	"""),_display_(/*19.3*/inputText(orderform("Days"),'size -> 8)),format.raw/*19.42*/("""
	"""),_display_(/*20.3*/inputText(orderform("Quantity"),'size -> 8)),format.raw/*20.46*/("""
	"""),format.raw/*21.2*/("""<input type="submit" value="Update Order"/>
	 
	""")))}),format.raw/*23.3*/("""



""")))}))}
  }

  def render(orderform:Form[Order]): play.twirl.api.HtmlFormat.Appendable = apply(orderform)

  def f:((Form[Order]) => play.twirl.api.HtmlFormat.Appendable) = (orderform) => apply(orderform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/orderupdate.scala.html
                  HASH: 1d2b1297fc88ecb8f3a100316788b4c805878d88
                  MATRIX: 516->1|643->25|670->43|697->45|725->65|763->66|792->69|1157->408|1232->474|1271->475|1300->478|1355->512|1384->515|1436->546|1465->549|1529->592|1558->595|1626->642|1655->645|1715->684|1744->687|1808->730|1837->732|1916->781
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|34->14|34->14|34->14|35->15|35->15|36->16|36->16|37->17|37->17|38->18|38->18|39->19|39->19|40->20|40->20|41->21|43->23
                  -- GENERATED --
              */
          