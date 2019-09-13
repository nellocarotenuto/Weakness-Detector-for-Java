package org.apache.hadoop.hbase.generated.regionserver;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.List;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.RuntimeMXBean;
import java.lang.management.GarbageCollectorMXBean;
import org.apache.hadoop.hbase.util.JSONMetricUtil;
import org.apache.hadoop.hbase.procedure2.util.StringUtils;
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;

public final class processRS_jsp extends org.apache.jasper.runtime.HttpJspBase
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

RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
ObjectName jvmMetrics = new ObjectName("Hadoop:service=HBase,name=JvmMetrics");
ObjectName rsMetrics = new ObjectName("Hadoop:service=HBase,name=RegionServer,sub=Server");

// There is always two of GC collectors
List<GarbageCollectorMXBean> gcBeans = JSONMetricUtil.getGcCollectorBeans();
GarbageCollectorMXBean collector1 = null;
GarbageCollectorMXBean collector2 = null;
try {
collector1 = gcBeans.get(0);
collector2 = gcBeans.get(1);
} catch(IndexOutOfBoundsException e) {}
List<MemoryPoolMXBean> mPools = JSONMetricUtil.getMemoryPools();
pageContext.setAttribute("pageTitle", "Process info for PID: " + JSONMetricUtil.getProcessPID());

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n      <div class=\"page-header\">\n          <h1>");
      out.print( JSONMetricUtil.getCommmand().split(" ")[0] );
      out.write("</h1>\n      </div>\n  </div>\n  <table class=\"table table-striped\" width=\"90%\" >\n    <tr>\n        <th>Started</th>\n        <th>Uptime</th>\n        <th>PID</th>\n        <th>JvmPauseMonitor Count </th>\n        <th>Owner</th>\n    </tr>\n    <tr>\n      <tr>\n        <td>");
      out.print( new Date(runtimeBean.getStartTime()) );
      out.write("</td>\n        <td>");
      out.print( StringUtils.humanTimeDiff(runtimeBean.getUptime()) );
      out.write("</td>\n        <td>");
      out.print( JSONMetricUtil.getProcessPID() );
      out.write("</td>\n        <td>");
      out.print( (long)JSONMetricUtil.getValueFromMBean(rsMetrics, "pauseWarnThresholdExceeded")
          + (long)JSONMetricUtil.getValueFromMBean(rsMetrics, "pauseInfoThresholdExceeded") );
      out.write("</td>\n        <td>");
      out.print( runtimeBean.getSystemProperties().get("user.name") );
      out.write("</td>\n      </tr>\n  </table>\n</div>\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n    <div class=\"page-header\">\n    <h2>Threads</h2>\n    </div>\n    </div>\n  <table class=\"table table-striped\" width=\"90%\" >\n    <tr>\n        <th>ThreadsNew</th>\n        <th>ThreadsRunable</th>\n        <th>ThreadsBlocked</th>\n        <th>ThreadsWaiting</th>\n        <th>ThreadsTimeWaiting</th>\n        <th>ThreadsTerminated</th>\n    </tr>\n    <tr>\n      <tr>\n        <td>");
      out.print( JSONMetricUtil.getValueFromMBean(jvmMetrics, "ThreadsNew")  );
      out.write("</td>\n        <td>");
      out.print( JSONMetricUtil.getValueFromMBean(jvmMetrics, "ThreadsRunnable"));
      out.write("</td>\n        <td>");
      out.print( JSONMetricUtil.getValueFromMBean(jvmMetrics, "ThreadsBlocked"));
      out.write("</td>\n        <td>");
      out.print( JSONMetricUtil.getValueFromMBean(jvmMetrics, "ThreadsWaiting"));
      out.write("</td>\n        <td>");
      out.print( JSONMetricUtil.getValueFromMBean(jvmMetrics, "ThreadsTimedWaiting"));
      out.write("</td>\n        <td>");
      out.print( JSONMetricUtil.getValueFromMBean(jvmMetrics, "ThreadsTerminated"));
      out.write("</td>\n      </tr>\n  </table>\n</div>\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n    <div class=\"page-header\">\n    <h2>GC Collectors</h2>\n    </div>\n    </div>\n    ");
 if (gcBeans.size() == 2) { 
      out.write("\n<div class=\"tabbable\">\n  <ul class=\"nav nav-pills\">\n    <li class=\"active\">\n      <a href=\"#tab_gc1\" data-toggle=\"tab\">");
      out.print(collector1.getName() );
      out.write("</a>\n    </li>\n    <li class=\"\">\n      <a href=\"#tab_gc2\" data-toggle=\"tab\">");
      out.print(collector2.getName() );
      out.write("</a>\n     </li>\n  </ul>\n    <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\n      <div class=\"tab-pane active\" id=\"tab_gc1\">\n          <table class=\"table table-striped\">\n            <tr>\n              <th>Collection Count</th>\n              <th>Collection Time</th>\n              <th>Last duration</th>\n            </tr>\n            <tr>\n              <td> ");
      out.print( collector1.getCollectionCount() );
      out.write("</td>\n              <td> ");
      out.print( StringUtils.humanTimeDiff(collector1.getCollectionTime()) );
      out.write(" </td>\n              <td> ");
      out.print( StringUtils.humanTimeDiff(JSONMetricUtil.getLastGcDuration(
                collector1.getObjectName())) );
      out.write("</td>\n            </tr>\n          </table>\n      </div>\n      <div class=\"tab-pane\" id=\"tab_gc2\">\n        <table class=\"table table-striped\">\n          <tr>\n            <th>Collection Count</th>\n            <th>Collection Time</th>\n             <th>Last duration</th>\n          </tr>\n          <tr>\n            <td> ");
      out.print( collector2.getCollectionCount()  );
      out.write("</td>\n            <td> ");
      out.print( StringUtils.humanTimeDiff(collector2.getCollectionTime()) );
      out.write(" </td>\n            <td> ");
      out.print( StringUtils.humanTimeDiff(JSONMetricUtil.getLastGcDuration(
              collector2.getObjectName())) );
      out.write("</td>\n          </tr>\n          </table>\n      </div>\n      </div>\n  </div>\n  ");
} else { 
      out.write("\n  <p> Can not display GC Collector stats.</p>\n  ");
} 
      out.write("\n  Total GC Collection time: ");
      out.print( StringUtils.humanTimeDiff(collector1.getCollectionTime() +
    collector2.getCollectionTime()));
      out.write("\n</div>\n");
 for(MemoryPoolMXBean mp:mPools) {
if(mp.getName().contains("Cache")) continue;
      out.write("\n<div class=\"container-fluid content\">\n  <div class=\"row\">\n      <div class=\"page-header\">\n          <h2>");
      out.print( mp.getName() );
      out.write("</h2>\n      </div>\n  </div>\n  <table class=\"table table-striped\" width=\"90%\" >\n    <tr>\n        <th>Commited</th>\n        <th>Init</th>\n        <th>Max</th>\n        <th>Used</th>\n        <th>Utilization [%]</th>\n    </tr>\n    <tr>\n      <tr>\n        <td>");
      out.print( TraditionalBinaryPrefix.long2String(mp.getUsage().getCommitted(), "B", 1) );
      out.write("</td>\n        <td>");
      out.print( TraditionalBinaryPrefix.long2String(mp.getUsage().getInit(), "B", 1) );
      out.write("</td>\n        <td>");
      out.print( TraditionalBinaryPrefix.long2String(mp.getUsage().getMax(), "B", 1) );
      out.write("</td>\n        <td>");
      out.print( TraditionalBinaryPrefix.long2String(mp.getUsage().getUsed(), "B", 1) );
      out.write("</td>\n        <td>");
      out.print( JSONMetricUtil.calcPercentage(mp.getUsage().getUsed(),
          mp.getUsage().getCommitted()) );
      out.write("</td>\n      </tr>\n  </table>\n</div>\n");
 } 
      out.write('\n');
      out.write('\n');
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
