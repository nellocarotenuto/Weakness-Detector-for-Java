package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_002dreporting_002dtask_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"new-reporting-task-dialog\">\r\n    <div class=\"dialog-content\">\r\n        <div id=\"reporting-task-type-filter-controls\">\r\n            <div id=\"controller-service-type-filter-container\">\r\n                <input type=\"text\" id=\"reporting-task-type-filter\"/>\r\n            </div>\r\n            <div id=\"reporting-task-type-filter-status\">\r\n                Displaying&nbsp;<span id=\"displayed-reporting-task-types\"></span>&nbsp;of&nbsp;<span id=\"total-reporting-task-types\"></span>\r\n            </div>\r\n        </div>\r\n        <div id=\"reporting-task-tag-cloud-container\">\r\n            <div class=\"setting\">\r\n                <div class=\"setting-name\">Tags</div>\r\n                <div class=\"setting-field\">\r\n                    <div id=\"reporting-task-tag-cloud\"></div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div id=\"reporting-task-types-container\">\r\n            <div id=\"reporting-task-types-table\" class=\"unselectable\"></div>\r\n            <div id=\"reporting-task-description-container\" class=\"hidden\">\r\n");
      out.write("                <div id=\"reporting-task-type-name\" class=\"ellipsis\"></div>\r\n                <div id=\"reporting-task-type-description\" class=\"ellipsis multiline\"></div>\r\n                <span class=\"hidden\" id=\"selected-reporting-task-name\"></span>\r\n                <span class=\"hidden\" id=\"selected-reporting-task-type\"></span>\r\n            </div>\r\n        </div>\r\n        <div class=\"clear\"></div>\r\n        <div id=\"reporting-task-availability-container\" class=\"hidden\">\r\n            <div class=\"setting-name availability-label\">Available on</div>\r\n            <div id=\"reporting-task-availability-combo\"></div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n    </div>\r\n</div>\r\n");
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
