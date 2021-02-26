<%-- 
    Document   : index
    Created on : Jul 25, 2019, 3:48:09 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>USM</title>
        <link rel="shortcut icon" href="images/pitti-logo.ico">
        <link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/style2.css" />
	<style>
			body {
				background: #e1c192 url(images/bg.jpg);
			}
		</style>

                <script type="text/javascript">
                    function preventBack() { window.history.forward();
                    } 		 
                    setTimeout("preventBack()", 0); 		 
                    window.onunload = function () { null }; 		
                </script>
                
    </head>
    <body>
        
        
        
   <!--     <div class="container">
		
			<header>
                            <form class="form-header">
                            <h1 > <b><strong><font color="#ff333" face="Bauhaus 93">INEERING LTD.</font></strong></b><blink><b>-</b></blink> Aurangabad Plant</h1>
				<h2>LOG MANAGEMENT SYSTEM</h2>
                            </form>
				<div class="support-note">
					<span class="note-ie">Sorry, only modern browsers.</span>
				</div>
	</header>
	-->		
			<section class="main">
				<form class="form-2" name="form1" method="post" >
					<h1><span class="log-in">Log in</span> or <span class="sign-up">sign up</span></h1>
					<p class="float">
						<label for="login"><i class="icon-user"></i>Username</label>
						<input type="text" name="uname" placeholder="Username or email" required>
					</p>
					<p class="float">
						<label for="password"><i class="icon-lock"></i>Password</label>
						<input type="password" name="pass" placeholder="Password" class="showpassword" required>
					</p>
					<p class="clearfix"> 
						<a href="" class="log-twitter">Cancel</a>    
						<input type="submit" name="submit" value="Log in" onClick="check()">
					</p>
				</form>​​
			</section>
	
                <script language="javascript">
window.history.backward(0);
function check()
{

form1.action="login.jsp";
}



</script>


<button class="open-button" onclick="openForm()">Open Form</button>

<div class="form-popup" id="myForm">
  <form action="/action_page.php" class="form-container">
    <h1>Login</h1>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit" class="btn">Login</button>
    <button type="submit" class="btn cancel" onclick="closeForm()">Close</button>
  </form>
</div>

<script>
function openForm() {
    document.getElementById("myForm").style.display = "block";
}

function closeForm() {
    document.getElementById("myForm").style.display = "none";
}
</script>

<footer>
  
</footer>

    </body>
</html>
