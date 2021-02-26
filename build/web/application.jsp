<%-- 
    Document   : application
    Created on : Jul 24, 2019, 1:13:31 PM
    Author     : Administrator
--%>


<%@ page import="java.sql.*" %>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String userid= request.getParameter("userid");
     Cookie ck=new Cookie("auth", userid);
      ck.setMaxAge(600);
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
         response.addCookie(ck);
          response.sendRedirect("index.jsp");
       
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>

<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>USM</title>
       <link rel="shortcut icon" href="images/usm.ico">
             
       <script src="js/Export.js"></script>
       <script src="js/Filtering.js"></script>
    
       
       
       <style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  /*table-layout:fixed;*/
}

#customers td, #customers th {
  border: 1px solid #ddd;
 font-size: 13px;
    word-wrap:break-word;
  /*white-space: nowrap;*/
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
  

}
</style>


<script language="javascript">
function editRecord(id){
    var f=document.form;
    f.method="post";
    f.action='edit.jsp?sno='+id;
    f.submit();
}
function deleteRecord(id){
    var f=document.form;
    f.method="post";
    f.action='delete.jsp?id='+id;
    f.submit();
}

</script>

<script type="text/javascript">
                    function preventBack() { window.history.forward();
                    } 		 
                    setTimeout("preventBack()", 0); 		 
                    window.onunload = function () { null }; 		
                </script>

</head>
<body>

<br><br>
<form method="post" name="form">
<table border="1" id="customers">
    
    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Port number.." title="Type in a name">
    <input type="text" id="myInput1" onkeyup="myFunction1()" placeholder="Search for VoIP Phones.." title="Type in a name">
   
     <a href="new_entry.jsp"><input type="button" value="Register New Computer"></a><input type="button" onclick="tableToExcel('customers', 'HYD_Inventory')" value="Export to Excel"><a href="application_1.jsp"><input type="button" value="New App_Data"></a>
     <a href=java -jar "C:/Users/Administrator/Documents/NetBeansProjects/TEST-App/test_app/dist/test_app.jar"><input type="button" value="Java Swing"></a>
    <tr><th>Sno</th><th>PORT_NO</th><th>Location</th><th>M_NAME</th><th>M_DEPT</th><th>M_ORG</th><th>N_NAME</th><th>N_DEPT</th><th>N_ORG</th><th>RAM</th>
    <th>PROCESSER</th><th>HDD</th><th>MOUSE</th><th>KEYBOARD</th><th>MONITOR</th><th>Operating system</th><th>VOIP_PHONE</th><th>IP_ADDRESS</th><th>MAC_ID</th><th>EXT_NO</th><th>Date</th><th>Asset Code</th> </tr>

<!--<tr><th>Name</th><th>Address</th><th>Contact No</th><th>Email</th></tr>-->
<%
Connection con = null;
String url = "jdbc:mysql://localhost:3306/";
String db = "usm";
String driver = "com.mysql.jdbc.Driver";
String userName ="root";
String password="usmsystems@1";

int sumcount=0;
Statement st;
try{
Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);
String query = "select * from hyd_inventory";
st = con.createStatement();
ResultSet rs = st.executeQuery(query);
%>
<%
while(rs.next()){
%>

<tr>
<td><%=rs.getString("SNO")%></td>
<td><%=rs.getString("PORT_NO")%></td>
<td><%=rs.getString("LOCATION")%></td>
<td><%=rs.getString("M_NAME")%></td>
<!--<td><%=rs.getString("M_EMP")%></td>-->
<td><%=rs.getString("M_DEPT")%></td>
<td><%=rs.getString("M_ORG")%></td>
<td><%=rs.getString("N_NAME")%></td>
<!--<td><%=rs.getString("N_EMP")%></td>-->
<td><%=rs.getString("N_DEPT")%></td>
<td><%=rs.getString("N_ORG")%></td>

<td><%=rs.getString("RAM")%></td>
<td><%=rs.getString("PROCESSER")%></td>
<td><%=rs.getString("HDD")%></td>
<td><%=rs.getString("MOUSE")%></td>
<td><%=rs.getString("KEYBOARD")%></td>
<td><%=rs.getString("MONITOR")%></td>
<td><%=rs.getString("OS")%></td>
<td><%=rs.getString("VOIP_PHONE")%></td>
<td><%=rs.getString("IP_ADDRESS")%></td>
<td><%=rs.getString("MAC_ID")%></td>
<td><%=rs.getString("EXT_NO")%></td>
<td><%=rs.getString("MOD_DATE")%></td>
<td><%=rs.getString("ASSET_CODE")%></td>


<td><input type="button" name="edit" value="Edit" style="background-color:green;font-weight:bold;color:white;" onclick="editRecord(<%=rs.getString("SNO")%>);" ></td>
<td><input type="button" name="delete" value="Delete" style="background-color:#ff0000;font-weight:bold;color:#ffffff;" onclick="deleteRecord(<%=rs.getString("SNO")%>);" ></td>

</tr>
<%
}
%>
<%
}
catch(Exception e){
e.printStackTrace();
}
%>
</table>
</form>
</body>
</html>


<%
    }
%>