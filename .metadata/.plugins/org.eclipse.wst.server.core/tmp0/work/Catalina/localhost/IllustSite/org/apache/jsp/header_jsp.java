/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-03-04 10:40:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t<meta http-equiv=\"Content-Syle-Type\" content=\"text/css\" />\r\n");
      out.write("\t<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("\t<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("\t<script src=\"//code.jquery.com/jquery-2.2.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \t<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("  \t\tbody{\r\n");
      out.write("\t \t\tmargin: 0 auto;\r\n");
      out.write("\t \t\tpadding: 0;\r\n");
      out.write("\t \t\toverflow: scroll;\r\n");
      out.write(" \t\t}\r\n");
      out.write("\r\n");
      out.write(" \t/* ==========HEADER-TOP LAYOUT========== */\r\n");
      out.write("\t\t#header-top{\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 120px;\r\n");
      out.write(" \t\t\toverflow: hidden;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\tbackground: black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write(" \t\t#header-top .top-pict{\r\n");
      out.write("  \t\t\tposition: relative;\r\n");
      out.write(" \t\t\tmax-height: 120px;\r\n");
      out.write("\t \t\tobject-fit: cover;\r\n");
      out.write(" \t\t}\r\n");
      out.write("\r\n");
      out.write("  \t\t#header-top h1{\r\n");
      out.write("    \t\tposition: absolute;\r\n");
      out.write("  \t\t\ttop: 10px;\r\n");
      out.write(" \t\t\tleft: 50%;\r\n");
      out.write("  \t\t\twidth: 700px;\r\n");
      out.write("  \t\t\tmargin-left:-350px;/*widthの半分を-で*/\r\n");
      out.write("  \t\t\tfont-family: MS PMincho;\r\n");
      out.write(" \t\t\tfont-size: 40px;\r\n");
      out.write("  \t\t\tcolor: white;\r\n");
      out.write(" \t \t\ttext-shadow: 0px 0px 10px #330000, 0px 0px 60px #003300;\r\n");
      out.write("  \t\t}\r\n");
      out.write("\r\n");
      out.write("\t/* ==========HEADER-UNDER LAYOUT========== */\r\n");
      out.write("\t\t#header-under{\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 100px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\tbackground: black;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#header-under ul{\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write(" \t\t\tfont-size: 30px;\r\n");
      out.write("  \t\t\tcolor: white;\r\n");
      out.write("   \t\t\tlist-style: none;\r\n");
      out.write("\r\n");
      out.write("   \t\t}\r\n");
      out.write("\r\n");
      out.write(" \t\t.link-left li{\r\n");
      out.write(" \t\t\tfloat: left;\r\n");
      out.write("   \t\t\theight: 90px;\r\n");
      out.write("  \t\t\tline-height: 90px;\r\n");
      out.write("  \t\t\tpadding-left: 120px;\r\n");
      out.write("\t\t\tletter-spacing: 10px;\r\n");
      out.write("\t\t\tmargin-right: 35px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("   \t\t.link_right li{\r\n");
      out.write(" \t\t\tfloat: right;\r\n");
      out.write("   \t\t\theight: 90px;\r\n");
      out.write("  \t\t\tline-height: 90px;\r\n");
      out.write("  \t\t\tpadding-right: 120px;\r\n");
      out.write(" \t\t\tletter-spacing: 10px;\r\n");
      out.write("  \t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#header-under .logo-pict{\r\n");
      out.write("\t\t\tclear: both;\r\n");
      out.write(" \t\t\tmax-height: 80px;\r\n");
      out.write("  \t\t\tobject-fit: cover;\r\n");
      out.write(" \t\t\tmargin: 10px 0px 2px;\r\n");
      out.write(" \t\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header-top\">\r\n");
      out.write("\t\t\t\t<img src =\"image/topillust.jpg\" alt=\"トップイラスト\" class=\"top-pict\">\r\n");
      out.write("\t\t\t\t<h1>N.corva</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"header-under\">\r\n");
      out.write("\t\t<div class=\"link-left\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"home.jsp\" style=\"text-decoration:none;\"><font color=white>top</font></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"illust.jsp\" style=\"text-decoration:none;\"><font color=white>illust</font></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"link_right\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\" style=\"text-decoration:none;\"><font color=white>contact</font></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"tumblr.jsp\" style=\"text-decoration:none;\"><font color=white>tumblr</font></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<span><img src =\"image/logo.jpg\" alt=\"ロゴ\" class=\"logo-pict\"></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}