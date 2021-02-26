package org.apache.jsp.DEMO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--<script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js\"></script>-->\n");
      out.write("<html >\n");
      out.write("    <body onload=\"btnClick()\">\n");
      out.write("        \n");
      out.write("<style>\n");
      out.write("#tableA {\n");
      out.write("text-align: center;\n");
      out.write("border-collapse: collapse;\n");
      out.write("width: 45%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td {\n");
      out.write("  height: 120px;\n");
      out.write("  border: 1px solid black;\n");
      out.write("}\n");
      out.write("th {\n");
      out.write("  height: 10px;\n");
      out.write("  border: 1px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tableB {\n");
      out.write("text-align: center;\n");
      out.write("border-collapse: collapse;\n");
      out.write("width: 45%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td {\n");
      out.write("  height: 120px;\n");
      out.write("  border: 1px solid black;\n");
      out.write("}\n");
      out.write("th {\n");
      out.write("  height: 10px;\n");
      out.write("  border: 1px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*---------------------------------------------Veritaltext boxes names -------------*/\n");
      out.write("input {\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  text-align: center;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  border: 1;\n");
      out.write("  background-color: transparent;\n");
      out.write("  color: black;\n");
      out.write("  \n");
      out.write("  font-weight: bold;\n");
      out.write("  transition: ease-in-out, width .35s ease-in-out;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:hover,\n");
      out.write("input:focus {\n");
      out.write("  background-color: #bafff9;\n");
      out.write("  border-radius: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loc {\n");
      out.write("  font-size: 20px;\n");
      out.write("  width: 2.9cm;\n");
      out.write("  height: 0.9cm;\n");
      out.write("  -moz-transform: rotate(-90deg);\n");
      out.write("  -webkit-transform: rotate(-90deg);\n");
      out.write("  -o-transform: rotate(-90deg);\n");
      out.write("  -ms-transform: rotate(-90deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Let the borders collapse</h2>\n");
      out.write("\n");
      out.write("<form action=\"/action_page.php\">\n");
      out.write("<table id=\"tableA\">\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      <td rowspan=\"4\"><p class=\"rotated\">Table - 1</p></td>\n");
      out.write("      <td><input type=\"text\" class=\"loc\" id=\"loc\" name=\"loc\" value=\"RAVIKIRAN\"></td>\n");
      out.write("    <td><input type=\"text\" class=\"loc\" id=\"loc\" name=\"loc\" value=\"RAVIKIRAN\"></td>\n");
      out.write("    <td>3</td>\n");
      out.write("    <td>4</td>\n");
      out.write("    <td>5</td>\n");
      out.write("    <td>6</td>\n");
      out.write("    <td>7</td>\n");
      out.write("    <td>8</td>\n");
      out.write("    <td>9</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("<!--      <th><button value=\"name\">name</button></th>-->\n");
      out.write("<th>\n");
      out.write("  \n");
      out.write("    <input type=\"submit\" id=\"1F-01\" value=\"1F-01\">\n");
      out.write("    </th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>1</td>\n");
      out.write("    <td>2</td>\n");
      out.write("    <td>3</td>\n");
      out.write("    <td>4</td>\n");
      out.write("    <td>5</td>\n");
      out.write("    <td>6</td>\n");
      out.write("    <td>7</td>\n");
      out.write("    <td>8</td>\n");
      out.write("    <td>0</td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<table id=\"tableB\">\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      <td rowspan=\"4\">Table - 2</td>\n");
      out.write("    <td>1</td>\n");
      out.write("    <td>2</td>\n");
      out.write("    <td>3</td>\n");
      out.write("    <td>4</td>\n");
      out.write("    <td>5</td>\n");
      out.write("    <td>6</td>\n");
      out.write("    <td>7</td>\n");
      out.write("    <td>8</td>\n");
      out.write("    <td>9</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>name</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>1</td>\n");
      out.write("    <td>2</td>\n");
      out.write("    <td>3</td>\n");
      out.write("    <td>4</td>\n");
      out.write("    <td>5</td>\n");
      out.write("    <td>6</td>\n");
      out.write("    <td>7</td>\n");
      out.write("    <td>8</td>\n");
      out.write("    <td>9</td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("<script type=\"text/javascript\">\n");
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
