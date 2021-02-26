
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ComputerInfo {

    public static void main(String[] args) {
        
          
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
 

   
   
   
   
   
        try {

            String[][] commands = new String[][]{
               // {"CMD", "/C", "WMIC OS GET Installdate,SerialNumber"}, //OS Installation date & Time, OS Serial Number
             //   {"CMD", "/C", "WMIC BASEBOARD GET SerialNumber"}, // Motherboadrd Serial Number
           //     {"CMD", "/C", "WMIC CPU GET ProcessorId"}, // Processor ID
                {"CMD", "/C", "WMIC CPU GET Name"}}; // CPU Name
         //       {"CMD", "/C", "WMIC COMPUTERSYSTEM GET Name"}, // Computer Name
       //         {"CMD", "/C", "WMIC diskdrive GET Size"}}; // Computer Name

            for (int i = 0; i < commands.length; i++) {

                String[] com = commands[i];

                Process process = Runtime.getRuntime().exec(com);

                process.getOutputStream().close(); //Closing output stream of the process

                System.out.println();
                String s = null;
                //Reading sucessful output of the command
                String str = "";
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                while ((s = reader.readLine()) != null) {
                    if (s.length()>0) {
                        str = s;
                    }
                }
                System.out.println(str);
                // Reading error if any
                reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                while ((s = reader.readLine()) != null) {
                    System.out.print(s);
                }

            }
            

        } catch (IOException e) {
            e.printStackTrace(); //TODO: necessary exception handling
        }
    }
}
