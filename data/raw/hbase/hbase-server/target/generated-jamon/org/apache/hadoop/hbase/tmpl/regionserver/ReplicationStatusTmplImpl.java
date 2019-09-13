// Autogenerated Jamon implementation
// /home/nellocarotenuto/DSML/hbase/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/regionserver/ReplicationStatusTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 23, 9
import java.util.*;
// 24, 9
import java.util.Map.Entry;
// 25, 9
import org.apache.hadoop.hbase.procedure2.util.StringUtils;
// 26, 9
import org.apache.hadoop.hbase.regionserver.HRegionServer;
// 27, 9
import org.apache.hadoop.hbase.replication.regionserver.ReplicationStatus;

public class ReplicationStatusTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.regionserver.ReplicationStatusTmpl.Intf

{
  private final HRegionServer regionServer;
  protected static org.apache.hadoop.hbase.tmpl.regionserver.ReplicationStatusTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.regionserver.ReplicationStatusTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public ReplicationStatusTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.regionserver.ReplicationStatusTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    regionServer = p_implData.getRegionServer();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 30, 1
    
        Map<String, ReplicationStatus> walGroupsReplicationStatus = regionServer.getWalGroupsReplicationStatus();

    // 34, 1
    if ((walGroupsReplicationStatus != null && walGroupsReplicationStatus.size() > 0) )
    {
      // 34, 86
      jamonWriter.write("\n\n    <div class=\"tabbable\">\n        <ul class=\"nav nav-pills\">\n            <li class=\"active\"><a href=\"#tab_currentLog\" data-toggle=\"tab\">Current Log</a> </li>\n            <li class=\"\"><a href=\"#tab_replicationDelay\" data-toggle=\"tab\">Replication Delay</a></li>\n        </ul>\n        <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\n            <div class=\"tab-pane active\" id=\"tab_currentLog\">\n                ");
      // 43, 17
      {
        // 43, 17
        __jamon_innerUnit__currentLog(jamonWriter, walGroupsReplicationStatus);
      }
      // 43, 72
      jamonWriter.write("\n            </div>\n            <div class=\"tab-pane\" id=\"tab_replicationDelay\">\n                ");
      // 46, 17
      {
        // 46, 17
        __jamon_innerUnit__replicationDelay(jamonWriter, walGroupsReplicationStatus);
      }
      // 46, 78
      jamonWriter.write("\n            </div>\n        </div>\n    </div>\n    <p> If the replication delay is UNKNOWN, that means this walGroup doesn't start replicate yet and it may get disabled.\n    If the size of log is 0, it means we are replicating current HLog, thus we can't get accurate size since it's not closed yet.</p>\n\n");
    }
    // 53, 1
    else
    {
      // 53, 8
      jamonWriter.write("\n    <p>No Replication Metrics for Peers</p>\n");
    }
    // 55, 7
    jamonWriter.write("\n\n");
  }
  
  
  // 57, 1
  private void __jamon_innerUnit__currentLog(final java.io.Writer jamonWriter, final Map<String,ReplicationStatus> metrics)
    throws java.io.IOException
  {
    // 61, 5
    jamonWriter.write("<table class=\"table table-striped\">\n        <tr>\n            <th>PeerId</th>\n            <th>WalGroup</th>\n            <th>Current Log</th>\n            <th>Size</th>\n            <th>Queue Size</th>\n            <th>Offset</th>\n        </tr>\n            ");
    // 70, 13
    for (Map.Entry<String, ReplicationStatus> entry: metrics.entrySet() )
    {
      // 70, 84
      jamonWriter.write("\n                 <tr>\n                     <td>");
      // 72, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getPeerId()), jamonWriter);
      // 72, 60
      jamonWriter.write("</td>\n                     <td>");
      // 73, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getWalGroup()), jamonWriter);
      // 73, 62
      jamonWriter.write("</td>\n                     <td>");
      // 74, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getCurrentPath()), jamonWriter);
      // 74, 65
      jamonWriter.write(" </td>\n                     <td>");
      // 75, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(StringUtils.humanSize(entry.getValue().getFileSize())), jamonWriter);
      // 75, 85
      jamonWriter.write("</td>\n                     <td>");
      // 76, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getQueueSize()), jamonWriter);
      // 76, 63
      jamonWriter.write("</td>\n                     <td>");
      // 77, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(StringUtils.humanSize(entry.getValue().getCurrentPosition())), jamonWriter);
      // 77, 92
      jamonWriter.write("</td>\n                 </tr>\n            ");
    }
    // 79, 20
    jamonWriter.write("\n    </table>\n");
  }
  
  
  // 83, 1
  private void __jamon_innerUnit__replicationDelay(final java.io.Writer jamonWriter, final Map<String,ReplicationStatus> metrics)
    throws java.io.IOException
  {
    // 87, 5
    jamonWriter.write("<table class=\"table table-striped\">\n        <tr>\n            <th>PeerId</th>\n            <th>WalGroup</th>\n            <th>Current Log</th>\n            <th>Last Shipped Age</th>\n            <th>Replication Delay</th>\n        </tr>\n            ");
    // 95, 13
    for (Map.Entry<String, ReplicationStatus> entry: metrics.entrySet() )
    {
      // 95, 84
      jamonWriter.write("\n                 <tr>\n                     <td>");
      // 97, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getPeerId()), jamonWriter);
      // 97, 60
      jamonWriter.write("</td>\n                     <td>");
      // 98, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getWalGroup()), jamonWriter);
      // 98, 62
      jamonWriter.write("</td>\n                     <td>");
      // 99, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getCurrentPath()), jamonWriter);
      // 99, 65
      jamonWriter.write(" </td>\n                     <td>");
      // 100, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(StringUtils.humanTimeDiff(entry.getValue().getAgeOfLastShippedOp())), jamonWriter);
      // 100, 99
      jamonWriter.write("</td>\n                     <td>");
      // 101, 26
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(entry.getValue().getReplicationDelay() == Long.MAX_VALUE ? "UNKNOWN" : StringUtils.humanTimeDiff(entry.getValue().getReplicationDelay())), jamonWriter);
      // 101, 168
      jamonWriter.write("</td>\n                 </tr>\n            ");
    }
    // 103, 20
    jamonWriter.write("\n    </table>\n");
  }
  
  
}
