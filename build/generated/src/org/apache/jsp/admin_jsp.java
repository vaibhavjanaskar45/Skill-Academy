package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<center>\n");

    try {
        String i=request.getParameter("i1");
        	String p=request.getParameter("p1");
                if(i.equals("admin" )&& p.equals("123" ) ){
                      Class.forName("org.apache.derby.jdbc.ClientDriver");
        	Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
        	
            	PreparedStatement ps = c.prepareStatement("select * from registration");
            	ResultSet rs = ps.executeQuery();
            	out.println("<table border='2'>"
                    	+ "<tr><th colspan='7'>Student Detail</th></tr>"
                    	+ "<tr><td>Name</td>"
                    	+ "<td>Email</td>"
                        + "<td>Phone_No</td>"
                        + "<td>Passworad</td>"
                    );
            	while(rs.next())
            	{
                	out.println("<tr><td>" + rs.getString(1) + "</td>"
                            	+ "<td>" + rs.getString(2) + "</td>"
                            	+ "<td>" + rs.getString(3) + "</td>"
                                + "<td>" + rs.getString(4) + "</td></tr>");
            	}
                     out.println("</table>");
            	rs.close();
            	ps.close();
                
                PreparedStatement ps1 = c.prepareStatement("select * from QUIZ");
            	ResultSet rs1 = ps1.executeQuery();
            	out.println("<table border='2'>"
                    	+ "<tr><th colspan='7'>Quiz Detail</th></tr>"
                    	+ "<tr><td>Name</td>"
                    	+ "<td>Course Name</td>"
                        + "<td>Score</td>"
                    );
            	while(rs.next())
            	{
                	out.println("<tr><td>" + rs.getString(1) + "</td>"
                            	+ "<td>" + rs.getString(2) + "</td>"
                            	+ "<td>" + rs.getString(3) + "</td></tr>");
            	}
                     out.println("</table>");
            	rs1.close();
            	ps1.close();
                
                
                PreparedStatement ps2 = c.prepareStatement("select * from FEEDBACK");
            	ResultSet rs2 = ps2.executeQuery();
            	out.println("<table border='2'>"
                    	+ "<tr><th colspan='7'>Feedback Detail</th></tr>"
                    	+ "<tr><td>Name</td>"
                    	+ "<td>Course Name</td>"
                        + "<td>Message</td>"
                    );
            	while(rs.next())
            	{
                	out.println("<tr><td>" + rs.getString(1) + "</td>"
                            	+ "<td>" + rs.getString(2) + "</td>"
                            	+ "<td>" + rs.getString(3) + "</td></tr>");
            	}
                     out.println("</table>");
            	rs1.close();
            	ps1.close();
                
                
                
                
                
                }
                else{
                    out.println("Refresh page and try again!");
                }
        
    }
    catch(Exception e){
        
    }
    
      out.write("\n");
      out.write("    </center>");
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
