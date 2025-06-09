<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
	
	
	
        
  
        
       <%     
          
try { 
           String coursename = "UiUx Course";
           session.setAttribute("cname", coursename);
           String name = (String) session.getAttribute("uname");
           int i=0;
               String p = request.getParameter("g1");
                String q = request.getParameter("g2");
                 String r = request.getParameter("g3");
                  String s = request.getParameter("g4");
                   String t = request.getParameter("g5");
    if(p.equals ("void _jspService(HTTPRequest request, HTTPResponse response)")){
        i=i+1;
        
    }
     if(q.equals("contentType")){
       i=i+1;
     
    }
      if(r.equals("True")){
     i=i+1;
      
    }
       if(s.equals ("page, flush")){
        i=i+1;
     
    }
        if(t.equals("response.getParameter()")){
       i=i+1;
    }
        int x= i*20;

         
     
     String I=String.valueOf(x);
     Class.forName("org.apache.derby.jdbc.ClientDriver");
        	Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            	PreparedStatement ps = c.prepareStatement("insert into quiz values(?,?,?)");
            	ps.setString(1, name);
            	ps.setString(2, coursename);
                ps.setString(3, I);
                ps.executeUpdate();
                      
        if(x >= 60){
       response.sendRedirect("Certificate.jsp");
       
       
       %>
     <jsp:forward page="Certificate.jsp" /><%
    }       
          else{%>
     <jsp:forward page="CourseOpenPage.html" />
             <script>
              alert(" try again once you learn properly!"); 
                </script><%
          }    
  
     
}
        
        

catch(Exception e){
   
}
%>
</body>
</html>