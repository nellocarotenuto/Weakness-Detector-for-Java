/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-09-12 07:41:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.core.spring.ApplicationContextProvider;
import org.apache.commons.lang3.time.FastDateFormat;
import java.util.Date;
import org.apache.openjpa.datacache.CacheStatisticsImpl;
import javax.persistence.EntityManagerFactory;
import org.apache.openjpa.persistence.OpenJPAPersistence;
import org.apache.openjpa.persistence.OpenJPAEntityManagerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.apache.openjpa.datacache.QueryKey;
import org.apache.openjpa.kernel.QueryStatistics;
import org.apache.openjpa.persistence.QueryResultCacheImpl;

public final class cacheStats_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1568273990000L));
    _jspx_dependants.put("jar:file:/home/nellocarotenuto/DSML/syncope/fit/core-reference/target/cargo/configurations/tomcat9x/webapps/syncope/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("jar:file:/home/nellocarotenuto/DSML/syncope/fit/core-reference/target/cargo/configurations/tomcat9x/webapps/syncope/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.syncope.common.lib.SyncopeConstants");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("org.apache.openjpa.persistence.OpenJPAPersistence");
    _jspx_imports_classes.add("org.apache.openjpa.persistence.OpenJPAEntityManagerFactory");
    _jspx_imports_classes.add("org.apache.commons.lang3.time.FastDateFormat");
    _jspx_imports_classes.add("org.apache.openjpa.kernel.QueryStatistics");
    _jspx_imports_classes.add("org.apache.openjpa.datacache.CacheStatisticsImpl");
    _jspx_imports_classes.add("javax.persistence.EntityManagerFactory");
    _jspx_imports_classes.add("org.springframework.context.ConfigurableApplicationContext");
    _jspx_imports_classes.add("org.apache.openjpa.persistence.QueryResultCacheImpl");
    _jspx_imports_classes.add("org.springframework.beans.factory.support.DefaultListableBeanFactory");
    _jspx_imports_classes.add("org.apache.syncope.core.spring.ApplicationContextProvider");
    _jspx_imports_classes.add("org.apache.openjpa.datacache.QueryKey");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Cache Statistics</title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      .c{\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      .r{\n");
      out.write("        text-align: right;\n");
      out.write("      }\n");
      out.write("      .l{\n");
      out.write("        text-align: left;\n");
      out.write("      }\n");
      out.write("      .t{\n");
      out.write("        vertical-align: top;\n");
      out.write("      }\n");
      out.write("      .b{\n");
      out.write("        vertical-align: bottom;\n");
      out.write("      }\n");
      out.write("      .odd{\n");
      out.write("        background-color: #D4D4D4;\n");
      out.write("      }\n");
      out.write("      .even{\n");
      out.write("        background-color: #EEEEEE;\n");
      out.write("      }\n");
      out.write("      .bd1{\n");
      out.write("        border: solid #888888 1px;\n");
      out.write("      }\n");
      out.write("      .bg1{\n");
      out.write("        background-color: #CCCCCC;\n");
      out.write("      }\n");
      out.write("      .bg2{\n");
      out.write("        background-color: #DDDDDD;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <p/>\n");
      out.write("    ");

        DefaultListableBeanFactory beanFactory = ApplicationContextProvider.getBeanFactory();

        EntityManagerFactory emf = beanFactory.getBean("MasterEntityManagerFactory", EntityManagerFactory.class);
        OpenJPAEntityManagerFactory oemf = OpenJPAPersistence.cast(emf);

        QueryStatistics<QueryKey> queryStatistics =
                ((QueryResultCacheImpl) oemf.getQueryResultCache()).getDelegate().getStatistics();

        CacheStatisticsImpl statistics = (CacheStatisticsImpl) oemf.getStoreCache().getStatistics();

        String action = request.getParameter("do");
        StringBuilder info = new StringBuilder(512);

        if ("activate".equals(action) && !statistics.isEnabled()) {
            statistics.enable();
            info.append("Statistics enabled\n");
        } else if ("deactivate".equals(action) && !statistics.isEnabled()) {
            statistics.disable();
            info.append("Statistics disabled\n");
        } else if ("clear".equals(action)) {
            queryStatistics.reset();
            statistics.reset();
            info.append("Statistics cleared\n");
        }

        FastDateFormat sdf = FastDateFormat.getInstance(SyncopeConstants.DEFAULT_DATE_PATTERN);
        if (info.length() > 0) {
    
      out.write("\n");
      out.write("    <p/><div class=\"success\">\n");
      out.write("      ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");
                    }
      out.write("\n");
      out.write("    <p/>\n");
      out.write("    <a href=\"?\">Reload</a>\n");
      out.write("    <p/>\n");
      out.write("    <a href=\"?do=");
      out.print((statistics.isEnabled() ? "deactivate" : "activate"));
      out.write("\">\n");
      out.write("      ");
      out.print((statistics.isEnabled() ? "DEACTIVATE" : "ACTIVATE"));
      out.write("</a>\n");
      out.write("    <a href=\"?do=clear\">CLEAR</a>\n");
      out.write("    <p/>\n");
      out.write("    Last update: ");
      out.print(sdf.format(statistics.since()));
      out.write("<br/>\n");
      out.write("    Activation: ");
      out.print(sdf.format(statistics.start()));
      out.write("<br/>\n");
      out.write("    <p/>\n");
      out.write("    <table>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Hits</th>\n");
      out.write("        <td>");
      out.print(statistics.getHitCount());
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Reads</th>\n");
      out.write("        <td>");
      out.print(statistics.getReadCount());
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Writes</th>\n");
      out.write("        <td>");
      out.print(statistics.getWriteCount());
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Query Hits</th>\n");
      out.write("        <td>");
      out.print(queryStatistics.getHitCount());
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Query Executions</th>\n");
      out.write("        <td>");
      out.print(queryStatistics.getExecutionCount());
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Query Evictions</th>\n");
      out.write("        <td>");
      out.print(queryStatistics.getEvictionCount());
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("    <p/>\n");
      out.write("    <table width=\"100%\">\n");
      out.write("      <tr><th colspan=\"3\" class=\"c bd1 bg2\">Query statistics</th></tr>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Query</th>\n");
      out.write("        <th class=\"c bd1 bg1\">Hits</th>\n");
      out.write("        <th class=\"c bd1 bg1\">Executions</th>\n");
      out.write("      </tr>\n");
      out.write("      ");

          boolean odd = true;
          for (QueryKey key : queryStatistics.keys()) {
      
      out.write("\n");
      out.write("      <tr class=\"");
      out.print((odd ? "odd" : "even"));
      out.write("\">\n");
      out.write("        <td>");
      out.print(key);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(queryStatistics.getHitCount(key));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(queryStatistics.getExecutionCount(key));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      ");

              odd = !odd;
          }
      
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <p/>\n");
      out.write("    <table width=\"100%\">\n");
      out.write("      <tr><th colspan=\"4\" class=\"c bd1 bg2\">2nd level cache statistics</th></tr>\n");
      out.write("      <tr>\n");
      out.write("        <th class=\"c bd1 bg1\">Region</th>\n");
      out.write("        <th class=\"c bd1 bg1\">Hits</th>\n");
      out.write("        <th class=\"c bd1 bg1\">Reads</th>\n");
      out.write("        <th class=\"c bd1 bg1\">Writes</th>\n");
      out.write("      </tr>\n");
      out.write("      ");

          odd = true;
          for (String className : statistics.classNames()) {
      
      out.write("\n");
      out.write("      <tr class=\"");
      out.print((odd ? "odd" : "even"));
      out.write("\">\n");
      out.write("        <td>");
      out.print(className);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(statistics.getHitCount(className));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(statistics.getReadCount(className));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(statistics.getWriteCount(className));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      ");

              odd = !odd;
          }
      
      out.write("\n");
      out.write("    </table>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /cacheStats.jsp(105,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(info)}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
