
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
object bom extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[Bom],Form[Bom],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(partid:String,boms:List[Bom],bomForm :Form[Bom]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Bom sub parts")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""

	 """),format.raw/*6.3*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
	<h1> The Bill Of Materials (BOM) sub parts </h1>
	<h2>Add sub part</h2>
	"""),_display_(/*15.3*/form(action = routes.Application.bomadd,'id -> "genmrpform")/*15.63*/{_display_(Seq[Any](format.raw/*15.64*/("""
		"""),format.raw/*16.3*/("""<table>
		<tr>
		<td>"""),_display_(/*18.8*/inputText(bomForm("Company ID"))),format.raw/*18.40*/("""</td>
		<td>"""),_display_(/*19.8*/inputText(bomForm("Part ID"))),format.raw/*19.37*/("""</td>
		<td>"""),_display_(/*20.8*/inputText(bomForm("Child Part"))),format.raw/*20.40*/("""</td>
		<td>"""),_display_(/*21.8*/inputText(bomForm("Quantity"),'size -> 10)),format.raw/*21.50*/("""</td>
		</tr>
		</table>
		<input type="submit" value="Add Child">
		
	""")))}),format.raw/*26.3*/("""
	"""),format.raw/*27.2*/("""<table id="flowdata" border="1">
	<tr>
	 <th>Child part Id</th>
	 <th>Quantity</th>
	 <th>Del</th>
	</tr>
	
	"""),_display_(/*34.3*/boms/*34.7*/.map/*34.11*/{bom =>_display_(Seq[Any](format.raw/*34.18*/("""
		"""),format.raw/*35.3*/("""<tr>
			<td>"""),_display_(/*36.9*/bom/*36.12*/.childpartid),format.raw/*36.24*/("""</td>
			<td>"""),_display_(/*37.9*/bom/*37.12*/.quantity),format.raw/*37.21*/("""</td>
			<td> <a href=""""),_display_(/*38.19*/routes/*38.25*/.Application.bomdelete(bom.partid,bom.childpartid)),format.raw/*38.75*/(""""><image src = """"),_display_(/*38.92*/routes/*38.98*/.Assets.at("images/icontexto-message-types-error-purple16.png")),format.raw/*38.161*/(""""/></a>
			</td>
		</tr>
	""")))}),format.raw/*41.3*/("""
	"""),format.raw/*42.2*/("""</table>
	
<a href="/">Home</a> <p>
<a href=""""),_display_(/*45.11*/routes/*45.17*/.Application.part),format.raw/*45.34*/("""">Part</a>
""")))}),format.raw/*46.2*/("""
"""))}
  }

  def render(partid:String,boms:List[Bom],bomForm:Form[Bom]): play.twirl.api.HtmlFormat.Appendable = apply(partid,boms,bomForm)

  def f:((String,List[Bom],Form[Bom]) => play.twirl.api.HtmlFormat.Appendable) = (partid,boms,bomForm) => apply(partid,boms,bomForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:24 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/bom.scala.html
                  HASH: 79c4eb3e7866d845872a5b034c08040972e07cab
                  MATRIX: 523->1|675->50|702->68|729->70|758->91|796->92|826->96|1241->485|1310->545|1349->546|1379->549|1427->571|1480->603|1519->616|1569->645|1608->658|1661->690|1700->703|1763->745|1865->817|1894->819|2030->929|2042->933|2055->937|2100->944|2130->947|2169->960|2181->963|2214->975|2254->989|2266->992|2296->1001|2347->1025|2362->1031|2433->1081|2477->1098|2492->1104|2577->1167|2634->1194|2663->1196|2736->1242|2751->1248|2789->1265|2831->1277
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|26->6|35->15|35->15|35->15|36->16|38->18|38->18|39->19|39->19|40->20|40->20|41->21|41->21|46->26|47->27|54->34|54->34|54->34|54->34|55->35|56->36|56->36|56->36|57->37|57->37|57->37|58->38|58->38|58->38|58->38|58->38|58->38|61->41|62->42|65->45|65->45|65->45|66->46
                  -- GENERATED --
              */
          