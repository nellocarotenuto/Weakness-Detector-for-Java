package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class remote_002dprocess_002dgroup_002dconfiguration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"remote-process-group-configuration\">\r\n    <div class=\"dialog-content\">\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Name</div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"remote-process-group-name\"></span>\r\n            </div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Id</div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"remote-process-group-id\"></span>\r\n            </div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">URL</div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"remote-process-group-url\"></span>\r\n            </div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Communications timeout</div>\r\n            <div class=\"setting-field\">\r\n                <input type=\"text\" id=\"remote-process-group-timeout\"/>\r\n            </div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">\r\n");
      out.write("                Yield duration\r\n                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"When communication with this remote process group fails, it will not be scheduled again until this amount of time elapses.\"/>\r\n            </div>\r\n            <div class=\"setting-field\">\r\n                <input type=\"text\" id=\"remote-process-group-yield-duration\"/>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>");
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
