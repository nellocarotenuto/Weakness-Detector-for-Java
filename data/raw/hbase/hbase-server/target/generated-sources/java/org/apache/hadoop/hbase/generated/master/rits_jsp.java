package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import static org.apache.commons.lang3.StringEscapeUtils.escapeXml;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.master.assignment.RegionStates.RegionStateNode;
import org.apache.hadoop.hbase.master.assignment.RegionTransitionProcedure;

public final class rits_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    HMaster master = (HMaster) getServletContext().getAttribute(HMaster.MASTER);
    List<RegionStateNode> rit = master.getAssignmentManager().getRegionsInTransition();
    String table = request.getParameter("table");
    String state = request.getParameter("state");
    if (table != null && state != null && !table.equals("null") && !state.equals("null")) {
        rit = rit.stream().filter(regionStateNode -> regionStateNode.getTable().getNameAsString().equals(table))
                .filter(regionStateNode -> regionStateNode.getState().name().equals(state))
                .collect(Collectors.toList());
    }

    String format = request.getParameter("format");
    if(format == null || format.isEmpty()){
        format = "html";
    }
    String filter = request.getParameter("filter");
    Collections.sort(rit, new Comparator<RegionStateNode>() {
        @Override
        public int compare(RegionStateNode o1, RegionStateNode o2) {
            if (o1.getState() != o2.getState()){
                return o1.getState().ordinal() - o2.getState().ordinal();
            }
            return o1.compareTo(o2);
        }
    });

      out.write("\n\n\n");
 if (format.equals("html")) { 
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n<div class=\"container-fluid content\">\n    <div class=\"row\">\n        <div class=\"page-header\">\n            <h1>Regions in transition</h1>\n        </div>\n    </div>\n    <div class=\"row\">\n        <div class=\"page-header\">\n            <a href=\"/rits.jsp?format=txt&filter=region&table=");
      out.print(table);
      out.write("&state=");
      out.print(state);
      out.write("\" class=\"btn btn-primary\">Regions in text format</a>\n            <a href=\"/rits.jsp?format=txt&filter=procedure&table=");
      out.print(table);
      out.write("&state=");
      out.print(state);
      out.write("\" class=\"btn btn-info\">Procedures in text format</a>\n            <p>regions and procedures in text format can be copied and passed to command-line utils such as hbck2</p>\n        </div>\n    </div>\n\n    ");
 if (rit != null && rit.size() > 0) { 
      out.write("\n        <table class=\"table table-striped\">\n            <tr>\n                <th>Region</th>\n                <th>Table</th>\n                <th>RegionState</th>\n                <th>Procedure</th>\n                <th>ProcedureState</th>\n            </tr>\n            ");
 for (RegionStateNode regionStateNode : rit) { 
      out.write("\n            <tr>\n                <td>");
      out.print( regionStateNode.getRegionInfo().getEncodedName() );
      out.write("</td>\n                <td>");
      out.print( regionStateNode.getRegionInfo().getTable() );
      out.write("</td>\n                <td>");
      out.print( regionStateNode.getState() );
      out.write("</td>\n                ");

                    RegionTransitionProcedure procedure = regionStateNode.getProcedure();

                    if (procedure == null) {
                
      out.write("\n                    <td></td>\n                    <td></td>\n                ");
 } else { 
      out.write("\n                    <td>");
      out.print( procedure.getProcId() );
      out.write("</td>\n                    <td>");
      out.print( escapeXml(procedure.getState().toString() + (procedure.isBypass() ? "(Bypassed)" : "")) );
      out.write("</td>\n                ");
 } 
      out.write("\n            </tr>\n            ");
 } 
      out.write("\n            <p>");
      out.print( rit.size() );
      out.write(" region(s) in transition.</p>\n        </table>\n    ");
 } else { 
      out.write("\n    <p> no region in transition right now. </p>\n    ");
 } 
      out.write("\n</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
      out.write('\n');
 } else { 
      out.write("\n<div class=\"container-fluid content\">\n    <div class=\"row\">\n        <p>\n            ");

            if (filter.equals("region")) {
                for (RegionStateNode regionStateNode : rit) { 
      out.write("\n                    ");
      out.print( regionStateNode.getRegionInfo().getEncodedName() );
      out.write("<br>\n            ");
    }
            } else if (filter.equals("procedure")) {
                for (RegionStateNode regionStateNode : rit) { 
      out.write("\n                    ");
      out.print( regionStateNode.getProcedure().getProcId() );
      out.write("<br>\n            ");
    }
            } else { 
      out.write("\n                \"Not a valid filter\"\n            ");
 } 
      out.write("\n        </p>\n    </div>\n</div>\n");
 } 
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
