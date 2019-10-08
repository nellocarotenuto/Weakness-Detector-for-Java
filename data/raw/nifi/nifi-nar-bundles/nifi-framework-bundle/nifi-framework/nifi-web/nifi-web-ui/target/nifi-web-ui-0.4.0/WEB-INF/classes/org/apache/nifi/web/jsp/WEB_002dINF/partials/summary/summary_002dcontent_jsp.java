package org.apache.nifi.web.jsp.WEB_002dINF.partials.summary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class summary_002dcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"summary\">\r\n    <div id=\"summary-header-and-filter\">\r\n        <div id=\"summary-header-text\">NiFi Summary</div>\r\n        <div id=\"summary-filter-controls\">\r\n            <div id=\"summary-filter-container\">\r\n                <input type=\"text\" id=\"summary-filter\"/>\r\n                <div id=\"summary-filter-type\"></div>\r\n            </div>\r\n            <div id=\"summary-filter-status\">\r\n                Displaying&nbsp;<span id=\"displayed-items\"></span>&nbsp;of&nbsp;<span id=\"total-items\"></span>\r\n            </div>\r\n        </div>\r\n        <div id=\"view-options-container\">\r\n            View:&nbsp;\r\n            <span id=\"view-single-node-link\" class=\"view-summary-link\">Single node</span>&nbsp;&nbsp;<span id=\"view-cluster-link\" class=\"view-summary-link\">Cluster</span>\r\n        </div>\r\n    </div>\r\n    <div id=\"flow-summary-refresh-container\">\r\n        <div id=\"summary-tabs\"></div>\r\n        <div id=\"refresh-button\" class=\"summary-refresh pointer\" title=\"Refresh\"></div>\r\n        <div id=\"summary-last-refreshed-container\">\r\n");
      out.write("            Last updated:&nbsp;<span id=\"summary-last-refreshed\"></span>\r\n        </div>\r\n        <div id=\"summary-loading-container\" class=\"loading-container\"></div>\r\n        <div id=\"system-diagnostics-link-container\">\r\n            <span id=\"system-diagnostics-link\" class=\"link\">system diagnostics</span>\r\n        </div>\r\n    </div>\r\n    <div id=\"summary-tab-background\"></div>\r\n    <div id=\"summary-tabs-content\">\r\n        <div id=\"processor-summary-tab-content\" class=\"configuration-tab\">\r\n            <div id=\"processor-summary-table\" class=\"summary-table\"></div>\r\n        </div>\r\n        <div id=\"connection-summary-tab-content\" class=\"configuration-tab\">\r\n            <div id=\"connection-summary-table\" class=\"summary-table\"></div>\r\n        </div>\r\n        <div id=\"process-group-summary-tab-content\" class=\"configuration-tab\">\r\n            <div id=\"process-group-summary-table\" class=\"summary-table\"></div>\r\n        </div>\r\n        <div id=\"input-port-summary-tab-content\" class=\"configuration-tab\">\r\n            <div id=\"input-port-summary-table\" class=\"summary-table\"></div>\r\n");
      out.write("        </div>\r\n        <div id=\"output-port-summary-tab-content\" class=\"configuration-tab\">\r\n            <div id=\"output-port-summary-table\" class=\"summary-table\"></div>\r\n        </div>\r\n        <div id=\"remote-process-group-summary-tab-content\" class=\"configuration-tab\">\r\n            <div id=\"remote-process-group-summary-table\" class=\"summary-table\"></div>\r\n        </div>\r\n    </div>\r\n</div>");
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
