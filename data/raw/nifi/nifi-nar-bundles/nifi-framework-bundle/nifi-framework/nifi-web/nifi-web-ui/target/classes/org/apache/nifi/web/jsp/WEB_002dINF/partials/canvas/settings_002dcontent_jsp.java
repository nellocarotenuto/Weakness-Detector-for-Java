package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class settings_002dcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"settings\">\r\n    <div id=\"settings-header-text\">NiFi Settings</div>\r\n    <div id=\"settings-container\">\r\n        <div id=\"settings-tabs-container\">\r\n            <div id=\"settings-tabs\"></div>\r\n            <div id=\"settings-refresh-button\" class=\"pointer\" title=\"Refresh\"></div>\r\n            <div id=\"settings-last-refreshed-container\">\r\n                Last updated:&nbsp;<span id=\"settings-last-refreshed\"></span>\r\n            </div>\r\n            <div id=\"settings-refresh-required-icon\" class=\"hidden\"></div>\r\n            <div id=\"settings-loading-container\" class=\"loading-container\"></div>\r\n            <div id=\"new-service-or-task\" class=\"add-icon-bg\"></div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div id=\"settings-tab-background\"></div>\r\n        <div id=\"settings-tabs-content\">\r\n            <div id=\"general-settings-tab-content\" class=\"configuration-tab\">\r\n                <div id=\"general-settings\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Data flow name</div>\r\n");
      out.write("                        <div class=\"editable setting-field\">\r\n                            <input type=\"text\" id=\"data-flow-title-field\" name=\"data-flow-title\" class=\"setting-input\"/>\r\n                            <span id=\"archive-flow-link\" class=\"link\">Back-up flow</span>\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Archives the flow configuration.\"/>\r\n                        </div>\r\n                        <div class=\"read-only setting-field\">\r\n                            <span id=\"read-only-data-flow-title-field\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Data flow comments</div>\r\n                        <div class=\"editable setting-field\">\r\n                            <textarea id=\"data-flow-comments-field\" name=\"data-flow-comments\" class=\"setting-input\"></textarea>\r\n                        </div>\r\n                        <div class=\"read-only setting-field\">\r\n");
      out.write("                            <span id=\"read-only-data-flow-comments-field\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Maximum timer driven thread count\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum number of threads for timer driven processors available to the system.\"/>\r\n                        </div>\r\n                        <div class=\"editable setting-field\">\r\n                            <input type=\"text\" id=\"maximum-timer-driven-thread-count-field\" class=\"setting-input\"/>\r\n                        </div>\r\n                        <div class=\"read-only setting-field\">\r\n                            <span id=\"read-only-maximum-timer-driven-thread-count-field\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n");
      out.write("                            Maximum event driven thread count\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum number of threads for event driven processors available to the system.\"/>\r\n                        </div>\r\n                        <div class=\"editable setting-field\">\r\n                            <input type=\"text\" id=\"maximum-event-driven-thread-count-field\" class=\"setting-input\"/>\r\n                        </div>\r\n                        <div class=\"read-only setting-field\">\r\n                            <span id=\"read-only-maximum-event-driven-thread-count-field\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"settings-buttons\" class=\"editable\">\r\n                        <div id=\"settings-save\" class=\"button\">Apply</div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"controller-services-tab-content\" class=\"configuration-tab\">\r\n");
      out.write("                <div id=\"controller-services-table\" class=\"settings-table\"></div>\r\n            </div>\r\n            <div id=\"reporting-tasks-tab-content\" class=\"configuration-tab\">\r\n                <div id=\"reporting-tasks-table\" class=\"settings-table\"></div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>");
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
