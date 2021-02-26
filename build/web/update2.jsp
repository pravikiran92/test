<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<html>
    
    <meta http-equiv="Refresh" content="2;url=application.jsp">
    <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="-1" /
    
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
                String PRINTER = request.getParameter("PRINTER");
                String SCANNER = request.getParameter("SCANNER");
                String HEADPHONE = request.getParameter("HEADPHONE");
                  
                String VOIP_PHONE = request.getParameter("VOIP_PHONE");
		String IP_ADDRESS = request.getParameter("IP_ADDRESS");
		String MAC_ID = request.getParameter("MAC_ID");
		String EXT_NO = request.getParameter("EXT_NO");
                String MOD_DATE = request.getParameter("MOD_DATE");
                String ASSET_CODE = request.getParameter("ASSET_CODE");
                
               
		
		
		
		String sql = "UPDATE hyd_inventory " +
				"SET PORT_NO = '"+ PORT_NO + "' " +
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
                                ", PRINTER = '"+ PRINTER + "' " +
                                ", SCANNER = '"+ SCANNER + "' " +
                                ", HEADPHONE = '"+ HEADPHONE + "' " +
                                ", VOIP_PHONE = '"+ VOIP_PHONE + "' " +
                                ", IP_ADDRESS = '"+ IP_ADDRESS + "' " +
                                ", MAC_ID = '"+ MAC_ID + "' " +
                                ", EXT_NO = '"+ EXT_NO + "' " +
                                ", MOD_DATE = '"+ MOD_DATE + "' " +
                                ", ASSET_CODE = '"+ ASSET_CODE + "' " +
                        
                        
                                " WHERE sno = '" + id + "' ";
         s.execute(sql);
          //response.sendRedirect("application.jsp");
         out.println("Record Update Successfully");
	  		
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