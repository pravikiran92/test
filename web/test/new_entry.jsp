<%-- 
    Document   : new_entry
    Created on : Jul 25, 2019, 1:28:14 PM
    Author     : Administrator
--%>

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
<<body onload="addDate()">

</body>
<form method="post" action="entry.jsp" >
<table border="1" id="customers">

    <br><br><br><br><br><br><br><br><br><br>
<tr><td>Date</td><td><input type="text" name="Reg_Date" id="" ></td></td></tr>
<tr><td>Date</td><td><input type="text" name="Reg_Date" id="open_date" ></td></td></tr>


<tr><td>Sno</td><td><input type="text" name="id" ></td></td></tr>
<tr><td>PORT_NO</td><td><input type="text" name="PORT_NO" value=""></td></tr>
<tr><td>LOCATION</td><td><input type="text" name="LOCATION" value=""></td></tr>
        
        
        <!-- <select name="LOCATION">
  <option value="1 FW">First Floor</option>
  <option value="2 FW">Second Floor</option>
  <option value="3 FW">Third Floor</option>
  
</select> -->
<tr><td>M_NAME</td><td><input type="text" name="M_NAME" value=""></td>
<!--<td><input type="text" name="M_EMP" value=""></td>-->
<td>M_DEPT</td><td><input type="text" name="M_DEPT" value=""></td>
<td>M_ORG</td><td><input type="text" name="M_ORG" value=""></td></tr>
<tr><td>N_NAME</td><td><input type="text" name="N_NAME" value=""></td>
<!--<td><input type="text" name="N_EMP" value=""></td>-->
<td>N_DEPT</td><td><input type="text" name="N_DEPT" value=""></td>
<td>N_ORG</td><td><input type="text" name="N_ORG" value=""></td></tr>
<tr><td>RAM</td><td><input type="text" name="RAM" value=""></td></tr>
<tr><td>PROCESSER</td><td><input type="text" name="PROCESSER" value=""></td></tr>
<tr><td>HDD</td><td><input type="text" name="HDD" value=""></td></tr>

<tr><td>MOUSE</td><td><input type="text" name="MOUSE" value=""></td></tr>
<tr><td>KEYBOARD</td><td><input type="text" name="KEYBOARD" value=""></td></tr>
<tr><td>MONITOR</td><td><input type="text" name="MONITOR" value=""></td></tr>
<tr><td>OS</td><td><input type="text" name="OS" value=""></td></tr>
<tr><td>VOIP_PHONE</td><td><input type="text" name="VOIP_PHONE" value=""></td></tr>
<tr><td>IP_ADDRESS</td><td><input type="text" name="IP_ADDRESS" value=""></td></tr>

<tr><td>MAC_ID</td><td><input type="text" name="MAC_ID" value=""></td></tr>
<tr><td>EXT_NO</td><td><input type="text" name="EXT_NO" value=""></td></tr>









<td><input type="submit" name="Submit" value="Update" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>

</tr>


</table>
</form>
</html>