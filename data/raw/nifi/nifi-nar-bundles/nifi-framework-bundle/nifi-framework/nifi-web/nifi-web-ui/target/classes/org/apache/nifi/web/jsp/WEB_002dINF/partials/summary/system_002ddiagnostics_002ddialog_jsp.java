package org.apache.nifi.web.jsp.WEB_002dINF.partials.summary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class system_002ddiagnostics_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"system-diagnostics-dialog\">\r\n    <div id=\"system-diagnostics-refresh-container\">\r\n        <div id=\"system-diagnostics-tabs\"></div>\r\n        <div id=\"system-diagnostics-refresh-button\" class=\"summary-refresh pointer\" title=\"Refresh\"></div>\r\n        <div id=\"system-diagnostics-last-refreshed-container\">\r\n            Last updated:&nbsp;<span id=\"system-diagnostics-last-refreshed\"></span>\r\n        </div>\r\n        <div id=\"system-diagnostics-loading-container\" class=\"loading-container\"></div>\r\n    </div>\r\n    <div class=\"dialog-content\">\r\n        <div id=\"jvm-tab-content\" class=\"configuration-tab\">\r\n            <div class=\"settings-left\">\r\n                <div class=\"setting\">\r\n                    <input type=\"hidden\" id=\"\"/>\r\n                    <div class=\"setting-name\">Heap (<span id=\"utilization-heap\"></span>)</div>\r\n                    <div class=\"setting-field\">\r\n                        <table id=\"heap-table\">\r\n                            <tbody>\r\n                                <tr>\r\n                                    <td class=\"memory-header\"><b>Max</b></td>\r\n");
      out.write("                                    <td><span id=\"max-heap\"></span></td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td><b>Total</b></td>\r\n                                    <td><span id=\"total-heap\"></span></td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td><b>Used</b></td>\r\n                                    <td><span id=\"used-heap\"></span></td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td><b>Free</b></td>\r\n                                    <td><span id=\"free-heap\"></span></td>\r\n                                </tr>\r\n                            </tbody>\r\n                        </table>\r\n                    </div>\r\n                    <div class=\"clear\"></div>\r\n                </div>\r\n            </div>\r\n            <div class=\"settings-right\">\r\n                <div class=\"setting\">\r\n                    <div class=\"setting-name\">Non heap (<span id=\"utilization-non-heap\"></span>)</div>\r\n");
      out.write("                    <div class=\"setting-field\">\r\n                        <table id=\"heap-table\">\r\n                            <tbody>\r\n                                <tr>\r\n                                    <td class=\"memory-header\"><b>Max</b></td>\r\n                                    <td><span id=\"max-non-heap\"></span></td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td><b>Total</b></td>\r\n                                    <td><span id=\"total-non-heap\"></span></td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td><b>Used</b></td>\r\n                                    <td><span id=\"used-non-heap\"></span></td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td><b>Free</b></td>\r\n                                    <td><span id=\"free-non-heap\"></span></td>\r\n                                </tr>\r\n                            </tbody>\r\n");
      out.write("                        </table>\r\n                    </div>\r\n                    <div class=\"clear\"></div>\r\n                </div>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n            <div class=\"setting\">\r\n                <div class=\"setting-name\">Garbage collection</div>\r\n                <div id=\"garbage-collection-container\" class=\"setting-field\">\r\n                    <table id=\"garbage-collection-table\">\r\n                        <tbody></tbody>\r\n                    </table>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div id=\"system-tab-content\"class=\"configuration-tab\">\r\n            <div class=\"settings-left\">\r\n                <div class=\"setting\">\r\n                    <div class=\"setting-name\">Available processors</div>\r\n                    <div class=\"setting-field\">\r\n                        <div id=\"available-processors\"></div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"settings-right\">\r\n                <div class=\"setting\">\r\n");
      out.write("                    <div class=\"setting-name\">\r\n                        Processor load average\r\n                        <img class=\"setting-icon icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"Processor load average for the last minute. Not available on all platforms.\"/>\r\n                    </div>\r\n                    <div class=\"setting-field\">\r\n                        <div id=\"processor-load-average\"></div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n            <div class=\"setting\">\r\n                <div class=\"setting-name\">FlowFile repository storage usage</div>\r\n                <div class=\"setting-field\">\r\n                    <div id=\"flow-file-repository-storage-usage-container\"></div>\r\n                </div>\r\n            </div>\r\n            <div class=\"setting\">\r\n                <div class=\"setting-name\">Content repository storage usage</div>\r\n                <div class=\"setting-field\">\r\n                    <div id=\"content-repository-storage-usage-container\"></div>\r\n");
      out.write("                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>\r\n");
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
