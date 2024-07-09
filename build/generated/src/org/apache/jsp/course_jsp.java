package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/linkmaster.jsp");
    _jspx_dependants.add("/headermaster.jsp");
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
      out.write("             ");
      out.write("<div class=\"row bg-danger text-light\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    Call Us : +91 00000 00000\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    Email : email@gmail.com\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    Address : Lucknow,uttar-pradesh,India\n");
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
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"about.jsp\">About Us</a>\n");
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
      out.write("            <a class=\"nav-link\" href=\"registration.jsp\">Registration </a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"login.jsp\">Login </a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"contactus.jsp\">Contact Us </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav> \n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("               <div class=\"row p-0\">\n");
      out.write("                   <div class=\"col-sm-12\">\n");
      out.write("                       <div id=\"carouselExampleControls\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
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
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("               <div class=\"row mt-5\">\n");
      out.write("                     \n");
      out.write("                 \n");
      out.write("                   <div class=\"col-sm-12 text-center\">\n");
      out.write("                       <h4>COURSE DETAILS</h4>\n");
      out.write("                       \n");
      out.write("                       \n");
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
