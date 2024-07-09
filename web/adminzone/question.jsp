
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
                    <form  action="qcode.jsp" method="post">
             <table  class="table table-bordered table-hover">
                 <tr>
                     <th>Enter coursename :</th>
                     <td>
                    <input type="text" name="course" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter year:</th>
                     <td>
                    <input type="text" name="year" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter Subject:</th>
                     <td>
                    <input type="text" name="subject" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter question no :</th>
                     <td>
                    <input type="text" name="qno" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter question :</th>
                     <td>
                    <input type="text" name="question" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter option 1 :</th>
                     <td>
                    <input type="text" name="o1" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter option 2 :</th>
                     <td>
                    <input type="text" name="o2" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter option 3 :</th>
                     <td>
                    <input type="text" name="o3" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter option 4 :</th>
                     <td>
                    <input type="text" name="o4" class="form-control"  required=""  />
                     </td>
                 </tr> 
                 <tr>
                     <th>Enter correctanswer :</th>
                     <td>
                    <input type="text" name="ca" class="form-control"  required=""  />
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
                                    <th>coursename</th>
                                    <th>year</th>
                                    <th>subject</th>
                                    <th>question no</th>
                                    <th>question</th>
                                    <th>option 1</th>
                                    <th>option 2</th>
                                    <th>option3</th>
                                    <th>option 4</th>
                                    <th>correct answer</th>
                                    <th>Delete</th>
                                    
                                </tr>
                                <%
                                String q="select * from questionbank";
                                DbManager db=new DbManager();
                                ResultSet rs=db.selectQuery(q);
                                int n=1;
                                while(rs.next())
                                {
                                %>
                                <tr>
                                    <td><%=n%></td>
                                    <td><%=rs.getString("coursename")%></td>
                                    <td><%=rs.getString("year")%></td>
                                    <td><%=rs.getString("subject")%></td>
                                    <td><%=rs.getString("questionno")%></td>
                                    <td><%=rs.getString("question")%></td>
                                    <td><%=rs.getString("option1")%></td>
                                    <td><%=rs.getString("option2")%></td>
                                    <td><%=rs.getString("option3")%></td>
                                    <td><%=rs.getString("option4")%></td>
                                    <td><%=rs.getString("correctanswer")%></td>
                                    <td><a onclick="return confirm('do you want to delete?')" href="delq.jsp?id=<%=rs.getString("id")%>">delete</a> </td>
                                    
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
