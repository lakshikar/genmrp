// @SOURCE:/home/user/Projects/GenMRP/conf/routes
// @HASH:5beaf6259a9aa1586279749a6f2f332b3fc9aa20
// @DATE:Sat Apr 11 18:17:22 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:15
def loginvalidate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:27
def orderupdate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "orderupdate")
}
                        

// @LINE:24
def costfuncdelete(partid:String, funcid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "costfuncdelete/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)) + "/" + implicitly[PathBindable[String]].unbind("funcid", dynamicString(funcid)))
}
                        

// @LINE:35
def partupdate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "partupdate")
}
                        

// @LINE:37
def precostfuncupdate(partid:String, funcid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "precostfuncupdate/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)) + "/" + implicitly[PathBindable[String]].unbind("funcid", dynamicString(funcid)))
}
                        

// @LINE:19
def bom(partid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bom/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)))
}
                        

// @LINE:33
def genconfupdate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "genconfupdate")
}
                        

// @LINE:31
def genpor(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "genpor")
}
                        

// @LINE:32
def genconf(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "genconf")
}
                        

// @LINE:38
def genworking(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "genworking")
}
                        

// @LINE:17
def partdelete(partid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "partdelete/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)))
}
                        

// @LINE:25
def order(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "order")
}
                        

// @LINE:13
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:30
def orderpart(partid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "orderpart/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)))
}
                        

// @LINE:12
def signin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signin")
}
                        

// @LINE:29
def orderremove(orderid:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "orderremove/" + implicitly[PathBindable[Int]].unbind("orderid", orderid))
}
                        

// @LINE:21
def bomdelete(partid:String, childpartid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bomdelet/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)) + "/" + implicitly[PathBindable[String]].unbind("childpartid", dynamicString(childpartid)))
}
                        

// @LINE:39
def genpopulatereport(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "genpopulatereport")
}
                        

// @LINE:10
def part(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "part")
}
                        

// @LINE:26
def ordernew(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ordernew")
}
                        

// @LINE:14
def partadd(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "part")
}
                        

// @LINE:34
def genpopulate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "genpopulate")
}
                        

// @LINE:16
def savecompany(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signin")
}
                        

// @LINE:18
def prepartupdate(partid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "prepartupdate/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)))
}
                        

// @LINE:22
def costfunc(partid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "costfunc/" + implicitly[PathBindable[String]].unbind("partid", dynamicString(partid)))
}
                        

// @LINE:36
def costfuncupdate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "costfuncupdate")
}
                        

// @LINE:20
def bomadd(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "bomadd")
}
                        

// @LINE:23
def costfuncadd(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "costfuncadd")
}
                        

// @LINE:28
def perorderupdate(orderid:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "perorderupdate/" + implicitly[PathBindable[Int]].unbind("orderid", orderid))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:11
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:15
def loginvalidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginvalidate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:27
def orderupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.orderupdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "orderupdate"})
      }
   """
)
                        

// @LINE:24
def costfuncdelete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.costfuncdelete",
   """
      function(partid,funcid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "costfuncdelete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("funcid", encodeURIComponent(funcid))})
      }
   """
)
                        

// @LINE:35
def partupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.partupdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "partupdate"})
      }
   """
)
                        

// @LINE:37
def precostfuncupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.precostfuncupdate",
   """
      function(partid,funcid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "precostfuncupdate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("funcid", encodeURIComponent(funcid))})
      }
   """
)
                        

// @LINE:19
def bom : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bom",
   """
      function(partid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bom/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid))})
      }
   """
)
                        

// @LINE:33
def genconfupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.genconfupdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "genconfupdate"})
      }
   """
)
                        

// @LINE:31
def genpor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.genpor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genpor"})
      }
   """
)
                        

// @LINE:32
def genconf : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.genconf",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genconf"})
      }
   """
)
                        

// @LINE:38
def genworking : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.genworking",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genworking"})
      }
   """
)
                        

// @LINE:17
def partdelete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.partdelete",
   """
      function(partid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "partdelete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid))})
      }
   """
)
                        

// @LINE:25
def order : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.order",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order"})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:30
def orderpart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.orderpart",
   """
      function(partid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderpart/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid))})
      }
   """
)
                        

// @LINE:12
def signin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

// @LINE:29
def orderremove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.orderremove",
   """
      function(orderid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderremove/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("orderid", orderid)})
      }
   """
)
                        

// @LINE:21
def bomdelete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bomdelete",
   """
      function(partid,childpartid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bomdelet/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("childpartid", encodeURIComponent(childpartid))})
      }
   """
)
                        

// @LINE:39
def genpopulatereport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.genpopulatereport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genpopulatereport"})
      }
   """
)
                        

// @LINE:10
def part : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.part",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "part"})
      }
   """
)
                        

// @LINE:26
def ordernew : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ordernew",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ordernew"})
      }
   """
)
                        

// @LINE:14
def partadd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.partadd",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "part"})
      }
   """
)
                        

// @LINE:34
def genpopulate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.genpopulate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genpopulate"})
      }
   """
)
                        

// @LINE:16
def savecompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.savecompany",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

// @LINE:18
def prepartupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.prepartupdate",
   """
      function(partid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "prepartupdate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid))})
      }
   """
)
                        

// @LINE:22
def costfunc : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.costfunc",
   """
      function(partid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "costfunc/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("partid", encodeURIComponent(partid))})
      }
   """
)
                        

// @LINE:36
def costfuncupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.costfuncupdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "costfuncupdate"})
      }
   """
)
                        

// @LINE:20
def bomadd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bomadd",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bomadd"})
      }
   """
)
                        

// @LINE:23
def costfuncadd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.costfuncadd",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "costfuncadd"})
      }
   """
)
                        

// @LINE:28
def perorderupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.perorderupdate",
   """
      function(orderid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "perorderupdate/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("orderid", orderid)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:15
def loginvalidate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginvalidate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginvalidate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:27
def orderupdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.orderupdate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "orderupdate", Seq(), "POST", """""", _prefix + """orderupdate""")
)
                      

// @LINE:24
def costfuncdelete(partid:String, funcid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.costfuncdelete(partid, funcid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfuncdelete", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """costfuncdelete/$partid<[^/]+>/$funcid<[^/]+>""")
)
                      

// @LINE:35
def partupdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.partupdate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "partupdate", Seq(), "POST", """""", _prefix + """partupdate""")
)
                      

// @LINE:37
def precostfuncupdate(partid:String, funcid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.precostfuncupdate(partid, funcid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "precostfuncupdate", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """precostfuncupdate/$partid<[^/]+>/$funcid<[^/]+>""")
)
                      

// @LINE:19
def bom(partid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bom(partid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "bom", Seq(classOf[String]), "GET", """""", _prefix + """bom/$partid<[^/]+>""")
)
                      

// @LINE:33
def genconfupdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.genconfupdate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genconfupdate", Seq(), "POST", """""", _prefix + """genconfupdate""")
)
                      

// @LINE:31
def genpor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.genpor(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genpor", Seq(), "GET", """""", _prefix + """genpor""")
)
                      

// @LINE:32
def genconf(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.genconf(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genconf", Seq(), "GET", """""", _prefix + """genconf""")
)
                      

// @LINE:38
def genworking(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.genworking(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genworking", Seq(), "GET", """""", _prefix + """genworking""")
)
                      

// @LINE:17
def partdelete(partid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.partdelete(partid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "partdelete", Seq(classOf[String]), "GET", """""", _prefix + """partdelete/$partid<[^/]+>""")
)
                      

// @LINE:25
def order(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.order(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "order", Seq(), "GET", """""", _prefix + """order""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:30
def orderpart(partid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.orderpart(partid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "orderpart", Seq(classOf[String]), "GET", """""", _prefix + """orderpart/$partid<[^/]+>""")
)
                      

// @LINE:12
def signin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signin", Seq(), "GET", """""", _prefix + """signin""")
)
                      

// @LINE:29
def orderremove(orderid:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.orderremove(orderid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "orderremove", Seq(classOf[Int]), "GET", """""", _prefix + """orderremove/$orderid<[^/]+>""")
)
                      

// @LINE:21
def bomdelete(partid:String, childpartid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bomdelete(partid, childpartid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "bomdelete", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """bomdelet/$partid<[^/]+>/$childpartid<[^/]+>""")
)
                      

// @LINE:39
def genpopulatereport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.genpopulatereport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genpopulatereport", Seq(), "GET", """""", _prefix + """genpopulatereport""")
)
                      

// @LINE:10
def part(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.part(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "part", Seq(), "GET", """""", _prefix + """part""")
)
                      

// @LINE:26
def ordernew(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ordernew(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ordernew", Seq(), "POST", """""", _prefix + """ordernew""")
)
                      

// @LINE:14
def partadd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.partadd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "partadd", Seq(), "POST", """""", _prefix + """part""")
)
                      

// @LINE:34
def genpopulate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.genpopulate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "genpopulate", Seq(), "GET", """""", _prefix + """genpopulate""")
)
                      

// @LINE:16
def savecompany(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.savecompany(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "savecompany", Seq(), "POST", """""", _prefix + """signin""")
)
                      

// @LINE:18
def prepartupdate(partid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.prepartupdate(partid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "prepartupdate", Seq(classOf[String]), "GET", """""", _prefix + """prepartupdate/$partid<[^/]+>""")
)
                      

// @LINE:22
def costfunc(partid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.costfunc(partid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfunc", Seq(classOf[String]), "GET", """""", _prefix + """costfunc/$partid<[^/]+>""")
)
                      

// @LINE:36
def costfuncupdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.costfuncupdate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfuncupdate", Seq(), "POST", """""", _prefix + """costfuncupdate""")
)
                      

// @LINE:20
def bomadd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bomadd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "bomadd", Seq(), "POST", """""", _prefix + """bomadd""")
)
                      

// @LINE:23
def costfuncadd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.costfuncadd(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "costfuncadd", Seq(), "POST", """""", _prefix + """costfuncadd""")
)
                      

// @LINE:28
def perorderupdate(orderid:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.perorderupdate(orderid), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "perorderupdate", Seq(classOf[Int]), "GET", """""", _prefix + """perorderupdate/$orderid<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          
}
        
    