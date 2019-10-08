package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class disable_002dcontroller_002dservice_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"disable-controller-service-dialog\">\r\n    <div class=\"dialog-content\">\r\n        <div class=\"settings-left\">\r\n            <div id=\"disable-controller-service-service-container\" class=\"setting\">\r\n                <div class=\"setting-name\">Service</div>\r\n                <div class=\"setting-field\">\r\n                    <span id=\"disable-controller-service-id\" class=\"hidden\"></span>\r\n                    <div id=\"disable-controller-service-name\"></div>\r\n                    <div id=\"disable-controller-service-bulletins\"></div>\r\n                    <div class=\"clear\"></div>\r\n                </div>\r\n            </div>\r\n            <div id=\"disable-controller-service-scope-container\" class=\"setting\">\r\n                <div class=\"setting-name\">Scope</div>\r\n                <div class=\"setting-field\">\r\n                    Service and referencing components\r\n                    <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Referencing components must be disabled/stopped in order to disable this service.\"/>\r\n");
      out.write("                </div>\r\n            </div>\r\n            <div id=\"disable-controller-service-progress-container\" class=\"setting hidden\">\r\n                <div id=\"disable-progress-label\" class=\"setting-name\"></div>\r\n                <div class=\"setting-field\">\r\n                    <ol id=\"disable-controller-service-progress\">\r\n                        <li>\r\n                            Stopping referencing processors and reporting tasks\r\n                            <div id=\"disable-referencing-schedulable\" class=\"disable-referencing-components\"></div>\r\n                            <div class=\"clear\"></div>\r\n                        </li>\r\n                        <li>\r\n                            Disabling referencing controller services\r\n                            <div id=\"disable-referencing-services\" class=\"disable-referencing-components\"></div>\r\n                            <div class=\"clear\"></div>\r\n                        </li>\r\n                        <li>\r\n                            Disabling this controller service\r\n");
      out.write("                            <div id=\"disable-controller-service\" class=\"disable-referencing-components\"></div>\r\n                            <div class=\"clear\"></div>\r\n                        </li>\r\n                    </ol>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div class=\"spacer\">&nbsp;</div>\r\n        <div class=\"settings-right\">\r\n            <div class=\"setting\">\r\n                <div class=\"setting-name\">\r\n                    Referencing Components\r\n                    <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Other components referencing this controller service.\"/>\r\n                </div>\r\n                <div class=\"setting-field\">\r\n                    <div id=\"disable-controller-service-referencing-components\"></div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <div class=\"controller-service-canceling hidden unset\">\r\n        Canceling...\r\n    </div>\r\n</div>\r\n");
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
