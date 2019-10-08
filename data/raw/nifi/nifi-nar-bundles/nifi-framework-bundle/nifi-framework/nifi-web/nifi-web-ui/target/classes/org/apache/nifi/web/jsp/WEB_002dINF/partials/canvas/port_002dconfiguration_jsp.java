package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class port_002dconfiguration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n\r\n<div id=\"port-configuration\">\r\n    <div class=\"dialog-content\">\r\n        <div class=\"port-setting\">\r\n            <div class=\"setting-name\">Port name</div>\r\n            <div class=\"setting-field\">\r\n                <input type=\"text\" id=\"port-name\"/>\r\n                <div class=\"port-enabled-container\">\r\n                    <div id=\"port-enabled\" class=\"port-enabled nf-checkbox checkbox-unchecked\"></div>\r\n                    <span> Enabled</span>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div class=\"port-setting\">\r\n            <div class=\"setting-name\">\r\n                Id\r\n            </div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"port-id\"></span>\r\n            </div>\r\n        </div>\r\n        <div id=\"port-concurrent-task-container\" class=\"port-setting\">\r\n            <div class=\"setting-name\">\r\n                Concurrent tasks\r\n                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The number of tasks that should be concurrently scheduled for this port.\"/>\r\n");
      out.write("            </div>\r\n            <div class=\"setting-field\">\r\n                <input type=\"text\" id=\"port-concurrent-tasks\" class=\"port-field\"></input>\r\n            </div>\r\n        </div>\r\n        <div class=\"port-setting\">\r\n            <div class=\"setting-name\">Comments</div>\r\n            <div class=\"setting-field\">\r\n                <textarea cols=\"30\" rows=\"4\" id=\"port-comments\" class=\"port-field\"></textarea>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>");
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
