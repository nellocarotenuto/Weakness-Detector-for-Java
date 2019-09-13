package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import static org.apache.commons.lang3.StringEscapeUtils.escapeXml;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.HRegionLocation;
import org.apache.hadoop.hbase.ServerName;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.TableNotFoundException;
import org.apache.hadoop.hbase.client.AsyncAdmin;
import org.apache.hadoop.hbase.client.AsyncConnection;
import org.apache.hadoop.hbase.client.CompactionState;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.RegionInfo;
import org.apache.hadoop.hbase.client.RegionInfoBuilder;
import org.apache.hadoop.hbase.client.RegionLocator;
import org.apache.hadoop.hbase.client.RegionReplicaUtil;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.quotas.QuotaTableUtil;
import org.apache.hadoop.hbase.quotas.SpaceQuotaSnapshot;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.util.FSUtils;
import org.apache.hadoop.hbase.zookeeper.MetaTableLocator;
import org.apache.hadoop.util.StringUtils;
import org.apache.hbase.thirdparty.com.google.protobuf.ByteString;
import org.apache.hadoop.hbase.shaded.protobuf.generated.ClusterStatusProtos;
import org.apache.hadoop.hbase.shaded.protobuf.generated.HBaseProtos;
import org.apache.hadoop.hbase.shaded.protobuf.generated.QuotaProtos.Quotas;
import org.apache.hadoop.hbase.shaded.protobuf.generated.QuotaProtos.SpaceQuota;
import org.apache.hadoop.hbase.ServerMetrics;
import org.apache.hadoop.hbase.RegionMetrics;
import org.apache.hadoop.hbase.Size;
import org.apache.hadoop.hbase.RegionMetricsBuilder;

public final class table_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


  /**
   * @return An empty region load stamped with the passed in <code>regionInfo</code>
   * region name.
   */
  private RegionMetrics getEmptyRegionMetrics(final RegionInfo regionInfo) {
    return RegionMetricsBuilder.toRegionMetrics(ClusterStatusProtos.RegionLoad.newBuilder().
            setRegionSpecifier(HBaseProtos.RegionSpecifier.newBuilder().
                    setType(HBaseProtos.RegionSpecifier.RegionSpecifierType.REGION_NAME).
                    setValue(ByteString.copyFrom(regionInfo.getRegionName())).build()).build());
  }

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
      out.write('\n');

  HMaster master = (HMaster)getServletContext().getAttribute(HMaster.MASTER);
  Configuration conf = master.getConfiguration();

  MetaTableLocator metaTableLocator = new MetaTableLocator();
  String fqtn = request.getParameter("name");
  final String escaped_fqtn = StringEscapeUtils.escapeHtml4(fqtn);
  Table table;
  String tableHeader;
  boolean withReplica = false;
  boolean showFragmentation = conf.getBoolean("hbase.master.ui.fragmentation.enabled", false);
  boolean readOnly = conf.getBoolean("hbase.master.ui.readonly", false);
  int numMetaReplicas = conf.getInt(HConstants.META_REPLICAS_NUM,
                        HConstants.DEFAULT_META_REPLICA_NUM);
  Map<String, Integer> frags = null;
  if (showFragmentation) {
      frags = FSUtils.getTableFragmentation(master);
  }
  boolean quotasEnabled = conf.getBoolean("hbase.quota.enabled", false);
  String action = request.getParameter("action");
  String key = request.getParameter("key");
  String left = request.getParameter("left");
  String right = request.getParameter("right");
  long totalStoreFileSizeMB = 0;

  final String numRegionsParam = request.getParameter("numRegions");
  // By default, the page render up to 10000 regions to improve the page load time
  int numRegionsToRender = 10000;
  if (numRegionsParam != null) {
    // either 'all' or a number
    if (numRegionsParam.equals("all")) {
      numRegionsToRender = -1;
    } else {
      try {
        numRegionsToRender = Integer.parseInt(numRegionsParam);
      } catch (NumberFormatException ex) {
        // ignore
      }
    }
  }
  int numRegions = 0;

  String pageTitle;
  if ( !readOnly && action != null ) {
      pageTitle = "HBase Master: " + StringEscapeUtils.escapeHtml4(master.getServerName().toString());
  } else {
      pageTitle = "Table: " + escaped_fqtn;
  }
  pageContext.setAttribute("pageTitle", pageTitle);
  AsyncConnection connection = ConnectionFactory.createAsyncConnection(master.getConfiguration()).get();
  AsyncAdmin admin = connection.getAdminBuilder().setOperationTimeout(5, TimeUnit.SECONDS).build();

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write('\n');
      out.write('\n');

if (fqtn != null && master.isInitialized()) {
  try {
  table = master.getConnection().getTable(TableName.valueOf(fqtn));
  if (table.getTableDescriptor().getRegionReplication() > 1) {
    tableHeader = "<h2>Table Regions</h2><table id=\"tableRegionTable\" class=\"tablesorter table table-striped\" style=\"table-layout: fixed; word-wrap: break-word;\"><thead><tr><th>Name</th><th>Region Server</th><th>ReadRequests</th><th>WriteRequests</th><th>StorefileSize</th><th>Num.Storefiles</th><th>MemSize</th><th>Locality</th><th>Start Key</th><th>End Key</th><th>ReplicaID</th></tr></thead>";
    withReplica = true;
  } else {
    tableHeader = "<h2>Table Regions</h2><table id=\"tableRegionTable\" class=\"tablesorter table table-striped\" style=\"table-layout: fixed; word-wrap: break-word;\"><thead><tr><th>Name</th><th>Region Server</th><th>ReadRequests</th><th>WriteRequests</th><th>StorefileSize</th><th>Num.Storefiles</th><th>MemSize</th><th>Locality</th><th>Start Key</th><th>End Key</th></tr></thead>";
  }
  if ( !readOnly && action != null ) {

      out.write("\n<div class=\"container-fluid content\">\n        <div class=\"row inner_header\">\n            <div class=\"page-header\">\n                <h1>Table action request accepted</h1>\n            </div>\n        </div>\n<p><hr><p>\n");

    if (action.equals("split")) {
      if (key != null && key.length() > 0) {
        admin.split(TableName.valueOf(fqtn), Bytes.toBytes(key));
      } else {
        admin.split(TableName.valueOf(fqtn));
      }

    
      out.write(" Split request accepted. ");

    } else if (action.equals("compact")) {
      if (key != null && key.length() > 0) {
        List<RegionInfo> regions = admin.getRegions(TableName.valueOf(fqtn)).get();
        byte[] row = Bytes.toBytes(key);

        for (RegionInfo region : regions) {
          if (region.containsRow(row)) {
            admin.compactRegion(region.getRegionName());
          }
        }
      } else {
        admin.compact(TableName.valueOf(fqtn));
      }
    
      out.write(" Compact request accepted. ");

    } else if (action.equals("merge")) {
        if (left != null && left.length() > 0 && right != null && right.length() > 0) {
            admin.mergeRegions(Bytes.toBytesBinary(left), Bytes.toBytesBinary(right), false);
        }
        
      out.write(" Merge request accepted. ");

    }

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "redirect.jsp", out, false);
      out.write("\n</div>\n");

  } else {

      out.write("\n<div class=\"container-fluid content\">\n    <div class=\"row inner_header\">\n        <div class=\"page-header\">\n            <h1>Table <small>");
      out.print( escaped_fqtn );
      out.write("</small></h1>\n        </div>\n    </div>\n    <div class=\"row\">\n");

  if(fqtn.equals(TableName.META_TABLE_NAME.getNameAsString())) {

      out.write('\n');
      out.print( tableHeader );
      out.write("\n<tbody>\n");

  // NOTE: Presumes meta with one or more replicas
  for (int j = 0; j < numMetaReplicas; j++) {
    RegionInfo meta = RegionReplicaUtil.getRegionInfoForReplica(
                            RegionInfoBuilder.FIRST_META_REGIONINFO, j);
    ServerName metaLocation = metaTableLocator.waitMetaRegionLocation(master.getZooKeeper(), j, 1);
    for (int i = 0; i < 1; i++) {
      String hostAndPort = "";
      String readReq = "N/A";
      String writeReq = "N/A";
      String fileSize = "N/A";
      String fileCount = "N/A";
      String memSize = "N/A";
      float locality = 0.0f;

      if (metaLocation != null) {
        ServerMetrics sl = master.getServerManager().getLoad(metaLocation);
        // The host name portion should be safe, but I don't know how we handle IDNs so err on the side of failing safely.
        hostAndPort = URLEncoder.encode(metaLocation.getHostname()) + ":" + master.getRegionServerInfoPort(metaLocation);
        if (sl != null) {
          Map<byte[], RegionMetrics> map = sl.getRegionMetrics();
          if (map.containsKey(meta.getRegionName())) {
            RegionMetrics load = map.get(meta.getRegionName());
            readReq = String.format("%,1d", load.getReadRequestCount());
            writeReq = String.format("%,1d", load.getWriteRequestCount());
            fileSize = StringUtils.byteDesc((long) load.getStoreFileSize().get(Size.Unit.BYTE));
            fileCount = String.format("%,1d", load.getStoreFileCount());
            memSize = StringUtils.byteDesc((long) load.getMemStoreSize().get(Size.Unit.BYTE));
            locality = load.getDataLocality();
          }
        }
      }

      out.write("\n<tr>\n  <td>");
      out.print( escapeXml(meta.getRegionNameAsString()) );
      out.write("</td>\n    <td><a href=\"http://");
      out.print( hostAndPort );
      out.write("/rs-status/\">");
      out.print( StringEscapeUtils.escapeHtml4(hostAndPort) );
      out.write("</a></td>\n    <td>");
      out.print( readReq);
      out.write("</td>\n    <td>");
      out.print( writeReq);
      out.write("</td>\n    <td>");
      out.print( fileSize);
      out.write("</td>\n    <td>");
      out.print( fileCount);
      out.write("</td>\n    <td>");
      out.print( memSize);
      out.write("</td>\n    <td>");
      out.print( locality);
      out.write("</td>\n    <td>");
      out.print( escapeXml(Bytes.toString(meta.getStartKey())) );
      out.write("</td>\n    <td>");
      out.print( escapeXml(Bytes.toString(meta.getEndKey())) );
      out.write("</td>\n");

      if (withReplica) {

      out.write("\n    <td>");
      out.print( meta.getReplicaId() );
      out.write("</td>\n");

      }

      out.write("\n</tr>\n");
  } 
      out.write('\n');
} 
      out.write("\n</tbody>\n</table>\n");
} else {
  RegionLocator r = master.getConnection().getRegionLocator(table.getName());
  try { 
      out.write("\n<h2>Table Attributes</h2>\n<table class=\"table table-striped\">\n  <tr>\n      <th>Attribute Name</th>\n      <th>Value</th>\n      <th>Description</th>\n  </tr>\n  <tr>\n      <td>Enabled</td>\n      <td>");
      out.print( admin.isTableEnabled(table.getName()).get() );
      out.write("</td>\n      <td>Is the table enabled</td>\n  </tr>\n  <tr>\n      <td>Compaction</td>\n      <td>\n");

  try {
    CompactionState compactionState = admin.getCompactionState(table.getName()).get();

      out.write('\n');
      out.print( compactionState );
      out.write('\n');

  } catch (Exception e) {
    // Nothing really to do here
    for(StackTraceElement element : e.getStackTrace()) {
      
      out.print( StringEscapeUtils.escapeHtml4(element.toString()) );

    }

      out.write(" Unknown ");

  }

      out.write("\n      </td>\n      <td>Is the table compacting</td>\n  </tr>\n");
  if (showFragmentation) { 
      out.write("\n  <tr>\n      <td>Fragmentation</td>\n      <td>");
      out.print( frags.get(fqtn) != null ? frags.get(fqtn).intValue() + "%" : "n/a" );
      out.write("</td>\n      <td>How fragmented is the table. After a major compaction it is 0%.</td>\n  </tr>\n");
  } 
      out.write('\n');

  if (quotasEnabled) {
    TableName tn = TableName.valueOf(fqtn);
    SpaceQuotaSnapshot masterSnapshot = null;
    Quotas quota = QuotaTableUtil.getTableQuota(master.getConnection(), tn);
    if (quota == null || !quota.hasSpace()) {
      quota = QuotaTableUtil.getNamespaceQuota(master.getConnection(), tn.getNamespaceAsString());
      if (quota != null) {
        masterSnapshot = QuotaTableUtil.getCurrentSnapshot(master.getConnection(), tn.getNamespaceAsString());
      }
    } else {
      masterSnapshot = QuotaTableUtil.getCurrentSnapshot(master.getConnection(), tn);
    }
    if (quota != null && quota.hasSpace()) {
      SpaceQuota spaceQuota = quota.getSpace();

      out.write("\n  <tr>\n    <td>Space Quota</td>\n    <td>\n      <table>\n        <tr>\n          <th>Property</th>\n          <th>Value</th>\n        </tr>\n        <tr>\n          <td>Limit</td>\n          <td>");
      out.print( StringUtils.byteDesc(spaceQuota.getSoftLimit()) );
      out.write("</td>\n        </tr>\n        <tr>\n          <td>Policy</td>\n          <td>");
      out.print( spaceQuota.getViolationPolicy() );
      out.write("</td>\n        </tr>\n");

      if (masterSnapshot != null) {

      out.write("\n        <tr>\n          <td>Usage</td>\n          <td>");
      out.print( StringUtils.byteDesc(masterSnapshot.getUsage()) );
      out.write("</td>\n        </tr>\n        <tr>\n          <td>State</td>\n          <td>");
      out.print( masterSnapshot.getQuotaStatus().isInViolation() ? "In Violation" : "In Observance" );
      out.write("</td>\n        </tr>\n");

      }

      out.write("\n      </table>\n    </td>\n    <td>Information about a Space Quota on this table, if set.</td>\n  </tr>\n");

    }
  }

      out.write("\n</table>\n<h2>Table Schema</h2>\n<table class=\"table table-striped\">\n  <tr>\n      <th>Column Name</th>\n      <th></th>\n  </tr>\n  ");

    Collection<HColumnDescriptor> families = table.getTableDescriptor().getFamilies();
    for (HColumnDescriptor family: families) {
  
      out.write("\n  <tr>\n    <td>");
      out.print( StringEscapeUtils.escapeHtml4(family.getNameAsString()) );
      out.write("</td>\n    <td>\n    <table class=\"table table-striped\">\n      <tr>\n       <th>Property</th>\n       <th>Value</th>\n      </tr>\n    ");

    Map<Bytes, Bytes> familyValues = family.getValues();
    for (Bytes familyKey: familyValues.keySet()) {
    
      out.write("\n      <tr>\n        <td>\n          ");
      out.print( StringEscapeUtils.escapeHtml4(familyKey.toString()) );
      out.write("\n\t\t</td>\n        <td>\n          ");
      out.print( StringEscapeUtils.escapeHtml4(familyValues.get(familyKey).toString()) );
      out.write("\n        </td>\n      </tr>\n    ");
 } 
      out.write("\n    </table>\n    </td>\n  </tr>\n  ");
 } 
      out.write("\n</table>\n");

  long totalReadReq = 0;
  long totalWriteReq = 0;
  long totalSize = 0;
  long totalStoreFileCount = 0;
  long totalMemSize = 0;
  String urlRegionServer = null;
  Map<ServerName, Integer> regDistribution = new TreeMap<>();
  Map<ServerName, Integer> primaryRegDistribution = new TreeMap<>();
  List<HRegionLocation> regions = r.getAllRegionLocations();
  Map<RegionInfo, RegionMetrics> regionsToLoad = new LinkedHashMap<>();
  Map<RegionInfo, ServerName> regionsToServer = new LinkedHashMap<>();
  for (HRegionLocation hriEntry : regions) {
    RegionInfo regionInfo = hriEntry.getRegionInfo();
    ServerName addr = hriEntry.getServerName();
    regionsToServer.put(regionInfo, addr);

    if (addr != null) {
      ServerMetrics sl = master.getServerManager().getLoad(addr);
      if (sl != null) {
        RegionMetrics regionMetrics = sl.getRegionMetrics().get(regionInfo.getRegionName());
        regionsToLoad.put(regionInfo, regionMetrics);
        if(regionMetrics != null) {
          totalReadReq += regionMetrics.getReadRequestCount();
          totalWriteReq += regionMetrics.getWriteRequestCount();
          totalSize += regionMetrics.getStoreFileSize().get(Size.Unit.MEGABYTE);
          totalStoreFileCount += regionMetrics.getStoreFileCount();
          totalMemSize += regionMetrics.getMemStoreSize().get(Size.Unit.MEGABYTE);
          totalStoreFileSizeMB += regionMetrics.getStoreFileSize().get(Size.Unit.MEGABYTE);
        } else {
          RegionMetrics load0 = getEmptyRegionMetrics(regionInfo);
          regionsToLoad.put(regionInfo, load0);
        }
      } else{
        RegionMetrics load0 = getEmptyRegionMetrics(regionInfo);
        regionsToLoad.put(regionInfo, load0);
      }
    } else {
      RegionMetrics load0 = getEmptyRegionMetrics(regionInfo);
      regionsToLoad.put(regionInfo, load0);
    }
  }

  if(regions != null && regions.size() > 0) { 
      out.write("\n<h2>Table Regions</h2>\n<table id=\"regionServerDetailsTable\" class=\"tablesorter table table-striped\">\n<thead>\n<tr>\n<th>Name(");
      out.print( String.format("%,1d", regions.size()));
      out.write(")</th>\n<th>Region Server</th>\n<th>ReadRequests<br>(");
      out.print( String.format("%,1d", totalReadReq));
      out.write(")</th>\n<th>WriteRequests<br>(");
      out.print( String.format("%,1d", totalWriteReq));
      out.write(")</th>\n<th>StorefileSize<br>(");
      out.print( StringUtils.byteDesc(totalSize*1024l*1024));
      out.write(")</th>\n<th>Num.Storefiles<br>(");
      out.print( String.format("%,1d", totalStoreFileCount));
      out.write(")</th>\n<th>MemSize<br>(");
      out.print( StringUtils.byteDesc(totalMemSize*1024l*1024));
      out.write(")</th>\n<th>Locality</th>\n<th>Start Key</th>\n<th>End Key</th>\n");

  if (withReplica) {

      out.write("\n<th>ReplicaID</th>\n");

  }

      out.write("\n</thead>\n</tr>\n<tbody>\n\n");

  List<Map.Entry<RegionInfo, RegionMetrics>> entryList = new ArrayList<>(regionsToLoad.entrySet());
  numRegions = regions.size();
  int numRegionsRendered = 0;
  // render all regions
  if (numRegionsToRender < 0) {
    numRegionsToRender = numRegions;
  }
  for (Map.Entry<RegionInfo, RegionMetrics> hriEntry : entryList) {
    RegionInfo regionInfo = hriEntry.getKey();
    ServerName addr = regionsToServer.get(regionInfo);
    RegionMetrics load = hriEntry.getValue();
    String readReq = "N/A";
    String writeReq = "N/A";
    String regionSize = "N/A";
    String fileCount = "N/A";
    String memSize = "N/A";
    float locality = 0.0f;
    if(load != null) {
      readReq = String.format("%,1d", load.getReadRequestCount());
      writeReq = String.format("%,1d", load.getWriteRequestCount());
      regionSize = StringUtils.byteDesc((long) load.getStoreFileSize().get(Size.Unit.BYTE));
      fileCount = String.format("%,1d", load.getStoreFileCount());
      memSize = StringUtils.byteDesc((long) load.getMemStoreSize().get(Size.Unit.BYTE));
      locality = load.getDataLocality();
    }

    if (addr != null) {
      ServerMetrics sl = master.getServerManager().getLoad(addr);
      // This port might be wrong if RS actually ended up using something else.
      urlRegionServer =
          "//" + URLEncoder.encode(addr.getHostname()) + ":" + master.getRegionServerInfoPort(addr) + "/rs-status";
      if(sl != null) {
        Integer i = regDistribution.get(addr);
        if (null == i) i = Integer.valueOf(0);
        regDistribution.put(addr, i + 1);
        if (withReplica && RegionReplicaUtil.isDefaultReplica(regionInfo.getReplicaId())) {
          i = primaryRegDistribution.get(addr);
          if (null == i) i = Integer.valueOf(0);
          primaryRegDistribution.put(addr, i+1);
        }
      }
    }
    if (numRegionsRendered < numRegionsToRender) {
      numRegionsRendered++;

      out.write("\n<tr>\n  <td>");
      out.print( escapeXml(Bytes.toStringBinary(regionInfo.getRegionName())) );
      out.write("</td>\n  ");

  if (urlRegionServer != null) {
  
      out.write("\n  <td>\n     <a href=\"");
      out.print( urlRegionServer );
      out.write('"');
      out.write('>');
      out.print( addr == null? "-": StringEscapeUtils.escapeHtml4(addr.getHostname().toString()) + ":" + master.getRegionServerInfoPort(addr) );
      out.write("</a>\n  </td>\n  ");

  } else {
  
      out.write("\n  <td class=\"undeployed-region\">not deployed</td>\n  ");

  }
  
      out.write("\n  <td>");
      out.print( readReq);
      out.write("</td>\n  <td>");
      out.print( writeReq);
      out.write("</td>\n  <td>");
      out.print( regionSize);
      out.write("</td>\n  <td>");
      out.print( fileCount);
      out.write("</td>\n  <td>");
      out.print( memSize);
      out.write("</td>\n  <td>");
      out.print( locality);
      out.write("</td>\n  <td>");
      out.print( escapeXml(Bytes.toStringBinary(regionInfo.getStartKey())));
      out.write("</td>\n  <td>");
      out.print( escapeXml(Bytes.toStringBinary(regionInfo.getEndKey())));
      out.write("</td>\n  ");

  if (withReplica) {
  
      out.write("\n  <td>");
      out.print( regionInfo.getReplicaId() );
      out.write("</td>\n  ");

  }
  
      out.write("\n</tr>\n");
 } 
      out.write('\n');
 } 
      out.write("\n</tbody>\n</table>\n");
 if (numRegions > numRegionsRendered) {
     String allRegionsUrl = "?name=" + URLEncoder.encode(fqtn,"UTF-8") + "&numRegions=all";

      out.write("\n  <p>This table has <b>");
      out.print( numRegions );
      out.write("</b> regions in total, in order to improve the page load time,\n     only <b>");
      out.print( numRegionsRendered );
      out.write("</b> regions are displayed here, <a href=\"");
      out.print( allRegionsUrl );
      out.write("\">click\n     here</a> to see all regions.</p>\n");
 } 
      out.write("\n<h2>Regions by Region Server</h2>\n");

if (withReplica) {

      out.write("\n<table id=\"regionServerTable\" class=\"tablesorter table table-striped\"><thead><tr><th>Region Server</th><th>Region Count</th><th>Primary Region Count</th></tr></thead>\n");

} else {

      out.write("\n<table id=\"regionServerTable\" class=\"tablesorter table table-striped\"><thead><tr><th>Region Server</th><th>Region Count</th></tr></thead>\n<tbody>\n");

}

      out.write('\n');

  for (Map.Entry<ServerName, Integer> rdEntry : regDistribution.entrySet()) {
     ServerName addr = rdEntry.getKey();
     String url = "//" + URLEncoder.encode(addr.getHostname()) + ":" + master.getRegionServerInfoPort(addr) + "/rs-status";

      out.write("\n<tr>\n  <td><a href=\"");
      out.print( url );
      out.write('"');
      out.write('>');
      out.print( StringEscapeUtils.escapeHtml4(addr.getHostname().toString()) + ":" + master.getRegionServerInfoPort(addr) );
      out.write("</a></td>\n  <td>");
      out.print( rdEntry.getValue());
      out.write("</td>\n");

if (withReplica) {

      out.write("\n  <td>");
      out.print( primaryRegDistribution.get(addr));
      out.write("</td>\n");

}

      out.write("\n</tr>\n");
 } 
      out.write("\n</tbody>\n</table>\n");
 }
} catch(Exception ex) {
  for(StackTraceElement element : ex.getStackTrace()) {
    
      out.print( StringEscapeUtils.escapeHtml4(element.toString()) );

  }
} finally {
  connection.close();
}
} // end else

      out.write("\n\n<h2>Table Stats</h2>\n<table class=\"table table-striped\">\n  <tr>\n    <th>Name</th>\n    <th>Value</th>\n    <th>Description</th>\n  </tr>\n  <tr>\n    <td>Size</td>\n    <td>");
      out.print( StringUtils.TraditionalBinaryPrefix.long2String(totalStoreFileSizeMB * 1024 * 1024, "B", 2));
      out.write("</td>\n    <td>Total size of store files</td>\n  </tr>\n</table>\n\n");
 if (!readOnly) { 
      out.write("\n<p><hr/></p>\nActions:\n<p>\n<center>\n<table class=\"table\" style=\"border: 0;\" width=\"95%\" >\n<tr>\n  <form method=\"get\">\n  <input type=\"hidden\" name=\"action\" value=\"compact\" />\n  <input type=\"hidden\" name=\"name\" value=\"");
      out.print( escaped_fqtn );
      out.write("\" />\n  <td class=\"centered\">\n    <input style=\"font-size: 12pt; width: 10em\" type=\"submit\" value=\"Compact\" class=\"btn\" />\n  </td>\n  <td style=\"text-align: center;\">\n    <input type=\"text\" name=\"key\" size=\"40\" placeholder=\"Row Key (optional)\" />\n  </td>\n  <td>\n    This action will force a compaction of all regions of the table, or,\n    if a key is supplied, only the region containing the\n    given key.\n  </td>\n  </form>\n</tr>\n<tr>\n  <form method=\"get\">\n  <input type=\"hidden\" name=\"action\" value=\"split\" />\n  <input type=\"hidden\" name=\"name\" value=\"");
      out.print( escaped_fqtn );
      out.write("\" />\n  <td class=\"centered\">\n    <input style=\"font-size: 12pt; width: 10em\" type=\"submit\" value=\"Split\" class=\"btn\" />\n  </td>\n  <td style=\"text-align: center;\">\n    <input type=\"text\" name=\"key\" size=\"40\" placeholder=\"Row Key (optional)\" />\n  </td>\n  <td>\n\t  This action will force a split of all eligible\n\t  regions of the table, or, if a key is supplied, only the region containing the\n\t  given key. An eligible region is one that does not contain any references to\n\t  other regions. Split requests for noneligible regions will be ignored.\n  </td>\n  </form>\n</tr>\n<tr>\n  <form method=\"get\">\n  <input type=\"hidden\" name=\"action\" value=\"merge\" />\n  <input type=\"hidden\" name=\"name\" value=\"");
      out.print( escaped_fqtn );
      out.write("\" />\n  <td class=\"centered\">\n    <input style=\"font-size: 12pt; width: 10em\" type=\"submit\" value=\"Merge\" class=\"btn\" />\n  </td>\n  <td style=\"text-align: center;\">\n    <input type=\"text\" name=\"left\" size=\"40\" placeholder=\"Region Key (required)\" />\n    <input type=\"text\" name=\"right\" size=\"40\" placeholder=\"Region Key (required)\" />\n  </td>\n  <td>\n    This action will merge two regions of the table, Merge requests for\n    noneligible regions will be ignored.\n  </td>\n  </form>\n</tr>\n</table>\n</center>\n</p>\n");
 } 
      out.write("\n</div>\n</div>\n");
 }
  } catch(TableNotFoundException e) { 
      out.write("\n  <div class=\"container-fluid content\">\n    <div class=\"row inner_header\">\n      <div class=\"page-header\">\n        <h1>Table not found</h1>\n       </div>\n    </div>\n    <p><hr><p>\n    <p>Go <a href=\"javascript:history.back()\">Back</a>\n  </div> ");

  } catch(IllegalArgumentException e) { 
      out.write("\n  <div class=\"container-fluid content\">\n    <div class=\"row inner_header\">\n      <div class=\"page-header\">\n        <h1>Table qualifier must not be empty</h1>\n      </div>\n    </div>\n    <p><hr><p>\n    <p>Go <a href=\"javascript:history.back()\">Back</a>\n  </div> ");

  }
}
  else { // handle the case for fqtn is null or master is not initialized with error message + redirect

      out.write("\n<div class=\"container-fluid content\">\n    <div class=\"row inner_header\">\n        <div class=\"page-header\">\n            <h1>Table not ready</h1>\n        </div>\n    </div>\n<p><hr><p>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "redirect.jsp", out, false);
      out.write("\n</div>\n");
 } 
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n<script src=\"/static/js/jquery.min.js\" type=\"text/javascript\"></script>\n<script src=\"/static/js/jquery.tablesorter.min.js\" type=\"text/javascript\"></script>\n<script src=\"/static/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n\n<script>\n$(document).ready(function()\n    {\n        $(\"#regionServerTable\").tablesorter();\n        $(\"#regionServerDetailsTable\").tablesorter();\n        $(\"#tableRegionTable\").tablesorter();\n    }\n);\n</script>\n");
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
