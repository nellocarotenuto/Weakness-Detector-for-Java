package org.apache.nifi.web.jsp.WEB_002dINF.partials.provenance;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class provenance_002dsearch_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div id=\"provenance-search-dialog\">\r\n    <div class=\"dialog-content\">\r\n        <div class=\"setting\">\r\n            <div class=\"setting-name\">Fields</div>\r\n            <div class=\"setting-field\">\r\n                <div id=\"searchable-fields-container\">\r\n                    <div id=\"no-searchable-fields\" class=\"unset\">No searchable fields have been configured.</div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"start-date-setting\">\r\n                <div class=\"setting-name\">\r\n                    Start date\r\n                    <img class=\"icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The start date in the format 'mm/dd/yyyy'. Must also specify start time.\"/>\r\n                </div>\r\n                <div class=\"setting-field\">\r\n                    <input type=\"text\" id=\"provenance-search-start-date\" class=\"provenance-small-input\"/>\r\n                </div>\r\n            </div>\r\n            <div class=\"start-time-setting\">\r\n                <div class=\"setting-name\">\r\n");
      out.write("                    Start time (<span class=\"timezone\"></span>)\r\n                    <img class=\"icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The start time in the format 'hh:mm:ss'. Must also specify start date.\"/>\r\n                </div>\r\n                <div class=\"setting-field\">\r\n                    <input type=\"text\" id=\"provenance-search-start-time\" class=\"provenance-time-input\"/>\r\n                </div>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"end-date-setting\">\r\n                <div class=\"setting-name\">\r\n                    End date\r\n                    <img class=\"icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The end date in the format 'mm/dd/yyyy'. Must also specify end time.\"/>\r\n                </div>\r\n                <div class=\"setting-field\">\r\n                    <input type=\"text\" id=\"provenance-search-end-date\" class=\"provenance-small-input\"/>\r\n                </div>\r\n            </div>\r\n");
      out.write("            <div class=\"end-time-setting\">\r\n                <div class=\"setting-name\">\r\n                    End time (<span class=\"timezone\"></span>)\r\n                    <img class=\"icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The end time in the format 'hh:mm:ss'. Must also specify end date.\"/>\r\n                </div>\r\n                <div class=\"setting-field\">\r\n                    <input type=\"text\" id=\"provenance-search-end-time\" class=\"provenance-time-input\"/>\r\n                </div>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div class=\"setting\">\r\n            <div class=\"end-date-setting\">\r\n                <div class=\"setting-name\">\r\n                    Minimum file size\r\n                    <img class=\"icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The minimum file size (e.g. 2 KB).\"/>\r\n                </div>\r\n                <div class=\"setting-field\">\r\n                    <input type=\"text\" id=\"provenance-search-minimum-file-size\" class=\"provenance-small-input\"/>\r\n");
      out.write("                </div>\r\n            </div>\r\n            <div class=\"end-time-setting\">\r\n                <div class=\"setting-name\">\r\n                    Maximum file size\r\n                    <img class=\"icon-info\" src=\"images/iconInfo.png\" alt=\"Info\" title=\"The maximum file size (e.g. 4 GB).\"/>\r\n                </div>\r\n                <div class=\"setting-field\">\r\n                    <input type=\"text\" id=\"provenance-search-maximum-file-size\" class=\"provenance-time-input\"/>\r\n                </div>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n        <div id=\"provenance-search-location-container\" class=\"setting\">\r\n            <div class=\"setting-name\">\r\n                Search location\r\n            </div>\r\n            <div class=\"setting-field\">\r\n                <div id=\"provenance-search-location\"></div>\r\n            </div>\r\n            <div class=\"clear\"></div>\r\n        </div>\r\n    </div>\r\n</div>\r\n");
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
