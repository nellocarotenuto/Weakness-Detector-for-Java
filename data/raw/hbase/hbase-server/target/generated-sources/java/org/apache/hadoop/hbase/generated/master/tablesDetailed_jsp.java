package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import static org.apache.commons.lang3.StringEscapeUtils.escapeXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.hbase.client.TableDescriptor;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.tmpl.master.MasterStatusTmplImpl;

public final class tablesDetailed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n\n\n\n\n");

  HMaster master = (HMaster) getServletContext().getAttribute(HMaster.MASTER);
  pageContext.setAttribute("pageTitle", "HBase Master: " + master.getServerName());

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n\n<div class=\"container-fluid content\">\n  <div class=\"row inner_header\">\n    <div class=\"page-header\">\n      <h1>User Tables</h1>\n    </div>\n  </div>\n\n  ");
 List<TableDescriptor> tables = new ArrayList<TableDescriptor>();
     String errorMessage = MasterStatusTmplImpl.getUserTables(master, tables);
  if (tables.size() == 0 && errorMessage != null) { 
      out.write("\n  <p> ");
      out.print( errorMessage );
      out.write(" </p>\n  ");
 }
  if (tables != null && tables.size() > 0) { 
      out.write("\n  <table class=\"table table-striped\">\n    <tr>\n      <th>Table</th>\n      <th>Description</th>\n    </tr>\n    ");
 for (TableDescriptor htDesc : tables) { 
      out.write("\n    <tr>\n      <td>\n        <a href=\"/table.jsp?name=");
      out.print( escapeXml(htDesc.getTableName().getNameAsString()) );
      out.write('"');
      out.write('>');
      out.print( escapeXml(
            htDesc.getTableName().getNameAsString()) );
      out.write("\n        </a></td>\n      <td>");
      out.print( htDesc.toString() );
      out.write("\n      </td>\n    </tr>\n    ");
 } 
      out.write("\n\n    <p>");
      out.print( tables.size() );
      out.write(" table(s) in set.</p>\n  </table>\n  ");
 } 
      out.write("\n</div>\n\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
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
