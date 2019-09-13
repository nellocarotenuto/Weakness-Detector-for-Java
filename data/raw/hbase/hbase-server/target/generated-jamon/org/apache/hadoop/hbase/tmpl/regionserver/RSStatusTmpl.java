// Autogenerated Jamon proxy
// /home/nellocarotenuto/DSML/hbase/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/regionserver/RSStatusTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 27, 1
import java.util.*;
// 28, 1
import org.apache.hadoop.hbase.regionserver.HRegionServer;
// 29, 1
import org.apache.hadoop.hbase.client.RegionInfo;
// 30, 1
import org.apache.hadoop.hbase.ServerName;
// 31, 1
import org.apache.hadoop.hbase.HBaseConfiguration;
// 32, 1
import org.apache.hadoop.hbase.shaded.protobuf.ProtobufUtil;
// 33, 1
import org.apache.hadoop.hbase.shaded.protobuf.generated.AdminProtos.ServerInfo;
// 34, 1
import org.apache.hadoop.hbase.zookeeper.MasterAddressTracker;

@org.jamon.annotations.Template(
  signature = "223F582EC45E4EC7316F767108E87B08",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "regionServer", type = "HRegionServer")},
  optionalArguments = {
    @org.jamon.annotations.Argument(name = "bcn", type = "String"),
    @org.jamon.annotations.Argument(name = "bcv", type = "String"),
    @org.jamon.annotations.Argument(name = "filter", type = "String"),
    @org.jamon.annotations.Argument(name = "format", type = "String")})
public class RSStatusTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public RSStatusTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  protected RSStatusTmpl(String p_path)
  {
    super(p_path);
  }
  
  public RSStatusTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/regionserver/RSStatusTmpl");
  }
  
  public interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf
  {
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 20, 1
    public void setRegionServer(HRegionServer regionServer)
    {
      // 20, 1
      m_regionServer = regionServer;
    }
    public HRegionServer getRegionServer()
    {
      return m_regionServer;
    }
    private HRegionServer m_regionServer;
    // 23, 1
    public void setBcn(String bcn)
    {
      // 23, 1
      m_bcn = bcn;
      m_bcn__IsNotDefault = true;
    }
    public String getBcn()
    {
      return m_bcn;
    }
    private String m_bcn;
    public boolean getBcn__IsNotDefault()
    {
      return m_bcn__IsNotDefault;
    }
    private boolean m_bcn__IsNotDefault;
    // 24, 1
    public void setBcv(String bcv)
    {
      // 24, 1
      m_bcv = bcv;
      m_bcv__IsNotDefault = true;
    }
    public String getBcv()
    {
      return m_bcv;
    }
    private String m_bcv;
    public boolean getBcv__IsNotDefault()
    {
      return m_bcv__IsNotDefault;
    }
    private boolean m_bcv__IsNotDefault;
    // 21, 1
    public void setFilter(String filter)
    {
      // 21, 1
      m_filter = filter;
      m_filter__IsNotDefault = true;
    }
    public String getFilter()
    {
      return m_filter;
    }
    private String m_filter;
    public boolean getFilter__IsNotDefault()
    {
      return m_filter__IsNotDefault;
    }
    private boolean m_filter__IsNotDefault;
    // 22, 1
    public void setFormat(String format)
    {
      // 22, 1
      m_format = format;
      m_format__IsNotDefault = true;
    }
    public String getFormat()
    {
      return m_format;
    }
    private String m_format;
    public boolean getFormat__IsNotDefault()
    {
      return m_format__IsNotDefault;
    }
    private boolean m_format__IsNotDefault;
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
  
  protected String bcn;
  public final org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl setBcn(String p_bcn)
  {
    (getImplData()).setBcn(p_bcn);
    return this;
  }
  
  protected String bcv;
  public final org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl setBcv(String p_bcv)
  {
    (getImplData()).setBcv(p_bcv);
    return this;
  }
  
  protected String filter;
  public final org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl setFilter(String p_filter)
  {
    (getImplData()).setFilter(p_filter);
    return this;
  }
  
  protected String format;
  public final org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl setFormat(String p_format)
  {
    (getImplData()).setFormat(p_format);
    return this;
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
    return new RSStatusTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HRegionServer regionServer)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, regionServer);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HRegionServer regionServer)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, regionServer);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HRegionServer regionServer)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setRegionServer(regionServer);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}