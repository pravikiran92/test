<%-- 
    Document   : edit
    Created on : Jul 24, 2019, 1:14:08 PM
    Author     : Administrator
--%>

<%@page language="java"%>
<%@page import="java.sql.*"%>


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


<html>
<head>
    <title>USM</title>
       <link rel="shortcut icon" href="images/usm.ico">
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


 <SCRIPT>
function submitFunction(i) {
   if (i==1) document.theForm.action="application.jsp";
   if (i==2) document.theForm.action="logs.jsp";
   if (i==3) document.theForm.action=
      "comming soon.jsp";
   document.theForm.submit()
   }
</SCRIPT>


</head>
<body onload="addDate()">

</body>

<form method="post" action="update2.jsp" name="theForm">
<table border="1" id="customers">



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


<br><br><br><br><br><br>

<tr><td>Reg. Date</td><td><input type="text" name="" value="<%=rs.getString("REG_DATE")%>" readonly></td></td></tr>
<tr><td>Modifed Date</td><td><input type="text" name="MOD_DATE" id="open_date" readonly></td></td></tr>


<tr><td>Sno</td><td><input type="text" name="id" value="<%=rs.getString(1)%>" readonly></td></td></tr>
<tr><td>PORT_NO</td><td><input type="text" name="PORT_NO" value="<%=rs.getString("PORT_NO")%>" readonly></td></tr>

<tr><td>Asset Code</td><td><input type="text" name="ASSET_CODE" value="<%=rs.getString("ASSET_CODE")%>" ></td></td></tr>

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
<tr><td>PRINTER</td><td><input type="text" name="PRINTER" value="<%=rs.getString("PRINTER")%>"></td></tr>
<tr><td>SCANNER</td><td><input type="text" name="SCANNER" value="<%=rs.getString("SCANNER")%>"></td></tr>
<!--tr><td>HEADPHONE</td><td><input type="text" name="HEADPHONE" value="<%=rs.getString("HEADPHONE")%>"></td></tr>
-->

<tr><td>HEADPHONE</td><td>
        
        <select name="HEADPHONE" from="edit_usm" style="width: 172px">
            <option value="<%=rs.getString("HEADPHONE")%>" selected><%=rs.getString("HEADPHONE")%></option>
            <option value="Philips SHM1900">Philips SHM1900</option>
            <option value="Philips 3.5mm">Philips 3.5mm</option>
            <option value="Logitech">Logitech</option>
            <option value="Logitech USB">Logitech USB</option>
            <option value="Philips USB">Philips USB</option>
        </select>
</td></tr>


<tr><td>VOIP_PHONE</td><td>
        
        <select name="VOIP_PHONE" from="edit_usm" style="width: 172px">
            <option value="<%=rs.getString("VOIP_PHONE")%>" selected><%=rs.getString("VOIP_PHONE")%></option>
            <option value="GRANDSTREAM">GRANDSTREAM</option>
            <option value="POLYCOM">POLYCOM</option>
            <option value="UNIDEN">UNIDEN</option>
            <option value="No Phone">No Phone</option>
        </select>
</td></tr>
<!--tr><td>VOIP_PHONE</td><td><input type="text" name="VOIP_PHONE" value="<%=rs.getString("VOIP_PHONE")%>"></td></tr-->
<tr><td>IP_ADDRESS</td><td><input type="text" name="IP_ADDRESS" value="<%=rs.getString("IP_ADDRESS")%>"></td></tr>

<tr><td>MAC_ID</td><td><input type="text" name="MAC_ID" value="<%=rs.getString("MAC_ID")%>"></td></tr>
<tr><td>EXT_NO</td><td><input type="text" name="EXT_NO" value="<%=rs.getString("EXT_NO")%>"></td></tr>







<tr>

    <td><input type="submit" name="Submit" value="Update" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td><td><input type="submit" name="" value="Cancel" onclick="submitFunction(1)" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>

</tr>


<%
}
}
catch(Exception e){}
%>
</table>
</form>
</html>

<%
    }
%>