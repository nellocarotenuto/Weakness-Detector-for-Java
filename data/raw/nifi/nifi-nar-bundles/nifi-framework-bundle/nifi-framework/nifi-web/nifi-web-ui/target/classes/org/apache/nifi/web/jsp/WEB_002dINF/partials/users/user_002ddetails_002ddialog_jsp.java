package org.apache.nifi.web.jsp.WEB_002dINF.partials.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002ddetails_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"user-details-dialog\">\r\n    <div class=\"dialog-content\">\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">User</div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"user-name-details-dialog\"></span>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Identity</div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"user-dn-details-dialog\"></span>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Created</div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"user-created-details-dialog\"></span>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Last Verified</div>\r\n            <div class=\"setting-field\">\r\n                <span id=\"user-verified-details-dialog\"></span>\r\n");
      out.write("            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Justification</div>\r\n            <div class=\"setting-field\">\r\n                <div id=\"user-justification-details-dialog\"></div>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n    </div>\r\n</div>\r\n");
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
