/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.net2projjavaclient;

import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

public class MainPHPs extends javax.swing.JFrame {

    /**
     * Creates new form MainPHPs
     */
    public MainPHPs() {
        initComponents();
        this.getContentPane().setBackground(Color.GRAY);
        ADDURLs(); 
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaInfo = new javax.swing.JTextArea();
        jButtonEDIT = new javax.swing.JButton();
        jTxtFieldContact = new javax.swing.JTextField();
        jTxtFieldLocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonGET = new javax.swing.JButton();
        jTxtFieldURL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LISTCOMBO = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainPHPs");

        jTxtAreaInfo.setColumns(20);
        jTxtAreaInfo.setRows(5);
        jTxtAreaInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jScrollPane1.setViewportView(jTxtAreaInfo);

        jButtonEDIT.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonEDIT.setForeground(new java.awt.Color(0, 0, 255));
        jButtonEDIT.setText("EDIT By POST");
        jButtonEDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITActionPerformed(evt);
            }
        });

        jTxtFieldContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jTxtFieldContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFieldContactActionPerformed(evt);
            }
        });

        jTxtFieldLocation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Conntact :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Location :");

        jButtonGET.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonGET.setForeground(new java.awt.Color(0, 0, 204));
        jButtonGET.setText("SEND By GET");
        jButtonGET.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonGET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGETActionPerformed(evt);
            }
        });

        jTxtFieldURL.setEditable(false);
        jTxtFieldURL.setPreferredSize(new java.awt.Dimension(60, 20));
        jTxtFieldURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFieldURLActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("URLs :");
        jLabel5.setPreferredSize(new java.awt.Dimension(23, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("List : ");
        jLabel1.setPreferredSize(new java.awt.Dimension(23, 20));

        LISTCOMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "http://localhost/networking2/page1.php" }));
        LISTCOMBO.setToolTipText("");
        LISTCOMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTCOMBOActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Name:");

        jTextFieldName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtFieldContact, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jTxtFieldLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jTextFieldName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtFieldURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LISTCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEDIT, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jButtonGET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 181, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LISTCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGET, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITActionPerformed
        // TODO add your handling code here:
        String EdContact = this.jTxtFieldContact.getText(); // edit contact 
        String EdLocation = this.jTxtFieldLocation.getText(); // edit location
        String EdName = this.jTextFieldName.getText(); // edit location
        dataStr="";
        addParameter("EdContact",EdContact); // to  format to send by PORT method
        addParameter("EdLocation",EdLocation);// to  format to send by PORT method
        addParameter("EdName",EdName);// to  format to send by PORT method
        try {
            
            URL TURL = new URL("http://localhost/snmp/NET2ProjJAVACLIENT/page1Sys.php" ); // url php page server
          
             HttpURLConnection TomConn = (HttpURLConnection) TURL.openConnection();
          // activate the output
          TomConn.setRequestMethod("POST");  
          TomConn.setDoOutput(true);                   
            TomConn.setDoInput(true);                   
            TomConn.setRequestProperty("Content-Type", contentStr);
            
            TomConn.setUseCaches(false);                    
             BufferedOutputStream out = new BufferedOutputStream(TomConn.getOutputStream());
            out.write(dataStr.getBytes());
            System.out.print(dataStr.getBytes());
            out.flush();
            out.close();
        int responseCode = TomConn.getResponseCode();
        System.out.println("Response Code From Server (int)(Client Side): " + responseCode);
        } catch (Exception e) {
            System.out.println(e.toString()+" after connection"); 
            // e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonEDITActionPerformed

    private void jTxtFieldContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFieldContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFieldContactActionPerformed

    private void jButtonGETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGETActionPerformed
    sendData_GET();
       
    }//GEN-LAST:event_jButtonGETActionPerformed

    private void jTxtFieldURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFieldURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFieldURLActionPerformed

    private void LISTCOMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTCOMBOActionPerformed
        // TODO add your handling code here:
           String URL = (String)this.LISTCOMBO.getSelectedItem();
             this.jTxtFieldURL.setText(URL);
    }//GEN-LAST:event_LISTCOMBOActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

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
            java.util.logging.Logger.getLogger(MainPHPs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPHPs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPHPs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPHPs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPHPs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LISTCOMBO;
    private javax.swing.JButton jButtonEDIT;
    private javax.swing.JButton jButtonGET;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextArea jTxtAreaInfo;
    private javax.swing.JTextField jTxtFieldContact;
    private javax.swing.JTextField jTxtFieldLocation;
    private javax.swing.JTextField jTxtFieldURL;
    // End of variables declaration//GEN-END:variables

    String[] URLs = {
          "http://localhost/snmp/NET2ProjJAVACLIENT/page1Sys.php?Page=1",
        "http://localhost/snmp/NET2ProjJAVACLIENT/page2ARP.php?Page=2",
        "http://localhost/snmp/NET2ProjJAVACLIENT/page3TCP.php?Page=3",
    };
    
      
 
   
       
    void ADDURLs(){
        // add the urls to combobox or combolist
        this.LISTCOMBO.removeAllItems();
       
        for ( int i=0; i <URLs.length; i++){
            this.LISTCOMBO.addItem(URLs[i]);
        }
        this.LISTCOMBO.setSelectedIndex(0);
        String URLSelected = (String) this.LISTCOMBO.getSelectedItem();
        this.jTxtFieldURL.setText(URLSelected);
    }
    
    
    String dataStr = "";
   
    String contentStr = "application/x-www-form-urlencoded";

    public void addParameter(String ps, String vs) {
        if (ps == null || vs == null || ps.length() == 0 || vs.length() == 0) {
            return;
        }
        if (dataStr.length() > 0) {
            dataStr += "&";
        }
        try {
            dataStr += ps + "=" + URLEncoder.encode(vs, "ASCII");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    void sendData_GET() {
       
        String URL = this.jTxtFieldURL.getText(); // get the url from textfield 
        try {
            
           
  
            URL TURL = new URL(URL);
            HttpURLConnection TomConn = (HttpURLConnection) TURL.openConnection();
            TomConn.setDoOutput(true);
            TomConn.setDoInput(true);
            TomConn.setRequestProperty ("Content-Type", contentStr);
            TomConn.setUseCaches(false);
            InputStream is = TomConn.getInputStream();
            System.out.print("input Stream :"+is);
            
            
            int responseCode = TomConn.getResponseCode();
            System.out.println("Response Code From Server (int)(Client Side): " + responseCode);
            
            int ReadCh = -1;
            String t = "";
            String ResponseMsg = "";
            while ((ReadCh = is.read()) != -1) {
                if ((char) ReadCh == '\r') {
                    ResponseMsg += "\n";
                } else {
                    ResponseMsg = ResponseMsg + (char) ReadCh;
                }
            }
            
             this.jTxtAreaInfo.setText(ResponseMsg);


        } catch (Exception e) {
            System.out.println(e.toString());
            
        }

    }
}
