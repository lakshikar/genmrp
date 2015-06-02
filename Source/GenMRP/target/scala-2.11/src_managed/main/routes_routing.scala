// @SOURCE:/home/user/Projects/GenMRP/conf/routes
// @HASH:5beaf6259a9aa1586279749a6f2f332b3fc9aa20
// @DATE:Sat Apr 11 18:17:22 IST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:10
private[this] lazy val controllers_Application_part2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("part"))))
private[this] lazy val controllers_Application_part2_invoker = createInvoker(
controllers.Application.part,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "part", Nil,"GET", """""", Routes.prefix + """part"""))
        

// @LINE:11
private[this] lazy val controllers_Application_login3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login3_invoker = createInvoker(
controllers.Application.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:12
private[this] lazy val controllers_Application_signin4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
private[this] lazy val controllers_Application_signin4_invoker = createInvoker(
controllers.Application.signin,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signin", Nil,"GET", """""", Routes.prefix + """signin"""))
        

// @LINE:13
private[this] lazy val controllers_Application_logout5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout5_invoker = createInvoker(
controllers.Application.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:14
private[this] lazy val controllers_Application_partadd6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("part"))))
private[this] lazy val controllers_Application_partadd6_invoker = createInvoker(
controllers.Application.partadd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "partadd", Nil,"POST", """""", Routes.prefix + """part"""))
        

// @LINE:15
private[this] lazy val controllers_Application_loginvalidate7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_loginvalidate7_invoker = createInvoker(
controllers.Application.loginvalidate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginvalidate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:16
private[this] lazy val controllers_Application_savecompany8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
private[this] lazy val controllers_Application_savecompany8_invoker = createInvoker(
controllers.Application.savecompany,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "savecompany", Nil,"POST", """""", Routes.prefix + """signin"""))
        

// @LINE:17
private[this] lazy val controllers_Application_partdelete9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("partdelete/"),DynamicPart("partid", """[^/]+""",true))))
private[this] lazy val controllers_Application_partdelete9_invoker = createInvoker(
controllers.Application.partdelete(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "partdelete", Seq(classOf[String]),"GET", """""", Routes.prefix + """partdelete/$partid<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_Application_prepartupdate10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prepartupdate/"),DynamicPart("partid", """[^/]+""",true))))
private[this] lazy val controllers_Application_prepartupdate10_invoker = createInvoker(
controllers.Application.prepartupdate(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "prepartupdate", Seq(classOf[String]),"GET", """""", Routes.prefix + """prepartupdate/$partid<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_Application_bom11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bom/"),DynamicPart("partid", """[^/]+""",true))))
private[this] lazy val controllers_Application_bom11_invoker = createInvoker(
controllers.Application.bom(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "bom", Seq(classOf[String]),"GET", """""", Routes.prefix + """bom/$partid<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_Application_bomadd12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bomadd"))))
private[this] lazy val controllers_Application_bomadd12_invoker = createInvoker(
controllers.Application.bomadd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "bomadd", Nil,"POST", """""", Routes.prefix + """bomadd"""))
        

// @LINE:21
private[this] lazy val controllers_Application_bomdelete13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bomdelet/"),DynamicPart("partid", """[^/]+""",true),StaticPart("/"),DynamicPart("childpartid", """[^/]+""",true))))
private[this] lazy val controllers_Application_bomdelete13_invoker = createInvoker(
controllers.Application.bomdelete(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "bomdelete", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """bomdelet/$partid<[^/]+>/$childpartid<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_Application_costfunc14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("costfunc/"),DynamicPart("partid", """[^/]+""",true))))
private[this] lazy val controllers_Application_costfunc14_invoker = createInvoker(
controllers.Application.costfunc(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfunc", Seq(classOf[String]),"GET", """""", Routes.prefix + """costfunc/$partid<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_Application_costfuncadd15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("costfuncadd"))))
private[this] lazy val controllers_Application_costfuncadd15_invoker = createInvoker(
controllers.Application.costfuncadd,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfuncadd", Nil,"POST", """""", Routes.prefix + """costfuncadd"""))
        

// @LINE:24
private[this] lazy val controllers_Application_costfuncdelete16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("costfuncdelete/"),DynamicPart("partid", """[^/]+""",true),StaticPart("/"),DynamicPart("funcid", """[^/]+""",true))))
private[this] lazy val controllers_Application_costfuncdelete16_invoker = createInvoker(
controllers.Application.costfuncdelete(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfuncdelete", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """costfuncdelete/$partid<[^/]+>/$funcid<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_Application_order17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("order"))))
private[this] lazy val controllers_Application_order17_invoker = createInvoker(
controllers.Application.order,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "order", Nil,"GET", """""", Routes.prefix + """order"""))
        

// @LINE:26
private[this] lazy val controllers_Application_ordernew18_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ordernew"))))
private[this] lazy val controllers_Application_ordernew18_invoker = createInvoker(
controllers.Application.ordernew,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ordernew", Nil,"POST", """""", Routes.prefix + """ordernew"""))
        

// @LINE:27
private[this] lazy val controllers_Application_orderupdate19_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("orderupdate"))))
private[this] lazy val controllers_Application_orderupdate19_invoker = createInvoker(
controllers.Application.orderupdate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "orderupdate", Nil,"POST", """""", Routes.prefix + """orderupdate"""))
        

// @LINE:28
private[this] lazy val controllers_Application_perorderupdate20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("perorderupdate/"),DynamicPart("orderid", """[^/]+""",true))))
private[this] lazy val controllers_Application_perorderupdate20_invoker = createInvoker(
controllers.Application.perorderupdate(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "perorderupdate", Seq(classOf[Int]),"GET", """""", Routes.prefix + """perorderupdate/$orderid<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_Application_orderremove21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("orderremove/"),DynamicPart("orderid", """[^/]+""",true))))
private[this] lazy val controllers_Application_orderremove21_invoker = createInvoker(
controllers.Application.orderremove(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "orderremove", Seq(classOf[Int]),"GET", """""", Routes.prefix + """orderremove/$orderid<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_Application_orderpart22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("orderpart/"),DynamicPart("partid", """[^/]+""",true))))
private[this] lazy val controllers_Application_orderpart22_invoker = createInvoker(
controllers.Application.orderpart(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "orderpart", Seq(classOf[String]),"GET", """""", Routes.prefix + """orderpart/$partid<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_Application_genpor23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("genpor"))))
private[this] lazy val controllers_Application_genpor23_invoker = createInvoker(
controllers.Application.genpor,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genpor", Nil,"GET", """""", Routes.prefix + """genpor"""))
        

// @LINE:32
private[this] lazy val controllers_Application_genconf24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("genconf"))))
private[this] lazy val controllers_Application_genconf24_invoker = createInvoker(
controllers.Application.genconf,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genconf", Nil,"GET", """""", Routes.prefix + """genconf"""))
        

// @LINE:33
private[this] lazy val controllers_Application_genconfupdate25_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("genconfupdate"))))
private[this] lazy val controllers_Application_genconfupdate25_invoker = createInvoker(
controllers.Application.genconfupdate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genconfupdate", Nil,"POST", """""", Routes.prefix + """genconfupdate"""))
        

// @LINE:34
private[this] lazy val controllers_Application_genpopulate26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("genpopulate"))))
private[this] lazy val controllers_Application_genpopulate26_invoker = createInvoker(
controllers.Application.genpopulate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genpopulate", Nil,"GET", """""", Routes.prefix + """genpopulate"""))
        

// @LINE:35
private[this] lazy val controllers_Application_partupdate27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("partupdate"))))
private[this] lazy val controllers_Application_partupdate27_invoker = createInvoker(
controllers.Application.partupdate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "partupdate", Nil,"POST", """""", Routes.prefix + """partupdate"""))
        

// @LINE:36
private[this] lazy val controllers_Application_costfuncupdate28_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("costfuncupdate"))))
private[this] lazy val controllers_Application_costfuncupdate28_invoker = createInvoker(
controllers.Application.costfuncupdate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfuncupdate", Nil,"POST", """""", Routes.prefix + """costfuncupdate"""))
        

// @LINE:37
private[this] lazy val controllers_Application_precostfuncupdate29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("precostfuncupdate/"),DynamicPart("partid", """[^/]+""",true),StaticPart("/"),DynamicPart("funcid", """[^/]+""",true))))
private[this] lazy val controllers_Application_precostfuncupdate29_invoker = createInvoker(
controllers.Application.precostfuncupdate(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "precostfuncupdate", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """precostfuncupdate/$partid<[^/]+>/$funcid<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_Application_genworking30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("genworking"))))
private[this] lazy val controllers_Application_genworking30_invoker = createInvoker(
controllers.Application.genworking,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genworking", Nil,"GET", """""", Routes.prefix + """genworking"""))
        

// @LINE:39
private[this] lazy val controllers_Application_genpopulatereport31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("genpopulatereport"))))
private[this] lazy val controllers_Application_genpopulatereport31_invoker = createInvoker(
controllers.Application.genpopulatereport,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genpopulatereport", Nil,"GET", """""", Routes.prefix + """genpopulatereport"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """part""","""controllers.Application.part"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.Application.signin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """part""","""controllers.Application.partadd"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.loginvalidate"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.Application.savecompany"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """partdelete/$partid<[^/]+>""","""controllers.Application.partdelete(partid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prepartupdate/$partid<[^/]+>""","""controllers.Application.prepartupdate(partid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bom/$partid<[^/]+>""","""controllers.Application.bom(partid:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bomadd""","""controllers.Application.bomadd"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bomdelet/$partid<[^/]+>/$childpartid<[^/]+>""","""controllers.Application.bomdelete(partid:String, childpartid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """costfunc/$partid<[^/]+>""","""controllers.Application.costfunc(partid:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """costfuncadd""","""controllers.Application.costfuncadd"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """costfuncdelete/$partid<[^/]+>/$funcid<[^/]+>""","""controllers.Application.costfuncdelete(partid:String, funcid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """order""","""controllers.Application.order"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ordernew""","""controllers.Application.ordernew"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """orderupdate""","""controllers.Application.orderupdate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """perorderupdate/$orderid<[^/]+>""","""controllers.Application.perorderupdate(orderid:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """orderremove/$orderid<[^/]+>""","""controllers.Application.orderremove(orderid:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """orderpart/$partid<[^/]+>""","""controllers.Application.orderpart(partid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """genpor""","""controllers.Application.genpor"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """genconf""","""controllers.Application.genconf"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """genconfupdate""","""controllers.Application.genconfupdate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """genpopulate""","""controllers.Application.genpopulate"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """partupdate""","""controllers.Application.partupdate"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """costfuncupdate""","""controllers.Application.costfuncupdate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """precostfuncupdate/$partid<[^/]+>/$funcid<[^/]+>""","""controllers.Application.precostfuncupdate(partid:String, funcid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """genworking""","""controllers.Application.genworking"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """genpopulatereport""","""controllers.Application.genpopulatereport""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:10
case controllers_Application_part2_route(params) => {
   call { 
        controllers_Application_part2_invoker.call(controllers.Application.part)
   }
}
        

// @LINE:11
case controllers_Application_login3_route(params) => {
   call { 
        controllers_Application_login3_invoker.call(controllers.Application.login)
   }
}
        

// @LINE:12
case controllers_Application_signin4_route(params) => {
   call { 
        controllers_Application_signin4_invoker.call(controllers.Application.signin)
   }
}
        

// @LINE:13
case controllers_Application_logout5_route(params) => {
   call { 
        controllers_Application_logout5_invoker.call(controllers.Application.logout)
   }
}
        

// @LINE:14
case controllers_Application_partadd6_route(params) => {
   call { 
        controllers_Application_partadd6_invoker.call(controllers.Application.partadd)
   }
}
        

// @LINE:15
case controllers_Application_loginvalidate7_route(params) => {
   call { 
        controllers_Application_loginvalidate7_invoker.call(controllers.Application.loginvalidate)
   }
}
        

// @LINE:16
case controllers_Application_savecompany8_route(params) => {
   call { 
        controllers_Application_savecompany8_invoker.call(controllers.Application.savecompany)
   }
}
        

// @LINE:17
case controllers_Application_partdelete9_route(params) => {
   call(params.fromPath[String]("partid", None)) { (partid) =>
        controllers_Application_partdelete9_invoker.call(controllers.Application.partdelete(partid))
   }
}
        

// @LINE:18
case controllers_Application_prepartupdate10_route(params) => {
   call(params.fromPath[String]("partid", None)) { (partid) =>
        controllers_Application_prepartupdate10_invoker.call(controllers.Application.prepartupdate(partid))
   }
}
        

// @LINE:19
case controllers_Application_bom11_route(params) => {
   call(params.fromPath[String]("partid", None)) { (partid) =>
        controllers_Application_bom11_invoker.call(controllers.Application.bom(partid))
   }
}
        

// @LINE:20
case controllers_Application_bomadd12_route(params) => {
   call { 
        controllers_Application_bomadd12_invoker.call(controllers.Application.bomadd)
   }
}
        

// @LINE:21
case controllers_Application_bomdelete13_route(params) => {
   call(params.fromPath[String]("partid", None), params.fromPath[String]("childpartid", None)) { (partid, childpartid) =>
        controllers_Application_bomdelete13_invoker.call(controllers.Application.bomdelete(partid, childpartid))
   }
}
        

// @LINE:22
case controllers_Application_costfunc14_route(params) => {
   call(params.fromPath[String]("partid", None)) { (partid) =>
        controllers_Application_costfunc14_invoker.call(controllers.Application.costfunc(partid))
   }
}
        

// @LINE:23
case controllers_Application_costfuncadd15_route(params) => {
   call { 
        controllers_Application_costfuncadd15_invoker.call(controllers.Application.costfuncadd)
   }
}
        

// @LINE:24
case controllers_Application_costfuncdelete16_route(params) => {
   call(params.fromPath[String]("partid", None), params.fromPath[String]("funcid", None)) { (partid, funcid) =>
        controllers_Application_costfuncdelete16_invoker.call(controllers.Application.costfuncdelete(partid, funcid))
   }
}
        

// @LINE:25
case controllers_Application_order17_route(params) => {
   call { 
        controllers_Application_order17_invoker.call(controllers.Application.order)
   }
}
        

// @LINE:26
case controllers_Application_ordernew18_route(params) => {
   call { 
        controllers_Application_ordernew18_invoker.call(controllers.Application.ordernew)
   }
}
        

// @LINE:27
case controllers_Application_orderupdate19_route(params) => {
   call { 
        controllers_Application_orderupdate19_invoker.call(controllers.Application.orderupdate)
   }
}
        

// @LINE:28
case controllers_Application_perorderupdate20_route(params) => {
   call(params.fromPath[Int]("orderid", None)) { (orderid) =>
        controllers_Application_perorderupdate20_invoker.call(controllers.Application.perorderupdate(orderid))
   }
}
        

// @LINE:29
case controllers_Application_orderremove21_route(params) => {
   call(params.fromPath[Int]("orderid", None)) { (orderid) =>
        controllers_Application_orderremove21_invoker.call(controllers.Application.orderremove(orderid))
   }
}
        

// @LINE:30
case controllers_Application_orderpart22_route(params) => {
   call(params.fromPath[String]("partid", None)) { (partid) =>
        controllers_Application_orderpart22_invoker.call(controllers.Application.orderpart(partid))
   }
}
        

// @LINE:31
case controllers_Application_genpor23_route(params) => {
   call { 
        controllers_Application_genpor23_invoker.call(controllers.Application.genpor)
   }
}
        

// @LINE:32
case controllers_Application_genconf24_route(params) => {
   call { 
        controllers_Application_genconf24_invoker.call(controllers.Application.genconf)
   }
}
        

// @LINE:33
case controllers_Application_genconfupdate25_route(params) => {
   call { 
        controllers_Application_genconfupdate25_invoker.call(controllers.Application.genconfupdate)
   }
}
        

// @LINE:34
case controllers_Application_genpopulate26_route(params) => {
   call { 
        controllers_Application_genpopulate26_invoker.call(controllers.Application.genpopulate)
   }
}
        

// @LINE:35
case controllers_Application_partupdate27_route(params) => {
   call { 
        controllers_Application_partupdate27_invoker.call(controllers.Application.partupdate)
   }
}
        

// @LINE:36
case controllers_Application_costfuncupdate28_route(params) => {
   call { 
        controllers_Application_costfuncupdate28_invoker.call(controllers.Application.costfuncupdate)
   }
}
        

// @LINE:37
case controllers_Application_precostfuncupdate29_route(params) => {
   call(params.fromPath[String]("partid", None), params.fromPath[String]("funcid", None)) { (partid, funcid) =>
        controllers_Application_precostfuncupdate29_invoker.call(controllers.Application.precostfuncupdate(partid, funcid))
   }
}
        

// @LINE:38
case controllers_Application_genworking30_route(params) => {
   call { 
        controllers_Application_genworking30_invoker.call(controllers.Application.genworking)
   }
}
        

// @LINE:39
case controllers_Application_genpopulatereport31_route(params) => {
   call { 
        controllers_Application_genpopulatereport31_invoker.call(controllers.Application.genpopulatereport)
   }
}
        
}

}
     