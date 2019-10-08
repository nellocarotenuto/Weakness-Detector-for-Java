package org.apache.nifi.web.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connection_002dconfiguration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"connection-configuration\">\r\n    <div class=\"connection-configuration-tab-container\">\r\n        <div id=\"connection-configuration-tabs\"></div>\r\n        <div id=\"connection-configuration-tabs-content\">\r\n            <div id=\"connection-settings-tab-content\" class=\"configuration-tab\">\r\n                <div class=\"settings-left\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Name</div>\r\n                        <div class=\"setting-field\">\r\n                            <input type=\"text\" id=\"connection-name\" name=\"connection-name\" class=\"setting-input\"/>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Id</div>\r\n                        <div class=\"setting-field\">\r\n                            <span type=\"text\" id=\"connection-id\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n");
      out.write("                            FlowFile expiration\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum amount of time an object may be in the flow before it will be automatically aged out of the flow.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <input type=\"text\" id=\"flow-file-expiration\" name=\"flow-file-expiration\" class=\"setting-input\"/>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Back pressure object threshold\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum number of objects that can be queued before back pressure is applied.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <input type=\"text\" id=\"back-pressure-object-threshold\" name=\"back-pressure-object-threshold\" class=\"setting-input\"/>\r\n");
      out.write("                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Back pressure data size threshold\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum data size of objects that can be queued before back pressure is applied.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <input type=\"text\" id=\"back-pressure-data-size-threshold\" name=\"back-pressure-data-size-threshold\" class=\"setting-input\"/>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"spacer\">&nbsp;</div>\r\n                <div class=\"settings-right\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Available prioritizers\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Available prioritizers that could reprioritize FlowFiles in this work queue.\"/>\r\n");
      out.write("                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <ul id=\"prioritizer-available\"></ul>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Selected prioritizers\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Prioritizers that have been selected to reprioritize FlowFiles in this work queue.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <ul id=\"prioritizer-selected\"></ul>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <input type=\"hidden\" id=\"connection-uri\" name=\"connection-uri\"/>\r\n                <input type=\"hidden\" id=\"connection-source-component-id\" name=\"connection-source-component-id\"/>\r\n                <input type=\"hidden\" id=\"connection-source-id\" name=\"connection-source-id\"/>\r\n");
      out.write("                <input type=\"hidden\" id=\"connection-source-group-id\" name=\"connection-source-group-id\"/>\r\n                <input type=\"hidden\" id=\"connection-destination-component-id\" name=\"connection-destination-component-id\"/>\r\n                <input type=\"hidden\" id=\"connection-destination-id\" name=\"connection-destination-id\"/>\r\n                <input type=\"hidden\" id=\"connection-destination-group-id\" name=\"connection-destination-group-id\"/>\r\n            </div>\r\n            <div id=\"connection-details-tab-content\" class=\"configuration-tab\">\r\n                <div class=\"settings-left\">\r\n                    <div id=\"read-only-output-port-source\" class=\"setting hidden\">\r\n                        <div class=\"setting-name\">From output</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"read-only-output-port-name\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"output-port-source\" class=\"setting hidden\">\r\n");
      out.write("                        <div class=\"setting-name\">From output</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"output-port-options\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"input-port-source\" class=\"setting hidden\">\r\n                        <div class=\"setting-name\">From input</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"input-port-source-name\" class=\"label\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"funnel-source\" class=\"setting hidden\">\r\n                        <div class=\"setting-name\">From funnel</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"funnel-source-name\" class=\"label\">funnel</div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"processor-source\" class=\"setting hidden\">\r\n");
      out.write("                        <div class=\"setting-name\">From processor</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"processor-source-details\">\r\n                                <div id=\"processor-source-name\" class=\"label\"></div>\r\n                                <div id=\"processor-source-type\"></div>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"connection-source-group\" class=\"setting\">\r\n                        <div class=\"setting-name\">Within group</div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"connection-source-group-name\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"relationship-names-container\" class=\"hidden\">\r\n                        <div class=\"setting-name\">For relationships</div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"relationship-names\"></div>\r\n");
      out.write("                        </div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"spacer\">&nbsp;</div>\r\n                <div class=\"settings-right\">\r\n                    <div id=\"input-port-destination\" class=\"setting hidden\">\r\n                        <div class=\"setting-name\">To input</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"input-port-options\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"output-port-destination\" class=\"setting hidden\">\r\n                        <div class=\"setting-name\">To output</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"output-port-destination-name\" class=\"label\"></div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"funnel-destination\" class=\"setting hidden\">\r\n                        <div class=\"setting-name\">To funnel</div>\r\n");
      out.write("                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"funnel-source-name\" class=\"label\">funnel</div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"processor-destination\" class=\"setting hidden\">\r\n                        <div class=\"setting-name\">To processor</div>\r\n                        <div class=\"setting-field connection-terminal-label\">\r\n                            <div id=\"processor-destination-details\">\r\n                                <div id=\"processor-destination-name\" class=\"label\"></div>\r\n                                <div id=\"processor-destination-type\"></div>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                    <div id=\"connection-destination-group\" class=\"setting\">\r\n                        <div class=\"setting-name\">Within group</div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"connection-destination-group-name\"></div>\r\n");
      out.write("                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>    \r\n</div>");
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
