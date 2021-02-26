<%-- 
    Document   : newjsp
    Created on : Feb 17, 2021, 9:19:27 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    </head>
    <body onload="btnClick()">
            <script type="text/javascript">
    
     function btnClick()
    {
           var cells = document.getElementById("tableA").getElementsByTagName("td");
for (var i = 0; i < cells.length; i++) {
    if (cells[i].innerHTML == "0") {
        cells[i].style.backgroundColor = "Green";
    }
}    
   var cells = document.getElementById("tableB").getElementsByTagName("td");
for (var i = 0; i < cells.length; i++) {
    if (cells[i].innerHTML == "0") {
        cells[i].style.backgroundColor = "Green";
    }
}    
    }

</script>
        <style>
            
            table {
                
            border-collapse: collapse;
            }
            
.wrapper {
    width:60px;
    border: none;
    
}
.rotate {
    transform: rotate(-90deg) translateX(-100%);
    /*position: absolute;    */
}

input, select, textarea {
font-size: 150%;
 cursor: pointer;
 background-color: transparent;
 border: 0;
 border-radius: 15px;
}
td {
    text-align: center;
    
    /* center checkbox horizontally */
    /*vertical-align: middle; /* center checkbox vertically */
}
        th {
    text-align: center;
    
    /* center checkbox horizontally */
    /*vertical-align: middle; /* center checkbox vertically */
}</style>
        <h1>Hello World!</h1>
        
        
        
        <form class="form-inline" method="post" action="search.jsp">
            
       
        <table border="1" id="tableA">
    <tr>
        <td rowspan="4"><p class="rotated">Table - 1</p></td>
        <td height="200" width="20" >
            <div class="wrapper rotate">
                <input size="10" maxlength="10" name="sno" class="form-control" placeholder="Search roll no..">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
               
    </tr>
       
    <th><input type="submit" id="1F-01" value="18"></th>
    <th><input type="submit" id="1F-01" value="17"></th>
    <th><input type="submit" id="1F-01" value="16"></th>
    <th><input type="submit" id="1F-01" value="15"></th>
    <th><input type="submit" id="1F-01" value="14"></th>
    <th><input type="submit" id="1F-01" value="13"></th>
    <th><input type="submit" id="1F-01" value="12"></th>
    <th><input type="submit" id="1F-01" value="11"></th>
    <th><input type="submit" id="1F-01" value="10"></th>
  
   
  </tr>
  <tr>
    <th><input type="submit" id="1F-01" value="01"></th>
    <th><input type="submit" id="1F-01" value="02"></th>
    <th><input type="submit" id="1F-01" value="3"></th>
    <th><input type="submit" id="1F-01" value="04"></th>
    <th><input type="submit" id="1F-01" value="05"></th>
    <th><input type="submit" id="1F-01" value="06"></th>
    <th><input type="submit" id="1F-01" value="07"></th>
    <th><input type="submit" id="1F-01" value="08"></th>
    <th><input type="submit" id="1F-01" value="09"></th>
   
  </tr>
    <tr>
       
        <td height="200" width="20" >
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
        <td height="200" width="20">
            <div class="wrapper rotate">
                <input size="10" maxlength="10">
            </div>
        </td>
               
    </tr>
    
    
</table>
    </form>
       
    </body>
</html>
