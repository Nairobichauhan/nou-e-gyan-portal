
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>NOULM || LOGIN</title>
        
        <%@include file="linkmaster.jsp" %>
   
    </head>
    <body>
        <div class="container-fluid">
            
            <%@include file="headermaster.jsp" %>
           
            
            
            <!-- notification box-->
            <div class="row  mt-3 bg-warning">
                
                <div class="col-sm-12 bg-secondary">
                    
                    <h3 style="font-weight:bold;color:yellow;" class="text-center">Admin/Student Login </h3>
                 
                    <form action="logincode.jsp" method="post">
                      
                        <table class="mt-3 bg-white rounded-4 text-warning" background="images/a.jpg" height="400px;" width="1000px;" align="center">
                       
                            <tr>
                                <td align="center" style="font-size: 25px;"><b>User Id : </b></td>
                                <td>
                                    <input type="text" name="userid"  class="form-control" required="true" style="width: 300px; margin-left: 150px;"/>
                                </td>
                            </tr>
                            
                            <tr>
                                <td align="right" class="mt-0" style="font-size: 25px;"><b>Password : </b></td>
                                <td>
                  <input type="password" name="pwd"  class="form-control"   required="true" style="width: 300px; margin-left: 150px;"/>
                    
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="text-center">
                                    <input type="submit" value="LOGIN" class="btn btn-danger"  />
                                           
                                </td>
                            </tr>
                        </table>
                    </form>
                    
               
                </div>
            </div>
                        
            <!--notification end-->
            
            <%@include file="footermaster.jsp" %>
            
            <!-- outer end -->
        </div>   
    </body>
</html>
