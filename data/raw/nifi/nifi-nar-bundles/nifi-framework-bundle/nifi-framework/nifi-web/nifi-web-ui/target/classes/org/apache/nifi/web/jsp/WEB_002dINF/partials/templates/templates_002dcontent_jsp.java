package org.apache.nifi.web.jsp.WEB_002dINF.partials.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class templates_002dcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"templates\">\r\n    <div id=\"templates-header-and-filter\">\r\n        <div id=\"templates-header-text\">NiFi Templates</div>\r\n        <div id=\"templates-filter-controls\">\r\n            <div id=\"templates-filter-container\">\r\n                <input type=\"text\" id=\"templates-filter\"/>\r\n                <div id=\"templates-filter-type\"></div>\r\n            </div>\r\n            <div id=\"templates-filter-stats\">\r\n                Displaying&nbsp;<span id=\"displayed-templates\"></span>&nbsp;of&nbsp;<span id=\"total-templates\"></span>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <div id=\"templates-refresh-container\">\r\n        <div id=\"refresh-button\" class=\"templates-refresh pointer\" title=\"Refresh\"></div>\r\n        <div id=\"templates-last-refreshed-container\">\r\n            Last updated:&nbsp;<span id=\"templates-last-refreshed\"></span>\r\n        </div>\r\n        <div id=\"templates-loading-container\" class=\"loading-container\"></div>\r\n        <div id=\"upload-template-container\" class=\"hidden\">\r\n            <div id=\"select-template-container\">\r\n");
      out.write("                <div id=\"template-browse-container\">\r\n                    <div id=\"select-template-button\" class=\"template-button\">\r\n                        <span>Browse</span>\r\n                        <form id=\"template-upload-form\" enctype=\"multipart/form-data\" method=\"post\" action=\"../nifi-api/controller/templates\">\r\n                            <input type=\"file\" name=\"template\" id=\"template-file-field\"/>\r\n                        </form>\r\n                    </div>\r\n                    <div id=\"upload-template-status\" class=\"import-status\"></div>\r\n                </div>\r\n            </div>\r\n            <div id=\"submit-template-container\">\r\n                <div id=\"upload-template-button\" class=\"template-button\">Import</div>\r\n                <div id=\"cancel-upload-template-button\" class=\"template-button\">Cancel</div>\r\n                <div id=\"selected-template-name\"></div>\r\n            </div>\r\n            <div id=\"template-upload-form-container\">\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <div id=\"templates-table\"></div>\r\n");
      out.write("</div>");
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