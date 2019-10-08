package org.apache.nifi.web.jsp.WEB_002dINF.partials.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_002dcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"users\">\r\n    <div id=\"users-header-and-filter\">\r\n        <div id=\"users-header-text\">NiFi Users</div>\r\n        <div id=\"users-filter-controls\">\r\n            <div id=\"users-filter-container\">\r\n                <input type=\"text\" id=\"users-filter\"/>\r\n                <div id=\"users-filter-type\"></div>\r\n            </div>\r\n            <div id=\"users-filter-stats\">\r\n                Displaying&nbsp;<span id=\"displayed-users\"></span>&nbsp;of&nbsp;<span id=\"total-users\"></span>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <div id=\"users-refresh-container\">\r\n        <div id=\"refresh-button\" class=\"users-refresh pointer\" title=\"Refresh\"></div>\r\n        <div id=\"users-last-refreshed-container\">\r\n            Last updated:&nbsp;<span id=\"users-last-refreshed\"></span>\r\n        </div>\r\n        <div id=\"users-loading-container\" class=\"loading-container\"></div>\r\n        <div id=\"group-controls-container\">\r\n            <div id=\"group-collaspe-container\">\r\n                <div id=\"group-collaspe-checkbox\" class=\"nf-checkbox checkbox-unchecked\"></div>\r\n");
      out.write("                <span>&nbsp;Show by group</span>\r\n            </div>\r\n            <div id=\"group-button\" class=\"button-normal pointer\">Group</div>\r\n        </div>\r\n    </div>\r\n    <div id=\"users-table\"></div>\r\n</div>");
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
