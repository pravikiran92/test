<%-- 
    Document   : edit
    Created on : Jul 24, 2019, 1:14:08 PM
    Author     : Administrator
--%>

<%@page language="java"%>
<%@page import="java.sql.*"%>

<html>
<head>
 <style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 80%;
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
<script src="js/jquary.date.ref.ip.status.js"></script>
</head>
<body onload="addDate()">

</body>

<form method="post" action="update2.jsp" >
<table border="1" id="customers">
<tr><th>Sno</th><th>PORT_NO</th><th>M_NAME</th><th>M_DEPT</th><th>M_ORG</th><th>N_NAME</th><th>N_DEPT</th><th>N_ORG</th><th>RAM</th>
    <th>PROCESSER</th><th>HDD</th><th>MOUSE</th><th>KEYBOARD</th><th>MONITOR</th><th>OS</th><th>VOIP_PHONE</th><th>IP_ADDRESS</th><th>MAC_ID</th><th>EXT_NO</th> </tr>
<%
String id=request.getParameter("sno");
int no=Integer.parseInt(id);
int sumcount=0;
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usm", "root", "usmsystems@1");
String query = "select * from hyd_inventory where sno='"+no+"'";
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()){
%>


<tr><td>Asset Code</td><td><input type="text" name="ASSET_CODE" value="<%=rs.getString("ASSET_CODE")%>" ></td></td></tr>

<tr><td>Reg. Date</td><td><input type="text" name="" value="<%=rs.getString("REG_DATE")%>" readonly></td></td></tr>
<tr><td>Modifed Date</td><td><input type="text" name="MOD_DATE" id="open_date" readonly></td></td></tr>


<tr><td>Sno</td><td><input type="text" name="id" value="<%=rs.getString(1)%>"></td></td></tr>
<tr><td>PORT_NO</td><td><input type="text" name="PORT_NO" value="<%=rs.getString("PORT_NO")%>"></td></tr>

<tr><td>M_NAME</td><td><input type="text" name="M_NAME" value="<%=rs.getString("M_NAME")%>"></td>
<!--<td><input type="text" name="M_EMP" value="<%=rs.getString("M_EMP")%>"></td>-->
<td>M_DEPT</td><td><input type="text" name="M_DEPT" value="<%=rs.getString("M_DEPT")%>"></td>
<td>M_ORG</td><td><input type="text" name="M_ORG" value="<%=rs.getString("M_ORG")%>"></td></tr>
<tr><td>N_NAME</td><td><input type="text" name="N_NAME" value="<%=rs.getString("N_NAME")%>"></td>
<!--<td><input type="text" name="N_EMP" value="<%=rs.getString("N_EMP")%>"></td>-->
<td>N_DEPT</td><td><input type="text" name="N_DEPT" value="<%=rs.getString("N_DEPT")%>"></td>
<td>N_ORG</td><td><input type="text" name="N_ORG" value="<%=rs.getString("N_ORG")%>"></td></tr>
<tr><td>RAM</td><td><input type="text" name="RAM" value="<%=rs.getString("RAM")%>"></td></tr>
<tr><td>PROCESSER</td><td><input type="text" name="PROCESSER" value="<%=rs.getString("PROCESSER")%>"></td></tr>
<tr><td>HDD</td><td><input type="text" name="HDD" value="<%=rs.getString("HDD")%>"></td></tr>

<tr><td>MOUSE</td><td><input type="text" name="MOUSE" value="<%=rs.getString("MOUSE")%>"></td></tr>
<tr><td>KEYBOARD</td><td><input type="text" name="KEYBOARD" value="<%=rs.getString("KEYBOARD")%>"></td></tr>
<tr><td>MONITOR</td><td><input type="text" name="MONITOR" value="<%=rs.getString("MONITOR")%>"></td></tr>
<tr><td>OS</td><td><input type="text" name="OS" value="<%=rs.getString("OS")%>"></td></tr>
<tr><td>VOIP_PHONE</td><td><input type="text" name="VOIP_PHONE" value="<%=rs.getString("VOIP_PHONE")%>"></td></tr>
<tr><td>IP_ADDRESS</td><td><input type="text" name="IP_ADDRESS" value="<%=rs.getString("IP_ADDRESS")%>"></td></tr>

<tr><td>MAC_ID</td><td><input type="text" name="MAC_ID" value="<%=rs.getString("MAC_ID")%>"></td></tr>
<tr><td>EXT_NO</td><td><input type="text" name="EXT_NO" value="<%=rs.getString("EXT_NO")%>"></td></tr>









<td><input type="submit" name="Submit" value="Update" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>

</tr>


<%
}
}
catch(Exception e){}
%>
</table>
</form>
</html>