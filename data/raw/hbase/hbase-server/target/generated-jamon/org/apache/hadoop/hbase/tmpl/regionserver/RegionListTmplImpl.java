// Autogenerated Jamon implementation
// /home/nellocarotenuto/DSML/hbase/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/regionserver/RegionListTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 24, 9
import java.util.*;
// 25, 9
import org.apache.commons.lang3.time.FastDateFormat;
// 26, 9
import org.apache.hadoop.hbase.regionserver.HRegionServer;
// 27, 9
import org.apache.hadoop.hbase.util.Bytes;
// 28, 9
import org.apache.hadoop.hbase.client.RegionInfo;
// 29, 9
import org.apache.hadoop.hbase.client.RegionInfoDisplay;
// 30, 9
import org.apache.hadoop.hbase.regionserver.Region;
// 31, 9
import org.apache.hadoop.hbase.ServerName;
// 32, 9
import org.apache.hadoop.hbase.HBaseConfiguration;
// 33, 9
import org.apache.hadoop.hbase.shaded.protobuf.ProtobufUtil;
// 34, 9
import org.apache.hadoop.hbase.shaded.protobuf.generated.AdminProtos.ServerInfo;
// 35, 9
import org.apache.hadoop.hbase.shaded.protobuf.generated.ClusterStatusProtos.RegionLoad;
// 36, 9
import org.apache.hadoop.hbase.client.RegionReplicaUtil;
// 37, 9
import org.apache.hadoop.hbase.regionserver.MetricsRegionWrapper;
// 38, 9
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;

public class RegionListTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.regionserver.RegionListTmpl.Intf

{
  private final HRegionServer regionServer;
  private final List<RegionInfo> onlineRegions;
  protected static org.apache.hadoop.hbase.tmpl.regionserver.RegionListTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.regionserver.RegionListTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public RegionListTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.regionserver.RegionListTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    regionServer = p_implData.getRegionServer();
    onlineRegions = p_implData.getOnlineRegions();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 40, 1
    if ((onlineRegions != null && onlineRegions.size() > 0) )
    {
      // 40, 60
      jamonWriter.write("\n\n    ");
      // 42, 5
      
        Collections.sort(onlineRegions, RegionInfo.COMPARATOR);
    
      // 46, 5
      jamonWriter.write("<div class=\"tabbable\">\n        <ul class=\"nav nav-pills\">\n            <li class=\"active\"><a href=\"#tab_regionBaseInfo\" data-toggle=\"tab\">Base Info</a> </li>\n            <li><a href=\"#tab_regionRequestStats\" data-toggle=\"tab\">Request metrics</a></li>\n            <li class=\"\"><a href=\"#tab_regionStoreStats\" data-toggle=\"tab\">Storefile Metrics</a></li>\n            <li class=\"\"><a href=\"#tab_regionMemstoreStats\" data-toggle=\"tab\">Memstore Metrics</a></li>\n            <li class=\"\"><a href=\"#tab_regionCompactStats\" data-toggle=\"tab\">Compaction Metrics</a></li>\n        </ul>\n        <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\n            <div class=\"tab-pane active\" id=\"tab_regionBaseInfo\">\n                ");
      // 56, 17
      {
        // 56, 17
        __jamon_innerUnit__baseInfo(jamonWriter, onlineRegions);
      }
      // 56, 63
      jamonWriter.write("\n            </div>\n            <div class=\"tab-pane\" id=\"tab_regionRequestStats\">\n                ");
      // 59, 17
      {
        // 59, 17
        __jamon_innerUnit__requestStats(jamonWriter, onlineRegions);
      }
      // 59, 67
      jamonWriter.write("\n            </div>\n            <div class=\"tab-pane\" id=\"tab_regionStoreStats\">\n                ");
      // 62, 17
      {
        // 62, 17
        __jamon_innerUnit__storeStats(jamonWriter, onlineRegions);
      }
      // 62, 65
      jamonWriter.write("\n            </div>\n            <div class=\"tab-pane\" id=\"tab_regionMemstoreStats\">\n                ");
      // 65, 17
      {
        // 65, 17
        __jamon_innerUnit__memstoreStats(jamonWriter, onlineRegions);
      }
      // 65, 68
      jamonWriter.write("\n            </div>\n            <div class=\"tab-pane\" id=\"tab_regionCompactStats\">\n                ");
      // 68, 17
      {
        // 68, 17
        __jamon_innerUnit__compactStats(jamonWriter, onlineRegions);
      }
      // 68, 67
      jamonWriter.write("\n            </div>\n        </div>\n    </div>\n    <p>Region names are made of the containing table's name, a comma,\n    the start key, a comma, and a randomly generated region id.  To illustrate,\n    the region named\n    <em>domains,apache.org,5464829424211263407</em> is party to the table\n    <em>domains</em>, has an id of <em>5464829424211263407</em> and the first key\n    in the region is <em>apache.org</em>.  The <em>hbase:meta</em> 'table' is an internal\n    system table (or a 'catalog' table in db-speak).\n    The hbase:meta table keeps a list of all regions in the system. The empty key is used to denote\n    table start and table end.  A region with an empty start key is the first region in a table.\n    If a region has both an empty start key and an empty end key, it's the only region in the\n    table. See <a href=\"http://hbase.apache.org\">HBase Home</a> for further explication.<p>\n");
    }
    // 83, 1
    else
    {
      // 83, 8
      jamonWriter.write("\n    <p>Not serving regions</p>\n");
    }
    // 85, 7
    jamonWriter.write("\n\n");
  }
  
  
  // 87, 1
  private void __jamon_innerUnit__baseInfo(final java.io.Writer jamonWriter, final List<RegionInfo> onlineRegions)
    throws java.io.IOException
  {
    // 91, 5
    jamonWriter.write("<table id=\"baseStatsTable\" class=\"tablesorter table table-striped\">\n    <thead>\n        <tr>\n            <th>Region Name</th>\n            <th>Start Key</th>\n            <th>End Key</th>\n            <th>ReplicaID</th>\n        </tr>\n    </thead>\n\n    <tbody>\n        ");
    // 102, 9
    for (RegionInfo r: onlineRegions )
    {
      // 102, 45
      jamonWriter.write("\n        <tr>\n            ");
      // 104, 13
      
             String displayName = RegionInfoDisplay.getRegionNameAsStringForDisplay(r,
               regionServer.getConfiguration());
            
      // 108, 13
      jamonWriter.write("<td><a href=\"region.jsp?name=");
      // 108, 42
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(r.getEncodedName()), jamonWriter);
      // 108, 66
      jamonWriter.write("\">");
      // 108, 68
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(displayName), jamonWriter);
      // 108, 85
      jamonWriter.write("</a></td>\n            <td>");
      // 109, 17
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(Bytes.toStringBinary(RegionInfoDisplay.getStartKeyForDisplay(r,
                                        regionServer.getConfiguration()))), jamonWriter);
      // 110, 77
      jamonWriter.write("</td>\n            <td>");
      // 111, 17
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(Bytes.toStringBinary(RegionInfoDisplay.getEndKeyForDisplay(r,
                                        regionServer.getConfiguration()))), jamonWriter);
      // 112, 77
      jamonWriter.write("</td>\n            <td>");
      // 113, 17
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(r.getReplicaId()), jamonWriter);
      // 113, 39
      jamonWriter.write("</td>\n        </tr>\n        ");
    }
    // 115, 16
    jamonWriter.write("\n    </tbody>\n    </table>\n");
  }
  
  
  // 204, 1
  private void __jamon_innerUnit__compactStats(final java.io.Writer jamonWriter, final List<RegionInfo> onlineRegions)
    throws java.io.IOException
  {
    // 208, 5
    jamonWriter.write("<table id=\"compactionStatsTable\" class=\"tablesorter table table-striped\">\n    <thead>\n        <tr>\n            <th>Region Name</th>\n            <th>Num. Compacting Cells</th>\n            <th>Num. Compacted Cells</th>\n            <th>Compaction Progress</th>\n            <th data-date-format=\"yyyymmdd hhmm zz\">Last Major Compaction</th>\n        </tr>\n    </thead>\n\n    <tbody>\n        ");
    // 220, 9
    for (RegionInfo r: onlineRegions )
    {
      // 220, 45
      jamonWriter.write("\n\n        <tr>\n        ");
      // 223, 9
      
            RegionLoad load = regionServer.createRegionLoad(r.getEncodedName());
            String percentDone = "";
            String compactTime = "";
            if  (load != null) {
              if (load.getTotalCompactingKVs() > 0) {
                percentDone = String.format("%.2f", 100 *
                    ((float) load.getCurrentCompactedKVs() / load.getTotalCompactingKVs())) + "%";
              }
              if (load.getLastMajorCompactionTs() > 0) {
                FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm (ZZ)");
                compactTime = fdf.format(load.getLastMajorCompactionTs());
              }
            }
            String displayName = RegionInfoDisplay.getRegionNameAsStringForDisplay(r,
              regionServer.getConfiguration());
        
      // 240, 13
      jamonWriter.write("<td><a href=\"region.jsp?name=");
      // 240, 42
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(r.getEncodedName()), jamonWriter);
      // 240, 66
      jamonWriter.write("\">");
      // 240, 68
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(displayName), jamonWriter);
      // 240, 85
      jamonWriter.write("</a></td>\n            ");
      // 241, 13
      if (load != null )
      {
        // 241, 33
        jamonWriter.write("\n            <td>");
        // 242, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getTotalCompactingKVs()), jamonWriter);
        // 242, 51
        jamonWriter.write("</td>\n            <td>");
        // 243, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getCurrentCompactedKVs()), jamonWriter);
        // 243, 52
        jamonWriter.write("</td>\n            <td>");
        // 244, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(percentDone), jamonWriter);
        // 244, 34
        jamonWriter.write("</td>\n            <td>");
        // 245, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(compactTime), jamonWriter);
        // 245, 34
        jamonWriter.write("</td>\n            ");
      }
      // 246, 19
      jamonWriter.write("\n        </tr>\n        ");
    }
    // 248, 16
    jamonWriter.write("\n    </tbody>\n    </table>\n");
  }
  
  
  // 253, 1
  private void __jamon_innerUnit__memstoreStats(final java.io.Writer jamonWriter, final List<RegionInfo> onlineRegions)
    throws java.io.IOException
  {
    // 257, 5
    jamonWriter.write("<table id=\"memstoreStatsTable\" class=\"tablesorter table table-striped\">\n    <thead>\n        <tr>\n            <th>Region Name</th>\n            <th>Memstore Size</th>\n        </tr>\n    </thead>\n\n    <tbody>\n        ");
    // 266, 9
    for (RegionInfo r: onlineRegions )
    {
      // 266, 45
      jamonWriter.write("\n\n        <tr>\n        ");
      // 269, 9
      
            RegionLoad load = regionServer.createRegionLoad(r.getEncodedName());
            String displayName = RegionInfoDisplay.getRegionNameAsStringForDisplay(r,
              regionServer.getConfiguration());
        
      // 274, 13
      jamonWriter.write("<td><a href=\"region.jsp?name=");
      // 274, 42
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(r.getEncodedName()), jamonWriter);
      // 274, 66
      jamonWriter.write("\">");
      // 274, 68
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(displayName), jamonWriter);
      // 274, 85
      jamonWriter.write("</a></td>\n            ");
      // 275, 13
      if (load != null )
      {
        // 275, 33
        jamonWriter.write("\n            <td>");
        // 276, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(
                load.getMemStoreSizeMB() * TraditionalBinaryPrefix.MEGA.value, "B", 1)), jamonWriter);
        // 277, 90
        jamonWriter.write("</td>\n            ");
      }
      // 278, 19
      jamonWriter.write("\n        </tr>\n        ");
    }
    // 280, 16
    jamonWriter.write("\n    </tbody>\n    </table>\n");
  }
  
  
  // 120, 1
  private void __jamon_innerUnit__requestStats(final java.io.Writer jamonWriter, final List<RegionInfo> onlineRegions)
    throws java.io.IOException
  {
    // 124, 5
    jamonWriter.write("<table id=\"requestStatsTable\" class=\"tablesorter table table-striped\">\n    <thead>\n        <tr>\n            <th>Region Name</th>\n            <th>Read Request Count</th>\n            <th>Filtered Read Request Count</th>\n            <th>Write Request Count</th>\n        </tr>\n    </thead>\n\n    <tbody>\n        ");
    // 135, 9
    for (RegionInfo r: onlineRegions )
    {
      // 135, 45
      jamonWriter.write("\n\n        <tr>\n        ");
      // 138, 9
      
            RegionLoad load = regionServer.createRegionLoad(r.getEncodedName());
            String displayName = RegionInfoDisplay.getRegionNameAsStringForDisplay(r,
              regionServer.getConfiguration());
        
      // 143, 13
      jamonWriter.write("<td><a href=\"region.jsp?name=");
      // 143, 42
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(r.getEncodedName()), jamonWriter);
      // 143, 66
      jamonWriter.write("\">");
      // 143, 68
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(displayName), jamonWriter);
      // 143, 85
      jamonWriter.write("</a></td>\n            ");
      // 144, 13
      if (load != null )
      {
        // 144, 33
        jamonWriter.write("\n            <td>");
        // 145, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getReadRequestsCount()), jamonWriter);
        // 145, 50
        jamonWriter.write("</td>\n            <td>");
        // 146, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getFilteredReadRequestsCount()), jamonWriter);
        // 146, 58
        jamonWriter.write("</td>\n            <td>");
        // 147, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getWriteRequestsCount()), jamonWriter);
        // 147, 51
        jamonWriter.write("</td>\n            ");
      }
      // 148, 19
      jamonWriter.write("\n        </tr>\n        ");
    }
    // 150, 16
    jamonWriter.write("\n    </tbody>\n    </table>\n");
  }
  
  
  // 156, 1
  private void __jamon_innerUnit__storeStats(final java.io.Writer jamonWriter, final List<RegionInfo> onlineRegions)
    throws java.io.IOException
  {
    // 160, 5
    jamonWriter.write("<table id=\"storeStatsTable\" class=\"tablesorter table table-striped\">\n    <thead>\n        <tr>\n            <th>Region Name</th>\n            <th>Num. Stores</th>\n            <th>Num. Storefiles</th>\n            <th>Storefile Size Uncompressed</th>\n            <th>Storefile Size</th>\n            <th>Index Size</th>\n            <th>Bloom Size</th>\n            <th>Data Locality</th>\n        </tr>\n    </thead>\n\n    <tbody>\n        ");
    // 175, 9
    for (RegionInfo r: onlineRegions )
    {
      // 175, 45
      jamonWriter.write("\n\n        <tr>\n        ");
      // 178, 9
      
            RegionLoad load = regionServer.createRegionLoad(r.getEncodedName());
            String displayName = RegionInfoDisplay.getRegionNameAsStringForDisplay(r,
              regionServer.getConfiguration());
        
      // 183, 13
      jamonWriter.write("<td><a href=\"region.jsp?name=");
      // 183, 42
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(r.getEncodedName()), jamonWriter);
      // 183, 66
      jamonWriter.write("\">");
      // 183, 68
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(displayName), jamonWriter);
      // 183, 85
      jamonWriter.write("</a></td>\n            ");
      // 184, 13
      if (load != null )
      {
        // 184, 33
        jamonWriter.write("\n            <td>");
        // 185, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getStores()), jamonWriter);
        // 185, 39
        jamonWriter.write("</td>\n            <td>");
        // 186, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getStorefiles()), jamonWriter);
        // 186, 43
        jamonWriter.write("</td>\n            <td>");
        // 187, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(load.getStoreUncompressedSizeMB()
                * TraditionalBinaryPrefix.MEGA.value, "B", 1)), jamonWriter);
        // 188, 64
        jamonWriter.write("</td>\n            <td>");
        // 189, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(load.getStorefileSizeMB()
                * TraditionalBinaryPrefix.MEGA.value, "B", 1)), jamonWriter);
        // 190, 65
        jamonWriter.write("</td>\n            <td>");
        // 191, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(load.getTotalStaticIndexSizeKB()
                * TraditionalBinaryPrefix.KILO.value, "B", 1)), jamonWriter);
        // 192, 65
        jamonWriter.write("</td>\n            <td>");
        // 193, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(load.getTotalStaticBloomSizeKB()
                * TraditionalBinaryPrefix.KILO.value, "B", 1)), jamonWriter);
        // 194, 65
        jamonWriter.write("</td>\n            <td>");
        // 195, 17
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(load.getDataLocality()), jamonWriter);
        // 195, 45
        jamonWriter.write("</td>\n            ");
      }
      // 196, 19
      jamonWriter.write("\n        </tr>\n        ");
    }
    // 198, 16
    jamonWriter.write("\n    </tbody>\n    </table>\n");
  }
  
  
}
