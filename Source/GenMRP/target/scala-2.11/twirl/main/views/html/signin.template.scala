
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
object signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Company],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signinform : Form[Company]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.30*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Sign in")/*4.17*/{_display_(Seq[Any](format.raw/*4.18*/("""
	"""),format.raw/*5.2*/("""<table id="signin">
	<tr>
	<td>
	"""),_display_(/*8.3*/form(action = routes.Application.savecompany,'id -> "signin")/*8.64*/{_display_(Seq[Any](format.raw/*8.65*/("""
		"""),_display_(/*9.4*/inputText(signinform("Company Id"),'placeholder -> "IFS")),format.raw/*9.61*/("""
		"""),_display_(/*10.4*/inputText(signinform("Name"))),format.raw/*10.33*/("""
		"""),_display_(/*11.4*/inputPassword(signinform("Password"))),format.raw/*11.41*/("""
		"""),_display_(/*12.4*/inputText(signinform("Description"))),format.raw/*12.40*/("""
		"""),format.raw/*13.3*/("""<input type="submit" value="Submint">
		<input type="reset" value ="Clear">
	""")))}),format.raw/*15.3*/("""
	"""),format.raw/*16.2*/("""</td>
	<td>
	<image src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("images/businessman.jpg")),format.raw/*18.57*/("""" />
	 Enter a company Id with that would give a short name for your company. Enter a secret password.These fields are the 
	 required fields for registering the company. Name and Description can be given as you wish to describe you company.
	</td>
	</tr>
	</table>
	

""")))}))}
  }

  def render(signinform:Form[Company]): play.twirl.api.HtmlFormat.Appendable = apply(signinform)

  def f:((Form[Company]) => play.twirl.api.HtmlFormat.Appendable) = (signinform) => apply(signinform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/signin.scala.html
                  HASH: 6e324ad27948bffea3291e951192f37c2a462de4
                  MATRIX: 513->1|644->29|671->47|698->49|721->64|759->65|787->67|846->101|915->162|953->163|982->167|1059->224|1089->228|1139->257|1169->261|1227->298|1257->302|1314->338|1344->341|1452->419|1481->421|1534->447|1549->453|1606->489
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|28->8|28->8|28->8|29->9|29->9|30->10|30->10|31->11|31->11|32->12|32->12|33->13|35->15|36->16|38->18|38->18|38->18
                  -- GENERATED --
              */
          