
<%@page import="java.sql.ResultSet"%>
<!--
admin zone -> complaint
-->

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
            <div class="row">
                <div class="col-sm-12">
                    <h4 class="text-center text-primary">Question</h4>
                    <form  action="lqcode.jsp" method="post">
             <table  class="table table-bordered table-hover">
                 
                 <tr>
                     <th>Enter question :</th>
                     <td>
                    <input type="text" name="question" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>posted by :</th>
                     <td>
                    <input type="text" name="postby" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 
                 <tr>
                     <td colspan="2" align="center">
                         <input  type="submit" value="Submit" />
                     </td>
                 </tr>
             </table>
                    </form>
                    <div class="row">
                        <div class="col-sm-12 text-center text-primary">
                            <h3>questions added</h3>
                            <table class="table table-bordered table-hover">
                                <tr>
                                    <th>Sr no</th>
                                    
                                    <th>question</th>
                                    
                                    <th>posted by</th>
                                    <th>posted date</th>
                                    <th>Delete</th>
                                    
                                </tr>
                                <%
                                String q="select * from question";
                                DbManager db=new DbManager();
                                ResultSet rs=db.selectQuery(q);
                                int n=1;
                                while(rs.next())
                                {
                                %>
                                <tr>
                                    <td><%=n%></td>
                                    
                                    <td><%=rs.getString("qname")%></td>
                                    
                                    <td><%=rs.getString("postedby")%></td>
                                    <td><%=rs.getString("posteddate")%></td>
                                    <td><a onclick="return confirm('do you want to delete?')" href="dellq.jsp?id=<%=rs.getString("qid")%>">delete</a> </td>
                                    
                                </tr>
                                <%
                                  n++;
                                }
                                %>
                                
                            </table>
                        
                        </div>
                    </div>    
                </div>
            </div>
                        
            <!--notification end-->
            
            <%@include file="adminfootermaster.jsp" %>
            
            <!-- outer end -->
        </div>   
    </body>
</html>
