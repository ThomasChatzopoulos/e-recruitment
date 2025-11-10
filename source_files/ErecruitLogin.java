/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Erecruit_Login;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import static java.time.Instant.now;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
  

public class ErecruitLogin extends javax.swing.JFrame {
    
    Connection conn=null;
    Statement stmt=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String pass = "1234";
    
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    
    public ErecruitLogin() {
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/erecruit?zeroDateTimeBehavior=convertToNull" , "root" , "123qweasdzxc,");
            JOptionPane.showMessageDialog(null, "Connection to MySQL server Established Successfully!");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e); // Η οποία θα εκτυπώνει ενα default μήνυμα λάθους.
        }
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JPasswordField();
        jtxtUsername = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1380, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Electronical Recruit Login System", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PasswordLabel.setText("Password");

        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(34, 200, 75));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(230, 145, 0));
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 0, 0));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LoginButton)
                        .addGap(66, 66, 66)
                        .addComponent(CancelButton)
                        .addGap(67, 67, 67)
                        .addComponent(ExitButton)
                        .addGap(137, 137, 137))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(CancelButton)
                    .addComponent(ExitButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try
        {
            String username = jtxtUsername.getText();
            String password = jtxtPassword.getText();
            ArrayList<String> recruiters = new ArrayList<String>(),candidates = new ArrayList<String>(),admins=new ArrayList<String>();
            ArrayList<String> rec_pass = new ArrayList<String>(),cand_pass = new ArrayList<String>(), adm_pass = new ArrayList<String>();
            String admin ="";
            String admin_pass="";
            String update;
            int i;
            boolean flag=false;
            
            Statement stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery("select username from recruiter ;");
            
            while(rs1.next()) //η λιστα recruiters κρατάει τα username των recruiters
            {
                recruiters.add(rs1.getString("username"));
            }
            
            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery("select password from recruiter inner join user on recruiter.username = user.username; ");
            
            while(rs2.next())//η λίστα rec_pass κρατάει τα passwords των recruiters
            {
                rec_pass.add(rs2.getString("password"));
            }
            
            Statement stmt3 = conn.createStatement();
            ResultSet rs3 = stmt3.executeQuery("select username from candidate;");
            
            while(rs3.next())//η λίστα candidates κρατάει τα usernames των recruiters
            {
                candidates.add(rs3.getString("username"));
            }
            
            Statement stmt4 = conn.createStatement();
            ResultSet rs4 = stmt4.executeQuery("select password from candidate inner join user on candidate.username = user.username; ");
            
            while(rs4.next()) //η λίστα cand_pass κρατάει τα passwords των candidates
            {
                cand_pass.add(rs4.getString("password"));
            }
            
            Statement stmt5 = conn.createStatement();
            ResultSet rs5 = stmt5.executeQuery("select username,password from user where username like '%admin%';");
            
            while(rs5.next())
            {
                admin = rs5.getString("username");
                admin_pass = rs5.getString("password");
            }
            
            /*Statement stmt5 = conn.createStatement();
            ResultSet rs5 = stmt5.executeQuery("select username from user where username like '%admin%';");
            
            while(rs5.next())//η λίστα candidates κρατάει τα usernames των admins
            {
                admins.add(rs3.getString("username"));
            }
            
            Statement stmt6 = conn.createStatement();
            ResultSet rs6 = stmt6.executeQuery("select password from user where username like '%admin%';");
            
            while(rs6.next()) //η λίστα cand_pass κρατάει τα passwords των candidates
            {
                adm_pass.add(rs4.getString("password"));
            }
            */
            for(i=0; i<recruiters.size(); i++)
            {
                if(username.equals(recruiters.get(i)) && password.equals(rec_pass.get(i)) ) //αν τα στοιχεία υπάρχουν στους recruiters
                { 
                    //open recruiter gui and close this one 
                    this.dispose();
                    RecruiterGui recruiter = new RecruiterGui(username);
                    recruiter.setVisible(true);
                    
                    String lastLoginUpdateQuery = "update user set lastLogin ='"+LocalDateTime.now()+"' where username like '%"+username+"%';";
                    PreparedStatement pst1 = conn.prepareStatement(lastLoginUpdateQuery);
                    pst1.executeUpdate();

                    flag = true;
                }             
            }
            
            for(i=0; i<candidates.size(); i++)
            {
                if(username.equals(candidates.get(i)) && password.equals(cand_pass.get(i)))//αν τα στοιχεία υπάρχουν στους candidates
                {
                    //open candidate gui and close this one
                    this.dispose();
                    CandidateGui candidate=new CandidateGui(username);
                    candidate.setVisible(true);
                    String lastLoginUpdateQuery = "update user set lastLogin ='"+LocalDateTime.now()+"' where username like '%"+username+"%';";
                    PreparedStatement pst1 = conn.prepareStatement(lastLoginUpdateQuery);
                    pst1.executeUpdate();
                    
                    flag=true;
                }
            }
            
            
                if(username.equals(admin) && password.equals(admin_pass))//αν τα στοιχεία υπάρχουν στους candidates
                {
                    //open cadmin gui and close this one
                    this.dispose();
                    AdminGui adming=new AdminGui(admin);
                    adming.setVisible(true);
                    String lastLoginUpdateQuery = "update user set lastLogin ='"+LocalDateTime.now()+"' where username like '%"+username+"%';";
                    PreparedStatement pst1 = conn.prepareStatement(lastLoginUpdateQuery);
                    pst1.executeUpdate();
                    
                    flag=true;
                }
            
           
            if(!flag)
            {    
                if(username.equals(admin))
                {
                    JOptionPane.showMessageDialog(null, "Wrong username");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Wrong password");
                }
            }    
        }
        catch(Exception exce)
        {
            JOptionPane.showMessageDialog(null, exce);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        jtxtUsername.setText("");
        jtxtPassword.setText("");
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ErecruitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ErecruitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ErecruitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ErecruitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ErecruitLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables
}
