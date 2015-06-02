
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
object order extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Order],Form[Order],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(orders : List[Order],orderform :Form[Order]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Company orders")/*4.24*/{_display_(Seq[Any](format.raw/*4.25*/("""
	 """),format.raw/*5.3*/("""<ul id="menu">
		<li id="menu"><a id="mele" href="/">Home</a></li>
		<li id="menu"><a id="mele" href="/part">Parts</a></li>
		<li id="menu"><a id="mele" href="/order">Orders</a></li>
		<li id="menu"><a id="mele" href="/genconf">GenConfig</a></li>
		<li id="menu"><a id="mele" href="/logout">Logout</a></li>
	</ul>

	<h1>Company Orders</h1>
	
	"""),_display_(/*15.3*/form(action = routes.Application.ordernew, 'id -> "genmrpform")/*15.66*/{_display_(Seq[Any](format.raw/*15.67*/("""
	"""),format.raw/*16.2*/("""<table>
	<tr>
		<td>"""),_display_(/*18.8*/inputText(orderform("Company ID"))),format.raw/*18.42*/("""</td>
		<td>"""),_display_(/*19.8*/inputText(orderform("Part ID"))),format.raw/*19.39*/("""</td>
		<td>"""),_display_(/*20.8*/inputText(orderform("Order Id"),'size-> 10)),format.raw/*20.51*/("""</td>
		<td>"""),_display_(/*21.8*/inputText(orderform("Schedule ID"),'size -> 10)),format.raw/*21.55*/("""</td>
		<td>"""),_display_(/*22.8*/inputText(orderform("Days"),'size -> 8)),format.raw/*22.47*/("""</td>
		<td>"""),_display_(/*23.8*/inputText(orderform("Quantity"),'size -> 8)),format.raw/*23.51*/("""</td>
	</tr>
	</table>
	<input type="submit" value="Order"/>
	 <input type="reset" value ="Clear">	
	""")))}),format.raw/*28.3*/("""
   
   """),format.raw/*30.4*/("""<table id="flowdata" border="1">
   	<tr>
   		<th>Company Id</th>
   		<th>Part id</th>
   		<th>Order id</th>
   		<th>Schedule id</th>
   		<th>Time Frame</th>
   		<th>Quantity</th>
   		<th>Delete</th>
   		<th>Update</th>
   	</tr>
   """),_display_(/*41.5*/orders/*41.11*/.map/*41.15*/{order =>_display_(Seq[Any](format.raw/*41.24*/("""
    """),format.raw/*42.5*/("""<tr>
    	<td>"""),_display_(/*43.11*/order/*43.16*/.compid),format.raw/*43.23*/("""</td>
    	<td>"""),_display_(/*44.11*/order/*44.16*/.partid),format.raw/*44.23*/("""</td>
    	<td>"""),_display_(/*45.11*/order/*45.16*/.orderid),format.raw/*45.24*/("""</td>
    	<td>"""),_display_(/*46.11*/order/*46.16*/.scheduleid),format.raw/*46.27*/("""</td>
    	<td>"""),_display_(/*47.11*/order/*47.16*/.days),format.raw/*47.21*/("""</td>
    	<td>"""),_display_(/*48.11*/order/*48.16*/.quantity),format.raw/*48.25*/("""</td>
    	<td align="center"><a href =""""),_display_(/*49.36*/routes/*49.42*/.Application.orderremove(order.orderid)),format.raw/*49.81*/(""""><image src = """"),_display_(/*49.98*/routes/*49.104*/.Assets.at("images/icontexto-message-types-error-purple16.png")),format.raw/*49.167*/(""""/></a></td>
    	<td><a href=""""),_display_(/*50.20*/routes/*50.26*/.Application.perorderupdate(order.orderid)),format.raw/*50.68*/(""""><image src=""""),_display_(/*50.83*/routes/*50.89*/.Assets.at("images/update.jpg")),format.raw/*50.120*/(""""/></a></td>
    </tr>
    		
   """)))}),format.raw/*53.5*/("""
   """),format.raw/*54.4*/("""</table>
   <table>
   <tr>
   <td><a href=""""),_display_(/*57.18*/routes/*57.24*/.Application.genpor),format.raw/*57.43*/(""""><image src=""""),_display_(/*57.58*/routes/*57.64*/.Assets.at("images/POR.jpg")),format.raw/*57.92*/("""" /></a></td>
   <td width="400px"> Click on “Purchase order release” to generate the planned order release. This will give you the planned purchase order releases for the received orders above.<br/>
 If the planned order releases are not feasible. The GenMRP will give you an error. This means that you cant fulfill the received orders in time.  </td>
   </tr>
   </table>
   <br/>
   
   

""")))}))}
  }

  def render(orders:List[Order],orderform:Form[Order]): play.twirl.api.HtmlFormat.Appendable = apply(orders,orderform)

  def f:((List[Order],Form[Order]) => play.twirl.api.HtmlFormat.Appendable) = (orders,orderform) => apply(orders,orderform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Apr 11 18:17:25 IST 2015
                  SOURCE: /home/user/Projects/GenMRP/app/views/order.scala.html
                  HASH: c2ec1583dc7b3ae362704f07258ac1fadf2ba8bf
                  MATRIX: 522->1|670->46|697->64|724->66|754->88|792->89|821->92|1191->436|1263->499|1302->500|1331->502|1378->523|1433->557|1472->570|1524->601|1563->614|1627->657|1666->670|1734->717|1773->730|1833->769|1872->782|1936->825|2068->927|2103->935|2371->1177|2386->1183|2399->1187|2446->1196|2478->1201|2520->1216|2534->1221|2562->1228|2605->1244|2619->1249|2647->1256|2690->1272|2704->1277|2733->1285|2776->1301|2790->1306|2822->1317|2865->1333|2879->1338|2905->1343|2948->1359|2962->1364|2992->1373|3060->1414|3075->1420|3135->1459|3179->1476|3195->1482|3280->1545|3339->1577|3354->1583|3417->1625|3459->1640|3474->1646|3527->1677|3591->1711|3622->1715|3694->1760|3709->1766|3749->1785|3791->1800|3806->1806|3855->1834
                  LINES: 19->1|22->1|23->3|24->4|24->4|24->4|25->5|35->15|35->15|35->15|36->16|38->18|38->18|39->19|39->19|40->20|40->20|41->21|41->21|42->22|42->22|43->23|43->23|48->28|50->30|61->41|61->41|61->41|61->41|62->42|63->43|63->43|63->43|64->44|64->44|64->44|65->45|65->45|65->45|66->46|66->46|66->46|67->47|67->47|67->47|68->48|68->48|68->48|69->49|69->49|69->49|69->49|69->49|69->49|70->50|70->50|70->50|70->50|70->50|70->50|73->53|74->54|77->57|77->57|77->57|77->57|77->57|77->57
                  -- GENERATED --
              */
          