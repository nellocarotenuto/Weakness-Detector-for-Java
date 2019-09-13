// Autogenerated Jamon proxy
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

@org.jamon.annotations.Template(
  signature = "7C408A6F85F95860CF3B07902F77D50D",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "regionServer", type = "HRegionServer"),
    @org.jamon.annotations.Argument(name = "onlineRegions", type = "List<RegionInfo>")})
public class RegionListTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public RegionListTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  protected RegionListTmpl(String p_path)
  {
    super(p_path);
  }
  
  public RegionListTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/regionserver/RegionListTmpl");
  }
  
  public interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf
  {
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 20, 9
    public void setRegionServer(HRegionServer regionServer)
    {
      // 20, 9
      m_regionServer = regionServer;
    }
    public HRegionServer getRegionServer()
    {
      return m_regionServer;
    }
    private HRegionServer m_regionServer;
    // 21, 9
    public void setOnlineRegions(List<RegionInfo> onlineRegions)
    {
      // 21, 9
      m_onlineRegions = onlineRegions;
    }
    public List<RegionInfo> getOnlineRegions()
    {
      return m_onlineRegions;
    }
    private List<RegionInfo> m_onlineRegions;
  }
  @Override
  protected org.jamon.AbstractTemplateProxy.ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new RegionListTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HRegionServer regionServer, final List<RegionInfo> onlineRegions)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, regionServer, onlineRegions);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HRegionServer regionServer, final List<RegionInfo> onlineRegions)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, regionServer, onlineRegions);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HRegionServer regionServer, final List<RegionInfo> onlineRegions)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setRegionServer(regionServer);
    implData.setOnlineRegions(onlineRegions);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
