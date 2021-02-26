package org.apache.jsp.DEMO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"btnClick()\">\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("     function btnClick()\n");
      out.write("    {\n");
      out.write("           var cells = document.getElementById(\"tableA\").getElementsByTagName(\"td\");\n");
      out.write("for (var i = 0; i < cells.length; i++) {\n");
      out.write("    if (cells[i].innerHTML == \"0\") {\n");
      out.write("        cells[i].style.backgroundColor = \"Green\";\n");
      out.write("    }\n");
      out.write("}    \n");
      out.write("   var cells = document.getElementById(\"tableB\").getElementsByTagName(\"td\");\n");
      out.write("for (var i = 0; i < cells.length; i++) {\n");
      out.write("    if (cells[i].innerHTML == \"0\") {\n");
      out.write("        cells[i].style.backgroundColor = \"Green\";\n");
      out.write("    }\n");
      out.write("}    \n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            table {\n");
      out.write("                \n");
      out.write("            border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write(".wrapper {\n");
      out.write("    width:60px;\n");
      out.write("    border: none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".rotate {\n");
      out.write("    transform: rotate(-90deg) translateX(-100%);\n");
      out.write("    /*position: absolute;    */\n");
      out.write("}\n");
      out.write("\n");
      out.write("input, select, textarea {\n");
      out.write("font-size: 150%;\n");
      out.write(" cursor: pointer;\n");
      out.write(" background-color: transparent;\n");
      out.write(" border: 0;\n");
      out.write(" border-radius: 15px;\n");
      out.write("}\n");
      out.write("td {\n");
      out.write("    text-align: center;\n");
      out.write("    \n");
      out.write("    /* center checkbox horizontally */\n");
      out.write("    /*vertical-align: middle; /* center checkbox vertically */\n");
      out.write("}\n");
      out.write("        th {\n");
      out.write("    text-align: center;\n");
      out.write("    \n");
      out.write("    /* center checkbox horizontally */\n");
      out.write("    /*vertical-align: middle; /* center checkbox vertically */\n");
      out.write("}</style>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        \n");
      out.write("        ");

String id = request.getParameter("sno");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "usm";
String userId = "root";
String password = "usmsystems@1";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <form class=\"form-inline\" method=\"post\" action=\"search.jsp\">\n");
      out.write("            \n");
      out.write("       \n");
      out.write("        <table border=\"1\" id=\"tableA\">\n");
      out.write("    <tr>\n");
      out.write(" \n");
      out.write("        <td rowspan=\"4\"><p class=\"rotated\">Table - 1</p></td>\n");
      out.write("        <td height=\"200\" width=\"20\" >\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                       ");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM hyd_inventory where sno='"+id+"' ";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("                <input size=\"10\" maxlength=\"10\" name=\"sno\" class=\"form-control\" placeholder=\"Search roll no..\" value=\"");
      out.print(resultSet.getString("M_EMP") );
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        ");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("               \n");
      out.write("    </tr>\n");
      out.write("       \n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"18\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"17\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"16\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"15\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"14\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"13\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"12\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"11\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"10\"></th>\n");
      out.write("  \n");
      out.write("   \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"01\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"02\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"3\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"04\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"05\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"06\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"07\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"08\"></th>\n");
      out.write("    <th><input type=\"submit\" id=\"1F-01\" value=\"09\"></th>\n");
      out.write("   \n");
      out.write("  </tr>\n");
      out.write("    <tr>\n");
      out.write("       \n");
      out.write("        <td height=\"200\" width=\"20\" >\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("        <td height=\"200\" width=\"20\">\n");
      out.write("            <div class=\"wrapper rotate\">\n");
      out.write("                <input size=\"10\" maxlength=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("               \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("    </form>\n");
      out.write("       \n");
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
