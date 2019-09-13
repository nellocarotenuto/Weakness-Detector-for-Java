package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.HBaseConfiguration;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  HMaster master = (HMaster) getServletContext().getAttribute(HMaster.MASTER);

      out.write("\n<!DOCTYPE html>\n<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <head>\n    <meta charset=\"utf-8\">\n    <title>");
      out.print( request.getParameter("pageTitle"));
      out.write("</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <meta name=\"description\" content=\"\">\n    <meta name=\"author\" content=\"\">\n\n    <link href=\"/static/css/bootstrap.min.css\" rel=\"stylesheet\">\n    <link href=\"/static/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n    <link href=\"/static/css/hbase.css\" rel=\"stylesheet\">\n  </head>\n  <body>\n    <div class=\"navbar  navbar-fixed-top navbar-default\">\n      <div class=\"container-fluid\">\n        <div class=\"navbar-header\">\n          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n                  data-target=\".navbar-collapse\">\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n          </button>\n          <a class=\"navbar-brand\" href=\"/master-status\">\n            <img src=\"/static/hbase_logo_small.png\" alt=\"HBase Logo\"/>\n          </a>\n        </div>\n        <div class=\"collapse navbar-collapse\">\n          <ul class=\"nav navbar-nav\">\n            <li><a href=\"/master-status\">Home</a></li>\n");
      out.write("            <li><a href=\"/tablesDetailed.jsp\">Table Details</a></li>\n            ");
 if (master.isActiveMaster()){ 
      out.write("\n              <li><a href=\"/procedures.jsp\">Procedures &amp; Locks</a></li>\n              <li><a href=\"/hbck.jsp\">HBCK Report</a></li>\n            ");
 }
      out.write("\n            <li><a href=\"/processMaster.jsp\">Process Metrics</a></li>\n            <li><a href=\"/logs/\">Local Logs</a></li>\n            <li><a href=\"/logLevel\">Log Level</a></li>\n            <li><a href=\"/dump\">Debug Dump</a></li>\n            <li><a href=\"/jmx\">Metrics Dump</a></li>\n            <li><a href=\"/prof\">Profiler</a></li>\n            ");
 if (HBaseConfiguration.isShowConfInServlet()) { 
      out.write("\n            <li><a href=\"/conf\">HBase Configuration</a></li>\n            ");
 } 
      out.write("\n          </ul>\n        </div><!--/.nav-collapse -->\n      </div>\n    </div>\n");
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
