
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[LoginInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm:Form[LoginInfo]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Log In")/*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""
    
    """),format.raw/*6.5*/("""<h1>GenMRP</h1>
    <div>
    <p>GenMRP gives a solution for Material Requirement Planning (MRP)with optimized lot sizing using Genetic Algorithms and parallel processing.</p>
    </div>
    <table id = "login">
    <tr>
    <td>
    <p><a href ="http://genmrp.wordpress.com"> 
    <image src=""""),_display_(/*14.18*/routes/*14.24*/.Assets.at("images/icontexto-message-types-info-purple.png")),format.raw/*14.84*/("""" align="middle"/></a> For more information</p>
    <p> 
    <image src=""""),_display_(/*16.18*/routes/*16.24*/.Assets.at("images/yellowapple.png")),format.raw/*16.60*/("""" align="middle"/> Try out your self documentation</p>
    
    <p> <a href="/signin">
    <image src=""""),_display_(/*19.18*/routes/*19.24*/.Assets.at("images/xmas-20.png")),format.raw/*19.56*/("""" align="middle"/> </a> Sign in and Start using </p>
    
     </td>
    <td>
    
      """),_display_(/*24.8*/form(action = routes.Application.loginvalidate,'id -> "login")/*24.70*/{_display_(Seq[Any](format.raw/*24.71*/("""
    	"""),_display_(/*25.7*/inputText(loginForm("Company Id"))),format.raw/*25.41*/("""
    	"""),_display_(/*26.7*/inputPassword(loginForm("Password"))),format.raw/*26.43*/("""    	
        
      """),format.raw/*28.7*/("""<input type="submit" value="Log In">
    """)))}),format.raw/*29.6*/("""
    
    
    """),format.raw/*32.5*/("""</td>
    </tr>
    </table>
    
    
    
    
    
  
    
""")))}))}
  }

  def render(loginForm:Form[LoginInfo]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[LoginInfo]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/login.scala.html
                  HASH: d6f2712114f17705d96a31e3445af97c99ef1c09
                  MATRIX: 514->1|644->28|671->46|698->48|720->62|759->64|795->74|1117->369|1132->375|1213->435|1314->509|1329->515|1386->551|1517->655|1532->661|1585->693|1701->783|1772->845|1811->846|1844->853|1899->887|1932->894|1989->930|2037->951|2109->993|2151->1008
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|26->6|34->14|34->14|34->14|36->16|36->16|36->16|39->19|39->19|39->19|44->24|44->24|44->24|45->25|45->25|46->26|46->26|48->28|49->29|52->32
                  -- GENERATED --
              */
          