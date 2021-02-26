<%-- 
    Document   : update
    Created on : Jul 24, 2019, 1:14:37 PM
    Author     : Administrator
--%>
<%@page import="java.sql.*"%>
<%
String ide=request.getParameter("id");
//int num=Integer.parseInt(ide);
String first_name=request.getParameter("first_name");
String last_name=request.getParameter("last_name");
//int city_name=Integer.parseInt(request.getParameter("city_name"));
String city_name=request.getParameter("city_name");

String email=request.getParameter("email");
try{
Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "usmsystems@1");
Statement st=null;
st=conn.createStatement();
st.executeUpdate("update users2 set first_name='"+first_name+"',last_name='"+last_name+"',city_name="+city_name+",email='"+email+"' where id='"+ide+"'");
response.sendRedirect("application.jsp");
}
catch(Exception e){
System.out.println(e);
}
%>