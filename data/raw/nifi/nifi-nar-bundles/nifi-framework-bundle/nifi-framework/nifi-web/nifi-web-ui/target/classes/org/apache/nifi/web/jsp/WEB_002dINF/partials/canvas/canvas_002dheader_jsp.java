package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class canvas_002dheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"header\">\r\n    <div id=\"nf-logo\"></div>\r\n    <div id=\"nf-logo-name\"></div>\r\n    <div id=\"toolbox-container\">\r\n        <div id=\"toolbox\"></div>\r\n        <div id=\"toolbox-right-edge\"></div>\r\n    </div>\r\n    <div id=\"toolbar\">\r\n        <div id=\"global-controls\"></div>\r\n        <div id=\"utilities-container\">\r\n            <div id=\"utilities-border\"></div>\r\n            <div id=\"utility-buttons\">\r\n                <div id=\"reporting-link\" class=\"utility-button\" title=\"Summary\"></div>\r\n                <div id=\"counters-link\" class=\"utility-button\" title=\"Counters\"></div>\r\n                <div id=\"history-link\" class=\"utility-button\" title=\"Flow Configuration History\"></div>\r\n                <div id=\"provenance-link\" class=\"utility-button\" title=\"Data Provenance\"></div>\r\n                <div id=\"flow-settings-link\" class=\"utility-button\" title=\"Controller Settings\"></div>\r\n                <div id=\"templates-link\" class=\"utility-button\" title=\"Templates\"></div>\r\n                <div id=\"users-link\" class=\"utility-button\" title=\"Users\"><div id=\"has-pending-accounts\" class=\"hidden\"></div></div>\r\n");
      out.write("                <div id=\"cluster-link\" class=\"utility-button\" title=\"Cluster\"></div>\r\n                <div id=\"bulletin-board-link\" class=\"utility-button\" title=\"Bulletin Board\"></div>\r\n            </div>\r\n        </div>\r\n        <div id=\"search-container\">\r\n            <input id=\"search-field\" type=\"text\"/>\r\n        </div>\r\n    </div>\r\n    <div id=\"header-links-container\">\r\n        <ul class=\"links\">\r\n            <li id=\"current-user-container\">\r\n                <div id=\"anonymous-user-alert\" class=\"hidden\"></div>\r\n                <div id=\"current-user\"></div>\r\n                <div class=\"clear\"></div>\r\n            </li>\r\n            <li id=\"login-link-container\">\r\n                <span id=\"login-link\" class=\"link\">login</span>\r\n            </li>\r\n            <li id=\"logout-link-container\" style=\"display: none;\">\r\n                <span id=\"logout-link\" class=\"link\">logout</span>\r\n            </li>\r\n            <li>\r\n                <span id=\"help-link\" class=\"link\">help</span>\r\n            </li>\r\n            <li>\r\n");
      out.write("                <span id=\"about-link\" class=\"link\">about</span>\r\n            </li>\r\n        </ul>\r\n    </div>\r\n</div>\r\n<div id=\"search-flow-results\"></div>\r\n");
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
