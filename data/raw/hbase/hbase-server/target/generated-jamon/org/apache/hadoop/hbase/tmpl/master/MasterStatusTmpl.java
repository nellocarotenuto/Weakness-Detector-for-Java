// Autogenerated Jamon proxy
// /home/nellocarotenuto/DSML/hbase/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/master/MasterStatusTmpl.jamon

package org.apache.hadoop.hbase.tmpl.master;

// 32, 1
import java.util.*;
// 33, 1
import java.io.IOException;
// 34, 1
import org.apache.hadoop.hbase.client.replication.ReplicationPeerConfigUtil;
// 35, 1
import org.apache.hadoop.hbase.client.RegionInfo;
// 36, 1
import org.apache.hadoop.hbase.client.TableDescriptor;
// 37, 1
import org.apache.hadoop.hbase.replication.ReplicationPeerConfig;
// 38, 1
import org.apache.hadoop.hbase.replication.ReplicationPeerDescription;
// 39, 1
import org.apache.hadoop.hbase.HBaseConfiguration;
// 40, 1
import org.apache.hadoop.hbase.HConstants;
// 41, 1
import org.apache.hadoop.hbase.HTableDescriptor;
// 42, 1
import org.apache.hadoop.hbase.NamespaceDescriptor;
// 43, 1
import org.apache.hadoop.hbase.ServerName;
// 44, 1
import org.apache.hadoop.hbase.TableName;
// 45, 1
import org.apache.hadoop.hbase.client.Admin;
// 46, 1
import org.apache.hadoop.hbase.client.MasterSwitchType;
// 47, 1
import org.apache.hadoop.hbase.client.TableState;
// 48, 1
import org.apache.hadoop.hbase.master.assignment.AssignmentManager;
// 49, 1
import org.apache.hadoop.hbase.master.DeadServer;
// 50, 1
import org.apache.hadoop.hbase.master.HMaster;
// 51, 1
import org.apache.hadoop.hbase.master.RegionState;
// 52, 1
import org.apache.hadoop.hbase.master.ServerManager;
// 53, 1
import org.apache.hadoop.hbase.protobuf.ProtobufUtil;
// 54, 1
import org.apache.hadoop.hbase.quotas.QuotaUtil;
// 55, 1
import org.apache.hadoop.hbase.security.access.AccessControlLists;
// 56, 1
import org.apache.hadoop.hbase.security.visibility.VisibilityConstants;
// 57, 1
import org.apache.hadoop.hbase.shaded.protobuf.generated.SnapshotProtos.SnapshotDescription;
// 58, 1
import org.apache.hadoop.hbase.tool.Canary;
// 59, 1
import org.apache.hadoop.hbase.util.Bytes;
// 60, 1
import org.apache.hadoop.hbase.util.FSUtils;
// 61, 1
import org.apache.hadoop.hbase.util.JvmVersion;
// 62, 1
import org.apache.hadoop.util.StringUtils;

@org.jamon.annotations.Template(
  signature = "767EF6CBA3457ABF31A306ADBA3A7715",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "master", type = "HMaster")},
  optionalArguments = {
    @org.jamon.annotations.Argument(name = "assignmentManager", type = "AssignmentManager"),
    @org.jamon.annotations.Argument(name = "catalogJanitorEnabled", type = "boolean"),
    @org.jamon.annotations.Argument(name = "deadServers", type = "Set<ServerName>"),
    @org.jamon.annotations.Argument(name = "filter", type = "String"),
    @org.jamon.annotations.Argument(name = "format", type = "String"),
    @org.jamon.annotations.Argument(name = "frags", type = "Map<String,Integer>"),
    @org.jamon.annotations.Argument(name = "metaLocation", type = "ServerName"),
    @org.jamon.annotations.Argument(name = "serverManager", type = "ServerManager"),
    @org.jamon.annotations.Argument(name = "servers", type = "List<ServerName>")})
public class MasterStatusTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public MasterStatusTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  protected MasterStatusTmpl(String p_path)
  {
    super(p_path);
  }
  
  public MasterStatusTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/master/MasterStatusTmpl");
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
    public void setMaster(HMaster master)
    {
      // 20, 1
      m_master = master;
    }
    public HMaster getMaster()
    {
      return m_master;
    }
    private HMaster m_master;
    // 29, 1
    public void setAssignmentManager(AssignmentManager assignmentManager)
    {
      // 29, 1
      m_assignmentManager = assignmentManager;
      m_assignmentManager__IsNotDefault = true;
    }
    public AssignmentManager getAssignmentManager()
    {
      return m_assignmentManager;
    }
    private AssignmentManager m_assignmentManager;
    public boolean getAssignmentManager__IsNotDefault()
    {
      return m_assignmentManager__IsNotDefault;
    }
    private boolean m_assignmentManager__IsNotDefault;
    // 25, 1
    public void setCatalogJanitorEnabled(boolean catalogJanitorEnabled)
    {
      // 25, 1
      m_catalogJanitorEnabled = catalogJanitorEnabled;
      m_catalogJanitorEnabled__IsNotDefault = true;
    }
    public boolean getCatalogJanitorEnabled()
    {
      return m_catalogJanitorEnabled;
    }
    private boolean m_catalogJanitorEnabled;
    public boolean getCatalogJanitorEnabled__IsNotDefault()
    {
      return m_catalogJanitorEnabled__IsNotDefault;
    }
    private boolean m_catalogJanitorEnabled__IsNotDefault;
    // 24, 1
    public void setDeadServers(Set<ServerName> deadServers)
    {
      // 24, 1
      m_deadServers = deadServers;
      m_deadServers__IsNotDefault = true;
    }
    public Set<ServerName> getDeadServers()
    {
      return m_deadServers;
    }
    private Set<ServerName> m_deadServers;
    public boolean getDeadServers__IsNotDefault()
    {
      return m_deadServers__IsNotDefault;
    }
    private boolean m_deadServers__IsNotDefault;
    // 26, 1
    public void setFilter(String filter)
    {
      // 26, 1
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
    // 27, 1
    public void setFormat(String format)
    {
      // 27, 1
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
    // 21, 1
    public void setFrags(Map<String,Integer> frags)
    {
      // 21, 1
      m_frags = frags;
      m_frags__IsNotDefault = true;
    }
    public Map<String,Integer> getFrags()
    {
      return m_frags;
    }
    private Map<String,Integer> m_frags;
    public boolean getFrags__IsNotDefault()
    {
      return m_frags__IsNotDefault;
    }
    private boolean m_frags__IsNotDefault;
    // 22, 1
    public void setMetaLocation(ServerName metaLocation)
    {
      // 22, 1
      m_metaLocation = metaLocation;
      m_metaLocation__IsNotDefault = true;
    }
    public ServerName getMetaLocation()
    {
      return m_metaLocation;
    }
    private ServerName m_metaLocation;
    public boolean getMetaLocation__IsNotDefault()
    {
      return m_metaLocation__IsNotDefault;
    }
    private boolean m_metaLocation__IsNotDefault;
    // 28, 1
    public void setServerManager(ServerManager serverManager)
    {
      // 28, 1
      m_serverManager = serverManager;
      m_serverManager__IsNotDefault = true;
    }
    public ServerManager getServerManager()
    {
      return m_serverManager;
    }
    private ServerManager m_serverManager;
    public boolean getServerManager__IsNotDefault()
    {
      return m_serverManager__IsNotDefault;
    }
    private boolean m_serverManager__IsNotDefault;
    // 23, 1
    public void setServers(List<ServerName> servers)
    {
      // 23, 1
      m_servers = servers;
      m_servers__IsNotDefault = true;
    }
    public List<ServerName> getServers()
    {
      return m_servers;
    }
    private List<ServerName> m_servers;
    public boolean getServers__IsNotDefault()
    {
      return m_servers__IsNotDefault;
    }
    private boolean m_servers__IsNotDefault;
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
  
  protected AssignmentManager assignmentManager;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setAssignmentManager(AssignmentManager p_assignmentManager)
  {
    (getImplData()).setAssignmentManager(p_assignmentManager);
    return this;
  }
  
  protected boolean catalogJanitorEnabled;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setCatalogJanitorEnabled(boolean p_catalogJanitorEnabled)
  {
    (getImplData()).setCatalogJanitorEnabled(p_catalogJanitorEnabled);
    return this;
  }
  
  protected Set<ServerName> deadServers;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setDeadServers(Set<ServerName> p_deadServers)
  {
    (getImplData()).setDeadServers(p_deadServers);
    return this;
  }
  
  protected String filter;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setFilter(String p_filter)
  {
    (getImplData()).setFilter(p_filter);
    return this;
  }
  
  protected String format;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setFormat(String p_format)
  {
    (getImplData()).setFormat(p_format);
    return this;
  }
  
  protected Map<String,Integer> frags;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setFrags(Map<String,Integer> p_frags)
  {
    (getImplData()).setFrags(p_frags);
    return this;
  }
  
  protected ServerName metaLocation;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setMetaLocation(ServerName p_metaLocation)
  {
    (getImplData()).setMetaLocation(p_metaLocation);
    return this;
  }
  
  protected ServerManager serverManager;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setServerManager(ServerManager p_serverManager)
  {
    (getImplData()).setServerManager(p_serverManager);
    return this;
  }
  
  protected List<ServerName> servers;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setServers(List<ServerName> p_servers)
  {
    (getImplData()).setServers(p_servers);
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
    return new MasterStatusTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HMaster master)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, master);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HMaster master)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, master);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HMaster master)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setMaster(master);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
