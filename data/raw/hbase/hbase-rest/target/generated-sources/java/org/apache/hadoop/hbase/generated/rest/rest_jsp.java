package org.apache.hadoop.hbase.generated.rest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.util.VersionInfo;
import java.util.Date;

public final class rest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

Configuration conf = (Configuration)getServletContext().getAttribute("hbase.conf");
long startcode = conf.getLong("startcode", System.currentTimeMillis());
String listenPort = conf.get("hbase.rest.port", "8080");

      out.write("\n<!DOCTYPE html>\n<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\">\n    <title>HBase REST Server: ");
      out.print( listenPort );
      out.write("</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <meta name=\"description\" content=\"\">\n\n    <link href=\"/static/css/bootstrap.min.css\" rel=\"stylesheet\">\n    <link href=\"/static/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n    <link href=\"/static/css/hbase.css\" rel=\"stylesheet\">\n  </head>\n\n  <body>\n  <div class=\"navbar  navbar-fixed-top navbar-default\">\n      <div class=\"container-fluid\">\n          <div class=\"navbar-header\">\n              <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n                  <span class=\"icon-bar\"></span>\n                  <span class=\"icon-bar\"></span>\n                  <span class=\"icon-bar\"></span>\n              </button>\n              <a class=\"navbar-brand\" href=\"/rest.jsp\"><img src=\"/static/hbase_logo_small.png\" alt=\"HBase Logo\"/></a>\n          </div>\n          <div class=\"collapse navbar-collapse\">\n              <ul class=\"nav navbar-nav\">\n                  <li class=\"active\"><a href=\"/rest.jsp\">Home</a></li>\n");
      out.write("                  <li><a href=\"/logs/\">Local logs</a></li>\n                  <li><a href=\"/logLevel\">Log Level</a></li>\n                  <li><a href=\"/jmx\">Metrics Dump</a></li>\n                  <li><a href=\"/prof\">Profiler</a></li>\n                  ");
 if (HBaseConfiguration.isShowConfInServlet()) { 
      out.write("\n                  <li><a href=\"/conf\">HBase Configuration</a></li>\n                  ");
 } 
      out.write("\n              </ul>\n          </div><!--/.nav-collapse -->\n      </div>\n  </div>\n\n<div class=\"container-fluid content\">\n    <div class=\"row inner_header\">\n        <div class=\"page-header\">\n            <h1>RESTServer <small>");
      out.print( listenPort );
      out.write("</small></h1>\n        </div>\n    </div>\n    <div class=\"row\">\n\n    <section>\n    <h2>Software Attributes</h2>\n    <table id=\"attributes_table\" class=\"table table-striped\">\n        <tr>\n            <th>Attribute Name</th>\n            <th>Value</th>\n            <th>Description</th>\n        </tr>\n        <tr>\n            <td>HBase Version</td>\n            <td>");
      out.print( VersionInfo.getVersion() );
      out.write(", revision=");
      out.print( VersionInfo.getRevision() );
      out.write("</td>\n            <td>HBase version and revision</td>\n        </tr>\n        <tr>\n            <td>HBase Compiled</td>\n            <td>");
      out.print( VersionInfo.getDate() );
      out.write(',');
      out.write(' ');
      out.print( VersionInfo.getUser() );
      out.write("</td>\n            <td>When HBase version was compiled and by whom</td>\n        </tr>\n        <tr>\n            <td>REST Server Start Time</td>\n            <td>");
      out.print( new Date(startcode) );
      out.write("</td>\n            <td>Date stamp of when this REST server was started</td>\n        </tr>\n    </table>\n    </section>\n    </div>\n    <div class=\"row\">\n\n    <section>\n<a href=\"http://hbase.apache.org/book.html#_rest\">Apache HBase documentation about REST</a>\n    </section>\n    </div>\n</div>\n<script src=\"/static/js/jquery.min.js\" type=\"text/javascript\"></script>\n<script src=\"/static/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n<script src=\"/static/js/tab.js\" type=\"text/javascript\"></script>\n</body>\n</html>\n\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
