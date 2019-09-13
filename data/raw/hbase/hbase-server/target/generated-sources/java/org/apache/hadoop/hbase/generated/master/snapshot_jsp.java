package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.SnapshotDescription;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.snapshot.SnapshotInfo;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.hbase.TableName;

public final class snapshot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

  HMaster master = (HMaster)getServletContext().getAttribute(HMaster.MASTER);
  Configuration conf = master.getConfiguration();
  boolean readOnly = conf.getBoolean("hbase.master.ui.readonly", false);
  String snapshotName = request.getParameter("name");
  SnapshotDescription snapshot = null;
  SnapshotInfo.SnapshotStats stats = null;
  TableName snapshotTable = null;
  boolean tableExists = false;
  if(snapshotName != null && master.isInitialized()) {
    try (Admin admin = master.getConnection().getAdmin()) {
      for (SnapshotDescription snapshotDesc: admin.listSnapshots()) {
        if (snapshotName.equals(snapshotDesc.getName())) {
          snapshot = snapshotDesc;
          stats = SnapshotInfo.getSnapshotStats(conf, snapshot);
          snapshotTable = snapshot.getTableName();
          tableExists = admin.tableExists(snapshotTable);
          break;
        }
      }
    }
  }

  String action = request.getParameter("action");
  boolean isActionResultPage = (!readOnly && action != null);
  String pageTitle;
  if (isActionResultPage) {
    pageTitle = "HBase Master: " + master.getServerName();
  } else {
    pageTitle = "Snapshot: " + snapshotName;
  }
  pageContext.setAttribute("pageTitle", pageTitle);

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n\n<div class=\"container-fluid content\">\n");
 if (!master.isInitialized()) { 
      out.write("\n    <div class=\"row inner_header\">\n    <div class=\"page-header\">\n    <h1>Master is not initialized</h1>\n    </div>\n    </div>\n    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "redirect.jsp", out, false);
      out.write('\n');
 } else if (snapshot == null) { 
      out.write("\n  <div class=\"row inner_header\">\n    <div class=\"page-header\">\n      <h1>Snapshot \"");
      out.print( snapshotName );
      out.write("\" does not exist</h1>\n    </div>\n  </div>\n  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "redirect.jsp", out, false);
      out.write('\n');
 } else { 
      out.write("\n  <div class=\"row\">\n      <div class=\"page-header\">\n          <h1>Snapshot: ");
      out.print( snapshotName );
      out.write("</h1>\n      </div>\n  </div>\n  <h2>Snapshot Attributes</h2>\n  <table class=\"table table-striped\" width=\"90%\" >\n    <tr>\n        <th>Table</th>\n        <th>Creation Time</th>\n        <th>Type</th>\n        <th>Format Version</th>\n        <th>State</th>\n    </tr>\n    <tr>\n\n        <td>\n          ");
 if (tableExists) { 
      out.write("\n            <a href=\"table.jsp?name=");
      out.print( snapshotTable.getNameAsString() );
      out.write("\">\n              ");
      out.print( snapshotTable.getNameAsString() );
      out.write("</a>\n          ");
 } else { 
      out.write("\n            ");
      out.print( snapshotTable.getNameAsString() );
      out.write("\n          ");
 } 
      out.write("\n        </td>\n        <td>");
      out.print( new Date(snapshot.getCreationTime()) );
      out.write("</td>\n        <td>");
      out.print( snapshot.getType() );
      out.write("</td>\n        <td>");
      out.print( snapshot.getVersion() );
      out.write("</td>\n        ");
 if (stats.isSnapshotCorrupted()) { 
      out.write("\n          <td style=\"font-weight: bold; color: #dd0000;\">CORRUPTED</td>\n        ");
 } else { 
      out.write("\n          <td>ok</td>\n        ");
 } 
      out.write("\n    </tr>\n  </table>\n  <div class=\"row\">\n    <div class=\"span12\">\n    ");
      out.print( stats.getStoreFilesCount() );
      out.write(" HFiles (");
      out.print( stats.getArchivedStoreFilesCount() );
      out.write(" in archive),\n    total size ");
      out.print( StringUtils.humanReadableInt(stats.getStoreFilesSize()) );
      out.write("\n    (");
      out.print( stats.getSharedStoreFilePercentage() );
      out.write("&#37;\n    ");
      out.print( StringUtils.humanReadableInt(stats.getSharedStoreFilesSize()) );
      out.write(" shared with the source\n    table)\n    </div>\n    <div class=\"span12\">\n    ");
      out.print( stats.getLogsCount() );
      out.write(" Logs, total size\n    ");
      out.print( StringUtils.humanReadableInt(stats.getLogsSize()) );
      out.write("\n    </div>\n  </div>\n  ");
 if (stats.isSnapshotCorrupted()) { 
      out.write("\n    <div class=\"row\">\n      <div class=\"span12\">\n          <h3>CORRUPTED Snapshot</h3>\n      </div>\n      <div class=\"span12\">\n        ");
      out.print( stats.getMissingStoreFilesCount() );
      out.write(" hfile(s) and\n        ");
      out.print( stats.getMissingLogsCount() );
      out.write(" log(s) missing.\n      </div>\n    </div>\n  ");
 } 
      out.write('\n');

  } // end else

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
