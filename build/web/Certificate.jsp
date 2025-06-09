<%-- 
    Document   : Certificate
    Created on : 24 Feb, 2024, 3:13:39 PM
    Author     : vaibhav
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Skill Academy | Certificate </title>
    <link rel="icon" href="Assets/logo.jpg" type="image/x-icon">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css"/>
    <link rel="icon" href="Assets/logo.jpg" type="image/x-icon">
    <link rel="stylesheet" href="./Certificate.css">
</head>
<body>
    
 <%  
     String name = (String) session.getAttribute("uname");          
 %>
    <!-- Navigavtion Bar -->
    <div id="navbar">
        <a href="#default" id="logo" style="display: flex; gap: 5px;"><img src="Assets/logo.jpg" alt="" height="30px" style="margin-top: 0%;"><div class="l1" style="margin-top: 1.5%;">SKILL ACADEMY</div></a>
        <div id="navbar-right">
          <a href="SkillAcademyMenu.html">HOME</a>
          <a href="ContactUs.html">CONTACT</a>
          <a href="AboutUsPage.html">ABOUT</a>
          <a href="adminlogin.html">ADMIN LOGIN</a>
        </div>
    </div>

    <!-- Display -->
    <div class="display">5x More Recruiters show interest in people<br> 
        who share up skilling certificates on LinkedIn</div>

    <!-- Caption -->
    <div class="caption">Hi all, I have successfully completed the "___" course offered by Skill 
        Academy.<br>
        #SkillAcademy #CourseName #Skill</div>
    
    <div class="line">Copy & Paste this caption certificates on LinkedIn</div>
    
    <!-- Certificate Container -->
    <div class="certificateContainer" id="certificateContainer">
    <div class="certificate">
        <div class="border1"></div>
        <div class="border2"></div>
        <div class="border3"></div>
        <div class="border4"></div>
         <div class="headline">CERTIFICATE OF COMPLETION</div>
         <div class="sub">Presented to</div>
         <div class="name"><% out.println(name); %></div>
         <div class="sub2">For successfully completing a online course</div>
         <div class="provided">Provided by
            <div class="skillA">Skill Academy</div>
         </div>
    </div>
    </div>
    
    <!-- Button -->
   <div class="btnContainer">
    <button id="btn-one" class="btn-one">Generate PDF</button>
   </div>
    
    <!-- Lastline -->
    <div class="lastline">Share your certificates on LinkedIn to get noticed by recruiters and let your <br>
        professional network know about your new accomplishment</div>

    <!-- Script -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.min.js"></script>
	<script
			src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/1.4.1/html2canvas.min.js"
			integrity="sha512-BNaRQnYJYiPSqHHDb58B0yaPfCu+Wgds8Gp/gU33kqBtgNS4tSPHuGibyoeqMV/TJlSKda6FXzoEyYGjTe+vXA=="
			crossorigin="anonymous"
			referrerpolicy="no-referrer"
	></script>
    <script src="script.js"></script>
    
    <!-- Feedback Button -->
     <h6 style="font-size: 18px;margin-left:50px;"> Rate us by filling ⭐⭐⭐</h6>
        
     <!-- Button -->
    <a href="Feedback.html" style="text-decoration: none;">
        <div class="feedback" style=" margin:0 0 50px 50px;width: 20%; height: 40px; border-radius: 10px; font-size: 18px; background-color: #1085c9; color: azure; text-align: center; padding-top: 4px; border: 1px solid white">
        Feedback Form
        </div>
    </a>
</body>
</html>