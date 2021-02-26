<%-- 
    Document   : newjsp
    Created on : Aug 22, 2019, 5:10:20 PM
    Author     : Administrator
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
         
    <%
Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/Arun", "root", "usmsystems@1");
		Statement st = conn.createStatement();

		st = conn.createStatement();
		ResultSet rs = st.executeQuery("  SELECT MAX(ASSET_CODE) FROM usm.hyd_inventory ");

		while (rs.next()) {
			String name = rs.getString(1);
			System.out.println(name);

		}

		rs.close();
		st.close();
		conn.close();

	}

}
%>

    </body>
</html>
