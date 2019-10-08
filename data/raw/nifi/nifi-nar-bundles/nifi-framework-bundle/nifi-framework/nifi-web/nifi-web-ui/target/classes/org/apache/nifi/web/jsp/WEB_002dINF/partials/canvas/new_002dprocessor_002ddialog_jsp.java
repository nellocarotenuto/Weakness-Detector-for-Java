package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_002dprocessor_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"new-processor-dialog\">\r\n    <div class=\"dialog-content\">\r\n        <div id=\"processor-type-filter-controls\">\r\n            <div id=\"processor-type-filter-container\">\r\n                <input type=\"text\" id=\"processor-type-filter\"/>\r\n            </div>\r\n            <div id=\"processor-type-filter-status\">\r\n                Displaying&nbsp;<span id=\"displayed-processor-types\"></span>&nbsp;of&nbsp;<span id=\"total-processor-types\"></span>\r\n            </div>\r\n        </div>\r\n        <div id=\"processor-tag-cloud-container\">\r\n            <div class=\"setting\">\r\n                <div class=\"setting-name\">Tags</div>\r\n                <div class=\"setting-field\">\r\n                    <div id=\"processor-tag-cloud\"></div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div id=\"processor-types-container\">\r\n            <div id=\"processor-types-table\" class=\"unselectable\"></div>\r\n            <div id=\"processor-description-container\">\r\n                <div id=\"processor-type-name\" class=\"ellipsis\"></div>\r\n");
      out.write("                <div id=\"processor-type-description\" class=\"ellipsis multiline\"></div>\r\n                <span class=\"hidden\" id=\"selected-processor-name\"></span>\r\n                <span class=\"hidden\" id=\"selected-processor-type\"></span>\r\n            </div>\r\n        </div>\r\n        <div class=\"clear\"></div>\r\n    </div>\r\n</div>\r\n");
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
