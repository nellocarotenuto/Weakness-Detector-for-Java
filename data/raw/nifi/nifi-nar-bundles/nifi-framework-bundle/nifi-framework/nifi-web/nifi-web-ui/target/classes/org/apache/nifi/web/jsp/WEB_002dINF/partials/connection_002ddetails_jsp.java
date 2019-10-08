package org.apache.nifi.web.jsp.WEB_002dINF.partials;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connection_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"connection-details\">\r\n    <div class=\"connection-details-tab-container\">\r\n        <div id=\"connection-details-tabs\"></div>\r\n        <div id=\"connection-details-tabs-content\">\r\n            <div id=\"read-only-connection-details-tab-content\" class=\"configuration-tab\">\r\n                <div class=\"settings-left\">\r\n                    <div class=\"setting\">\r\n                        <div id=\"read-only-connection-source-label\" class=\"setting-name\"></div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"read-only-connection-source\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Within group</div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"read-only-connection-source-group-name\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"read-only-relationship-names-container\" class=\"setting\">\r\n");
      out.write("                        <div class=\"setting-name\">\r\n                            Relationships\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Selected relationships are in bold.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"read-only-relationship-names\"></div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"spacer\">&nbsp;</div>\r\n                <div class=\"settings-right\">\r\n                    <div class=\"setting\">\r\n                        <div id=\"read-only-connection-target-label\" class=\"setting-name\"></div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"read-only-connection-target\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Within group</div>\r\n");
      out.write("                        <div class=\"setting-field\">\r\n                            <div id=\"read-only-connection-target-group-name\"></div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"read-only-connection-settings-tab-content\" class=\"configuration-tab\">\r\n                <div class=\"settings-left\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Name</div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-connection-name\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Id</div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-connection-id\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n");
      out.write("                            FlowFile expiration\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum amount of time an object may be in the flow before it will be automatically aged out of the flow.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-flow-file-expiration\"></span>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Back pressure object threshold\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum number of objects that can be queued before back pressure is applied.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-back-pressure-object-threshold\"></span>\r\n");
      out.write("                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Back pressure data size threshold\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum data size of objects that can be queued before back pressure is applied.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-back-pressure-data-size-threshold\"></span>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"spacer\">&nbsp;</div>\r\n                <div class=\"settings-right\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Prioritizers\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Prioritizers that have been selected to reprioritize FlowFiles in this processors work queue.\"/>\r\n");
      out.write("                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"read-only-prioritizers\"></div>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>");
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
