
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewClass {
    
   
    public static void main(String[] args) throws Exception {
    Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.252:3306/usm", "root", "usmsystems@1");  
            PreparedStatement st = con.prepareStatement("SELECT MAX(ASSET_CODE) FROM hyd_inventory1;");  
    
    ResultSet rs = st.executeQuery();

   // rs = st.executeQuery("SELECT COUNT(*) FROM survey");
    // get the number of rows from the result set
    rs.next();
   // int rowCount = rs.getInt(0);
   String rowCount = rs.getString("ASSET_CODE");
    System.out.println(rowCount);

    rs.close();
    st.close();
    con.close();

  }

    private static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    