
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>NOULMS || register</title>
       <%@include file="linkmaster.jsp" %>
        
    </head>
    <body>
          
        <div class="container-fluid">
              
             <%@include file="headermaster.jsp"%>
             
               <div class="row mt-5">
                     
                 
                   <div class="col-sm-12 text-center">
                       <h2>REGISTRATION FORM</h2>
                       <hr/>
                   </div>
               </div>
       
             <form action="regcode.jsp" method="post" class="bg-secondary text-warning">
                
                 
                 <div class="row">
                     <div class="col-sm-6 mb-3">
                         <label for="f1" class="form-label">Enrollment No<sup style="color:red;">*</sup></label>
                         <input type="text" class="form-control" id="f1" name="enrollmentno" placeholder="Enter your enrollment no." required="true"/>
                 </div>
                     <div class="col-sm-6 mb-3">
                         <label for="f2" class="form-label">Name<sup style="color:red;">*</sup></label>
                         <input type="text" class="form-control" id="f2"   name="name" placeholder="Enter your name" required="true"/>
                 </div>
                 </div>
                 
                 <div class="row">
                     <div class="col-sm-6 mb-3">
                         <label for="f3" class="form-label">Father's name<sup style="color:red;">*</sup></label>
                         <input type="text" class="form-control" id="f3" name="fname" placeholder="Enter your father's name" required="true"/>
                 </div>
                     <div class="col-sm-6 mb-3">
                         <label for="f4" class="form-label">Mother's Name<sup style="color:red;">*</sup></label>
                         <input type="text" class="form-control" id="f4"   name="mname" placeholder="Enter your mother name" required="true"/>
                 </div>
                 </div>
                 
                 
                  <div class="row">
                 
                 <div class="col-sm-6 mb-3">
                     <label for="f5" class="form-label">Gender<sup style="color:red;">*</sup></label>
                     <input type="radio"  id="f5" name="a" required="true" value="Female"/>Female
                     <input type="radio"  id="f5" name="a" required="true" value="Male"/>Male
                 </div>
                 
                 
                  
                
                     <div class="col-sm-6 mb-3">
                         <label for="f6" class="form-label">Address<sup style="color:red;">*</sup></label>
                         <input type="text" class="form-control" id="f6"  name="address" placeholder="Enter your address" required="true"/>
                 </div>
                  </div>
                 
                 <div class="row">
                     <div class="col-sm-6 mb-3">
                         <label for="f7" class="form-label">contact no<sup style="color:red;">*</sup></label>
                         <input type="number" class="form-control" id="f7"   name="contactno" placeholder="Enter your conatct no." required="true"/>
                 </div>
                     <div class="col-sm-6 mb-3">
                         <label for="f8" class="form-label">Email<sup style="color:red;">*</sup></label>
                         <input type="email" class="form-control" id="f8"   name="email" placeholder="Enter your email" required="true"/>
                 </div>
                 
                 </div>
                 
                 
                 <div class="row">
                     <div class="col-sm-6 mb-3">
                         <label for="f9" class="form-label">DOB<sup style="color:red;">*</sup></label>
                         <input type="date" class="form-control" id="f9" name="dob" required="true"/>
                 </div>
                     <div class="col-sm-6 mb-3">
                         <label for="f10" class="form-label">Aadhar No.<sup style="color:red;">*</sup></label>
                         <input type="number" class="form-control" id="f10"   name="aadhar" placeholder="Enter your aadhar no" required="true"/>
                 </div>
                 </div>
                 
                 <div class="row">
                     <div class="col-sm-6 mb-3">
                         <label for="f11" class="form-label">Course<sup style="color:red;">*</sup></label>
                         <select class="form-control" name="course" id="f11" required="true">
                             <option value="">--select--</option>
                             <option>MCA</option>
                             <option>BCA</option>
                             <option>Diploma</option>
                             <option>B.Tech</option>
                             
                         </select>
                     
                     
                     </div>
                     
                     <div class="col-sm-6 mb-3">
                         <label for="f12" class="form-label">Year<sup style="color:red;">*</sup></label>
                         <select class="form-control" name="year" id="f12" required="true">
                             <option value="">--select--</option>
                             <option>1st year</option>
                             <option>2nd year</option>
                             <option>3rd year</option>
                             <option>4th year</option>
                             
                         </select>
                 </div>
                 </div>
                 
                 <div class="row">
                     <div class="col-sm-6">
                         <label for="f13" class="form-label">Center Name<sup style="color:red;">*</sup></label>
                         <input type="text" class="form-control" id="f13" name="centername" placeholder="Enter your center name" required="true"/>
                     </div>
                         <div class="col-sm-6">
                         <label for="f14" class="form-label">Password<sup style="color:red;">*</sup></label>
                         <input type="password" class="form-control" id="f14" name="password" placeholder="Enter your center name" required="true"/>
                     </div>
                    
                 </div>
                 <div class="col-sm-2 mt-4">
                         <input type="submit" value="SUBMIT" class="btn btn-primary form-control"/>
                     </div>
             </form>

          <!--header end-->
          
          <%@include file="footermaster.jsp" %>
        </div>
    </body>
</html>

