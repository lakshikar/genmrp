
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
object part extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Part],Form[Part],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parts:List[Part], partForm:Form[Part]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Manage your Part or Materials")/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
    """),format.raw/*5.5*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>
	
    <h2> You are at Products and Parts page</h2> 
    <p/>
    <h3>Add new parts</h3>
    
    """),_display_(/*17.6*/form(action = routes.Application.partadd, 'id -> "genmrpform")/*17.68*/{_display_(Seq[Any](format.raw/*17.69*/("""
    """),format.raw/*18.5*/("""<table>
    <tr>
    <td>"""),_display_(/*20.10*/inputText(partForm("CompId"))),format.raw/*20.39*/(""" 
    """),format.raw/*21.5*/("""</td>
    <td>"""),_display_(/*22.10*/inputText(partForm("PartId"))),format.raw/*22.39*/("""
    """),format.raw/*23.5*/("""</td>
    <td>"""),_display_(/*24.10*/inputText(partForm("Part name"))),format.raw/*24.42*/("""
    """),format.raw/*25.5*/("""</td>
    <td>"""),_display_(/*26.10*/inputText(partForm("Lead time"),'size -> 10)),format.raw/*26.54*/("""
    """),format.raw/*27.5*/("""</td>
    <td>"""),_display_(/*28.10*/inputText(partForm("On Hand"),'size -> 10)),format.raw/*28.52*/("""
    """),format.raw/*29.5*/("""</td>
    </tr>
    </table>
        <input type="submit" value="Add Part">
        <input type="reset" value ="Clear">
    """)))}),format.raw/*34.6*/("""
    
    """),format.raw/*36.5*/("""<h3>Products and  parts</h3>
    <table id="flowdata" border="1">
    <tr>
    	<th>Company</th>
    	<th>Part Id</th>
    	<th>Part Name</th>
    	<th>Lead time(days)</th>
    	<th>On hand </th>
    	<th></th>
    	<th></th>
    	<th></th>
    	<th></th>
    	<th></th>
    	
    </tr>
   
    """),_display_(/*52.6*/parts/*52.11*/.map/*52.15*/{ part =>_display_(Seq[Any](format.raw/*52.24*/("""
     """),format.raw/*53.6*/("""<tr> 
     <td>"""),_display_(/*54.11*/part/*54.15*/.compid),format.raw/*54.22*/("""</td>
     <td>"""),_display_(/*55.11*/part/*55.15*/.partid),format.raw/*55.22*/(""" """),format.raw/*55.23*/("""</td>
     <td>"""),_display_(/*56.11*/part/*56.15*/.partname),format.raw/*56.24*/("""</td>
     <td>"""),_display_(/*57.11*/part/*57.15*/.leadtime),format.raw/*57.24*/("""</td>
     <td>"""),_display_(/*58.11*/part/*58.15*/.onhand),format.raw/*58.22*/("""</td>
     <td>"""),_display_(/*59.11*/form(routes.Application.prepartupdate(part.partid))/*59.62*/{_display_(Seq[Any](format.raw/*59.63*/("""
    				"""),format.raw/*60.9*/("""<input type="submit" value="Update"/>
    			""")))}),format.raw/*61.9*/("""
     """),format.raw/*62.6*/("""</td>
     <td>"""),_display_(/*63.11*/form(routes.Application.partdelete(part.partid))/*63.59*/{_display_(Seq[Any](format.raw/*63.60*/("""
    				"""),format.raw/*64.9*/("""<input type="submit" value="Delete"/>
    			""")))}),format.raw/*65.9*/("""
     """),format.raw/*66.6*/("""</td>
     <td>"""),_display_(/*67.11*/form(routes.Application.bom(part.partid))/*67.52*/{_display_(Seq[Any](format.raw/*67.53*/("""
     			"""),format.raw/*68.9*/("""<input type="submit" value="Sub Parts"/>
     	""")))}),format.raw/*69.8*/("""
     
     """),format.raw/*71.6*/("""</td>
     <td>
     	"""),_display_(/*73.8*/form(routes.Application.costfunc(part.partid))/*73.54*/{_display_(Seq[Any](format.raw/*73.55*/("""
     		"""),format.raw/*74.8*/("""<input type="submit" value="Cost functions"/>
        """)))}),format.raw/*75.10*/("""
     """),format.raw/*76.6*/("""</td>
     <td>
     	"""),_display_(/*78.8*/form(routes.Application.orderpart(part.partid))/*78.55*/{_display_(Seq[Any](format.raw/*78.56*/("""
     		"""),format.raw/*79.8*/("""<input type="submit" value="Order"/>
     	""")))}),format.raw/*80.8*/("""
     """),format.raw/*81.6*/("""</td>
    </tr>
    """)))}),format.raw/*83.6*/("""
    """),format.raw/*84.5*/("""</table>
    
    
    
""")))}))}
  }

  def render(parts:List[Part],partForm:Form[Part]): play.twirl.api.HtmlFormat.Appendable = apply(parts,partForm)

  def f:((List[Part],Form[Part]) => play.twirl.api.HtmlFormat.Appendable) = (parts,partForm) => apply(parts,partForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/part.scala.html
                  HASH: 9dae51edd08855a1f41a2e98029fe5567f3ba5a5
                  MATRIX: 519->1|661->40|688->58|715->60|760->97|799->99|830->104|1268->516|1339->578|1378->579|1410->584|1463->610|1513->639|1546->645|1588->660|1638->689|1670->694|1712->709|1765->741|1797->746|1839->761|1904->805|1936->810|1978->825|2041->867|2073->872|2228->997|2265->1007|2587->1303|2601->1308|2614->1312|2661->1321|2694->1327|2737->1343|2750->1347|2778->1354|2821->1370|2834->1374|2862->1381|2891->1382|2934->1398|2947->1402|2977->1411|3020->1427|3033->1431|3063->1440|3106->1456|3119->1460|3147->1467|3190->1483|3250->1534|3289->1535|3325->1544|3401->1590|3434->1596|3477->1612|3534->1660|3573->1661|3609->1670|3685->1716|3718->1722|3761->1738|3811->1779|3850->1780|3886->1789|3964->1837|4003->1849|4052->1872|4107->1918|4146->1919|4181->1927|4267->1982|4300->1988|4349->2011|4405->2058|4444->2059|4479->2067|4553->2111|4586->2117|4637->2138|4669->2143
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|37->17|37->17|37->17|38->18|40->20|40->20|41->21|42->22|42->22|43->23|44->24|44->24|45->25|46->26|46->26|47->27|48->28|48->28|49->29|54->34|56->36|72->52|72->52|72->52|72->52|73->53|74->54|74->54|74->54|75->55|75->55|75->55|75->55|76->56|76->56|76->56|77->57|77->57|77->57|78->58|78->58|78->58|79->59|79->59|79->59|80->60|81->61|82->62|83->63|83->63|83->63|84->64|85->65|86->66|87->67|87->67|87->67|88->68|89->69|91->71|93->73|93->73|93->73|94->74|95->75|96->76|98->78|98->78|98->78|99->79|100->80|101->81|103->83|104->84
                  -- GENERATED --
              */
          