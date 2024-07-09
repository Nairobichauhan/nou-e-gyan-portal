<%@page import="connect.DbManager"%>
<%
 String qtext=request.getParameter("question");
 String postby=request.getParameter("postby");
 
 String cmd="insert into question(qname,postedby,posteddate) values('"+qtext+"','"+postby+"',curdate())";
 DbManager db=new DbManager();
 boolean status=db.insertUpdateDelete(cmd);
 if(status==true)
 {
     %>
     <script>
         alert('question added successfully');
         window.location.href="longq.jsp";
         
     </script>
     <%
             
 }
else
{
    %>
    <script>
         alert('question is not added successfully');
         window.location.href="longq.jsp";
         
     </script>
    <%
}
%>