<%-- 
    Document   : Contactus
    Created on : 24 Feb, 2024, 3:23:25 PM
    Author     : vaibhav
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skill Academy</title>
    </head>
    <body>
           <%
try {
     
    

    
                String name =request.getParameter("t1");
        	String email=request.getParameter("t2");
        	String phoneno=request.getParameter("t3");
                String msg=request.getParameter("t4");
                
               
        	Class.forName("org.apache.derby.jdbc.ClientDriver");
        	Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
        	
            	PreparedStatement ps = c.prepareStatement("insert into contactus values(?,?,?,?)");
            	ps.setString(1, name);
            	ps.setString(2, email);
            	ps.setString(3, phoneno);
                ps.setString(4, msg);
             
                
            	int i= ps.executeUpdate();
                if(i>0){%>
                <script>
                    alert("We recieve your message! Thank You for Connecting with us.✉️")
                </script>
                	<jsp:include page="SkillAcademyMenu.html" /><%
                }
                else{
                	out.println("Refresh page and try again!");
        	}
                

}
catch(Exception e)
{ out.println(e);
}
%>
    </body>
</html>
