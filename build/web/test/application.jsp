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
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>

<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<html>
<head>
    
    <style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
 font-size: 13px;
    word-wrap:break-word;

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

<script>
function myFunction() {
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("customers");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
      //search field value as a column number[2] is port number//
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
</head>
<body>

<br><br>
<form method="post" name="form">
<table border="1" id="customers">
    
    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Port number.." title="Type in a name">
    <a href="new_entry.jsp"><input type="button" value="Register New Computer"></a>
    <tr><th>Sno</th><th>PORT_NO</th><th>Location</th><th>M_NAME</th><th>M_DEPT</th><th>M_ORG</th><th>N_NAME</th><th>N_DEPT</th><th>N_ORG</th><th>RAM</th>
    <th>PROCESSER</th><th>HDD</th><th>MOUSE</th><th>KEYBOARD</th><th>MONITOR</th><th>Operating system</th><th>VOIP_PHONE</th><th>IP_ADDRESS</th><th>MAC_ID</th><th>EXT_NO</th> </tr>

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
<td><%=rs.getString(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<!--<td><%=rs.getString(5)%></td>-->
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
<td><%=rs.getString(8)%></td>
<!--<td><%=rs.getString(9)%></td>-->
<td><%=rs.getString(10)%></td>
<td><%=rs.getString(11)%></td>
<td><%=rs.getString(12)%></td>
<td><%=rs.getString(13)%></td>
<td><%=rs.getString(14)%></td>
<td><%=rs.getString(15)%></td>
<td><%=rs.getString(16)%></td>
<td><%=rs.getString(17)%></td>
<td><%=rs.getString(18)%></td>
<td><%=rs.getString(19)%></td>
<td><%=rs.getString(20)%></td>
<td><%=rs.getString(21)%></td>
<td><%=rs.getString(22)%></td>




<td><input type="button" name="edit" value="Edit" style="background-color:green;font-weight:bold;color:white;" onclick="editRecord(<%=rs.getString(1)%>);" ></td>
<td><input type="button" name="delete" value="Delete" style="background-color:#ff0000;font-weight:bold;color:#ffffff;" onclick="deleteRecord(<%=rs.getString(1)%>);" ></td>

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