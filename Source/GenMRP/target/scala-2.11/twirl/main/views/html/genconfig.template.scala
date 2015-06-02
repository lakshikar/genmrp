
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
object genconfig extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Genconfig],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(genConfigForm: Form[Genconfig]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.35*/("""
 
 """),format.raw/*4.1*/(""" 
 
 """),_display_(/*6.3*/main("Configure Genetic parameters")/*6.39*/{_display_(Seq[Any](format.raw/*6.40*/("""
  """),format.raw/*7.3*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
 
   <div>
   	<p> Configure your Genetic engine parameters below. pool size will determine the number of random solutions that will
   	 be created in a single genetic operation. Iterations determine the number of cycles that you want to perform crossovers
   	 and mutations on your Random sample sample space.</p> 
   </div>
   
   """),_display_(/*21.5*/form(action = routes.Application.genconfupdate, 'id -> "genconfig")/*21.72*/{_display_(Seq[Any](format.raw/*21.73*/("""
   			"""),_display_(/*22.8*/inputText(genConfigForm("Pool Size"))),format.raw/*22.45*/("""
   			"""),_display_(/*23.8*/inputText(genConfigForm("Iterations"))),format.raw/*23.46*/("""
   			"""),_display_(/*24.8*/inputText(genConfigForm("Max order count"))),format.raw/*24.51*/("""
   			"""),_display_(/*25.8*/inputText(genConfigForm("Workers"))),format.raw/*25.43*/("""
   			"""),_display_(/*26.8*/inputText(genConfigForm("Reports Path"),'size -> 40)),format.raw/*26.60*/("""
   			"""),format.raw/*27.7*/("""<input type="submit" value ="Set"/>
   		
   """)))}),format.raw/*29.5*/("""
 
 """)))}))}
  }

  def render(genConfigForm:Form[Genconfig]): play.twirl.api.HtmlFormat.Appendable = apply(genConfigForm)

  def f:((Form[Genconfig]) => play.twirl.api.HtmlFormat.Appendable) = (genConfigForm) => apply(genConfigForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/genconfig.scala.html
                  HASH: 888fc788ada473d936ba90a418ecb87f65c3afd4
                  MATRIX: 518->2|653->34|683->55|714->61|758->97|796->98|825->101|1501->751|1577->818|1616->819|1650->827|1708->864|1742->872|1801->910|1835->918|1899->961|1933->969|1989->1004|2023->1012|2096->1064|2130->1071|2206->1117
                  LINES: 19->1|22->1|24->4|26->6|26->6|26->6|27->7|41->21|41->21|41->21|42->22|42->22|43->23|43->23|44->24|44->24|45->25|45->25|46->26|46->26|47->27|49->29
                  -- GENERATED --
              */
          