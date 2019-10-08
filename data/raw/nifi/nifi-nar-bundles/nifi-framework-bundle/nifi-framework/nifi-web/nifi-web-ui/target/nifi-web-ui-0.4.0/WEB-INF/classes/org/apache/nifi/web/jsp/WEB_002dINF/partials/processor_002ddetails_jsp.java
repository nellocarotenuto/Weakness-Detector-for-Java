package org.apache.nifi.web.jsp.WEB_002dINF.partials;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processor_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"processor-details\">\r\n    <div class=\"processor-details-tab-container\">\r\n        <div id=\"processor-details-tabs\"></div>\r\n        <div id=\"processor-details-tabs-content\">\r\n            <div id=\"details-standard-settings-tab-content\" class=\"details-tab\">\r\n                <div class=\"settings-left\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Name</div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-processor-name\"></span>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Id</div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-processor-id\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">Type</div>\r\n");
      out.write("                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-processor-type\"></span>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"penalty-duration-setting\">\r\n                            <div class=\"setting-name\">\r\n                                Penalty duration\r\n                                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The amount of time used when this processor penalizes a FlowFile.\"/>\r\n                            </div>\r\n                            <div class=\"setting-field\">\r\n                                <span id=\"read-only-penalty-duration\"></span>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"yield-duration-setting\">\r\n                            <div class=\"setting-name\">\r\n                                Yield duration\r\n");
      out.write("                                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"When a processor yields, it will not be scheduled again until this amount of time elapses.\"/>\r\n                            </div>\r\n                            <div class=\"setting-field\">\r\n                                <span id=\"read-only-yield-duration\"></span>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"bulletin-setting\">\r\n                            <div class=\"setting-name\">\r\n                                Bulletin level\r\n                                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The level at which this processor will generate bulletins.\"/>\r\n                            </div>\r\n                            <div class=\"setting-field\">\r\n                                <span id=\"read-only-bulletin-level\"></span>\r\n");
      out.write("                            </div>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"spacer\">&nbsp;</div>\r\n                <div class=\"settings-right\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Auto terminate relationships\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Will automatically terminate FlowFiles sent to all relationships in bold.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <div id=\"read-only-auto-terminate-relationship-names\"></div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"details-scheduling-tab-content\" class=\"details-tab\">\r\n                <div class=\"settings-left\">\r\n                    <div class=\"setting\">\r\n");
      out.write("                        <div class=\"scheduling-strategy-setting\">\r\n                            <div class=\"setting-name\">\r\n                                Scheduling strategy\r\n                                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The strategy used to schedule this processor.\"/>\r\n                            </div>\r\n                            <div class=\"setting-field\">\r\n                                <span id=\"read-only-scheduling-strategy\"></span>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                    <div class=\"setting\">\r\n                        <div class=\"concurrently-schedulable-tasks-setting\">\r\n                            <div class=\"setting-name\">\r\n                                Concurrent tasks\r\n                                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The number of tasks that should be concurrently scheduled for this processor.\"/>\r\n");
      out.write("                            </div>\r\n                            <div class=\"setting-field\">\r\n                                <span id=\"read-only-concurrently-schedulable-tasks\"></span>\r\n                            </div>\r\n                        </div>\r\n                        <div id=\"read-only-run-schedule\" class=\"scheduling-period-setting\">\r\n                            <div class=\"setting-name\">\r\n                                Run schedule\r\n                                <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The minimum number of seconds that should elapse between task executions.\"/>\r\n                            </div>\r\n                            <div class=\"setting-field\">\r\n                                <span id=\"read-only-scheduling-period\"></span>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"clear\"></div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"spacer\">&nbsp;</div>\r\n");
      out.write("                <div class=\"settings-right\">\r\n                    <div class=\"setting\">\r\n                        <div class=\"setting-name\">\r\n                            Run duration\r\n                            <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The amount of time this processor will run for when scheduled.\"/>\r\n                        </div>\r\n                        <div class=\"setting-field\">\r\n                            <span id=\"read-only-run-duration\"></span>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"details-processor-properties-tab-content\" class=\"details-tab\">\r\n                <div id=\"read-only-processor-properties\"></div>\r\n            </div>\r\n            <div id=\"details-processor-comments-tab-content\" class=\"details-tab\">\r\n                <div class=\"setting\">\r\n                    <div class=\"setting-name\">Comments</div>\r\n                    <div class=\"setting-field\">\r\n                        <div id=\"read-only-processor-comments\"></div>\r\n");
      out.write("                    </div>\r\n                    <div class=\"clear\"></div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>");
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
