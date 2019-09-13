package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.client.RegionInfo;
import org.apache.hadoop.hbase.master.HbckChore;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.ServerName;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.util.Pair;
import org.apache.hadoop.hbase.master.CatalogJanitor;
import org.apache.hadoop.hbase.master.CatalogJanitor.Report;

public final class hbck_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n\n\n\n\n\n\n\n\n\n");

  HMaster master = (HMaster) getServletContext().getAttribute(HMaster.MASTER);
  pageContext.setAttribute("pageTitle", "HBase Master HBCK Report: " + master.getServerName());
  HbckChore hbckChore = master.getHbckChore();
  Map<String, Pair<ServerName, List<ServerName>>> inconsistentRegions = null;
  Map<String, ServerName> orphanRegionsOnRS = null;
  Map<String, Path> orphanRegionsOnFS = null;
  long startTimestamp = 0;
  long endTimestamp = 0;
  if (hbckChore != null) {
    inconsistentRegions = hbckChore.getInconsistentRegions();
    orphanRegionsOnRS = hbckChore.getOrphanRegionsOnRS();
    orphanRegionsOnFS = hbckChore.getOrphanRegionsOnFS();
    startTimestamp = hbckChore.getCheckingStartTimestamp();
    endTimestamp = hbckChore.getCheckingEndTimestamp();
  }
  ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(startTimestamp),
    ZoneId.systemDefault());
  String iso8601start = startTimestamp == 0? "-1": zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(endTimestamp),
    ZoneId.systemDefault());
  String iso8601end = startTimestamp == 0? "-1": zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  CatalogJanitor cj = master.getCatalogJanitor();
  CatalogJanitor.Report report = cj == null? null: cj.getLastReport();

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n\n<div class=\"container-fluid content\">\n\n  ");
 if (!master.isInitialized()) { 
      out.write("\n  <div class=\"row\">\n    <div class=\"page-header\">\n      <h1>Master is not initialized</h1>\n    </div>\n  </div>\n  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "redirect.jsp", out, false);
      out.write("\n  ");
 } else { 
      out.write("\n\n  <div class=\"row\">\n    <div class=\"page-header\">\n      <h1>HBCK Chore Report</h1>\n      <p>\n        ");
 if (hbckChore.isDisabled()) { 
      out.write("\n        <span>HBCK chore is currently disabled. Set hbase.master.hbck.chore.interval > 0 in the config & do a rolling-restart to enable it.</span>\n        ");
 } else { 
      out.write("\n        <span>Checking started at ");
      out.print( iso8601start );
      out.write(" and generated report at ");
      out.print( iso8601end );
      out.write(". Execute 'hbck_chore_run' in hbase shell to generate a new sub-report.</span>\n        ");
 } 
      out.write("\n      </p>\n    </div>\n  </div>\n\n\n  <div class=\"row\">\n    <div class=\"page-header\">\n      <h2>Inconsistent Regions</h2>\n    </div>\n  </div>\n\n  ");
 if (inconsistentRegions != null && inconsistentRegions.size() > 0) { 
      out.write("\n      <p>\n        <span>\n        There are three cases: 1. Master thought this region opened, but no regionserver reported it (Fix: use assigns\n        command; 2. Master thought this region opened on Server1, but regionserver reported Server2 (Fix:\n        need to check the server is still exist. If not, schedule SCP for it. If exist, restart Server2 and Server1):\n        3. More than one regionservers reported opened this region (Fix: restart the RegionServers).\n        Notice: the reported online regionservers may be not right when there are regions in transition.\n        Please check them in regionserver's web UI.\n        </span>\n      </p>\n\n  <table class=\"table table-striped\">\n    <tr>\n      <th>Region Encoded Name</th>\n      <th>Location in META</th>\n      <th>Reported Online RegionServers</th>\n    </tr>\n    ");
 for (Map.Entry<String, Pair<ServerName, List<ServerName>>> entry : inconsistentRegions.entrySet()) { 
      out.write("\n    <tr>\n      <td>");
      out.print( entry.getKey() );
      out.write("</td>\n      <td>");
      out.print( entry.getValue().getFirst() );
      out.write("</td>\n      <td>");
      out.print( entry.getValue().getSecond().stream().map(ServerName::getServerName)
                        .collect(Collectors.joining(", ")) );
      out.write("</td>\n    </tr>\n    ");
 } 
      out.write("\n\n    <p>");
      out.print( inconsistentRegions.size() );
      out.write(" region(s) in set.</p>\n  </table>\n  ");
 } 
      out.write("\n\n  <div class=\"row\">\n    <div class=\"page-header\">\n      <h2>Orphan Regions on RegionServer</h2>\n    </div>\n  </div>\n\n  ");
 if (orphanRegionsOnRS != null && orphanRegionsOnRS.size() > 0) { 
      out.write("\n  <table class=\"table table-striped\">\n    <tr>\n      <th>Region Encoded Name</th>\n      <th>Reported Online RegionServer</th>\n    </tr>\n    ");
 for (Map.Entry<String, ServerName> entry : orphanRegionsOnRS.entrySet()) { 
      out.write("\n    <tr>\n      <td>");
      out.print( entry.getKey() );
      out.write("</td>\n      <td>");
      out.print( entry.getValue() );
      out.write("</td>\n    </tr>\n    ");
 } 
      out.write("\n\n    <p>");
      out.print( orphanRegionsOnRS.size() );
      out.write(" region(s) in set.</p>\n  </table>\n  ");
 } 
      out.write("\n\n  <div class=\"row\">\n    <div class=\"page-header\">\n      <h2>Orphan Regions on FileSystem</h2>\n    </div>\n  </div>\n\n  ");
 if (orphanRegionsOnFS != null && orphanRegionsOnFS.size() > 0) { 
      out.write("\n  <table class=\"table table-striped\">\n    <tr>\n      <th>Region Encoded Name</th>\n      <th>FileSystem Path</th>\n    </tr>\n    ");
 for (Map.Entry<String, Path> entry : orphanRegionsOnFS.entrySet()) { 
      out.write("\n    <tr>\n      <td>");
      out.print( entry.getKey() );
      out.write("</td>\n      <td>");
      out.print( entry.getValue() );
      out.write("</td>\n    </tr>\n    ");
 } 
      out.write("\n\n    <p>");
      out.print( orphanRegionsOnFS.size() );
      out.write(" region(s) in set.</p>\n  </table>\n  ");
 } 
      out.write("\n\n  <div class=\"row inner_header\">\n    <div class=\"page-header\">\n      <h1>CatalogJanitor <em>hbase:meta</em> Consistency Issues</h1>\n    </div>\n  </div>\n  ");
 if (report != null && !report.isEmpty()) {
    zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(report.getCreateTime()),
      ZoneId.systemDefault());
    String iso8601reportTime = zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()),
      ZoneId.systemDefault());
    String iso8601Now = zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  
      out.write("\n  <p>Report created: ");
      out.print( iso8601reportTime );
      out.write(" (now=");
      out.print( iso8601Now );
      out.write("). Run <i>catalogjanitor_run</i> in hbase shell to generate a new sub-report.</p>\n      ");
 if (!report.getHoles().isEmpty()) { 
      out.write("\n          <div class=\"row inner_header\">\n            <div class=\"page-header\">\n              <h2>Holes</h2>\n            </div>\n          </div>\n          <table class=\"table table-striped\">\n            <tr>\n              <th>RegionInfo</th>\n              <th>RegionInfo</th>\n            </tr>\n            ");
 for (Pair<RegionInfo, RegionInfo> p : report.getHoles()) { 
      out.write("\n            <tr>\n              <td>");
      out.print( p.getFirst() );
      out.write("</td>\n              <td>");
      out.print( p.getSecond() );
      out.write("</td>\n            </tr>\n            ");
 } 
      out.write("\n\n            <p>");
      out.print( report.getHoles().size() );
      out.write(" hole(s).</p>\n          </table>\n      ");
 } 
      out.write("\n      ");
 if (!report.getOverlaps().isEmpty()) { 
      out.write("\n            <div class=\"row inner_header\">\n              <div class=\"page-header\">\n                <h2>Overlaps</h2>\n              </div>\n            </div>\n            <table class=\"table table-striped\">\n              <tr>\n                <th>RegionInfo</th>\n                <th>Other RegionInfo</th>\n              </tr>\n              ");
 for (Pair<RegionInfo, RegionInfo> p : report.getOverlaps()) { 
      out.write("\n              <tr>\n                <td>");
      out.print( p.getFirst() );
      out.write("</td>\n                <td>");
      out.print( p.getSecond() );
      out.write("</td>\n              </tr>\n              ");
 } 
      out.write("\n\n              <p>");
      out.print( report.getOverlaps().size() );
      out.write(" overlap(s).</p>\n            </table>\n      ");
 } 
      out.write("\n      ");
 if (!report.getUnknownServers().isEmpty()) { 
      out.write("\n            <div class=\"row inner_header\">\n              <div class=\"page-header\">\n                <h2>Unknown Servers</h2>\n              </div>\n            </div>\n            <table class=\"table table-striped\">\n              <tr>\n                <th>RegionInfo</th>\n                <th>ServerName</th>\n              </tr>\n              ");
 for (Pair<RegionInfo, ServerName> p: report.getUnknownServers()) { 
      out.write("\n              <tr>\n                <td>");
      out.print( p.getFirst() );
      out.write("</td>\n                <td>");
      out.print( p.getSecond() );
      out.write("</td>\n              </tr>\n              ");
 } 
      out.write("\n\n              <p>");
      out.print( report.getUnknownServers().size() );
      out.write(" unknown servers(s).</p>\n            </table>\n      ");
 } 
      out.write("\n      ");
 if (!report.getEmptyRegionInfo().isEmpty()) { 
      out.write("\n            <div class=\"row inner_header\">\n              <div class=\"page-header\">\n                <h2>Empty <em>info:regioninfo</em></h2>\n              </div>\n            </div>\n            <table class=\"table table-striped\">\n              <tr>\n                <th>Row</th>\n              </tr>\n              ");
 for (byte [] row: report.getEmptyRegionInfo()) { 
      out.write("\n              <tr>\n                <td>");
      out.print( Bytes.toStringBinary(row) );
      out.write("</td>\n              </tr>\n              ");
 } 
      out.write("\n\n              <p>");
      out.print( report.getEmptyRegionInfo().size() );
      out.write(" emptyRegionInfo(s).</p>\n            </table>\n      ");
 } 
      out.write("\n  ");
 } 
      out.write("\n\n  ");
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
