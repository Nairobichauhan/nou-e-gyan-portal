package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.DbManager;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--studentzone feedback-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <title>NOULMS || feedback</title>\n");
      out.write("       ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\"/>\n");
      out.write("         <link href=\"css/style1.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script>");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("              \n");
      out.write("            ");
      out.write("\n");
      out.write("<div class=\"row bg-danger text-light\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    Welcome to student zone\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    ");
      out.print(new DbManager().getDate());
      out.write(" \n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    ");
      out.print(session.getAttribute("studentid"));
      out.write("\n");
      out.write("                </div>  \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("           <!-- headline end -->\n");
      out.write("           <!--header start-->\n");
      out.write("           <div class=\"row\">\n");
      out.write("               <div class=\"col-sm-1 p-0\"> \n");
      out.write("                   <img src=\"images/logo.png\" class=\"logo\"/>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-sm-7 py-3\">\n");
      out.write("                   <h4>Nalanda eGyan Portal</h4>\n");
      out.write("                   <p>(An Initiative Taken By Nalanda Open University)</p>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-sm-4\">\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"row\">\n");
      out.write("               <div class=\"col-sm-12 p-0\">\n");
      out.write("                  <nav class=\"navbar navbar-expand-lg bg-light\">\n");
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
      out.write("          <a class=\"nav-link\" href=\"feedback.jsp\">Feedback</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Course\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"course.jsp\">Courses</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"studycenter.jsp\">Study Center</a></li>\n");
      out.write("             \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"complain.jsp\">complaint</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"changepassword.jsp\">change password</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"logout.jsp\">Log Out</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav> \n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("\n");
      out.write("             \n");
      out.write("               <div class=\"row mt-5\">\n");
      out.write("                     \n");
      out.write("                 \n");
      out.write("                   <div class=\"col-sm-12 text-center\">\n");
      out.write("                       <h1>Feedback Form </h1>\n");
      out.write("                       <hr/>\n");
      out.write("                       <form action=\"feedbackcode.jsp\" method=\"post\">\n");
      out.write("                           <table class=\"table-bordered\" style=\"height:200px\">\n");
      out.write("                               <tr>\n");
      out.write("                                   <th>\n");
      out.write("                                       Enter Subject :\n");
      out.write("                                   </th>\n");
      out.write("                                   <td>\n");
      out.write("                                       <input type=\"text\" name=\"subject\" required=\"\" class=\"form-control\"/>\n");
      out.write("                                   </td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <th>\n");
      out.write("                                       Enter Feedback Text :\n");
      out.write("                                   </th>\n");
      out.write("                                   <td>\n");
      out.write("                                       <textarea name=\"ftext\" required=\"\"></textarea>\n");
      out.write("                                   </td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td colspan=\"2\" align=\"center\">\n");
      out.write("                                       <input type=\"submit\" class=\"btn btn-primary\" class=\"form-control\" value=\"Feedback Submit\"/>   \n");
      out.write("                                   </td>\n");
      out.write("                               </tr>\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                           </table>\n");
      out.write("                           <br/>\n");
      out.write("                           <table class=\" table table-bordered table-hover\">\n");
      out.write("                               <tr class=\"bg-success\">\n");
      out.write("                                   <th>sr no.</th>\n");
      out.write("                                   <th>Enrollment no</th>\n");
      out.write("                                   <th>student name</th>\n");
      out.write("                                   <th>subject</th>\n");
      out.write("                                   <th>Feedback Text</th>\n");
      out.write("                                   <th>Post Date</th>\n");
      out.write("                                   \n");
      out.write("                               </tr>\n");
      out.write("                               ");

                                   String cmd="Select * from feedback a left join studentinfo b on a.enrollmentno=b.enrollmentno where a.enrollmentno='"+session.getAttribute("studentid")+"'";
                                   DbManager db=new DbManager();
                                   ResultSet rs=db.selectQuery(cmd);
                                   
                                   int n=1;
                                   while(rs.next())
                                   {
                                       
      out.write("\n");
      out.write("                                       <tr class=\"bg-warning\">\n");
      out.write("                                           <td>\n");
      out.write("                                            ");
      out.print(n );
      out.write("   \n");
      out.write("                                           </td>\n");
      out.write("                                           <td>");
      out.print(rs.getString("enrollmentno"));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString("subject"));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString("feedbacktext"));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString("posteddate"));
      out.write("</td>\n");
      out.write("                                           \n");
      out.write("                                       </tr>\n");
      out.write("                                       ");

                                    n++; }
                               
      out.write("\n");
      out.write("                           </table>\n");
      out.write("                               \n");
      out.write("                           \n");
      out.write("                       </form>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("          <!--header end-->\n");
      out.write("          \n");
      out.write("          ");
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
      out.write("<div class=\"col-sm-3 text-warning\"><i class=\"fa-solid fa-envelope\"></i>  Mail Us: mukulroy4042@gmail.com</div>\n");
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
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
