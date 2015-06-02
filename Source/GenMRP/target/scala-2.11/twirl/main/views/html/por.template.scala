
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
object por extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[Order],List[Order],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String,orders:List[Order],por:List[Order]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Planned order Release")/*4.31*/{_display_(Seq[Any](format.raw/*4.32*/("""
 """),format.raw/*5.2*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
</ul>

 <h1>Material requirment plan</h1>
 
 <div>
 
  """),_display_(/*17.4*/Html(message)),format.raw/*17.17*/("""
 """),format.raw/*18.2*/("""</div>
 


"""),_display_(/*22.2*/if(!message.equals("Order failed"))/*22.37*/{_display_(Seq[Any](format.raw/*22.38*/(""" 
 """),format.raw/*23.2*/("""<p>
 <table>
 <tr>
 <td>
 	<a href=""""),_display_(/*27.13*/routes/*27.19*/.Application.genworking),format.raw/*27.42*/(""" """),format.raw/*27.43*/("""" target ="_blank">
 	<image src=""""),_display_(/*28.16*/routes/*28.22*/.Assets.at("images/Genpot2.jpg")),format.raw/*28.54*/("""" />
 	 </a>
 </td>
 <td width="400px">
 	Clicking on 'Optimize' will start the genetic optimization. This will take some time depending on the pool size and the iterations you have specified in 'Genconfig' form. Higher the pool size and the Iterations will be, you will get more optimized solution at the end. 
 </td>
 </tr>
 <tr>
 <td><a href=""""),_display_(/*36.16*/routes/*36.22*/.Application.genpopulatereport),format.raw/*36.52*/("""" ><image src=""""),_display_(/*36.68*/routes/*36.74*/.Assets.at("images/report-icon.png")),format.raw/*36.110*/(""""/></a></td>
 <td> Create Report</td>
 </tr>
 </table>	 
 </p>
""")))}),format.raw/*41.2*/("""



""")))}))}
  }

  def render(message:String,orders:List[Order],por:List[Order]): play.twirl.api.HtmlFormat.Appendable = apply(message,orders,por)

  def f:((String,List[Order],List[Order]) => play.twirl.api.HtmlFormat.Appendable) = (message,orders,por) => apply(message,orders,por)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/por.scala.html
                  HASH: 83a5dc8329dffa00a8a5b4bdea0b46cf56ce46ce
                  MATRIX: 527->1|681->52|708->70|735->72|772->101|810->102|838->104|1227->467|1261->480|1290->482|1328->494|1372->529|1411->530|1441->533|1505->570|1520->576|1564->599|1593->600|1655->635|1670->641|1723->673|2097->1020|2112->1026|2163->1056|2206->1072|2221->1078|2279->1114|2373->1178
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|37->17|37->17|38->18|42->22|42->22|42->22|43->23|47->27|47->27|47->27|47->27|48->28|48->28|48->28|56->36|56->36|56->36|56->36|56->36|56->36|61->41
                  -- GENERATED --
              */
          