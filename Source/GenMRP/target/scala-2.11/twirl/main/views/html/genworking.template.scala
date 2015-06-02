
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
object genworking extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("Working on Genetic optimization")/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
"""),format.raw/*4.1*/("""<script>
 function genpopulate()"""),format.raw/*5.24*/("""{"""),format.raw/*5.25*/("""
	 """),format.raw/*6.3*/("""window.location.href = """"),_display_(/*6.28*/routes/*6.34*/.Application.genpopulate),format.raw/*6.58*/("""";
	 
 """),format.raw/*8.2*/("""}"""),format.raw/*8.3*/("""
"""),format.raw/*9.1*/("""</script>
<body onload ="genpopulate()">
	
	<center><image src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("images/matrix-animated-image.gif")),format.raw/*12.75*/("""" /><image src=""""),_display_(/*12.92*/routes/*12.98*/.Assets.at("images/matrix-animated-image.gif")),format.raw/*12.144*/("""" /></center>

	<h2> Working ....</h2>
	<button  name ="GEN" onClick="genpopulate()" /> 
</body>	
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/genworking.scala.html
                  HASH: 8ff3efcbc2ee77eebfbcad5eae5593472d59c028
                  MATRIX: 510->1|616->19|644->22|691->61|730->63|757->64|816->96|844->97|873->100|924->125|938->131|982->155|1015->162|1042->163|1069->164|1161->229|1176->235|1243->281|1287->298|1302->304|1370->350
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|27->6|27->6|27->6|27->6|29->8|29->8|30->9|33->12|33->12|33->12|33->12|33->12|33->12
                  -- GENERATED --
              */
          