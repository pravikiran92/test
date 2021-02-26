
package test_app;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import static test_app.reg_form.format;

public class reg_form extends javax.swing.JFrame {


    public reg_form() {
        initComponents();
         setIcon();
jBtn_update.setVisible(false);

         jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DELL", "Logitech", "Microsoft", "FRONTECH","HP" }));
         jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DELL", "Logitech", "Microsoft", "FRONTECH","HP" }));
         jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Phone","GRANDSTREAM", "POLYCOM", "Uniden phone", "Panasonic","HP" }));
         jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Head Phones","Philips 2.5 mm", "Logitech usb Head set", "Uniden phone", "Panasonic","HP" }));
         jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DELL", "ViewSonic", "Acer", "LG","HP","Samsung","Lenovo" }));
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-YYYY HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));
   jTextField12.setText(dtf.format(now));
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Btn_IP = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jBtn_update = new javax.swing.JButton();
        jPORT_NO = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCInfo");

        jLabel9.setText("Model No");

        jLabel1.setText("Operating system");

        jLabel2.setText("Host Name");

        jLabel3.setText("User Name");

        jLabel4.setText("IP Address");

        jLabel5.setText("RAM Size");

        jLabel6.setText("MAC Address");

        jLabel7.setText("HDD Size");

        jLabel8.setText("CUP");

        Btn_IP.setText("Get Dtails");
        Btn_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IPActionPerformed(evt);
            }
        });

        jButton1.setText("Save & Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jBtn_update.setText("Update");
        jBtn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_updateActionPerformed(evt);
            }
        });

        jPORT_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPORT_NOActionPerformed(evt);
            }
        });

        jLabel11.setText("PORT_NO");

        jLabel12.setText("Key Board");

        jLabel13.setText("Mouse");

        jLabel14.setText("Voip Phone");

        jLabel15.setText("HeadPhones");

        jLabel16.setText("Monitor");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField10.setText("Ext. / Phone Number");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel17.setText("Reg. Date & Time");

        jLabel18.setText("Asset Code");

        jLabel19.setText("Serial No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel17)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Btn_IP)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2)
                                                .addGap(32, 32, 32)
                                                .addComponent(jBtn_update)))
                                        .addGap(87, 87, 87))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPORT_NO)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, 160, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, 160, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jPORT_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_IP)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jBtn_update))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String format(double bytes, int digits) {
        String[] dictionary = {"bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};
        int index = 0;
        for (index = 0; index < dictionary.length; index++) {
            if (bytes < 1024) {
                break;
            }
            bytes = bytes / 1024;
        }
        return String.format("%." + digits + "f", bytes) + " " + dictionary[index];
    }
    
    private void Btn_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IPActionPerformed

        
        try {
            
            InetAddress inetAddress = InetAddress.getLocalHost();

            String ipAddress = inetAddress.getHostAddress();
            //System.out.println("IP address: " + ipAddress);
            jTextField4.setText(ipAddress);
            String hostName = inetAddress.getHostName();
            jTextField2.setText(hostName);
            String nameOS= System.getProperty("os.name");
            
            jTextField1.setText(nameOS);
            String userName = System.getProperty("user.name");
            jTextField3.setText(userName);
          //  System.out.println("User Name: " + userName);

            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
            
             byte[] macAddress = networkInterface.getHardwareAddress();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < macAddress.length; i++) {

                stringBuilder.append(String.format("%02X%s", macAddress[i], (i < macAddress.length - 1) ? "-" : ""));
            }

           // System.out.println("MAC address : " + stringBuilder.toString());
            jTextField5.setText(stringBuilder.toString());

            long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
            // System.out.println("Size of C:="+diskSize+" Bytes");
             //System.out.println("RAM Size="+memorySize+" Bytes" + format(memorySize, 2));
           // System.out.println("RAM Size=" + format(memorySize, 0));
            
            jTextField6.setText(format(memorySize, 0));

FileSystemView fsv = FileSystemView.getFileSystemView();

            File[] drives = File.listRoots();
            long diskSize = 0;
            if (drives != null && drives.length > 0) {
                for (File aDrive : drives) {
                    // System.out.println("Drive Letter: " + aDrive);
                    // System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive));
                    long totalSpace = aDrive.getTotalSpace() / 1024 / 1024 / 1024;
                    // System.out.println("\tTotal space: " + totalSpace);
                    // System.out.println("\tFree space: " + aDrive.getFreeSpace() / 1024 / 1024 / 1024);
                    diskSize += totalSpace;
                }
            }
            String size = "";
            // diskSize = 245;
            if (diskSize <= 250) {
                size = "250 GB";
            } else if (diskSize >= 251 && diskSize <= 320) {
                size = "320 GB";
            } else if (diskSize >= 321 && diskSize <= 500) {
                size = "500 GB";
            } else if (diskSize >= 501 && diskSize <= 1000) {
                size = "1 TB";
            } else if (diskSize >= 1001 && diskSize <= 1500) {
                size = "1.5 TB";
            } else {
                size = "2 TB";
            }
            jTextField7.setText(size);
                  
   //----------------------------------Procer Name------------------------------------------------
            try {

                String[][] commands = new String[][]{
                {"CMD", "/C", "WMIC CPU GET Name"}}; // Computer Name

                for (int i = 0; i < commands.length; i++) {

                    String[] com = commands[i];

                    Process process = Runtime.getRuntime().exec(com);

                    process.getOutputStream().close(); // Closing output stream of the process

                    System.out.println();
                    String s = null;
                    String str = "";
                    // Reading sucessful output of the command
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    while ((s = reader.readLine()) != null) {
//                        System.out.print(s);
                        if (s.length()>0) {
                            str = s;
                        }
                    }
                    jTextField8.setText(str.trim());
                    
                    // Reading error if any
//                    reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//                    while ((s = reader.readLine()) != null) {
//                        System.out.print(s);
//                    }

                }

            } catch (IOException e) {
                e.printStackTrace(); // TODO: necessary exception handling
            }
            
                
  //----------------------------------------------------------------------------------------------------------          
            
  
     //WMIC BIOS GET SERIALNUMBER
  //----------------------------------Serial Number------------------------------------------------
            try {

                String[][] commands = new String[][]{
                {"CMD", "/C", "WMIC BIOS GET SERIALNUMBER"}}; // Computer Name

                for (int i = 0; i < commands.length; i++) {

                    String[] com = commands[i];

                    Process process = Runtime.getRuntime().exec(com);

                    process.getOutputStream().close(); // Closing output stream of the process

                    System.out.println();
                    String s = null;
                    String str = "";
                    // Reading sucessful output of the command
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    while ((s = reader.readLine()) != null) {
//                        System.out.print(s);
                        if (s.length()>0) {
                            str = s;
                        }
                    }
                    jTextField13.setText(str.trim());
                    // Reading error if any
//                    reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//                    while ((s = reader.readLine()) != null) {
//                        System.out.print(s);
//                    }

                }

            } catch (IOException e) {
                e.printStackTrace(); // TODO: necessary exception handling
            }
  
   //----------------------------------------------------------------------------------------------------------          
    
  //-----------------------for Product number --------------------------------------          
            
            
             try {

                String[][] commands = new String[][]{
                {"CMD", "/C", "WMIC baseboard get product"}}; // Computer Name

                for (int i = 0; i < commands.length; i++) {

                    String[] com = commands[i];

                    Process process = Runtime.getRuntime().exec(com);

                    process.getOutputStream().close(); // Closing output stream of the process

                    System.out.println();
                    String s = null;
                    String str = "";
                    // Reading sucessful output of the command
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    while ((s = reader.readLine()) != null) {
//                        System.out.print(s);
                        if (s.length()>0) {
                            str = s;
                        }
                    }
                    jTextField9.setText(str.trim());
                    // Reading error if any
//                    reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//                    while ((s = reader.readLine()) != null) {
//                        System.out.print(s);
//                    }

                }

            } catch (IOException e) {
                e.printStackTrace(); // TODO: necessary exception handling
            }
            
 //--------------------------------------------------------------------------------------------------------------           
            
 // TODO add your handling code here:
        
       
        // TODO add your handling code here:
    }   catch (UnknownHostException ex) {           
            Logger.getLogger(reg_form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SocketException ex) {
            Logger.getLogger(reg_form.class.getName()).log(Level.SEVERE, null, ex);
        }           




        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_IPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if(jPORT_NO.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"PORT No is Empty");
            
        } else
        {
        Connection conn = null;
        Statement s = null;
try
{
String userName = "root";
String password = "usmsystems@1";
String url = "jdbc:mysql://192.168.1.252:3306/usm";
Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
conn = DriverManager.getConnection (url, userName, password);

s = conn.createStatement();

JOptionPane.showMessageDialog(null,"Database connection established");
System.out.println ("Database connection established");

                String RAM = jTextField6.getText();
                String M_NAME = jTextField3.getText();
                String PROCESSER = jTextField8.getText();
                String PORT_NO = jPORT_NO.getText();
                String MOUSE = (String) jComboBox2.getSelectedItem();
                String KEYBOARD = (String) jComboBox1.getSelectedItem();
                String MONITOR = (String) jComboBox5.getSelectedItem();
                String HDD = jTextField7.getText();
                String OS = jTextField1.getText();
                String VOIP_PHONE = (String) jComboBox3.getSelectedItem();
                String MAC_ID = jTextField5.getText();
                String IP_ADDRESS = jTextField4.getText();
                String MODEL = jTextField9.getText();
                String HOST_NAME = jTextField2.getText();
                String ASSET_CODE = jTextField11.getText();
                String REG_DATE = jTextField12.getText();
                String SERIAL_NO = jTextField13.getText();
                String HEADPHONE = (String) jComboBox4.getSelectedItem();
                
                
                
             
              
		String sql = "insert into hyd_inventory1 " +
				"SET RAM = '"+ RAM + "' " +
                                ", M_NAME = '"+ M_NAME + "' " +
				", PROCESSER = '"+ PROCESSER + "' " +
                                ", MOUSE = '"+ MOUSE + "' " +
                                ", KEYBOARD = '"+ KEYBOARD + "' " +
                                ", MONITOR = '"+ MONITOR + "' " +
                                 ", HDD = '"+ HDD + "' " +
                                ", OS = '"+ OS + "' " +
                                ", VOIP_PHONE = '"+ VOIP_PHONE + "' " +
                                ", MAC_ID = '"+ MAC_ID + "' " +
                                ", IP_ADDRESS = '"+ IP_ADDRESS + "' " +
                                ", PORT_NO = '"+ PORT_NO + "' " +
                                ", MODEL = '"+ MODEL + "' " +
                                ", REG_DATE = '"+ REG_DATE + "' " +
                                ", ASSET_CODE = '"+ ASSET_CODE + "' " +
                                ", HOST_NAME = '"+ HOST_NAME + "' " +
                                ", SERIAL_NO = '"+ SERIAL_NO + "' " +
                                ", HEADPHONE = '"+ HEADPHONE + "' " ;
                               
				
                               // " WHERE PORT_NO = '" + PORT_NO + "' ";
         s.execute(sql);
         JOptionPane.showMessageDialog(null,"Record Registerd Successfully");
         out.println("Record Registerd Successfully");

}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,"Cannot connect to database server");
//jLabel10.setText ("Cannot connect to database server");
System.err.println ("Cannot connect to database server");
}
finally
{
if (conn != null)
{
try
{
conn.close ();
System.out.println ("Database connection terminated");
JOptionPane.showMessageDialog(null,"Database connection terminated");

}
catch (Exception e) { /* ignore close errors */ }
}
}
        
     
    }
        
        
        
//        
//        
//    try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.252:3306/test" +
//                "?user=root&password=usmsystems@1");
//      //    Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.252:3306/test,user=root&password=usmsystems@1");
//        
//		JOptionPane.showMessageDialog(null,"Connection Sucessfull");
//                
//                String query = "insert into info values(?,?,?,?,?,?,?,?,?)";
//                PreparedStatement Statement= connection.prepareStatement(query);
//                Statement.setString(1, jTextField1.getText());
//                Statement.setString(2, jTextField2.getText());
//                Statement.setString(3, jTextField3.getText());
//                Statement.setString(4, jTextField4.getText());
//                Statement.setString(5, jTextField5.getText());
//                Statement.setString(6, jTextField6.getText());
//                Statement.setString(7, jTextField7.getText());
//                Statement.setString(8, jTextField8.getText());
//                Statement.setString(9, jTextField9.getText());
//                Statement.setString(10,jComboBox1.getName());
//                Statement.execute();
//                
//                
//                JOptionPane.showMessageDialog(null,"Data Insert Sucessfull");
//                
//                } catch (Exception e) {
//			// TODO Auto-generated catch block
//			out.println(e.getMessage());
//			e.printStackTrace();
//		}





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
Connection conn = null;
try
{
String userName = "root";
String password = "usmsystems@1";
String url = "jdbc:mysql://192.168.1.252:3306/test";
Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
conn = DriverManager.getConnection (url, userName, password);
jProgressBar1.setValue(100);
        jProgressBar1.setStringPainted(true);
       // jProgressBar1.getBackground();
JOptionPane.showMessageDialog(null,"Database connection established");
System.out.println ("Database connection established");

}
catch (Exception e)
{
    jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);
JOptionPane.showMessageDialog(null,"Cannot connect to database server");
//jLabel10.setText ("Cannot connect to database server");
System.err.println ("Cannot connect to database server");
}
finally
{
if (conn != null)
{
try
{
conn.close ();
System.out.println ("Database connection terminated");
JOptionPane.showMessageDialog(null,"Database connection terminated");
}
catch (Exception e) { /* ignore close errors */ }
}
}
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBtn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_updateActionPerformed

        if(jPORT_NO.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"PORT No is Empty");
            
        } else
        {
        Connection conn = null;
        Statement s = null;
try
{
String userName = "root";
String password = "usmsystems@1";
String url = "jdbc:mysql://192.168.1.252:3306/usm";
Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
conn = DriverManager.getConnection (url, userName, password);

s = conn.createStatement();

JOptionPane.showMessageDialog(null,"Database connection established");
System.out.println ("Database connection established");

                String RAM = jTextField6.getText();
                String M_NAME = jTextField3.getText();
                String PROCESSER = jTextField8.getText();
                String PORT_NO = jPORT_NO.getText();
                String MOUSE = (String) jComboBox2.getSelectedItem();
                String KEYBOARD = (String) jComboBox1.getSelectedItem();
                String MONITOR = (String) jComboBox5.getSelectedItem();
                String HDD = jTextField7.getText();
                String OS = jTextField1.getText();
                String VOIP_PHONE = (String) jComboBox3.getSelectedItem();
                String MAC_ID = jTextField5.getText();
                String IP_ADDRESS = jTextField4.getText();
                String HEADPHONE = (String) jComboBox4.getSelectedItem();
                
                
                
             
              
		String sql = "UPDATE hyd_inventory1 " +
				"SET RAM = '"+ RAM + "' " +
                                ", M_NAME = '"+ M_NAME + "' " +
				", PROCESSER = '"+ PROCESSER + "' " +
                                ", MOUSE = '"+ MOUSE + "' " +
                                ", KEYBOARD = '"+ KEYBOARD + "' " +
                                ", MONITOR = '"+ MONITOR + "' " +
                                 ", HDD = '"+ HDD + "' " +
                                ", OS = '"+ OS + "' " +
                                ", VOIP_PHONE = '"+ VOIP_PHONE + "' " +
                                ", MAC_ID = '"+ MAC_ID + "' " +
                                ", IP_ADDRESS = '"+ IP_ADDRESS + "' " +
                                ", HEADPHONE = '"+ HEADPHONE + "' " +
                               
				
                                " WHERE PORT_NO = '" + PORT_NO + "' ";
         s.execute(sql);
         JOptionPane.showMessageDialog(null,"Record Update Successfully");
         out.println("Record Update Successfully");

}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,"Cannot connect to database server");
//jLabel10.setText ("Cannot connect to database server");
System.err.println ("Cannot connect to database server");
}
finally
{
if (conn != null)
{
try
{
conn.close ();
System.out.println ("Database connection terminated");
JOptionPane.showMessageDialog(null,"Database connection terminated");

}
catch (Exception e) { /* ignore close errors */ }
}
}
        
     
    }  
        
        
        
        
        
        
        
        
        
        
        
//        
//        Connection connect = null;
//	Statement s = null;
//	
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/usm" +
//				"?user=root&password=usmsystems@1");
//		
//		s = connect.createStatement();
//
// // , Sno,  PORT_NO,  M_NAME,  M_DEPT,  M_ORG,  N_NAME,  N_DEPT,  N_ORG,  RAM, 
// //  , PROCESSER,  HDD,  MOUSE,  KEYBOARD,  MONITOR,  OS,  VOIP_PHONE,  IP_ADDRESS,  MAC_ID,  EXT_NO,  </tr>
//                
//		
//		String RAM = jTextField6.getText();
//                String PROCESSER = jTextField8.getText();
//                String PORT_NO = jPORT_NO.getText();
//             
//              
//		String sql = "UPDATE hyd_inventory1 " +
//				"SET RAM = '"+ RAM + "' " +
//				", PROCESSER = '"+ PROCESSER + "' " +
//				
//                                " WHERE PORT_NO = '" + PORT_NO + "' ";
//         s.execute(sql);
//          //response.sendRedirect("application.jsp");
//         out.println("Record Update Successfully");
//	  		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	
//		try {
//			if(s!=null){
//				s.close();
//				connect.close();
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			out.println(e.getMessage());
//			e.printStackTrace();
//		}
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_updateActionPerformed

    private void jPORT_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPORT_NOActionPerformed

        jPORT_NO.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jPORT_NOActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

      
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reg_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_IP;
    private javax.swing.JButton jBtn_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPORT_NO;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
}
}