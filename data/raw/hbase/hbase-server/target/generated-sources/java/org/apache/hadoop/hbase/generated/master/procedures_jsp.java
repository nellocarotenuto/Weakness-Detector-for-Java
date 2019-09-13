package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import static org.apache.commons.lang3.StringEscapeUtils.escapeXml;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.master.procedure.MasterProcedureEnv;
import org.apache.hadoop.hbase.master.procedure.ProcedureDescriber;
import org.apache.hadoop.hbase.procedure2.LockedResource;
import org.apache.hadoop.hbase.procedure2.Procedure;
import org.apache.hadoop.hbase.procedure2.ProcedureExecutor;
import org.apache.hadoop.hbase.procedure2.store.wal.ProcedureWALFile;
import org.apache.hadoop.hbase.procedure2.store.wal.WALProcedureStore;
import org.apache.hadoop.hbase.procedure2.util.StringUtils;
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;

public final class procedures_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  HMaster master = (HMaster) getServletContext().getAttribute(HMaster.MASTER);
  ProcedureExecutor<MasterProcedureEnv> procExecutor = master.getMasterProcedureExecutor();
  WALProcedureStore walStore = master.getWalProcedureStore();

  ArrayList<WALProcedureStore.SyncMetrics> syncMetricsBuff = walStore.getSyncMetrics();
  long millisToNextRoll = walStore.getMillisToNextPeriodicRoll();
  long millisFromLastRoll = walStore.getMillisFromLastRoll();
  ArrayList<ProcedureWALFile> procedureWALFiles = walStore.getActiveLogs();
  Set<ProcedureWALFile> corruptedWALFiles = walStore.getCorruptedLogs();
  List<Procedure<MasterProcedureEnv>> procedures = procExecutor.getProcedures();
  Collections.sort(procedures, new Comparator<Procedure>() {
    @Override
    public int compare(Procedure lhs, Procedure rhs) {
      long cmp = lhs.getParentProcId() - rhs.getParentProcId();
      cmp = cmp != 0 ? cmp : lhs.getProcId() - rhs.getProcId();
      return cmp < 0 ? -1 : cmp > 0 ? 1 : 0;
    }
  });

  List<LockedResource> lockedResources = master.getLocks();
  pageContext.setAttribute("pageTitle", "HBase Master Procedures: " + master.getServerName());

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n      <div class=\"page-header\">\n          <h1>Procedures</h1>\n      </div>\n  </div>\n  <table class=\"table table-striped\" width=\"90%\" >\n    <tr>\n        <th>Id</th>\n        <th>Parent</th>\n        <th>State</th>\n        <th>Owner</th>\n        <th>Type</th>\n        <th>Start Time</th>\n        <th>Last Update</th>\n        <th>Errors</th>\n        <th>Parameters</th>\n    </tr>\n    ");
 for (Procedure<?> proc : procedures) { 
      out.write("\n      <tr>\n        <td>");
      out.print( proc.getProcId() );
      out.write("</td>\n        <td>");
      out.print( proc.hasParent() ? proc.getParentProcId() : "" );
      out.write("</td>\n        <td>");
      out.print( escapeXml(proc.getState().toString() + (proc.isBypass() ? "(Bypass)" : "")) );
      out.write("</td>\n        <td>");
      out.print( proc.hasOwner() ? escapeXml(proc.getOwner()) : "" );
      out.write("</td>\n        <td>");
      out.print( escapeXml(proc.getProcName()) );
      out.write("</td>\n        <td>");
      out.print( new Date(proc.getSubmittedTime()) );
      out.write("</td>\n        <td>");
      out.print( new Date(proc.getLastUpdate()) );
      out.write("</td>\n        <td>");
      out.print( escapeXml(proc.isFailed() ? proc.getException().unwrapRemoteIOException().getMessage() : "") );
      out.write("</td>\n        <td>");
      out.print( escapeXml(ProcedureDescriber.describeParameters(proc)) );
      out.write("</td>\n      </tr>\n    ");
 } 
      out.write("\n  </table>\n</div>\n<br />\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n    <div class=\"page-header\">\n      <h2>Procedure WAL State</h2>\n    </div>\n  </div>\n  <div class=\"tabbable\">\n    <ul class=\"nav nav-pills\">\n      <li class=\"active\">\n        <a href=\"#tab_WALFiles\" data-toggle=\"tab\">WAL files</a>\n      </li>\n      <li class=\"\">\n        <a href=\"#tab_WALFilesCorrupted\" data-toggle=\"tab\">Corrupted WAL files</a>\n      </li>\n      <li class=\"\">\n        <a href=\"#tab_WALRollTime\" data-toggle=\"tab\">WAL roll time</a>\n      </li>\n      <li class=\"\">\n        <a href=\"#tab_SyncStats\" data-toggle=\"tab\">Sync stats</a>\n      </li>\n    </ul>\n    <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\n      <div class=\"tab-pane active\" id=\"tab_WALFiles\">\n        ");
 if (procedureWALFiles != null && procedureWALFiles.size() > 0) { 
      out.write("\n          <table class=\"table table-striped\">\n            <tr>\n              <th>LogID</th>\n              <th>Size</th>\n              <th>Timestamp</th>\n              <th>Path</th>\n            </tr>\n            ");
 for (int i = procedureWALFiles.size() - 1; i >= 0; --i) { 
      out.write("\n            ");
    ProcedureWALFile pwf = procedureWALFiles.get(i); 
      out.write("\n            <tr>\n              <td> ");
      out.print( pwf.getLogId() );
      out.write("</td>\n              <td> ");
      out.print( TraditionalBinaryPrefix.long2String(pwf.getSize(), "B", 1) );
      out.write(" </td>\n              <td> ");
      out.print( new Date(pwf.getTimestamp()) );
      out.write(" </td>\n              <td> ");
      out.print( escapeXml(pwf.toString()) );
      out.write(" </td>\n            </tr>\n            ");
 } 
      out.write("\n          </table>\n        ");
 } else {
      out.write("\n          <p> No WAL files</p>\n        ");
 } 
      out.write("\n      </div>\n      <div class=\"tab-pane\" id=\"tab_WALFilesCorrupted\">\n      ");
 if (corruptedWALFiles != null && corruptedWALFiles.size() > 0) { 
      out.write("\n        <table class=\"table table-striped\">\n          <tr>\n            <th>LogID</th>\n            <th>Size</th>\n            <th>Timestamp</th>\n            <th>Path</th>\n          </tr>\n          ");
 for (ProcedureWALFile cwf:corruptedWALFiles) { 
      out.write("\n          <tr>\n            <td> ");
      out.print( cwf.getLogId() );
      out.write("</td>\n            <td> ");
      out.print( TraditionalBinaryPrefix.long2String(cwf.getSize(), "B", 1) );
      out.write(" </td>\n            <td> ");
      out.print( new Date(cwf.getTimestamp()) );
      out.write(" </td>\n            <td> ");
      out.print( escapeXml(cwf.toString()) );
      out.write(" </td>\n          </tr>\n          ");
 } 
      out.write("\n          </table>\n      ");
 } else {
      out.write("\n        <p> No corrupted WAL files</p>\n      ");
 } 
      out.write("\n      </div>\n      <div class=\"tab-pane\" id=\"tab_WALRollTime\">\n        <table class=\"table table-striped\">\n          <tr>\n            <th> Milliseconds to next roll</th>\n            <th> Milliseconds from last roll</th>\n          </tr>\n          <tr>\n            <td> ");
      out.print(StringUtils.humanTimeDiff(millisToNextRoll)  );
      out.write("</td>\n            <td> ");
      out.print(StringUtils.humanTimeDiff(millisFromLastRoll) );
      out.write("</td>\n          </tr>\n        </table>\n      </div>\n      <div class=\"tab-pane\" id=\"tab_SyncStats\">\n        <table class=\"table table-striped\">\n          <tr>\n            <th> Time</th>\n            <th> Sync Wait</th>\n            <th> Last num of synced entries</th>\n            <th> Total Synced</th>\n            <th> Synced per second</th>\n          </tr>\n          ");
 for (int i = syncMetricsBuff.size() - 1; i >= 0; --i) { 
      out.write("\n          ");
    WALProcedureStore.SyncMetrics syncMetrics = syncMetricsBuff.get(i); 
      out.write("\n          <tr>\n            <td> ");
      out.print( new Date(syncMetrics.getTimestamp()) );
      out.write("</td>\n            <td> ");
      out.print( StringUtils.humanTimeDiff(syncMetrics.getSyncWaitMs()) );
      out.write("</td>\n            <td> ");
      out.print( syncMetrics.getSyncedEntries() );
      out.write("</td>\n            <td> ");
      out.print( TraditionalBinaryPrefix.long2String(syncMetrics.getTotalSyncedBytes(), "B", 1) );
      out.write("</td>\n            <td> ");
      out.print( TraditionalBinaryPrefix.long2String((long)syncMetrics.getSyncedPerSec(), "B", 1) );
      out.write("</td>\n          </tr>\n          ");
} 
      out.write("\n        </table>\n        </div>\n      </div>\n  </div>\n</div>\n<br />\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n      <div class=\"page-header\">\n          <h1>Locks</h1>\n      </div>\n  </div>\n  ");
 for (LockedResource lockedResource : lockedResources) { 
      out.write("\n    <h2>");
      out.print( lockedResource.getResourceType() );
      out.write(':');
      out.write(' ');
      out.print( lockedResource.getResourceName() );
      out.write("</h2>\n    ");

      switch (lockedResource.getLockType()) {
      case EXCLUSIVE:
    
      out.write("\n    <p>Lock type: EXCLUSIVE</p>\n    <p>Owner procedure: ");
      out.print( escapeXml(ProcedureDescriber.describe(lockedResource.getExclusiveLockOwnerProcedure())) );
      out.write("</p>\n    ");

        break;
      case SHARED:
    
      out.write("\n    <p>Lock type: SHARED</p>\n    <p>Number of shared locks: ");
      out.print( lockedResource.getSharedLockCount() );
      out.write("</p>\n    ");

        break;
      }

      List<Procedure<?>> waitingProcedures = lockedResource.getWaitingProcedures();

      if (!waitingProcedures.isEmpty()) {
    
      out.write("\n        <h3>Waiting procedures</h3>\n        <table class=\"table table-striped\" width=\"90%\" >\n        ");
 for (Procedure<?> proc : procedures) { 
      out.write("\n         <tr>\n            <td>");
      out.print( escapeXml(ProcedureDescriber.describe(proc)) );
      out.write("</td>\n          </tr>\n        ");
 } 
      out.write("\n        </table>\n    ");
 } 
      out.write("\n  ");
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
