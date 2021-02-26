<%-- 
    Document   : entry
    Created on : Jul 25, 2019, 1:32:22 PM
    Author     : Administrator
--%>

<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<html>
<head>
	
</head>
<body>
	
	<%	
	Connection connect = null;
	Statement s = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		connect =  DriverManager.getConnection("jdbc:mysql://localhost/usm" +
				"?user=root&password=usmsystems@1");
		
		s = connect.createStatement();

 // , Sno,  PORT_NO,  M_NAME,  M_DEPT,  M_ORG,  N_NAME,  N_DEPT,  N_ORG,  RAM, 
 //  , PROCESSER,  HDD,  MOUSE,  KEYBOARD,  MONITOR,  OS,  VOIP_PHONE,  IP_ADDRESS,  MAC_ID,  EXT_NO,  </tr>
                
		String id = request.getParameter("id");
		String PORT_NO = request.getParameter("PORT_NO");
                String LOCATION = request.getParameter("LOCATION");
		String M_NAME = request.getParameter("M_NAME");
		String M_DEPT = request.getParameter("M_DEPT");
                String M_ORG = request.getParameter("M_ORG");
                String N_NAME = request.getParameter("N_NAME");
		String N_DEPT = request.getParameter("N_DEPT");
		String N_ORG = request.getParameter("N_ORG");
		String RAM = request.getParameter("RAM");
                String PROCESSER = request.getParameter("PROCESSER");
                String HDD = request.getParameter("HDD");
		String MOUSE = request.getParameter("MOUSE");
		String KEYBOARD = request.getParameter("KEYBOARD");
		String MONITOR = request.getParameter("MONITOR");
                String OS = request.getParameter("OS");
                String VOIP_PHONE = request.getParameter("VOIP_PHONE");
		String IP_ADDRESS = request.getParameter("IP_ADDRESS");
		String MAC_ID = request.getParameter("MAC_ID");
		String EXT_NO = request.getParameter("EXT_NO");
                String Reg_Date = request.getParameter("Reg_Date");
               
		
		
		
		String sql = "insert into hyd_inventory " +
				"SET PORT_NO = '"+ PORT_NO + "' " +
                                ",LOCATION = '"+ LOCATION + "' " +
                        	", M_NAME = '"+ M_NAME + "' " +
				", M_DEPT = '"+ M_DEPT + "' " +
				", M_ORG = '"+ M_ORG + "' " +
                                ", N_NAME = '"+ N_NAME + "' " +
                                ", N_DEPT = '"+ N_DEPT + "' " +
                                ", N_ORG = '"+ N_ORG + "' " +
                                ", RAM = '"+ RAM + "' " +
                                ", PROCESSER = '"+ PROCESSER + "' " +
                                ", HDD = '"+ HDD + "' " +
                                ", MOUSE = '"+ MOUSE + "' " +
                                ", KEYBOARD = '"+ KEYBOARD + "' " +
                                ", MONITOR = '"+ MONITOR + "' " +
                                ", OS = '"+ OS + "' " +
                                ", VOIP_PHONE = '"+ VOIP_PHONE + "' " +
                                ", IP_ADDRESS = '"+ IP_ADDRESS + "' " +
                                ", MAC_ID = '"+ MAC_ID + "' " +
                                ", EXT_NO = '"+ EXT_NO + "' " +
                                ", Reg_Date = '"+ Reg_Date + "' ";
         s.execute(sql);
         
         out.println("Successfully Registred");
	  		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
			e.printStackTrace();
		}
	
		try {
			if(s!=null){
				s.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
			e.printStackTrace();
		}
	%>
</body>
</html>