
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome GenMRP Home")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
   
    """),format.raw/*5.5*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
    
   <h1>GenMRP Home </h1> 
   <H3>You are logged in with """),_display_(/*14.32*/message),format.raw/*14.39*/("""</H3>
   <h4> please proceed with you configurations.</h4>
   
   <table id="home">
   <tr>
   <td><a href="part"><image src=""""),_display_(/*19.36*/routes/*19.42*/.Assets.at("images/process10.JPG")),format.raw/*19.76*/("""" /> </a></td>
   <td><a href=""""),_display_(/*20.18*/routes/*20.24*/.Application.order),format.raw/*20.42*/(""""> <image src=""""),_display_(/*20.58*/routes/*20.64*/.Assets.at("images/table.png")),format.raw/*20.94*/("""" /></a></td>
   <td><a href=""""),_display_(/*21.18*/routes/*21.24*/.Application.genconf),format.raw/*21.44*/(""""> <image src=""""),_display_(/*21.60*/routes/*21.66*/.Assets.at("images/genetics.svg_.png")),format.raw/*21.104*/("""" width="145" height="145"/></a></td>
   <td><a href="logout"><image src=""""),_display_(/*22.38*/routes/*22.44*/.Assets.at("images/logout.png")),format.raw/*22.75*/("""" /></a></td>  
   </tr>
   <tr>
   <td>Parts</td>
   <td>Order Snapshot</td>
   <td>Genetic Engine</td>
   <td>Logout</td>
   </tr>
   </table>
  
   

   
  
  
    
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/index.scala.html
                  HASH: f41da62df5d775b6c6aebd5da4b43ca8bc07b9c8
                  MATRIX: 505->1|610->18|638->21|673->48|712->50|747->59|1150->435|1178->442|1332->569|1347->575|1402->609|1461->641|1476->647|1515->665|1558->681|1573->687|1624->717|1682->748|1697->754|1738->774|1781->790|1796->796|1856->834|1958->909|1973->915|2025->946
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|35->14|35->14|40->19|40->19|40->19|41->20|41->20|41->20|41->20|41->20|41->20|42->21|42->21|42->21|42->21|42->21|42->21|43->22|43->22|43->22
                  -- GENERATED --
              */
          