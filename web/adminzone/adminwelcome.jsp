
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>NOULM || ADMIN</title>
        
        <%@include file="adminlinkmaster.jsp" %>
   
    </head>
    <body>
        <div class="container-fluid">
            
            <%@include file="adminheadermaster.jsp" %>
           
            
            
            <!-- notification box-->
            <div class="row  mt-5">
                
                <div class="col-sm-12">
         <h3 align="center">Welcome ! Admin  Zone </h3>
               
         
<!-- section1 sart -->

<div class="row mt-5">
<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/home.jpg" alt="">
</div>
<button type="button" class="btn btn-light">Home</button>
</div>
<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/about.png" alt="">
</div>
<button type="button" class="btn btn-light">About Us</button>
</div>
<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/study.png" alt="">
</div>
<button type="button" class="btn btn-light">Study Center</button>
</div>
<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/login.png" alt="">
</div>
<button type="button" class="btn btn-light">Login</button> 
</div>
</div>
<!-- section1 end -->




<!-- section2 -->
<div class="row mt-5">
<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/feedback.png" alt="">
</div>
<button type="button" class="btn btn-light">Feedback</button>
</div>



<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/contact.png" alt="">
</div>
<button type="button" class="btn btn-light">Contact Us</button>
</div>

<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/course.png" alt="">
</div>
<button type="button" class="btn btn-light">Courses</button>
</div>



<div class="col-sm-3 text-center">
<div class="section shadow-lg">
<img src="image/complain.png" alt="">
</div>
<button type="button" class="btn btn-light">Complain</button>
</div>

</div>
<!-- section2 end -->
         
                </div>
            </div>
                        
            <!--notification end-->
            
            <%@include file="adminfootermaster.jsp" %>
            
            <!-- outer end -->
        </div>   
    </body>
</html>
