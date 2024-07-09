<%@page import="connect.DbManager"%>
<%
    String enrollmentno=request.getParameter("enrollmentno");
    String name=request.getParameter("name");
    String fname=request.getParameter("fname");
    String mname=request.getParameter("mname");
    String gender=request.getParameter("a");
    
    String address=request.getParameter("address");
    String contactno=request.getParameter("contactno");
    String email=request.getParameter("emailaddress");
    String dob=request.getParameter("dob");
    String adhar=request.getParameter("aadharno");
    String course=request.getParameter("course");
    String year=request.getParameter("year");
    String centername=request.getParameter("centername");
    
    String password=request.getParameter("password");
    
    //insert query
    String cmd="insert into studentinfo(enrollmentno,name,fname,mname,gender,address,contactno,emailaddress,dob,aadharno,course,year,centername,registrationdate,pwd) values('"+enrollmentno+"','"+name+"','"+fname+"','"+mname+"','"+gender+"','"+address+"','"+contactno+"','"+email+"','"+dob+"','"+adhar+"','"+course+"','"+year+"','"+centername+"',curdate(),'"+password+"')";
  // out.print(cmd);
    DbManager db=new DbManager();
    boolean status=db.insertUpdateDelete(cmd);
    if(status==true)
    {
        %>
        <script>alert('registration successfully done');
            window.location.href="registration.jsp";        </script>
      
        
        <%
    }
    else{
        %>
        
    <script>alert('registration is not done successfully ');
            window.location.href="registration.jsp";        </script>
    
    <%
    }
    
    %>