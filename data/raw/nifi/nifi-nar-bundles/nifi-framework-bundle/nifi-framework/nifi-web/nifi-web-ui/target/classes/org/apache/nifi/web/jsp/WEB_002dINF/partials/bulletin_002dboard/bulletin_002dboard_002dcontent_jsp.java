package org.apache.nifi.web.jsp.WEB_002dINF.partials.bulletin_002dboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bulletin_002dboard_002dcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"bulletin-board\">\r\n    <div id=\"bulletin-board-header-and-filter\">\r\n        <div id=\"bulletin-board-header-text\">NiFi Templates</div>\r\n        <div id=\"bulletin-board-filter-controls\">\r\n            <div id=\"bulletin-board-filter-container\">\r\n                <input type=\"text\" id=\"bulletin-board-filter\"/>\r\n                <div id=\"bulletin-board-filter-type\"></div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <div id=\"bulletin-board-refresh-container\">\r\n        <div id=\"refresh-button\" class=\"bulletin-board-refresh pointer\" title=\"Start/Stop auto refresh\"></div>\r\n        <div id=\"bulletin-board-last-refreshed-container\">\r\n            Last updated:&nbsp;<span id=\"bulletin-board-last-refreshed\"></span>\r\n        </div>\r\n        <div id=\"bulletin-board-loading-container\" class=\"loading-container\"></div>\r\n        <div id=\"bulletin-board-status-container\">\r\n            <div id=\"bulletin-error-message\"></div>\r\n            <div id=\"clear-bulletins-button\" class=\"button-normal pointer\">Clear</div>\r\n        </div>\r\n");
      out.write("    </div>\r\n    <div id=\"bulletin-board-container\"></div>\r\n</div>");
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
