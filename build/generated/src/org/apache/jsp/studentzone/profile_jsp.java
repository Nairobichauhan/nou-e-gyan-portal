package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.DbManager;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/studentzone/studentlinkmaster.jsp");
    _jspx_dependants.add("/studentzone/studentheadermaster.jsp");
    _jspx_dependants.add("/studentzone/studentfootermaster.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>NOULM </title>\n");
      out.write("        \n");
      out.write("        ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write(" <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"css/style1.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"css/style1.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <script src=\"js/bootstrap.bundle.js\"></script> \n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("      window.history.forward();\n");
      out.write("      function unload()\n");
      out.write("      {\n");
      out.write("          window.history.forward();\n");
      out.write("      }\n");
      out.write("       window.setTimeout(\"unload()\",10);\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");

      if(session.getAttribute("studentid")==null)
      {
        response.sendRedirect("../login.jsp");
      }
  
      out.write("\n");
      out.write("  ");
      out.write("\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("<!-- headline start -->\n");
      out.write("            <div class=\"row bg-danger text-light\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    Welcome to Student Zone\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    ");
      out.print(new DbManager().getDate() );
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    ");
      out.print(session.getAttribute("studentid") );
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div> \n");
      out.write("            <!--headline end-->\n");
      out.write("            \n");
      out.write("             <!--header start-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-1 mt-4\">\n");
      out.write("                    <img src=\"images/logo.png\" class=\"logo\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-7 mt-4\">\n");
      out.write("                    <h4>Nalanda eGyan Portal</h4>\n");
      out.write("                    <p>(An Initiative Taken By Nalanda Open University)</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!--header end-->\n");
      out.write("            \n");
      out.write("             <!--navbar--->\n");
      out.write("            \n");
      out.write("            <div class=\"row mt-3\">\n");
      out.write("              <div class=\"col-sm-12 p-0 bg-warning\">\n");
      out.write("                   <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">NOULMS</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"welcome.jsp\">Dashboard</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"feedback.jsp\">Feedback</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item dropdown\"  style=\"display: none;\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Course\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"course.jsp\">Courses</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"studycenter.jsp\">Study Centers</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("       <a class=\"nav-link\" href=\"course.jsp\">Course</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("       <a class=\"nav-link\" href=\"studymaterial.jsp\">Study Material</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"complaint.jsp\">Complaint</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"profile.jsp\">Profile</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"changepassword.jsp\">Change Password</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"logout.jsp\">Logout</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav> \n");
      out.write("            </div>  \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             <!-- navbar end-->\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!-- notification box-->\n");
      out.write("            <div class=\"row  mt-5\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    \n");
      out.write("         <h3 style=\"font-weight:bold;\">My Profile </h3>\n");
      out.write("         <hr />\n");
      out.write("              \n");
      out.write("         ");

         
            
             String cmd = "select  * from studentinfo  where enrollmentno='"+session.getAttribute("studentid")+"'";
             DbManager db=new DbManager();
             ResultSet rs=db.selectQuery(cmd);
             if(rs!=null)
             {
                 if(rs.next())
                 {
                 String img="";
                 String pic=rs.getString("profilepic")+"";
                 if(pic.equals("null"))
                     {
                     img="images/cont.png";
                     }
                 else
                 {
                 img="../uploadimage/"+pic;
                 }
                     
         
      out.write("\n");
      out.write("         \n");
      out.write("         <table  class=\"table table-bordered bg-warning\">\n");
      out.write("             <tr>\n");
      out.write("                 <th>Student Pic</th>\n");
      out.write("                 <td>\n");
      out.write("                     <img src=\"");
      out.print(img);
      out.write("\" height=\"100px\" width=\"100px\"  />\n");
      out.write("                 </td>\n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <th>Student Name :</th>\n");
      out.write("                 <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("              <tr>\n");
      out.write("                 <th>Mobile No :</th>\n");
      out.write("                 <td>");
      out.print(rs.getString("contactno") );
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                 <th>Email Id :</th>\n");
      out.write("                 <td>");
      out.print(rs.getString("emailaddress") );
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                 <th>Address :</th>\n");
      out.write("                 <td>");
      out.print(rs.getString("address") );
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td colspan=\"2\" align=\"center\">\n");
      out.write("                     <a class=\"btn btn-primary\" href=\"editprofile.jsp\">Edit Profile</a>\n");
      out.write("                 </td>\n");
      out.write("             </tr>    \n");
      out.write("             \n");
      out.write("         </table>\n");
      out.write("         \n");
      out.write("         ");

                 }
             }
         
      out.write("\n");
      out.write("         \n");
      out.write("         </div>\n");
      out.write("            </div>\n");
      out.write("                        \n");
      out.write("            <!--notification end-->\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            ");
      out.write("     <!--footer start -->\n");
      out.write("             \n");
      out.write("             <div class=\"row bg-dark py-4\">\n");
      out.write("                 <div class=\"col-sm-3 text-center text-warning\">\n");
      out.write("                     <img src=\"images/logo.png\" class=\"w-50\"/>\n");
      out.write("                     <h4>Nalanda Open University</h4>\n");
      out.write("                 </div>\n");
      out.write("             \n");
      out.write("           <div class=\"col-sm-2 text-warning\">\n");
      out.write("               <h4> <u><b>Useful Links</b></u></h4>\n");
      out.write("               <ul>\n");
      out.write("                   <li><a href=\"home.jsp\">Home</a></li>          \n");
      out.write("                   <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                   <li><a href=\"#\">Course</a></li>\n");
      out.write("                   <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                   <li><a href=\"#\">Services</a></li>\n");
      out.write("           </ul>\n");
      out.write("                 </div> \n");
      out.write("             <div class=\"col-sm-3 text-warning text-center rounded-3\">\n");
      out.write("                 <h4><u><b>Contact Us</b></u></h4>NOU\n");
      out.write("       </br>\n");
      out.write("       2nd/3rd Floor,Biscoman Bhawan,Gandhi Maidan,Patna 800 001(Bihar)\n");
      out.write("       </br>\n");
      out.write("       Mob:- 7970997207\n");
      out.write("             </div>\n");
      out.write("                 <div class=\"col-sm-4 text-warning text-center\">\n");
      out.write("                     <h4><u><b>Subscribe</b></u></h4>\n");
      out.write("                     <p>Fill the details to receive the manualof the NOU e-Gyan Portal</p>\n");
      out.write("                     <form action=\"#\">\n");
      out.write("                         <div class=\"form-row bg-dark\">\n");
      out.write("                         \n");
      out.write("                             <input type=\"email\" class=\"form-control\" placeholder=\"E-mail\">\n");
      out.write("                             <button type=\"submit\"><i class=\"fa-solid fa-paper-plane\"></i></button>\n");
      out.write("                         \n");
      out.write("                         </div>\n");
      out.write("                         </div>\n");
      out.write("                         </form>\n");
      out.write("                 </div>\n");
      out.write("                     <div class=\"row text-center bg-dark\">\n");
      out.write("                         \n");
      out.write("<div class=\"col-sm-3 text-warning\"><i class=\"fa-solid fa-phone\"></i>  Call Us: 7970997207</div>\n");
      out.write("<div class=\"col-sm-3 text-warning\"><i class=\"fa-solid fa-envelope\"></i>  Mail Us: bhawnachauhan@gmail.com</div>\n");
      out.write("<div class=\"col-sm-6 text-warning\"><i class=\"fa-solid fa-hat-cowboy\"></i>Join Us: Social Media Platform\n");
      out.write("<ul class=\"smi\">\n");
      out.write("<li><i class=\"fa-brands fa-instagram\"></i></li>\n");
      out.write("<li><i class=\"fa-brands fa-google\"></i></li>\n");
      out.write("<li><i class=\"fa-brands fa-facebook\"></i></li>\n");
      out.write("<li><i class=\"fa-brands fa-twitter\"></i></li>\n");
      out.write("<li><i class=\"fa-brands fa-whatsapp\"></i></li>\n");
      out.write("</ul>\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("<p class=\"text-info text-center fs-2\">&copy Copyright 2022-2023 All right reserved</p> \n");
      out.write("                     </div>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                                 <!--footer end -->");
      out.write("\n");
      out.write("            \n");
      out.write("            <!-- outer end -->\n");
      out.write("        </div>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}