package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.DbManager;

public final class complain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <title>NOULMS || Course</title>\n");
      out.write("       ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\"/>\n");
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
      out.write("                       <h1>Complain Form</h1>\n");
      out.write("                       <form action=\"complaincode.jsp\" method=\"post\">\n");
      out.write("                           <table class=\"table table-bordered\" style=\"height: 250px\">\n");
      out.write("                               <tr>\n");
      out.write("                                   <th>\n");
      out.write("                                       Enter Subject\n");
      out.write("                                   </th>\n");
      out.write("                                   <td>\n");
      out.write("                                       <input type=\"text\" name=\"subject\" class=\"form-control\" required=\"\"/>\n");
      out.write("                                   </td>\n");
      out.write("                                   \n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <th>\n");
      out.write("                                       Enter complain text\n");
      out.write("                                       \n");
      out.write("                                   </th>\n");
      out.write("                                   <td>\n");
      out.write("                                       <textarea name=\"ctext\" class=\"form-control\" required=\"\"></textarea>\n");
      out.write("                                   </td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td colspan=\"2\" align=\"center\">\n");
      out.write("                                       <input type=\"submit\" class=\"btn btn-primary\" value=\"submit\"/>\n");
      out.write("                                   </td>\n");
      out.write("                               </tr>\n");
      out.write("                           </table> \n");
      out.write("                           <br>\n");
      out.write("                           <h4 class=\"text-center text-primary\">Complaint list</h4>\n");
      out.write("                           <table class=\"table table-bordered table-hover\">\n");
      out.write("                               <tr class=\"bg-danger\">\n");
      out.write("                                   <th>sr. no</th>\n");
      out.write("                                   <th>Enrollment no</th>\n");
      out.write("                                   <th>Student name</th>\n");
      out.write("                                   <th>subject</th>\n");
      out.write("                                   <th>Complaint text</th>\n");
      out.write("                                   <th>Status</th>\n");
      out.write("                                   <th>Approve Date</th>\n");
      out.write("                               </tr>\n");
      out.write("                               ");
 
                                String q="Select * from complain a left join studentinfo b on b.enrollmentno=a.enrollmentno where a.enrollmentno='"+session.getAttribute("studentid")+"'";
                                DbManager db=new DbManager();
                                ResultSet rs=db.selectQuery(q);
                                int n=1;
                                while(rs.next())
                                {
                                    
      out.write("\n");
      out.write("                                    <tr class=\"bg-info\">\n");
      out.write("                                        <td>");
      out.print(n );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString("enrollmentno") );
      out.write("</td>\n");
      out.write("                                         <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                                          \n");
      out.write("                                        <td>");
      out.print(rs.getString("subject") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString("Complaint Date") );
      out.write("</td>\n");
      out.write("                                         <td>");
      out.print(rs.getString("posteddate") );
      out.write("</td>\n");
      out.write("                                         <td>");
      out.print(rs.getString("status") );
      out.write("</td>\n");
      out.write("                                          <td>");
      out.print(rs.getString("statusdate") );
      out.write("</td>\n");
      out.write("                                    </tr>    \n");
      out.write("                                    \n");
      out.write("                                    ");

                                    n++;
                                }
                               
                                
                               
      out.write("\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                           </table>     \n");
      out.write("                       \n");
      out.write("                       </form>\n");
      out.write("                       \n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("          <!--header end-->\n");
      out.write("          \n");
      out.write("          ");
      out.write("<div class=\"row bg-dark py-4\">\n");
      out.write("              <div class=\"col-sm-3 text-center text-light mt-4\">\n");
      out.write("                  <img src=\"images/logo.png\" class=\"w-50\"/>\n");
      out.write("                  <h5>Nalanda Open University</h5>\n");
      out.write("              </div> \n");
      out.write("              <div class=\"col-sm-6 text-light text-center\">\n");
      out.write("                  <p>\n");
      out.write("                      Nalanda Open University<br/>\n");
      out.write("                      HOME | Contact us | FAQ | Terms & Conditions | Privacy Policy<br/> \n");
      out.write("                      Telephone :1234948390984<br/>\n");
      out.write("                      Fax : 2454059605679<br/>\n");
      out.write("                      Email : nou@nou.sc.in<br/>\n");
      out.write("                      website : nalanda.com.in<br/>\n");
      out.write("                      &copy;2011 Nalanda Open University All rights are Reserved<br/>\n");
      out.write("                  </p>\n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("              <div class=\"col-sm-3\"></div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          ");
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
