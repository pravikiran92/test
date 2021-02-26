<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/test";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String id = request.getParameter("id");
		String PORT_NO = request.getParameter("PORT_NO");
		String M_NAME = request.getParameter("M_NAME");
		String M_DEPT = request.getParameter("M_DEPT");
                String M_ORG = request.getParameter("M_ORG");
                String N_NAME = request.getParameter("N_NAME");
		String N_DEPT = request.getParameter("N_DEPT");
		String N_ORG = request.getParameter("N_ORG");
		String RAM = request.getParameter("RAM");
                String PROCESSER = request.getParameter("PROCESSER");
                String HDD = request.getParameter("HDD");
		String MOUSE = request.getParameter("MOUSE");
		String KEYBOARD = request.getParameter("KEYBOARD");
		String MONITOR = request.getParameter("MONITOR");
                String OS = request.getParameter("OS");
                String VOIP_PHONE = request.getParameter("VOIP_PHONE");
		String IP_ADDRESS = request.getParameter("IP_ADDRESS");
		String MAC_ID = request.getParameter("MAC_ID");
		String EXT_NO = request.getParameter("EXT_NO");
                String MOD_DATE = request.getParameter("MOD_DATE");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update users set PORT_NO=?,M_NAME=?,M_DEPT=?,M_ORG=?,N_NAME=?,N_DEPT=?,N_ORG=?,RAM=?,PROCESSER=?,HDD=?,MOUSE=?,KEYBOARD=?,MONITOR=?,OS=?,VOIP_PHONE =?,IP_ADDRESS=?,MAC_ID=?,EXT_NO=?,MOD_DATE=? where id="+id;
ps = con.prepareStatement(sql);

ps.setString(2, first_name);
ps.setString(3, last_name);
ps.setString(4, city_name);
ps.setString(5, email);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>