<!DOCTYPE html>
<!--<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>-->
<html >
    <body onload="btnClick()">
        
<style>
#tableA {
text-align: center;
border-collapse: collapse;
width: 45%;
}

td {
  height: 120px;
  border: 1px solid black;
}
th {
  height: 10px;
  border: 1px solid black;
}

#tableB {
text-align: center;
border-collapse: collapse;
width: 45%;
}

td {
  height: 120px;
  border: 1px solid black;
}
th {
  height: 10px;
  border: 1px solid black;
}


/*---------------------------------------------Veritaltext boxes names -------------*/
input {
  
  
  text-align: center;
  font-family: Arial, Helvetica, sans-serif;
  border: 1;
  background-color: transparent;
  color: black;
  
  font-weight: bold;
  transition: ease-in-out, width .35s ease-in-out;
  cursor: pointer;
}

input:hover,
input:focus {
  background-color: #bafff9;
  border-radius: 15px;
}

.loc {
  font-size: 20px;
  width: 2.9cm;
  height: 0.9cm;
  -moz-transform: rotate(-90deg);
  -webkit-transform: rotate(-90deg);
  -o-transform: rotate(-90deg);
  -ms-transform: rotate(-90deg);
}




</style>
</head>
<body>

<h2>Let the borders collapse</h2>

<form action="/action_page.php">
<table id="tableA">

  <tr>
      <td rowspan="4"><p class="rotated">Table - 1</p></td>
      <td><input type="text" class="loc" id="loc" name="loc" value="RAVIKIRAN"></td>
    <td><input type="text" class="loc" id="loc" name="loc" value="RAVIKIRAN"></td>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td>6</td>
    <td>7</td>
    <td>8</td>
    <td>9</td>
  </tr>
  <tr>
<!--      <th><button value="name">name</button></th>-->
<th>
  
    <input type="button" id="1F-01" value="1F-01">
    </th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
  </tr>
  <tr>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
  </tr>
  <tr>
    <td>1</td>
    <td>2</td>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td>6</td>
    <td>7</td>
    <td>8</td>
    <td>0</td>
  </tr>
  
</table>
<br>
<table id="tableB">

  <tr>
      <td rowspan="4">Table - 2</td>
    <td>1</td>
    <td>2</td>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td>6</td>
    <td>7</td>
    <td>8</td>
    <td>9</td>
  </tr>
  <tr>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
  </tr>
  <tr>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
    <th>name</th>
  </tr>
  <tr>
    <td>1</td>
    <td>2</td>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td>6</td>
    <td>7</td>
    <td>8</td>
    <td>9</td>
  </tr>
  
</table>
</form>
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
    </body>
</html>
