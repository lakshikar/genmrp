
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
object costfunc extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Costfunction],Form[Costfunction],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(costfuncs : List[Costfunction], costfuncForm : Form[Costfunction]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Part Cost functions")/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""
	 """),format.raw/*5.3*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
	<h2>Cost functions of part</h2>
	"""),_display_(/*13.3*/form(action = routes.Application.costfuncadd,'id -> "genmrpform")/*13.68*/{_display_(Seq[Any](format.raw/*13.69*/("""
		"""),format.raw/*14.3*/("""<table>
		<tr>
		<td>"""),_display_(/*16.8*/inputText(costfuncForm("Company ID"))),format.raw/*16.45*/("""</td>
		<td>"""),_display_(/*17.8*/inputText(costfuncForm("Part ID"))),format.raw/*17.42*/("""</td>
		<td>"""),_display_(/*18.8*/inputText(costfuncForm("Function ID"),'size -> 10)),format.raw/*18.58*/("""</td>
		<td>"""),_display_(/*19.8*/inputText(costfuncForm("Function"),'size -> 40)),format.raw/*19.55*/("""</td>
		</tr>
		</table>
		<input type="submit" value="add function"/>
		<input type="reset" value ="Clear"/>
	""")))}),format.raw/*24.3*/("""
	"""),format.raw/*25.2*/("""<table id="flowdata" border="1">
	<tr>
		<th>Function Id</th>
		<th>Function f(Q)</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	"""),_display_(/*32.3*/costfuncs/*32.12*/.map/*32.16*/{costfunc =>_display_(Seq[Any](format.raw/*32.28*/("""
	"""),format.raw/*33.2*/("""<tr>
		<td> """),_display_(/*34.9*/costfunc/*34.17*/.funcid),format.raw/*34.24*/("""</td>
		<td> """),_display_(/*35.9*/costfunc/*35.17*/.functxt),format.raw/*35.25*/("""</td>
		<td><a href =""""),_display_(/*36.18*/routes/*36.24*/.Application.costfuncdelete(costfunc.partid,costfunc.funcid)),format.raw/*36.84*/(""""><image src = """"),_display_(/*36.101*/routes/*36.107*/.Assets.at("images/icontexto-message-types-error-purple16.png")),format.raw/*36.170*/(""""/></a></td>
		<td><a href =""""),_display_(/*37.18*/routes/*37.24*/.Application.precostfuncupdate(costfunc.partid,costfunc.funcid)),format.raw/*37.87*/(""""> <image src=""""),_display_(/*37.103*/routes/*37.109*/.Assets.at("images/update.jpg")),format.raw/*37.140*/(""""/></a></td>
	</tr>
		
		
	""")))}),format.raw/*41.3*/("""
	"""),format.raw/*42.2*/("""</table>


""")))}))}
  }

  def render(costfuncs:List[Costfunction],costfuncForm:Form[Costfunction]): play.twirl.api.HtmlFormat.Appendable = apply(costfuncs,costfuncForm)

  def f:((List[Costfunction],Form[Costfunction]) => play.twirl.api.HtmlFormat.Appendable) = (costfuncs,costfuncForm) => apply(costfuncs,costfuncForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/costfunc.scala.html
                  HASH: c0b9f53b5aa26da5322bb0473b52b011913959f2
                  MATRIX: 539->1|709->68|736->86|763->88|798->115|836->116|865->119|1240->468|1314->533|1353->534|1383->537|1431->559|1489->596|1528->609|1583->643|1622->656|1693->706|1732->719|1800->766|1942->878|1971->880|2129->1012|2147->1021|2160->1025|2210->1037|2239->1039|2278->1052|2295->1060|2323->1067|2363->1081|2380->1089|2409->1097|2459->1120|2474->1126|2555->1186|2600->1203|2616->1209|2701->1272|2758->1302|2773->1308|2857->1371|2901->1387|2917->1393|2970->1424|3028->1452|3057->1454
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|33->13|33->13|33->13|34->14|36->16|36->16|37->17|37->17|38->18|38->18|39->19|39->19|44->24|45->25|52->32|52->32|52->32|52->32|53->33|54->34|54->34|54->34|55->35|55->35|55->35|56->36|56->36|56->36|56->36|56->36|56->36|57->37|57->37|57->37|57->37|57->37|57->37|61->41|62->42
                  -- GENERATED --
              */
          