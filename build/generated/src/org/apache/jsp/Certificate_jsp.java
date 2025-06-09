package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Certificate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(">\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Skill Academy</title>\n");
      out.write("    <link rel=\"icon\" href=\"Assets/logo.jpg\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\"/>\n");
      out.write("    <link rel=\"icon\" href=\"Assets/logo.jpg\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./Certificate.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write(" ");
  
     String name = (String) session.getAttribute("uname");          
 
      out.write("\n");
      out.write("    <!-- Navigavtion Bar -->\n");
      out.write("    <div id=\"navbar\">\n");
      out.write("        <a href=\"#default\" id=\"logo\" style=\"display: flex; gap: 5px;\"><img src=\"Assets/logo.jpg\" alt=\"\" height=\"30px\" style=\"margin-top: 0%;\"><div class=\"l1\" style=\"margin-top: 1.5%;\">SKILL ACADEMY</div></a>\n");
      out.write("        <div id=\"navbar-right\">\n");
      out.write("          <a class=\"active\" href=\"#home\">HOME</a>\n");
      out.write("          <a href=\"#contact\">CONTACT</a>\n");
      out.write("          <a href=\"#about\">ABOUT</a>\n");
      out.write("          <a href=\"adminlogin.html\">ADMIN LOGIN</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Display -->\n");
      out.write("    <div class=\"display\">5x More Recruiters show interest in people<br> \n");
      out.write("        who share up skilling certificates on LinkedIn</div>\n");
      out.write("\n");
      out.write("    <!-- Caption -->\n");
      out.write("    <div class=\"caption\">Hi all, I have successfully completed the \"___\" course offered by Skill \n");
      out.write("        Academy.<br>\n");
      out.write("        #SkillAcademy #CourseName #Skill</div>\n");
      out.write("    \n");
      out.write("    <div class=\"line\">Copy & Paste this caption certificates on LinkedIn</div>\n");
      out.write("    \n");
      out.write("    <!-- Certificate Container -->\n");
      out.write("    <div class=\"certificateContainer\" id=\"certificateContainer\">\n");
      out.write("    <div class=\"certificate\">\n");
      out.write("        <div class=\"border1\"></div>\n");
      out.write("        <div class=\"border2\"></div>\n");
      out.write("        <div class=\"border3\"></div>\n");
      out.write("        <div class=\"border4\"></div>\n");
      out.write("         <div class=\"headline\">CERTIFICATE OF COMPLETION</div>\n");
      out.write("         <div class=\"sub\">Presented to</div>\n");
      out.write("         <div class=\"name\">");
 out.println(name); 
      out.write("</div>\n");
      out.write("         <div class=\"sub2\">For successfully completing a online course</div>\n");
      out.write("         <div class=\"provided\">Provided by\n");
      out.write("            <div class=\"skillA\">Skill Academy</div>\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Button -->\n");
      out.write("   <div class=\"btnContainer\">\n");
      out.write("    <button id=\"btn-one\" class=\"btn-one\">Generate PDF</button>\n");
      out.write("   </div>\n");
      out.write("    \n");
      out.write("    <!-- Lastline -->\n");
      out.write("    <div class=\"lastline\">Share your certificates on LinkedIn to get noticed by recruiters and let your <br>\n");
      out.write("        professional network know about your new accomplishment</div>\n");
      out.write("\n");
      out.write("    <!-- Script -->\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script\n");
      out.write("\t\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/html2canvas/1.4.1/html2canvas.min.js\"\n");
      out.write("\t\t\tintegrity=\"sha512-BNaRQnYJYiPSqHHDb58B0yaPfCu+Wgds8Gp/gU33kqBtgNS4tSPHuGibyoeqMV/TJlSKda6FXzoEyYGjTe+vXA==\"\n");
      out.write("\t\t\tcrossorigin=\"anonymous\"\n");
      out.write("\t\t\treferrerpolicy=\"no-referrer\"\n");
      out.write("\t></script>\n");
      out.write("\n");
      out.write("    <script src=\"script.js\"></script>\n");
      out.write("         <!-- Feedback Button -->\n");
      out.write("      <h6 style=\"font-size: 18px;margin-left:50px;\"> Rate us by filling ⭐⭐⭐</h6>\n");
      out.write("        <!-- Button -->\n");
      out.write("        <a href=\"Feedback.html\" style=\"text-decoration: none;\">\n");
      out.write("        <div class=\"feedback\" style=\" margin:0 0 50px 50px;width: 20%; height: 40px; border-radius: 10px; font-size: 18px; background-color: #1085c9; color: azure; text-align: center; padding-top: 4px; border: 1px solid white\">\n");
      out.write("            Feedback Form</div>\n");
      out.write("             </a>\n");
      out.write("      \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("</body>\n");
      out.write("</html>");
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
