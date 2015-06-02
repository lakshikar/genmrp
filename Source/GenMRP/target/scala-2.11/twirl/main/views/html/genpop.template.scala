
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
object genpop extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[gen.Solpool,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(solpool:gen.Solpool, soltable: String, timestamp:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import mrp.Soln
import gen.Solpool

Seq[Any](format.raw/*2.59*/("""

"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/main("Solution Pool")/*9.23*/{_display_(Seq[Any](format.raw/*9.24*/("""

  """),format.raw/*11.3*/("""<h1>Optimized solution</h1>
    <ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
	
   <H2>Optimized Solution</H2>
    
    Time taken for the optimization -"""),_display_(/*22.39*/timestamp),format.raw/*22.48*/(""" 
	"""),format.raw/*23.2*/("""<div>
	"""),_display_(/*24.3*/Html(soltable)),format.raw/*24.17*/("""
	"""),format.raw/*25.2*/("""</div>

  <table>
  """),_display_(/*28.4*/solpool/*28.11*/.sols.map/*28.20*/{solx =>_display_(Seq[Any](format.raw/*28.28*/(""" 
  			"""),format.raw/*29.6*/("""<tr>
	       """),_display_(/*30.10*/solx/*30.14*/.portlist.map/*30.27*/{orderc =>_display_(Seq[Any](format.raw/*30.37*/("""
			"""),format.raw/*31.4*/("""<td>"""),_display_(/*31.9*/orderc/*31.15*/.partid),format.raw/*31.22*/(""" """),format.raw/*31.23*/("""</td>
			<td>"""),_display_(/*32.9*/orderc/*32.15*/.days),format.raw/*32.20*/(""" """),format.raw/*32.21*/("""</td>
			<td>"""),_display_(/*33.9*/orderc/*33.15*/.quantity),format.raw/*33.24*/(""" """),format.raw/*33.25*/("""</td> 
			""")))}),format.raw/*34.5*/("""
	       """),format.raw/*35.9*/("""<td>"""),_display_(/*35.14*/solx/*35.18*/.fitness),format.raw/*35.26*/("""</td>
	       
	     
	     	</tr>
	     """)))}),format.raw/*39.8*/("""

   """),format.raw/*41.4*/("""</table>
""")))}))}
  }

  def render(solpool:gen.Solpool,soltable:String,timestamp:String): play.twirl.api.HtmlFormat.Appendable = apply(solpool,soltable,timestamp)

  def f:((gen.Solpool,String,String) => play.twirl.api.HtmlFormat.Appendable) = (solpool,soltable,timestamp) => apply(solpool,soltable,timestamp)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/genpop.scala.html
                  HASH: 0960f5f98a2b84f5a650337c1e2d480ac3937691
                  MATRIX: 525->2|720->59|748->115|776->118|805->139|843->140|874->144|1323->566|1353->575|1383->578|1417->586|1452->600|1481->602|1528->623|1544->630|1562->639|1608->647|1642->654|1683->668|1696->672|1718->685|1766->695|1797->699|1828->704|1843->710|1871->717|1900->718|1940->732|1955->738|1981->743|2010->744|2050->758|2065->764|2095->773|2124->774|2165->785|2201->794|2233->799|2246->803|2275->811|2347->853|2379->858
                  LINES: 19->2|24->2|26->7|28->9|28->9|28->9|30->11|41->22|41->22|42->23|43->24|43->24|44->25|47->28|47->28|47->28|47->28|48->29|49->30|49->30|49->30|49->30|50->31|50->31|50->31|50->31|50->31|51->32|51->32|51->32|51->32|52->33|52->33|52->33|52->33|53->34|54->35|54->35|54->35|54->35|58->39|60->41
                  -- GENERATED --
              */
          