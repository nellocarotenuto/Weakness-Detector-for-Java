package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class flow_002dstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"flow-status\">\r\n    <div class=\"flow-status-property-element\">\r\n        Active threads:\r\n        <span id=\"active-thread-count\" class=\"flow-status-property-value\"></span>\r\n    </div>\r\n    <div class=\"flow-status-property-element\">\r\n        Queued:\r\n        <span id=\"total-queued\" class=\"flow-status-property-value\"></span>\r\n    </div>\r\n    <div id=\"connected-nodes-element\" class=\"flow-status-property-element\">\r\n        Connected nodes:\r\n        <span id=\"connected-nodes-count\" class=\"flow-status-property-value\"></span>\r\n    </div>\r\n    <div class=\"flow-status-property-element\">\r\n        Stats last refreshed:\r\n        <span id=\"stats-last-refreshed\" class=\"flow-status-property-value\"></span>\r\n    </div>\r\n    <div id=\"refresh-required-container\" class=\"flow-status-property-element\">\r\n        <div id=\"refresh-required-icon\"></div>\r\n        <span id=\"refresh-required-link\" class=\"link\">Refresh</span>\r\n    </div>\r\n    <div id=\"controller-bulletins\" class=\"bulletin-icon\"></div>\r\n    <div id=\"canvas-loading-container\" class=\"loading-container\"></div>\r\n");
      out.write("    <div id=\"controller-counts\">\r\n        <div class=\"transmitting\"></div>\r\n        <div id=\"controller-transmitting-count\" class=\"controller-component-count\">0</div>\r\n        <div class=\"not-transmitting\"></div>\r\n        <div id=\"controller-not-transmitting-count\" class=\"controller-component-count\">0</div>\r\n        <div class=\"running\"></div>\r\n        <div id=\"controller-running-count\" class=\"controller-component-count\">-</div>\r\n        <div class=\"stopped\"></div>\r\n        <div id=\"controller-stopped-count\" class=\"controller-component-count\">-</div>\r\n        <div class=\"invalid\"></div>\r\n        <div id=\"controller-invalid-count\" class=\"controller-component-count\">-</div>\r\n        <div class=\"disabled\"></div>\r\n        <div id=\"controller-disabled-count\" class=\"controller-component-count\">-</div>\r\n    </div>\r\n</div>\r\n");
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
