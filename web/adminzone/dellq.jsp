<%@page import="connect.DbManager"%>
<%
  
    String id=request.getParameter("id");
    String cmd="delete from question where  qid='"+id+"'";
    
   DbManager db=new DbManager();
   db.insertUpdateDelete(cmd);
   
   response.sendRedirect("longq.jsp");
   
%>