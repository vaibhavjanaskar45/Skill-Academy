<%-- 
    Document   : admin
    Created on : 14 Sep, 2023, 6:11:28 PM
    Author     : vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<center>
<%
    try {
        String i=request.getParameter("i1");
        	String p=request.getParameter("p1");
                if(i.equals("admin" )&& p.equals("123" ) ){
                      Class.forName("org.apache.derby.jdbc.ClientDriver");
        	Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
        	
            	PreparedStatement ps = c.prepareStatement("select * from registration");
            	ResultSet rs = ps.executeQuery();
            	out.println("<table border='2'>"
                    	+ "<tr><th colspan='4'>Student Detail</th></tr>"
                    	+ "<tr><td>Name</td>"
                    	+ "<td>Email</td>"
                        + "<td>Phone_No</td>"
                        + "<td>Passworad</td></tr>"
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
                %>
               <br /><br />
                <%
                PreparedStatement ps1 = c.prepareStatement("select * from QUIZ");
            	ResultSet rs1 = ps1.executeQuery();
            	out.println("<table border='2'>"
                    	+ "<tr><th colspan='3'>Quiz Detail</th></tr>"
                    	+ "<tr><td>Name</td>"
                    	+ "<td>Course Name</td>"
                        + "<td>Score</td></tr>"
                    );
            	while(rs1.next())
            	{
                	out.println("<tr><td>" + rs1.getString(1) + "</td>"
                            	+ "<td>" + rs1.getString(2) + "</td>"
                            	+ "<td>" + rs1.getString(3) + "</td></tr>");
            	}
                     out.println("</table>");
            	rs1.close();
            	ps1.close();
                
               %>
               <br /><br />
                <%
                PreparedStatement ps2 = c.prepareStatement("select * from FEEDBACK");
            	ResultSet rs2 = ps2.executeQuery();
            	out.println("<table border='2'>"
                    	+ "<tr><th colspan='3'>Feedback Detail</th></tr>"
                    	+ "<tr><td>Name</td>"
                    	+ "<td>Course Name</td>"
                        + "<td>Message</td></tr>"
                    );
            	while(rs2.next())
            	{
                	out.println("<tr><td>" + rs2.getString(1) + "</td>"
                            	+ "<td>" + rs2.getString(2) + "</td>"
                            	+ "<td>" + rs2.getString(3) + "</td></tr>");
            	}
                     out.println("</table>");
            	rs2.close();
            	ps2.close();
                %>
               <br /><br />
                <%
                 PreparedStatement ps3 = c.prepareStatement("select * from CONTACTUS");
            	ResultSet rs3 = ps3.executeQuery();
            	out.println("<table border='2'>"
                    	+ "<tr><th colspan='4'>Contact us Detail</th></tr>"
                    	+ "<tr><td>Name</td>"
                    	+ "<td>Email</td>"
                        + "<td>Phone Number</td>"
                        + "<td>Message</td></tr>"
                    );
            	while(rs3.next())
            	{
                	out.println("<tr><td>" + rs3.getString(1) + "</td>"
                            	+ "<td>" + rs3.getString(2) + "</td>"
                                + "<td>" + rs3.getString(3) + "</td>"
                            	+ "<td>" + rs3.getString(4) + "</td></tr>");
            	}
                     out.println("</table>");
            	rs3.close();
            	ps3.close();
                
                               %>
               <br /><br />
                <%
                
                }
                else{
                    out.println("You don't have permission to access this page ");
                }
        
    }
    catch(Exception e){
        
    }
    %>
    </center>