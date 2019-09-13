// Autogenerated Jamon implementation
// /home/nellocarotenuto/DSML/hbase/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/regionserver/BlockCacheViewTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 28, 1
import java.util.*;
// 29, 1
import org.apache.hadoop.conf.Configuration;
// 30, 1
import org.apache.hadoop.hbase.io.hfile.BlockCacheUtil.CachedBlocksByFile;
// 31, 1
import org.apache.hadoop.hbase.io.hfile.BlockCacheUtil;
// 32, 1
import org.apache.hadoop.hbase.io.hfile.CachedBlock;
// 33, 1
import org.apache.hadoop.hbase.io.hfile.CacheConfig;
// 34, 1
import org.apache.hadoop.hbase.io.hfile.BlockCache;
// 35, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCacheStats;
// 36, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCache;
// 37, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator;
// 38, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator.Bucket;
// 39, 1
import org.apache.hadoop.util.StringUtils;

public class BlockCacheViewTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.Intf

{
  private final CacheConfig cacheConfig;
  private final Configuration conf;
  private final String bcn;
  private final String bcv;
  protected static org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public BlockCacheViewTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    cacheConfig = p_implData.getCacheConfig();
    conf = p_implData.getConf();
    bcn = p_implData.getBcn();
    bcv = p_implData.getBcv();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 41, 1
    
  BlockCache bc = cacheConfig == null ? null : cacheConfig.getBlockCache();
  BlockCache [] bcs = bc == null ? null : bc.getBlockCaches();
  if (bcn.equals("L1")) {
    bc = bcs == null || bcs.length == 0? bc: bcs[0];
  } else {
    if (bcs == null || bcs.length < 2) {
      System.out.println("There is no L2 block cache");
      return;
    }
    bc = bcs[1];
  }
  if (bc == null) {
    System.out.println("There is no block cache");
    return;
  }
  CachedBlocksByFile cbsbf = BlockCacheUtil.getLoadedCachedBlocksByFile(conf, bc);

    // 59, 1
    if (bcv.equals("file") )
    {
      // 59, 27
      {
        // 59, 27
        __jamon_innerUnit__bc_by_file(jamonWriter, cbsbf);
      }
    }
    // 59, 59
    else
    {
      // 59, 66
      jamonWriter.write("[ ");
      // 59, 68
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(BlockCacheUtil.toJSON(bc)), jamonWriter);
      // 59, 99
      jamonWriter.write(", ");
      // 59, 101
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(BlockCacheUtil.toJSON(cbsbf)), jamonWriter);
      // 59, 135
      jamonWriter.write(" ]");
    }
    // 59, 143
    jamonWriter.write("\n");
    // 60, 1
    
cbsbf = null;

  }
  
  
  // 64, 1
  private void __jamon_innerUnit__bc_by_file(final java.io.Writer jamonWriter, final CachedBlocksByFile cbsbf)
    throws java.io.IOException
  {
    // 68, 1
    jamonWriter.write("[");
    // 68, 2
    for (Map.Entry<String, NavigableSet<CachedBlock>> e: cbsbf.getCachedBlockStatsByFile().entrySet() )
    {
      // 68, 103
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(BlockCacheUtil.toJSON(e.getKey(), e.getValue())), jamonWriter);
    }
    // 68, 163
    jamonWriter.write("]\n");
  }
  
  
}
