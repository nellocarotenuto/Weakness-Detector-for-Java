package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.RSGroupTableAccessor;
import org.apache.hadoop.hbase.ServerName;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.RegionInfo;
import org.apache.hadoop.hbase.client.TableState;
import org.apache.hadoop.hbase.client.TableDescriptor;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.master.RegionState;
import org.apache.hadoop.hbase.net.Address;
import org.apache.hadoop.hbase.rsgroup.RSGroupInfo;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.util.VersionInfo;
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;
import org.apache.hadoop.hbase.ServerMetrics;
import org.apache.hadoop.hbase.Size;
import org.apache.hadoop.hbase.RegionMetrics;

public final class rsgroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  String rsGroupName = request.getParameter("name");
  pageContext.setAttribute("pageTitle", "RSGroup: " + rsGroupName);

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n<div class=\"container-fluid content\">\n");

  HMaster master = (HMaster)getServletContext().getAttribute(HMaster.MASTER);
  RSGroupInfo rsGroupInfo = null;

  if (!RSGroupTableAccessor.isRSGroupsEnabled(master.getConnection())) {

      out.write("\n  <div class=\"row inner_header\">\n    <div class=\"page-header\">\n      <h1>RSGroups are not enabled</h1>\n    </div>\n  </div>\n  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "redirect.jsp", out, false);
      out.write('\n');

  } else if (rsGroupName == null || rsGroupName.isEmpty() ||
      (rsGroupInfo = RSGroupTableAccessor.getRSGroupInfo(
          master.getConnection(), Bytes.toBytes(rsGroupName))) == null) {

      out.write("\n  <div class=\"row inner_header\">\n    <div class=\"page-header\">\n      <h1>RSGroup: ");
      out.print( rsGroupName );
      out.write(" does not exist</h1>\n    </div>\n  </div>\n  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "redirect.jsp", out, false);
      out.write('\n');

  } else {
    List<Address> rsGroupServers = new ArrayList<>();
    List<TableName> rsGroupTables = new ArrayList<>();
    rsGroupServers.addAll(rsGroupInfo.getServers());
    rsGroupTables.addAll(rsGroupInfo.getTables());
    Collections.sort(rsGroupServers);
    rsGroupTables.sort((o1, o2) -> {
      int compare = Bytes.compareTo(o1.getNamespace(), o2.getNamespace());
      if (compare != 0)
          return compare;
      compare = Bytes.compareTo(o1.getQualifier(), o2.getQualifier());
      if (compare != 0)
          return compare;
      return 0;
    });

    Map<Address, ServerMetrics> onlineServers = Collections.emptyMap();
    Map<Address, ServerName> serverMaping = Collections.emptyMap();
    if (master.getServerManager() != null) {
      onlineServers = master.getServerManager().getOnlineServers().entrySet().stream()
              .collect(Collectors.toMap(p -> p.getKey().getAddress(), Map.Entry::getValue));
      serverMaping =
          master.getServerManager().getOnlineServers().entrySet().stream()
              .collect(Collectors.toMap(p -> p.getKey().getAddress(), Map.Entry::getKey));
    }

      out.write("\n  <div class=\"container-fluid content\">\n    <div class=\"row\">\n      <div class=\"page-header\">\n        <h1>RSGroup: ");
      out.print( rsGroupName );
      out.write("</h1>\n      </div>\n    </div>\n  </div>\n  <div class=\"container-fluid content\">\n    <div class=\"row\">\n      <div class=\"inner_header\">\n        <h1>Region Servers</h1>\n      </div>\n    </div>\n    <div class=\"tabbable\">\n      ");
 if (rsGroupServers != null && rsGroupServers.size() > 0) { 
      out.write("\n        <ul class=\"nav nav-pills\">\n          <li class=\"active\">\n            <a href=\"#tab_baseStats\" data-toggle=\"tab\">Base Stats</a>\n          </li>\n          <li class=\"\">\n            <a href=\"#tab_memoryStats\" data-toggle=\"tab\">Memory</a>\n          </li>\n          <li class=\"\">\n            <a href=\"#tab_requestStats\" data-toggle=\"tab\">Requests</a>\n          </li>\n          <li class=\"\">\n            <a href=\"#tab_storeStats\" data-toggle=\"tab\">Storefiles</a>\n          </li>\n          <li class=\"\">\n            <a href=\"#tab_compactStats\" data-toggle=\"tab\">Compactions</a>\n          </li>\n        </ul>\n\n      <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\n        <div class=\"tab-pane active\" id=\"tab_baseStats\">\n          <table class=\"table table-striped\">\n            <tr>\n              <th>ServerName</th>\n              <th>Start time</th>\n              <th>Last contact</th>\n              <th>Version</th>\n              <th>Requests Per Second</th>\n              <th>Num. Regions</th>\n");
      out.write("            </tr>\n            ");
 int totalRegions = 0;
               int totalRequestsPerSecond = 0;
               int inconsistentNodeNum = 0;
               String masterVersion = VersionInfo.getVersion();
               for (Address server: rsGroupServers) {
                 ServerName serverName = serverMaping.get(server);
                 if (serverName != null) {
                   ServerMetrics sl = onlineServers.get(server);
                   String version = master.getRegionServerVersion(serverName);
                   if (!masterVersion.equals(version)) {
                     inconsistentNodeNum ++;
                   }
                   double requestsPerSecond = 0.0;
                   int numRegionsOnline = 0;
                   long lastContact = 0;
                   if (sl != null) {
                     requestsPerSecond = sl.getRequestCountPerSecond();
                     numRegionsOnline = sl.getRegionMetrics().size();
                     totalRegions += sl.getRegionMetrics().size();
                     totalRequestsPerSecond += sl.getRequestCountPerSecond();
                     lastContact = (System.currentTimeMillis() - sl.getReportTimestamp())/1000;
                   }
                   long startcode = serverName.getStartcode();
                   int infoPort = master.getRegionServerInfoPort(serverName);
                   String url = "//" + serverName.getHostname() + ":" + infoPort + "/rs-status";
      out.write("\n                   <tr>\n                     <td><a href=\"");
      out.print( url );
      out.write('"');
      out.write('>');
      out.print( serverName.getServerName() );
      out.write("</a></td>\n                     <td>");
      out.print( new Date(startcode) );
      out.write("</td>\n                     <td>");
      out.print( lastContact );
      out.write("</td>\n                     <td>");
      out.print( version );
      out.write("</td>\n                     <td>");
      out.print( String.format("%.0f", requestsPerSecond) );
      out.write("</td>\n                     <td>");
      out.print( numRegionsOnline );
      out.write("</td>\n                   </tr>\n              ");
 } else { 
      out.write("\n                   <tr>\n                     <td style=\"color:rgb(192,192,192);\">");
      out.print( server );
      out.write("</td>\n                     <td style=\"color:rgb(192,192,192);\">");
      out.print( "Dead" );
      out.write("</td>\n                     <td></td>\n                     <td></td>\n                     <td></td>\n                     <td></td>\n                   </tr>\n              ");
 } 
      out.write("\n            ");
 } 
      out.write("\n            <tr><td>Total:");
      out.print( rsGroupServers.size() );
      out.write("</td>\n            <td></td>\n            <td></td>\n            ");
if (inconsistentNodeNum > 0) { 
      out.write("\n                <td style=\"color:red;\">");
      out.print( inconsistentNodeNum );
      out.write(" nodes with inconsistent version</td>\n            ");
} else { 
      out.write("\n                <td></td>\n            ");
} 
      out.write("\n            <td>");
      out.print( totalRequestsPerSecond );
      out.write("</td>\n            <td>");
      out.print( totalRegions );
      out.write("</td>\n            </tr>\n          </table>\n        </div>\n        <div class=\"tab-pane\" id=\"tab_memoryStats\">\n          <table class=\"table table-striped\">\n            <tr>\n              <th>ServerName</th>\n              <th>Used Heap</th>\n              <th>Max Heap</th>\n              <th>Memstore Size</th>\n            </tr>\n            ");
 for (Address server: rsGroupServers) {
                 ServerName serverName = serverMaping.get(server);
                 ServerMetrics sl = onlineServers.get(server);
                 if (sl != null && serverName != null) {
                   double memStoreSizeMB = sl.getRegionMetrics().values()
                           .stream().mapToDouble(rm -> rm.getMemStoreSize().get(Size.Unit.MEGABYTE))
                           .sum();
                   int infoPort = master.getRegionServerInfoPort(serverName);
                   String url = "//" + serverName.getHostname() + ":" + infoPort + "/rs-status";
            
      out.write("\n                   <tr>\n                     <td><a href=\"");
      out.print( url );
      out.write('"');
      out.write('>');
      out.print( serverName.getServerName() );
      out.write("</a></td>\n                     <td>");
      out.print( TraditionalBinaryPrefix.long2String((long) sl.getUsedHeapSize().get(Size.Unit.MEGABYTE)
                       * TraditionalBinaryPrefix.MEGA.value, "B", 1) );
      out.write("</td>\n                     <td>");
      out.print( TraditionalBinaryPrefix.long2String((long) sl.getMaxHeapSize().get(Size.Unit.MEGABYTE)
                       * TraditionalBinaryPrefix.MEGA.value, "B", 1) );
      out.write("</td>\n                     <td>");
      out.print( TraditionalBinaryPrefix.long2String((long) memStoreSizeMB
                       * TraditionalBinaryPrefix.MEGA.value, "B", 1) );
      out.write("</td>\n                   </tr>\n              ");
 } else { 
      out.write("\n                   <tr>\n                     <td style=\"color:rgb(192,192,192);\">");
      out.print( server );
      out.write("</td>\n                     <td></td>\n                     <td></td>\n                     <td></td>\n                   </tr>\n              ");
 }
               } 
      out.write("\n          </table>\n        </div>\n        <div class=\"tab-pane\" id=\"tab_requestStats\">\n          <table class=\"table table-striped\">\n            <tr>\n                <th>ServerName</th>\n                <th>Request Per Second</th>\n                <th>Read Request Count</th>\n                <th>Write Request Count</th>\n            </tr>\n            ");
 for (Address server: rsGroupServers) {
                 ServerName serverName = serverMaping.get(server);
                 ServerMetrics sl = onlineServers.get(server);
                 if (sl != null && serverName != null) {
                   int infoPort = master.getRegionServerInfoPort(serverName);
                   long readRequestCount = 0;
                   long writeRequestCount = 0;
                   for (RegionMetrics rm : sl.getRegionMetrics().values()) {
                     readRequestCount += rm.getReadRequestCount();
                     writeRequestCount += rm.getWriteRequestCount();
                   }
                   String url = "//" + serverName.getHostname() + ":" + infoPort + "/rs-status";
            
      out.write("\n                   <tr>\n                     <td><a href=\"");
      out.print( url );
      out.write('"');
      out.write('>');
      out.print( serverName.getServerName() );
      out.write("</a></td>\n                     <td>");
      out.print( sl.getRequestCountPerSecond() );
      out.write("</td>\n                     <td>");
      out.print( readRequestCount );
      out.write("</td>\n                     <td>");
      out.print( writeRequestCount );
      out.write("</td>\n                   </tr>\n              ");
 } else { 
      out.write("\n                   <tr>\n                     <td style=\"color:rgb(192,192,192);\">");
      out.print( server );
      out.write("</td>\n                     <td></td>\n                     <td></td>\n                     <td></td>\n                   </tr>\n              ");
 }
              } 
      out.write("\n          </table>\n        </div>\n        <div class=\"tab-pane\" id=\"tab_storeStats\">\n          <table class=\"table table-striped\">\n            <tr>\n                <th>ServerName</th>\n                <th>Num. Stores</th>\n                <th>Num. Storefiles</th>\n                <th>Storefile Size Uncompressed</th>\n                <th>Storefile Size</th>\n                <th>Index Size</th>\n                <th>Bloom Size</th>\n            </tr>\n            ");
  for (Address server: rsGroupServers) {
                  ServerName serverName = serverMaping.get(server);
                  ServerMetrics sl = onlineServers.get(server);
                  if (sl != null && serverName != null) {
                    long storeCount = 0;
                    long storeFileCount = 0;
                    double storeUncompressedSizeMB = 0;
                    double storeFileSizeMB = 0;
                    double totalStaticIndexSizeKB = 0;
                    double totalStaticBloomSizeKB = 0;
                    for (RegionMetrics rm : sl.getRegionMetrics().values()) {
                      storeCount += rm.getStoreCount();
                      storeFileCount += rm.getStoreFileCount();
                      storeUncompressedSizeMB += rm.getUncompressedStoreFileSize().get(Size.Unit.MEGABYTE);
                      storeFileSizeMB += rm.getStoreFileSize().get(Size.Unit.MEGABYTE);
                      totalStaticIndexSizeKB += rm.getStoreFileUncompressedDataIndexSize().get(Size.Unit.KILOBYTE);
                      totalStaticBloomSizeKB += rm.getBloomFilterSize().get(Size.Unit.KILOBYTE);
                    }
                    int infoPort = master.getRegionServerInfoPort(serverName);
                    String url = "//" + serverName.getHostname() + ":" + infoPort + "/rs-status";
            
      out.write("\n                    <tr>\n                      <td><a href=\"");
      out.print( url );
      out.write('"');
      out.write('>');
      out.print( serverName.getServerName() );
      out.write("</a></td>\n                      <td>");
      out.print( storeCount );
      out.write("</td>\n                      <td>");
      out.print( storeFileCount );
      out.write("</td>\n                      <td>");
      out.print( TraditionalBinaryPrefix.long2String(
                          (long) storeUncompressedSizeMB * TraditionalBinaryPrefix.MEGA.value, "B", 1) );
      out.write("</td>\n                      <td>");
      out.print( TraditionalBinaryPrefix.long2String((long) storeFileSizeMB
                          * TraditionalBinaryPrefix.MEGA.value, "B", 1) );
      out.write("</td>\n                      <td>");
      out.print( TraditionalBinaryPrefix.long2String((long) totalStaticIndexSizeKB
                          * TraditionalBinaryPrefix.KILO.value, "B", 1) );
      out.write("</td>\n                      <td>");
      out.print( TraditionalBinaryPrefix.long2String((long) totalStaticBloomSizeKB
                          * TraditionalBinaryPrefix.KILO.value, "B", 1) );
      out.write("</td>\n                    </tr>\n               ");
 } else { 
      out.write("\n                    <tr>\n                      <td style=\"color:rgb(192,192,192);\">");
      out.print( server );
      out.write("</td>\n                      <td></td>\n                      <td></td>\n                      <td></td>\n                      <td></td>\n                      <td></td>\n                      <td></td>\n                    </tr>\n              ");
 }
              } 
      out.write("\n          </table>\n        </div>\n        <div class=\"tab-pane\" id=\"tab_compactStats\">\n          <table class=\"table table-striped\">\n            <tr>\n              <th>ServerName</th>\n              <th>Num. Compacting KVs</th>\n              <th>Num. Compacted KVs</th>\n              <th>Remaining KVs</th>\n              <th>Compaction Progress</th>\n            </tr>\n            ");
  for (Address server: rsGroupServers) {
                  ServerName serverName = serverMaping.get(server);
                  ServerMetrics sl = onlineServers.get(server);
                  if (sl != null && serverName != null) {
                    long totalCompactingCells = 0;
                    long currentCompactedCells = 0;
                    for (RegionMetrics rm : sl.getRegionMetrics().values()) {
                      totalCompactingCells += rm.getCompactingCellCount();
                      currentCompactedCells += rm.getCompactedCellCount();
                    }
                    String percentDone = "";
                    if  (totalCompactingCells > 0) {
                         percentDone = String.format("%.2f", 100 *
                            ((float) currentCompactedCells / totalCompactingCells)) + "%";
                    }
                    int infoPort = master.getRegionServerInfoPort(serverName);
                    String url = "//" + serverName.getHostname() + ":" + infoPort + "/rs-status";
            
      out.write("\n                    <tr>\n                      <td><a href=\"");
      out.print( url );
      out.write('"');
      out.write('>');
      out.print( serverName.getServerName() );
      out.write("</a></td>\n                      <td>");
      out.print( totalCompactingCells );
      out.write("</td>\n                      <td>");
      out.print( currentCompactedCells );
      out.write("</td>\n                      <td>");
      out.print( totalCompactingCells - currentCompactedCells );
      out.write("</td>\n                      <td>");
      out.print( percentDone );
      out.write("</td>\n                    </tr>\n               ");
 } else { 
      out.write("\n                    <tr>\n                      <td style=\"color:rgb(192,192,192);\">");
      out.print( server );
      out.write("</td>\n                      <td></td>\n                      <td></td>\n                      <td></td>\n                      <td></td>\n                    </tr>\n               ");
 }
               } 
      out.write("\n          </table>\n        </div>\n      </div>\n      ");
 } else { 
      out.write("\n      <p> No Region Servers</p>\n      ");
 } 
      out.write("\n    </div>\n  </div>\n  <br />\n\n  <div class=\"container-fluid content\">\n    <div class=\"row inner_header\">\n        <div class=\"page-header\">\n            <h1>Tables</h1>\n        </div>\n    </div>\n\n    ");
 if (rsGroupTables != null && rsGroupTables.size() > 0) {
        HTableDescriptor[] tables = null;
        try (Admin admin = master.getConnection().getAdmin()) {
            tables = master.isInitialized() ? admin.listTables((Pattern)null, true) : null;
        }
         Map<TableName, HTableDescriptor> tableDescriptors
            = Stream.of(tables).collect(Collectors.toMap(TableDescriptor::getTableName, p -> p));
    
      out.write("\n         <table class=\"table table-striped\">\n         <tr>\n             <th>Namespace</th>\n             <th>Table</th>\n             <th>Stats</th>\n             <th>Online Regions</th>\n             <th>Offline Regions</th>\n             <th>Failed Regions</th>\n             <th>Split Regions</th>\n             <th>Other Regions</th>\n             <th>Description</th>\n         </tr>\n         ");
 for(TableName tableName : rsGroupTables) {
             HTableDescriptor htDesc = tableDescriptors.get(tableName);
             if(htDesc == null) {
         
      out.write("\n               <tr>\n                 <td>");
      out.print( tableName.getNamespaceAsString() );
      out.write("</td>\n                 <td>");
      out.print( tableName.getQualifierAsString() );
      out.write("</td>\n                 <td style=\"color:rgb(0,0,255);\">");
      out.print( "DELETED" );
      out.write("</td>\n                 <td></td>\n                 <td></td>\n                 <td></td>\n                 <td></td>\n                 <td></td>\n                 <td></td>\n               </tr>\n           ");
 } else { 
      out.write("\n                <tr>\n                  <td>");
      out.print( tableName.getNamespaceAsString() );
      out.write("</td>\n                  <td><a href=\"/table.jsp?name=");
      out.print( tableName.getNameAsString() );
      out.write('"');
      out.write('>');
      out.print( tableName.getQualifierAsString() );
      out.write("</a></td>\n              ");
 TableState tableState = master.getTableStateManager().getTableState(tableName);
                  if(tableState.isDisabledOrDisabling()) {
              
      out.write("\n                  <td style=\"color:red;\">");
      out.print( tableState.getState().name() );
      out.write("</td>\n              ");
 } else {  
      out.write("\n                  <td>");
      out.print( tableState.getState().name() );
      out.write("</td>\n              ");
 } 
      out.write("\n              ");
 Map<RegionState.State, List<RegionInfo>> tableRegions =
                     master.getAssignmentManager().getRegionStates().getRegionByStateOfTable(tableName);
                 int openRegionsCount = tableRegions.get(RegionState.State.OPEN).size();
                 int offlineRegionsCount = tableRegions.get(RegionState.State.OFFLINE).size();
                 int splitRegionsCount = tableRegions.get(RegionState.State.SPLIT).size();
                 int failedRegionsCount = tableRegions.get(RegionState.State.FAILED_OPEN).size()
                         + tableRegions.get(RegionState.State.FAILED_CLOSE).size();
                 int otherRegionsCount = 0;
                 for (List<RegionInfo> list: tableRegions.values()) {
                     otherRegionsCount += list.size();
                 }
                 // now subtract known states
                 otherRegionsCount = otherRegionsCount - openRegionsCount
                         - failedRegionsCount - offlineRegionsCount
                         - splitRegionsCount;
              
      out.write("\n                  <td>");
      out.print( openRegionsCount );
      out.write("</td>\n                  <td>");
      out.print( offlineRegionsCount );
      out.write("</td>\n                  <td>");
      out.print( failedRegionsCount );
      out.write("</td>\n                  <td>");
      out.print( splitRegionsCount );
      out.write("</td>\n                  <td>");
      out.print( otherRegionsCount );
      out.write("</td>\n                  <td>");
      out.print( htDesc.toStringCustomizedValues() );
      out.write("</td>\n                </tr>\n           ");
 }
            } 
      out.write("\n           <p> ");
      out.print( rsGroupTables.size() );
      out.write(" table(s) in set.</p>\n         </table>\n    ");
 } else { 
      out.write("\n      <p> No Tables</p>\n    ");
 } 
      out.write("\n  </div>\n");
 } 
      out.write("\n</div>\n");
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
