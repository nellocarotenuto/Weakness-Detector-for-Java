package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class controller_002dservice_002dconfiguration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"controller-service-configuration\">\r\n    <div class=\"controller-service-configuration-tab-container\">\r\n        <div id=\"controller-service-configuration-tabs\"></div>\r\n        <div id=\"controller-service-configuration-tabs-content\">\r\n            <div id=\"controller-service-standard-settings-tab-content\" class=\"configuration-tab\">\r\n                <div class=\"settings-left\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Name</div>\r\n                        <div class=\"controller-service-editable setting-field\">\r\n                            <input type=\"text\" id=\"controller-service-name\" name=\"controller-service-name\" class=\"setting-input\"/>\r\n                        </div>\r\n                        <div class=\"controller-service-read-only setting-field hidden\">\r\n                            <span id=\"read-only-controller-service-name\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Id</div>\r\n");
      out.write("                        <div class=\"setting-field\">\r\n                            <span id=\"controller-service-id\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Type</div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"controller-service-type\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"controller-service-availability-setting-container\" class=\"setting hidden\">\r\n                        <div class=\"availability-setting\">\r\n                            <div class=\"setting-name\">\r\n                                Availability\r\n                                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Where this controller service is available.\"/>\r\n                            </div>\r\n                            <div class=\"setting-field\">\r\n                                <div id=\"controller-service-availability\"></div>\r\n");
      out.write("                            </div>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"spacer\">&nbsp;</div>\r\n                <div class=\"settings-right\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Referencing Components\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Other components referencing this controller service.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"controller-service-referencing-components\"></div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"controller-service-properties-tab-content\" class=\"configuration-tab\">\r\n                <div id=\"controller-service-properties\"></div>\r\n            </div>\r\n");
      out.write("            <div id=\"controller-service-comments-tab-content\" class=\"configuration-tab\">\r\n                <textarea cols=\"30\" rows=\"4\" id=\"controller-service-comments\" name=\"controller-service-comments\" class=\"controller-service-editable setting-input\"></textarea>\r\n                <div class=\"setting controller-service-read-only hidden\">\r\n                    <div class=\"setting-name\">Comments</div>\r\n                    <div class=\"setting-field\">\r\n                        <span id=\"read-only-controller-service-comments\"></span>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>\r\n<div id=\"new-controller-service-property-container\"></div>");
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
