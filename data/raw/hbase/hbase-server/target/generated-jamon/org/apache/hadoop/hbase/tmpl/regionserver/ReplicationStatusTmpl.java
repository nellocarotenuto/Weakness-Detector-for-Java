// Autogenerated Jamon proxy
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

@org.jamon.annotations.Template(
  signature = "AA783364EF0882BC85BF660ED7A05252",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "regionServer", type = "HRegionServer")})
public class ReplicationStatusTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public ReplicationStatusTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  protected ReplicationStatusTmpl(String p_path)
  {
    super(p_path);
  }
  
  public ReplicationStatusTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/regionserver/ReplicationStatusTmpl");
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
    return new ReplicationStatusTmplImpl(getTemplateManager(), getImplData());
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
