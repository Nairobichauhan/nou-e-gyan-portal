package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.DbManager;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/linkmaster.jsp");
    _jspx_dependants.add("/headermaster.jsp");
    _jspx_dependants.add("/notice.jsp");
    _jspx_dependants.add("/footermaster.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>NOULM || HOME</title>\n");
      out.write("        \n");
      out.write("        ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("  <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"css/style1.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"css/style1.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <script src=\"js/bootstrap.bundle.js\"></script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("   <script>\n");
      out.write("      window.history.forward();\n");
      out.write("      function unload()\n");
      out.write("      {\n");
      out.write("          window.history.forward();\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("     window.setTimeout(\"unload()\",10);\n");
      out.write("      \n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  ");
      out.write("\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            \n");
      out.write("            ");
      out.write("<!-- headline start -->\n");
      out.write("            <div class=\"row bg-danger text-light p-0\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <b><i class=\"fa-sharp fa-solid fa-phone\"></i> call us :+91000000</b>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <b><i class=\"fa-regular fa-envelope\"></i> email :email@gmail.com</b>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <b><i class=\"fa-solid fa-landmark\"></i> Address :Lucknow,Uttar Pradesh</b>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div> \n");
      out.write("            <!--headline end-->\n");
      out.write("            \n");
      out.write("             <!--header start-->\n");
      out.write("            <div class=\"row p-0\">\n");
      out.write("                <div class=\"col-sm-1 mt-4 ms-5\">\n");
      out.write("                    <img src=\"images/logo.png\" class=\"logo\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-7 mt-4\">\n");
      out.write("                    <h4 style=\"color:darkred; font-size:30px;\">NOU e-Gyan PORTAL</h4>\n");
      out.write("                    <p>(A Concept By Nalanda Open University)</p>\n");
      out.write("                </div>\n");
      out.write("            <!----    <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"col-sm-1\"  style=\"height:20px; width:20px; border:1px solid red; border-radius: 100px;\">y</div>\n");
      out.write("                    <div class=\"col-sm-1\"  style=\"height:20px; width:20px; border:1px solid red; border-radius: 100px;\"></div>\n");
      out.write("                    <div class=\"col-sm-1\"  style=\"height:20px; width:20px; border:1px solid red; border-radius: 100px;\"></div>\n");
      out.write("                </div>--->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!--header end-->\n");
      out.write("            \n");
      out.write("             <!--navbar--->\n");
      out.write("            \n");
      out.write("            <div class=\"row mt-3\">\n");
      out.write("                <div class=\"col-sm-3 bg-light\" style=\"color:darkred; font-size:25px; font-weight: bold;\">WELCOME STUDENT !!</div>\n");
      out.write("              <div class=\"col-sm-9 p-0 bg-warning\">\n");
      out.write("                   <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">NOULMS</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\"><b>Home</b></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"about.jsp\"><b>Abouts Us</b></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("              <b>Course</b>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"course.jsp\">Courses</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"studycenter.jsp\">Study Centers</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"registration.jsp\"><b>Registration</b></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"login.jsp\"><b>Login</b></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"contactus.jsp\"><b>Contact Us</b></a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
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
      out.write("             <!--slider-->\n");
      out.write("            <div class=\"row mt-0\">\n");
      out.write("                <div class=\"col-sm-12 p-0\">\n");
      out.write("                    <div id=\"carouselExampleSlidesOnly\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"images/slider1.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"images/slider2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"images/slider3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <!---slider end-->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("           \n");
      out.write("            <!-- notification box-->\n");
      out.write("            <div class=\"row  mt-5 p-0\">\n");
      out.write("                <div class=\"col-sm-4 border p-0\">\n");
      out.write("                    <div class=\"bg-danger text-light p-1 rounded rounded-3 text-center\" style=\"height: 500px;\" >\n");
      out.write("                        <h4>Notice Board</h4>\n");
      out.write("                        <br>\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<marquee direction=\"up\" behavior=\"scroll\" onmousemove=\"this.stop()\" onmouseout=\"this.start()\" scrollamount=\"10\"  style=\"height: 300px;\">\n");
      out.write("    <ul  >\n");
      out.write("    ");

      String cmd="select * from notification";
      DbManager db=new DbManager();
      ResultSet rs=db.selectQuery(cmd);
      while(rs.next())
      {
      
      out.write("\n");
      out.write("      <li> <img src=\"images/new.gif\" height=\"50px\" width=\"50px\" /> ");
      out.print(rs.getString("ntext") );
      out.write("</li>\n");
      out.write("      ");

      }
    
      out.write("\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("</marquee>");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <h3 style=\"font-weight:bold;\">About Nalanda Open University</h3>\n");
      out.write("                    <p style=\"font-weight:bold;\"><span style=\"font-size: 30px; color:red;\"><b>T</b></span>he Nalanda Open University is the only University in\n");
      out.write("the State of Bihar meant for imparting learning\n");
      out.write("exclusively through the system of distance education.\n");
      out.write("The University was established in March, 1987 by an\n");
      out.write("ordinance, promulgated by the Government of Bihar.\n");
      out.write("Later, Nalanda Open University Act, 1995 was passed by\n");
      out.write("the Bihar Legislature, replacing the Ordinance, and the\n");
      out.write("University came under the authority and jurisdiction of\n");
      out.write("the new Act automatically. The University is named after\n");
      out.write("the famous Nalanda University of Ancient India.</p>\n");
      out.write("                    <p><span style=\"font-size:20px; color:yellow;\">N</span>alanda Open University welcomes all our students, faculties & study centres to the very new & innovative online study portal NOU e-Gyan. The portal is a unique initiative by Hon'ble Vice-Chancellor Prof. (Dr.) K C Sinha, which aims at providing online study material to the students of NOU.\n");
      out.write("The portal is accessible from any hook and corner of the world if the system allows the permission to its users. It is also fully secured and accessible 24 x 7 to its authorised users. It will resolve the academic issues such as E-content Distribution, Delivery, Tracking, Assessment, Progress Monitoring & Controlling of all stakeholders of the system i.e. students, teachers, study centre administrators as well as Nalanda Open University Admins when they are at a distance.</p>\n");
      out.write("                </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--notification end-->\n");
      out.write("                    \n");
      out.write("                    <!--users of the portal-->\n");
      out.write("                    \n");
      out.write("                    <div  class=\"row mt-4 bg-light\" >\n");
      out.write("                        <b style=\"margin-left: 120px;\">USERS-----</b>\n");
      out.write("                        <h2 style=\"margin-left: 120px;\">USERS<span style=\"color:darkred;\"> OF THE PORTAL</span></h2>\n");
      out.write("                        <div class=\"row mt-3 bg-light mb-5\">\n");
      out.write("                            <div class=\"col-sm-1 bg-light\"></div>\n");
      out.write("                            <div class=\"col-sm-3 ms-5\">\n");
      out.write("                            <div class=\"card border border-2 border-warning rounded-5\" style=\"width: 18rem;\">\n");
      out.write("                                <center> <i class=\"fa-solid fa-lock\" style=\"font-size:50px; border:1px solid white; border-radius: 120px; height:70px; width:80px; background-color:darkred; color:white;\"></i></center>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("      <p class=\"card-text\" style=\"margin-top: 15px; margin-left: 17px;\"><b>The university admin can login to monitor the portal, provide access to authorised stake holders & upload study material.The university  can.</b></p>\n");
      out.write("    <a href=\"#\" class=\"btn\" style=\"background-color:orange; border-radius: 50px; margin-left: 50px; color:darkred; font-weight: bold;\">University Admin</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3 ms-4\">\n");
      out.write("                                <div class=\"card border border-2 border-warning rounded-5\" style=\"width: 18rem;\">\n");
      out.write("                                    <center><i class=\"fa-solid fa-book\" style=\"font-size:45px; border:1px solid white; border-radius: 120px; height:70px; width:80px; background-color:darkred; color:white;\"></i></center>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("      <p class=\"card-text\" style=\"margin-top: 15px; margin-left: 15px;\"><b>The study centres authorised personnel can login to track students progress, enroll students, schedule assignments & generate reports.</b></p>\n");
      out.write("    <a href=\"#\" class=\"btn\"  style=\"background-color:orange; border-radius: 50px; margin-left: 70px; color:darkred; font-weight: bold;\">Study Center</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3 ms-4\" box box-shadow=\"\">\n");
      out.write("                                <div class=\"card border border-2 border-warning rounded-5\" style=\"width: 18rem;\">\n");
      out.write("                                    <center><i class=\"fa-solid fa-users\" style=\"font-size:50px; border:1px solid white; border-radius: 120px; height:70px; width:80px; background-color:darkred; color:white;\"></i></center>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("      <p class=\"card-text\" style=\"margin-top: 15px; margin-left: 14px;\"><b>The university enrolled students can login to view the notification by university, access the e-contents, give assignments & track thier.</b></p>\n");
      out.write("    <a href=\"#\" class=\"btn\"  style=\"background-color:orange; border-radius: 50px; margin-left: 65px; color:darkred; font-weight: bold;\">NOU Students</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                                  \n");
      out.write("            <!--- users portal end-->\n");
      out.write("            \n");
      out.write("            <!--student feature-->\n");
      out.write("            <div class=\"row mt-3\">\n");
      out.write("                <b style=\"margin-left: 40px; color:lightgray;\">FEATURS-----</b>\n");
      out.write("                <h2 style=\"margin-left: 40px;\">STUDENT<span style=\"color:darkred;\"> SERVICES</span></h2></div>\n");
      out.write("            <div class=\"row mt-3 mb-2\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                   \n");
      out.write("                    <div class=\"card ms-5\" style=\"width: 18rem;\">\n");
      out.write("                        <img src=\"images/s1.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>Login</b>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                   <div class=\"card ms-4\" style=\"width: 18rem;\">\n");
      out.write("  <img src=\"images/s2.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>Dashboard</b>\n");
      out.write("  </div>\n");
      out.write("</div> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <div class=\"card ms-2\" style=\"width: 18rem;\">\n");
      out.write("  <img src=\"images/s3.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>Self Learning Material (SLM)</b>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("  <img src=\"images/s4.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>e-Books</b>\n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("  </div>\n");
      out.write("                \n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row mt-3 mb-5\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                   \n");
      out.write("                    <div class=\"card ms-5\" style=\"width: 18rem;\">\n");
      out.write("                        <img src=\"images/selftool.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>Self-Assessment Tools</b>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                   <div class=\"card ms-4\" style=\"width: 18rem;\">\n");
      out.write("  <img src=\"images/s6.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>Performance</b>\n");
      out.write("  </div>\n");
      out.write("</div> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <div class=\"card ms-2\" style=\"width: 18rem;\">\n");
      out.write("  <img src=\"images/s7.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>Feedback</b>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("  <img src=\"images/s8.png\" class=\"card-img-top\" alt=\"...\" style=\"height:240px; width:240px; border:1px solid white; border-radius:20px 20px 20px 20px; margin-left: 20px; margin-top: 40px; margin-bottom: 30px;\">\n");
      out.write("  <div class=\"col-sm-12 bg-danger text-center text-white\">\n");
      out.write("      <b>Courses-Catalogue</b>\n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("  </div>\n");
      out.write("                \n");
      out.write("  </div>\n");
      out.write("         <!---student feature end-->\n");
      out.write("            \n");
      out.write("           <!--photo teacher of nou-->\n");
      out.write("           <div class=\"row bg-light \">\n");
      out.write("               <div class=\"col-sm-12 mb-3\">\n");
      out.write("        <b style=\"margin-left: 60px; color:lightgray;\">OURS MENTERS-----</b>\n");
      out.write("        <h2 style=\"margin-left: 60px;\">ADMINISTRATIVE<span style=\"color:darkred;\"> SETUP</span></h2> </div> \n");
      out.write(" \n");
      out.write("               <div class=\"col-sm-3 mb-5\">\n");
      out.write("                   <div class=\"card\" style=\"width: 15rem; margin-left: 80px;\">\n");
      out.write("  <img src=\"images/kc.png\" class=\"card-img-top\" alt=\"...\" style=\"height:140px; width:140px; border:1px solid yellow; border-radius:100px;; margin-left: 40px; margin-top: 20px; margin-bottom:4px;\">\n");
      out.write("  <font style=\"text-align: center; color:darkred; font-size: 20px;\">Prof. (Dr.) K. C. Sinha</font>\n");
      out.write("  <center> <p>VICE CHANCELLOR</p></center>\n");
      out.write("</div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-sm-3\">\n");
      out.write("                   <div class=\"card\" style=\"width: 15rem; margin-left: 60px;\">\n");
      out.write("  <img src=\"images/sangay.png\" class=\"card-img-top\" alt=\"...\" style=\"height:140px; width:140px; border:1px solid yellow; border-radius:100px;; margin-left:40px; margin-top: 20px; margin-bottom: 8px;\">\n");
      out.write("  <font style=\"text-align: center; color:darkred; font-size: 20px;\">Prof. (Dr.) Sanjoy Kumar</font>\n");
      out.write("  <center> <p>VICE CHANCELLOR</p></center>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-sm-3\">\n");
      out.write("                   <div class=\"card\" style=\"width: 15rem; margin-left: 35px;\">\n");
      out.write("  <img src=\"images/ghan.png\" class=\"card-img-top\" alt=\"...\" style=\"height:140px; width:140px; border:1px solid yellow; border-radius:100px;; margin-left: 40px; margin-top: 20px; margin-bottom: 8px;\">\n");
      out.write("  <font style=\"text-align: center; color:darkred; font-size: 20px;\">Dr. Ghanshyam Roy</font>\n");
      out.write("  <center> <p>REGISTRAR</p></center>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-sm-3\">\n");
      out.write("                   <div class=\"card\" style=\"width: 15rem;\">\n");
      out.write("  <img src=\"images/neelam.png\" class=\"card-img-top\" alt=\"...\" style=\"height:140px; width:140px; border:1px solid yellow; border-radius:100px; margin-left: 40px; margin-top: 20px; margin-bottom: 8px;\">\n");
      out.write("  <font style=\"text-align: center; color:darkred; font-size: 20px;\">Dr. Neelam Kumari</font>\n");
      out.write("  <center> <p> EXAM REGISTRAR</p></center>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           <!----photo end---->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");
      out.write("     <!--footer start -->\n");
      out.write("             \n");
      out.write("             <div class=\"row bg-dark py-4 mt-3\">\n");
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