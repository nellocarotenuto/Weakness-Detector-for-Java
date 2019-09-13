package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.snapshot.SnapshotInfo;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.hbase.shaded.protobuf.generated.SnapshotProtos.SnapshotDescription;

public final class snapshotsStats_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  AtomicLong totalSharedSize = new AtomicLong();
  AtomicLong totalArchivedSize = new AtomicLong();
  AtomicLong totalMobSize = new AtomicLong();
  long totalSize = 0;
  long totalUnsharedArchivedSize = 0;

  Map<Path, Integer> filesMap = null;

  List<SnapshotDescription> snapshots = master.isInitialized() ?
    master.getSnapshotManager().getCompletedSnapshots() : null;

  if (snapshots != null && snapshots.size() > 0) {
    filesMap = SnapshotInfo.getSnapshotsFilesMap(master.getConfiguration(),
                   totalArchivedSize, totalSharedSize, totalMobSize);
    totalSize = totalSharedSize.get() + totalArchivedSize.get() + totalMobSize.get();
  }
  pageContext.setAttribute("pageTitle", "HBase Master Snapshots: " + master.getServerName());

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n      <div class=\"page-header\">\n          <h1>Snapshot Storefile Stats</h1>\n      </div>\n  </div>\n  <table class=\"table table-striped\" width=\"90%\" >\n    <tr>\n        <th>Snapshot Name</th>\n        <th>Table</th>\n        <th>Creation Time</th>\n        <th>Shared Storefile Size</th>\n        <th>Mob Storefile Size</th>\n        <th>Archived Storefile Size</th>\n    </tr>\n    ");
for (SnapshotDescription snapshotDesc : snapshots) { 
      out.write("\n    <tr>\n      <td><a href=\"/snapshot.jsp?name=");
      out.print( snapshotDesc.getName() );
      out.write("\">\n        ");
      out.print( snapshotDesc.getName() );
      out.write("</a></td>\n      ");

        TableName snapshotTable = TableName.valueOf(snapshotDesc.getTable());
        SnapshotInfo.SnapshotStats stats = SnapshotInfo.getSnapshotStats(master.getConfiguration(),
          snapshotDesc, filesMap);
        totalUnsharedArchivedSize += stats.getNonSharedArchivedStoreFilesSize();
      
      out.write("\n      <td><a href=\"/table.jsp?name=");
      out.print( snapshotTable.getNameAsString() );
      out.write("\">\n        ");
      out.print( snapshotTable.getNameAsString() );
      out.write("</a></td>\n      <td>");
      out.print( new Date(snapshotDesc.getCreationTime()) );
      out.write("</td>\n      <td>");
      out.print( StringUtils.humanReadableInt(stats.getSharedStoreFilesSize()) );
      out.write("</td>\n      <td>");
      out.print( StringUtils.humanReadableInt(stats.getMobStoreFilesSize())  );
      out.write("</td>\n      <td>");
      out.print( StringUtils.humanReadableInt(stats.getArchivedStoreFileSize()) );
      out.write("\n        (");
      out.print( StringUtils.humanReadableInt(stats.getNonSharedArchivedStoreFilesSize()) );
      out.write(")</td>\n    </tr>\n    ");
 } 
      out.write("\n    <p>");
      out.print( snapshots.size() );
      out.write(" snapshot(s) in set.</p>\n    <p>Total Storefile Size: ");
      out.print( StringUtils.humanReadableInt(totalSize) );
      out.write("</p>\n    <p>Total Shared Storefile Size: ");
      out.print( StringUtils.humanReadableInt(totalSharedSize.get()) );
      out.write(",\n       Total Mob Storefile Size: ");
      out.print( StringUtils.humanReadableInt(totalMobSize.get()) );
      out.write(",\n       Total Archived Storefile Size: ");
      out.print( StringUtils.humanReadableInt(totalArchivedSize.get()) );
      out.write("\n       (");
      out.print( StringUtils.humanReadableInt(totalUnsharedArchivedSize) );
      out.write(")</p>\n    <p>Shared Storefile Size is the Storefile size shared between snapshots and active tables.\n       Mob Storefile Size is the Mob Storefile size shared between snapshots and active tables.\n       Archived Storefile Size is the Storefile size in Archive.\n       The format of Archived Storefile Size is NNN(MMM). NNN is the total Storefile\n       size in Archive, MMM is the total Storefile size in Archive that is specific\n       to the snapshot (not shared with other snapshots and tables)</p>\n  </table>\n</div>\n\n");
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
