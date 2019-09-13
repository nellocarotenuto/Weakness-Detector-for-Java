package org.apache.hadoop.hbase.generated.regionserver;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.apache.hadoop.hbase.client.RegionInfoDisplay;
import org.apache.hadoop.hbase.regionserver.HRegionServer;
import org.apache.hadoop.hbase.regionserver.Region;
import org.apache.hadoop.hbase.regionserver.Store;
import org.apache.hadoop.hbase.regionserver.StoreFile;

public final class region_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

  String regionName = request.getParameter("name");
  HRegionServer rs = (HRegionServer) getServletContext().getAttribute(HRegionServer.REGIONSERVER);

  Region region = rs.getRegion(regionName);
  String displayName = RegionInfoDisplay.getRegionNameAsStringForDisplay(region.getRegionInfo(),
    rs.getConfiguration());
  pageContext.setAttribute("pageTitle", "HBase RegionServer: " + rs.getServerName());

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n\n  <div class=\"container-fluid content\">\n    <div class=\"row inner_header\">\n        <div class=\"page-header\">\n            <h1>Region: ");
      out.print( displayName );
      out.write("</h1>\n        </div>\n    </div>\n\n");
 if(region != null) { //
     List<? extends Store> stores = region.getStores();
     for (Store store : stores) {
       String cf = store.getColumnFamilyName();
       Collection<? extends StoreFile> storeFiles = store.getStorefiles(); 
      out.write("\n\n       <h3>Column Family: ");
      out.print( cf );
      out.write("</h3>\n\n       <h4>Memstore size (MB): ");
      out.print( (int) (store.getMemStoreSize().getHeapSize() / 1024 / 1024) );
      out.write("</h4>\n\n       <h4>Store Files</h4>\n\n       <table class=\"table table-striped\">\n         <tr>\n           <th>Store File</th>\n           <th>Size (MB)</th>\n           <th>Modification time</th>\n         </tr>\n       ");
   for(StoreFile sf : storeFiles) { 
      out.write("\n         <tr>\n           <td><a href=\"storeFile.jsp?name=");
      out.print( sf.getPath() );
      out.write('"');
      out.write('>');
      out.print( sf.getPath() );
      out.write("</a></td>\n           <td>");
      out.print( (int) (rs.getFileSystem().getLength(sf.getPath()) / 1024 / 1024) );
      out.write("</td>\n           <td>");
      out.print( new Date(sf.getModificationTimestamp()) );
      out.write("</td>\n         </tr>\n         ");
 } 
      out.write("\n\n         <p> ");
      out.print( storeFiles.size() );
      out.write(" StoreFile(s) in set.</p>\n         </table>\n   ");
  }
   }
      out.write("\n</div>\n\n");
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
