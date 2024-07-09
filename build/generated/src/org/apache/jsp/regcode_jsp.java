package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connect.DbManager;

public final class regcode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    String enrollmentno=request.getParameter("enrollmentno");
    String name=request.getParameter("name");
    String fname=request.getParameter("fname");
    String mname=request.getParameter("mname");
    String gender=request.getParameter("a");
    
    String address=request.getParameter("address");
    String contactno=request.getParameter("contactno");
    String email=request.getParameter("email");
    String dob=request.getParameter("dob");
    String adhar=request.getParameter("aadhar");
    String course=request.getParameter("course");
    String year=request.getParameter("year");
    String centername=request.getParameter("centername");
    
    String password=request.getParameter("password");
    
    //insert query
    String cmd="insert into studentinfo(enrollmentno,name,fname,mname,gender,address,contactno,emailaddress,dob,aadharno,course,year,centername,registrationdate,pwd) values('"+enrollmentno+"','"+name+"','"+fname+"','"+mname+"','"+gender+"','"+address+"','"+contactno+"','"+email+"','"+dob+"','"+adhar+"','"+course+"','"+year+"','"+centername+"',curdate(),'"+password+"')";
    //out.print(cmd);
    DbManager db=new DbManager();
    boolean status=db.insertUpdateDelete(cmd);
    if(status==true)
    {
        
      out.write("\n");
      out.write("        <script>alert('registration successfully done');\n");
      out.write("            window.location.href=\"registration.jsp\";        </script>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        ");

    }
    else{
        
      out.write("\n");
      out.write("        \n");
      out.write("    <script>alert('registration is not done successfully ');\n");
      out.write("            window.location.href=\"registration.jsp\";        </script>\n");
      out.write("    \n");
      out.write("    ");

    }
    
    
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
