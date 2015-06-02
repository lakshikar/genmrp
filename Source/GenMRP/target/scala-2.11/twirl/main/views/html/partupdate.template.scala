
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
object partupdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Part],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(partForm:Form[Part]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.23*/(""")
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update Part")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
	 """),format.raw/*5.3*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
	<h2> Update Part</h2>
	"""),_display_(/*13.3*/form(action = routes.Application.partupdate, 'id -> "updateform")/*13.68*/{_display_(Seq[Any](format.raw/*13.69*/("""
    
    """),_display_(/*15.6*/inputText(partForm("CompId"))),format.raw/*15.35*/(""" 
    """),_display_(/*16.6*/inputText(partForm("PartId"))),format.raw/*16.35*/("""
    """),_display_(/*17.6*/inputText(partForm("Part name"))),format.raw/*17.38*/("""
    """),_display_(/*18.6*/inputText(partForm("Lead time"),'size -> 10)),format.raw/*18.50*/("""
    """),_display_(/*19.6*/inputText(partForm("On Hand"),'size -> 10)),format.raw/*19.48*/("""
     """),format.raw/*20.6*/("""<input type="submit" value="Update">
        
    """)))}),format.raw/*22.6*/("""



""")))}))}
  }

  def render(partForm:Form[Part]): play.twirl.api.HtmlFormat.Appendable = apply(partForm)

  def f:((Form[Part]) => play.twirl.api.HtmlFormat.Appendable) = (partForm) => apply(partForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/partupdate.scala.html
                  HASH: d4bfda0423c6d7e0ce5ccddba4e066aa481e3f70
                  MATRIX: 514->1|638->22|666->41|693->43|720->62|759->64|788->67|1153->406|1227->471|1266->472|1303->483|1353->512|1386->519|1436->548|1468->554|1521->586|1553->592|1618->636|1650->642|1713->684|1746->690|1827->741
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|33->13|33->13|33->13|35->15|35->15|36->16|36->16|37->17|37->17|38->18|38->18|39->19|39->19|40->20|42->22
                  -- GENERATED --
              */
          