/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Erecruit_Login;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chatzopoulos Thomas
 */
public class CandidateGui extends javax.swing.JFrame {
    
    String username;
    Connection conn=null;
    Statement stmt=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
   
    public CandidateGui(String username) {
        this.username = username;
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/erecruit" , "root" , "123qweasdzxc,");     
        }
        catch(Exception Ex)
        {
            JOptionPane.showMessageDialog(null,Ex);
        }
        initComponents();
        welcomeLabel.setText("Welcome " +this.username +" what would you like to do ?");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        welcomeLabel = new javax.swing.JLabel();
        viewYourDatajButton = new javax.swing.JButton();
        viewYourDatajScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        updateUserJButton = new javax.swing.JButton();
        newApply = new javax.swing.JButton();
        showMyApplies = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appliesTable = new javax.swing.JTable();
        deleteApplyJButton1 = new javax.swing.JButton();
        deleteApplyJComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        otherJobsJComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jobInfoButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JobInfoTable = new javax.swing.JTable();
        viewLanguagesToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        languagesTable = new javax.swing.JTable();
        addLanguageButton = new javax.swing.JButton();
        newLanguageComboBox = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        degreesTable = new javax.swing.JTable();
        degreeTitleComboBox1 = new javax.swing.JComboBox<>();
        degreeIdrymaComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();
        yearComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        candidateTable = new javax.swing.JTable();
        updateCandidateButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(31, 120, 255));
        welcomeLabel.setText("Hello");
        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        getContentPane().add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));
        getContentPane().add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 10, -1, -1));

        viewYourDatajButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewYourDatajButton.setForeground(new java.awt.Color(30, 120, 255));
        viewYourDatajButton.setText("View your data");
        viewYourDatajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewYourDatajButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewYourDatajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 49, -1, -1));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "username", "password", "name", "surname", "reg_date", "email", "lastLogIn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewYourDatajScrollPane1.setViewportView(UserTable);

        getContentPane().add(viewYourDatajScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 986, 46));

        updateUserJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateUserJButton.setForeground(new java.awt.Color(230, 135, 45));
        updateUserJButton.setText("Update User");
        updateUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 113, -1, -1));

        newApply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newApply.setForeground(new java.awt.Color(34, 200, 75));
        newApply.setText("New Apply");
        newApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newApplyActionPerformed(evt);
            }
        });
        getContentPane().add(newApply, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, -1, -1));

        showMyApplies.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showMyApplies.setForeground(new java.awt.Color(30, 120, 255));
        showMyApplies.setText("Show my Applies");
        showMyApplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMyAppliesActionPerformed(evt);
            }
        });
        getContentPane().add(showMyApplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        appliesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "start_date", "salary", "position", "edra", "submission_date", "status", "My_Submission", "Evaluate", "ranking"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appliesTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 910, 96));

        deleteApplyJButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteApplyJButton1.setForeground(new java.awt.Color(255, 0, 0));
        deleteApplyJButton1.setText("Delete Apply");
        deleteApplyJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteApplyJButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(deleteApplyJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, -1, -1));

        deleteApplyJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteApplyJComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(deleteApplyJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 250, -1));

        jLabel1.setText("To delete an apply (only if status is open), plese select the job from combo box and then press the button \"Delete Apply\".");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 630, -1));

        otherJobsJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherJobsJComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(otherJobsJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 350, -1));

        jLabel2.setText("To do a new apply, plese select the job from combo box and press the button \"New Apply\". For more informations about the job press the button \"More Imformations\".");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 777, -1));

        jobInfoButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jobInfoButton.setForeground(new java.awt.Color(230, 145, 0));
        jobInfoButton.setText("More Information");
        jobInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jobInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        JobInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Start_Day", "Salary", "Position", "Edra", "Recruiter", "Announce_Date", "Submission_Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JobInfoTable);
        if (JobInfoTable.getColumnModel().getColumnCount() > 0) {
            JobInfoTable.getColumnModel().getColumn(0).setResizable(false);
            JobInfoTable.getColumnModel().getColumn(1).setResizable(false);
            JobInfoTable.getColumnModel().getColumn(2).setResizable(false);
            JobInfoTable.getColumnModel().getColumn(3).setResizable(false);
            JobInfoTable.getColumnModel().getColumn(4).setResizable(false);
            JobInfoTable.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 1346, 61));

        viewLanguagesToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewLanguagesToggleButton1.setForeground(new java.awt.Color(31, 120, 255));
        viewLanguagesToggleButton1.setText("View Laguages");
        viewLanguagesToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLanguagesToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(viewLanguagesToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 189, -1));

        languagesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Languages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(languagesTable);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 117, 43));

        addLanguageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addLanguageButton.setForeground(new java.awt.Color(34, 200, 75));
        addLanguageButton.setText("Add Language");
        addLanguageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLanguageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addLanguageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 189, -1));

        newLanguageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN", "FR", "SP", "GR" }));
        newLanguageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLanguageComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(newLanguageComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 117, 20));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(31, 120, 255));
        jButton3.setText("View Degrees");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 640, 169, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(34, 200, 75));
        jButton5.setText("Add Degree");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 730, 169, -1));

        degreesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Title", "Department", "Yaer", "Grade", "Bathmida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(degreesTable);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 740, 90));

        degreeTitleComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeTitleComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(degreeTitleComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 740, 220, -1));

        degreeIdrymaComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeIdrymaComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(degreeIdrymaComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 740, 200, -1));

        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Grade"
            }
        ));
        jScrollPane7.setViewportView(gradeTable);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 730, 70, 50));

        yearComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));
        getContentPane().add(yearComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 740, 70, -1));

        jLabel3.setText("Select Degree Title");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 710, 170, 20));

        jLabel4.setText("Select Department");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 710, 210, -1));

        jLabel5.setText("Select graduation yaer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, -1, -1));

        jLabel6.setText("Type degree grade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 710, -1, -1));

        checkButton.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        checkButton.setForeground(new java.awt.Color(230, 145, 0));
        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 740, -1, -1));

        jLabel7.setText("Press Check button");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 710, -1, -1));

        jLabel8.setText("to choose department");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 720, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, -1, -1));

        candidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "username", "bio", "sistatikes", "certificates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(candidateTable);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 990, 50));

        updateCandidateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateCandidateButton.setForeground(new java.awt.Color(230, 135, 45));
        updateCandidateButton.setText("Update Candidate");
        updateCandidateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCandidateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateCandidateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewYourDatajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewYourDatajButtonActionPerformed
        try
        {
            if(UserTable.getRowCount()>0)
            ((DefaultTableModel)UserTable.getModel()).removeRow(0);
            
            String userQuery = 
            "select * from user"
            + " where username LIKE '%" +this.username +"%';" ;
            
            DefaultTableModel temporaryTable = (DefaultTableModel) UserTable.getModel();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(userQuery);
            while(rs.next())
            {
                temporaryTable.addRow(new Object[] { rs.getString("username"), rs.getString("password") , rs.getString("name"),
                    rs.getString("surname") , rs.getString("reg_date"), rs.getString("email"), rs.getString("lastLogIn")});
            }     
            UserTable.setModel(temporaryTable);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);           
        }
        
        
        //εμφάνισε και τα στοιχεία στον πίνακα candidate
        try
        {
            if(candidateTable.getRowCount()>0)
                ((DefaultTableModel)candidateTable.getModel()).removeRow(0);

            String candQuery = 
                    "Select * from candidate"
                    + " where username LIKE '%" +this.username + "%'" ;

            DefaultTableModel tempTable = (DefaultTableModel) candidateTable.getModel();
            Statement stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery(candQuery);
            while(rs1.next())
            {
                tempTable.addRow(new Object[] { rs1.getString("username"), rs1.getString("bio"), rs1.getString("sistatikes"), rs1.getString("certificates") });
            }     
            candidateTable.setModel(tempTable);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_viewYourDatajButtonActionPerformed

    private void updateUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserJButtonActionPerformed
        try
        {
            String updated;
            String UserUpdateQuery = "update user";

            for(int i=0;i<UserTable.getColumnCount();i++)
            {
                updated = UserTable.getValueAt(0, i).toString();
                if(i==0)
                    UserUpdateQuery += " set " +UserTable.getColumnName(i) +" = '" +updated +"'";
                else
                    UserUpdateQuery += " , " +UserTable.getColumnName(i) +" = '" +updated +"'";
            }  
            UserUpdateQuery += " where username LIKE '%" +this.username +"%'";
            
            JOptionPane.showMessageDialog(null, UserUpdateQuery);

            Statement stmt = conn.createStatement();
            pst =conn.prepareStatement(UserUpdateQuery);
            pst.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateUserJButtonActionPerformed

    private void newApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newApplyActionPerformed
        try
        {
            int intJobID=0;
            String jobPosition = otherJobsJComboBox1.getSelectedItem().toString();
            String jobID = "Select id from job where position LIKE '%"+ jobPosition +"%'";
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery(jobID);
            res.next();
            intJobID=res.getInt("id");
            
            String jobInsertQuery ="Insert into applies (cand_usrname, job_id, user_submission) values ('"+ this.username +"','"+ intJobID +"','"+ LocalDate.now(ZoneId.of("Europe/Athens")) +"')";
            Statement stmt = conn.createStatement();
            pst =conn.prepareStatement(jobInsertQuery);
            pst.execute(); 
           
            /*
            
            String checkID ="select id from job where id IN (select job_id from applies where cand_usrname LIKE '%" + this.username +"%');"; 
            
            Statement stmnt = conn.createStatement();           
            ResultSet rst = stmt.executeQuery(checkID);
            /*
            boolean flag=false;
            while(rst.next()) 
            {
                try
                {
                    int ckeckID = res.getInt("id");
                    if(ckeckID==intJobID)
                    {
                        flag=true;   
                        JOptionPane.showMessageDialog(null, "You have already applied for this job");
                        break;
                    }
                    else
                    {
                        flag=false;   
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }*/
                
        }
        catch (Exception ex){}   
    }//GEN-LAST:event_newApplyActionPerformed

    private void showMyAppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMyAppliesActionPerformed
        try 
        {
            int height = appliesTable.getRowCount();
            for(int i=0;i<height;i++)
            {
                ((DefaultTableModel)appliesTable.getModel()).removeRow(0);
            }           
            
            DefaultTableModel tempAppliesTable =  (DefaultTableModel)appliesTable.getModel();                  
            String applies ="select start_date, salary, position, edra, announce_date, submission_date, evaluated, DATEDIFF(submission_date,NOW()) from job "
                    + "where id IN (select job_id from applies where cand_usrname LIKE '%" + this.username +"%');"; 
                    
            Statement stmt = conn.createStatement();           
            ResultSet rst = stmt.executeQuery(applies);
                         
            while(rst.next()) 
            {
                try
                {
                    if(rst.getInt("DATEDIFF(submission_date,NOW())")>0)
                    {
                        tempAppliesTable.addRow(new Object[] {rst.getString("start_date") , rst.getString("salary") , rst.getString("position"),
                        rst.getString("edra") , rst.getString("submission_date") , "open"});   
                    }
                    else
                    {
                        tempAppliesTable.addRow(new Object[] {rst.getString("start_date") , rst.getString("salary") , rst.getString("position"),
                        rst.getString("edra") , rst.getString("submission_date") , "close"});   
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            
            String My_Submission = "select user_submission as My_Submission from applies where cand_usrname LIKE '%" + this.username +"%';"; 
                     
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery(My_Submission);
            
            height = appliesTable.getRowCount();
            
            for(int i=0;i<height;i++) //nom_of_My_Submission for each job
            {
                res.next();
                tempAppliesTable.setValueAt(res.getString("My_Submission"), i, 6);
            }
            
            
            applies ="select evaluated from job where id IN (select job_id from applies where cand_usrname LIKE '%" + this.username +"%');"; 
            Statement stmnt = conn.createStatement();
            ResultSet res1 = stmnt.executeQuery(applies);
                
            height = appliesTable.getRowCount();
            
            for(int i=0;i<height;i++) //nom_of_My_Submission for each job
            {
                res1.next();
                String tempValue=res1.getString("evaluated");
                tempAppliesTable.setValueAt(tempValue, i, 7);
                if(tempValue.equals("under assessment"))
                {
                    tempAppliesTable.setValueAt("---", i, 8);
                }
               /*else if(tempValue="evaluated"){
                    
                }*/
                
            }
            
            
            height = appliesTable.getRowCount();
            for(int i=0; i<height ; i++)
            {    
                if(tempAppliesTable.getValueAt(i, 7).equals("under assessment"))
                    continue;
                    
                String position = tempAppliesTable.getValueAt(i, 2).toString();
                String positionQuery = "select id from job where position like '%" +position +"%'";
                Statement stmnt2 = conn.createStatement();
                ResultSet res2 = stmnt2.executeQuery(positionQuery);
                res2.next();
                
                
                String idofjob = res2.getString("id");
                String eval = "call evaluate(" +idofjob +")";
                Statement stmnt3 = conn.createStatement();
                ResultSet res3 = stmnt3.executeQuery(eval);
                
                int ranking = 1;   
                String rank = "";
                boolean found = false;
                while(res3.next())
                {
                    if(res3.getString("applicant").equals(this.username))
                    {
                        found = true;
                        break;
                    }
                    
                    ranking++;                    
                }
                
                if(found)
                {
                    rank = String.valueOf(ranking);
                }
                else
                {
                    rank = "failed";
                }
                
                if(tempAppliesTable.getValueAt(i,8) == null)
                    tempAppliesTable.setValueAt(rank, i, 8);
                
            }
            
        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //otherJobsJComboBox1
        try
        {
            otherJobsJComboBox1.removeAllItems(); 
            
            String myJobs = "SELECT position,id FROM job INNER JOIN applies on job.id = applies.job_id WHERE applies.cand_usrname LIKE '" +this.username +"'";
            Statement stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery(myJobs);
            
            ArrayList<String> myJobsList = new ArrayList<String>();
            myJobsList.clear();
            while(rs1.next())
            {
                myJobsList.add(rs1.getString("id"));
            }
            
            
            String jobQuery = " SELECT position,id FROM job " +
                "INNER JOIN applies on job.id = applies.job_id " +
                "WHERE applies.cand_usrname NOT LIKE '%" +this.username +"%'" + " GROUP BY position";
                      
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(jobQuery);
            
            boolean found= false;
            while(rs.next())
            {
                found = false;
                for(int a=0; a<myJobsList.size(); a++)   
                {
                    if(rs.getString("id").equals(myJobsList.get(a)))
                    {
                        found = true;
                        break;
                    }
                }
                
                if(!found)
                {
                    String position=rs.getString("position");
                    otherJobsJComboBox1.addItem(position);       
                }
            }                   
        }                         
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //combo box new apply
        try 
        {
            
            String jobsPosition="select position,DATEDIFF(submission_date,NOW()) from job group by id";
            /*String jobsFromApplies="select position, DATEDIFF(submission_date,NOW()) from job "
                    + "where id IN (select job_id from applies where cand_usrname LIKE '%" + this.username +"%');"; */
           
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(jobsPosition);
            while(rs.next())
            {
                if(rs.getInt("DATEDIFF(submission_date,NOW())")>0){
                    String id=rs.getString("position");
                    otherJobsJComboBox1.addItem(id);
                }
            }          
        }                         
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        //combo box delete aplly
        
        try 
        {
            int height = appliesTable.getRowCount();
            
            for(int i=0; i<height; i++)
            {
                if(appliesTable.getValueAt(i, 7).equals("under assessment"))
                {
                    String deletepos = appliesTable.getValueAt(i, 2).toString();
                    deleteApplyJComboBox1.addItem(deletepos);
                }
            }
        }                        
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }  
    }//GEN-LAST:event_showMyAppliesActionPerformed

    private void deleteApplyJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteApplyJComboBox1ActionPerformed
           
    }//GEN-LAST:event_deleteApplyJComboBox1ActionPerformed

    private void deleteApplyJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteApplyJButton1ActionPerformed
        try
        {
            String toDelete= deleteApplyJComboBox1.getSelectedItem().toString();
            String deleteApply="Delete from applies where cand_usrname LIKE '%" + this.username +"%' AND job_id IN (select id from job where position like '%"+ toDelete +"%');";            
            Statement stmt = conn.createStatement();
            pst =conn.prepareStatement(deleteApply);
            pst.execute();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }        
    }//GEN-LAST:event_deleteApplyJButton1ActionPerformed

    private void otherJobsJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherJobsJComboBox1ActionPerformed
        
    }//GEN-LAST:event_otherJobsJComboBox1ActionPerformed

    private void jobInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobInfoButtonActionPerformed
        String jobInfo= otherJobsJComboBox1.getSelectedItem().toString();
        try
        {
            if(JobInfoTable.getRowCount()>0)
            ((DefaultTableModel)JobInfoTable.getModel()).removeRow(0);
            
            String jobQuery = "select * from job where position='"+ jobInfo+"' " ;
            
            DefaultTableModel temporaryTable = (DefaultTableModel) JobInfoTable.getModel();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(jobQuery);
            while(rs.next())
            {
                temporaryTable.addRow(new Object[] {rs.getString("start_date"), rs.getString("salary") , rs.getString("position"),
                    rs.getString("edra") , rs.getString("recruiter"), rs.getString("announce_date"), rs.getString("submission_date")});
            }     
            JobInfoTable.setModel(temporaryTable);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);           
        }
    }//GEN-LAST:event_jobInfoButtonActionPerformed

    private void viewLanguagesToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLanguagesToggleButton1ActionPerformed
        try
        {
            if(languagesTable.getRowCount()>0)
            ((DefaultTableModel)languagesTable.getModel()).removeRow(0);
            
            String userQuery = "select * from languages where candid LIKE '%" +this.username +"%';" ;
            
            DefaultTableModel temporaryTable = (DefaultTableModel) languagesTable.getModel();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(userQuery);
            while(rs.next())
            {
                temporaryTable.addRow(new Object[] { rs.getString("lang")});
            }     
            languagesTable.setModel(temporaryTable);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);           
        } 
    }//GEN-LAST:event_viewLanguagesToggleButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {    
            String titlosFromBox = degreeTitleComboBox1.getSelectedItem().toString();
            String idrymaFromBox = degreeIdrymaComboBox2.getSelectedItem().toString();
            String yaerFromBox = yearComboBox1.getSelectedItem().toString();
            String grade = (String) gradeTable.getValueAt(0,0).toString();
            System.out.println(grade);
            String insertQuery="insert into has_degree (cand_usrname, degr_title, degr_idryma, etos, grade) values " 
                                + "('"+ this.username +"','"+ titlosFromBox +"', '"+ idrymaFromBox +"', "+yaerFromBox  +", "+ grade +");";            
            JOptionPane.showMessageDialog(null,insertQuery);
            Statement stmt = conn.createStatement();
            pst =conn.prepareStatement(insertQuery);
            pst.execute(); 
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            int height = degreesTable.getRowCount();
            for(int i=0;i<height;i++)
            {
                ((DefaultTableModel)degreesTable.getModel()).removeRow(0);
            }
            
            String userQuery = "select degr_title, degr_idryma, etos, grade, bathmida from has_degree inner join degree ON degr_title=titlos AND degr_idryma=idryma where cand_usrname LIKE '%" +this.username +"%';";
            
            DefaultTableModel temporaryTable = (DefaultTableModel) degreesTable.getModel();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(userQuery);
            while(rs.next())
            {
                temporaryTable.addRow(new Object[] { rs.getString("degr_title"),rs.getString("degr_idryma"),rs.getString("etos"),rs.getString("grade"), rs.getString("bathmida")});
            }
            
            
            degreesTable.setModel(temporaryTable);
        }
        /****************************************************************************************************************************************************************************************+  bathmida  +******/
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);           
        }  
        
        //degreeTitleComboBox1
        try 
        {
            degreeTitleComboBox1.removeAllItems(); 
            String titleQuery="select titlos from degree";
                      
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(titleQuery);
            while(rs.next())
            {
                String titlos=rs.getString("titlos");
                degreeTitleComboBox1.addItem(titlos);               
            }                   
        }                         
        catch (Exception ex){} 
        
        //degreeIdrymaComboBox2
        /*try 
        {
            while (gradeTable.getColumnName(0)==""){   
                degreeIdrymaComboBox2.removeAllItems(); 
                String titlosFromBox = degreeTitleComboBox1.getSelectedItem().toString();

                String idrymaQuery="select idryma from degree where titlos LIKE '%" + titlosFromBox +"%';";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(idrymaQuery);
                while(rs.next())
                {
                    String idryma=rs.getString("idryma");
                    degreeIdrymaComboBox2.addItem(idryma);               
                }
            }
        }                         
        catch (Exception ex){} */
               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addLanguageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLanguageButtonActionPerformed
        try
        {
            String newLanguage= newLanguageComboBox.getSelectedItem().toString();
            String languageQuery = "select * from languages where candid LIKE '%" +this.username +"%';";
            Statement stmnt = conn.createStatement();
            ResultSet rs= stmnt.executeQuery(languageQuery);
            rs.next();
            newLanguage= rs.getString("lang")+","+ newLanguage;
            String languages; 
            
            if(languageQuery=="")
            {
                languages="Insert into languages(candid, lang) values ('"+ this.username +"','"+ newLanguage +"')";
            }    
            else
            {
                languages="Update languages set lang='"+ newLanguage +"'where candid LIKE '%" +this.username +"%' ";
            }
           
            Statement stmt = conn.createStatement();
            pst =conn.prepareStatement(languages);
            pst.execute();
            
        }
        /****************************************************************************************************************************************************************************************+  bathmida  +******/
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);           
        }   
    }//GEN-LAST:event_addLanguageButtonActionPerformed

    private void degreeTitleComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeTitleComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeTitleComboBox1ActionPerformed

    private void degreeIdrymaComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeIdrymaComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeIdrymaComboBox2ActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        try 
        {
                degreeIdrymaComboBox2.removeAllItems(); 
                String titlosFromBox = degreeTitleComboBox1.getSelectedItem().toString();

                String idrymaQuery="select idryma from degree where titlos LIKE '%" + titlosFromBox +"%';";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(idrymaQuery);
                while(rs.next())
                {
                    String idryma=rs.getString("idryma");
                    degreeIdrymaComboBox2.addItem(idryma);               
                }
        }                         
        catch (Exception ex){} 
    }//GEN-LAST:event_checkButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newLanguageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLanguageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newLanguageComboBoxActionPerformed

    private void updateCandidateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCandidateButtonActionPerformed
        try
        {
            String updated;
            String candidateUpdateQuery = "update candidate";

            for(int i=0;i<candidateTable.getColumnCount();i++)
            {
                updated = candidateTable.getValueAt(0, i).toString();
                if(i==0)
                    candidateUpdateQuery += " set " +candidateTable.getColumnName(i) +" = '" +updated +"'";
                else
                    candidateUpdateQuery += " , " +candidateTable.getColumnName(i) +" = '" +updated +"'";
            }  
            candidateUpdateQuery += " where username LIKE '%" +this.username +"%'";
            
            JOptionPane.showMessageDialog(null, candidateUpdateQuery);

            PreparedStatement pst1 =conn.prepareStatement(candidateUpdateQuery);
            pst1.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateCandidateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JobInfoTable;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton addLanguageButton;
    private javax.swing.JTable appliesTable;
    private javax.swing.JTable candidateTable;
    private javax.swing.JButton checkButton;
    private javax.swing.JComboBox<String> degreeIdrymaComboBox2;
    private javax.swing.JComboBox<String> degreeTitleComboBox1;
    private javax.swing.JTable degreesTable;
    private javax.swing.JButton deleteApplyJButton1;
    private javax.swing.JComboBox<String> deleteApplyJComboBox1;
    private javax.swing.JTable gradeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jobInfoButton;
    private javax.swing.JTable languagesTable;
    private javax.swing.JButton newApply;
    private javax.swing.JComboBox<String> newLanguageComboBox;
    private javax.swing.JComboBox<String> otherJobsJComboBox1;
    private javax.swing.JButton showMyApplies;
    private javax.swing.JButton updateCandidateButton;
    private javax.swing.JButton updateUserJButton;
    private javax.swing.JToggleButton viewLanguagesToggleButton1;
    private javax.swing.JButton viewYourDatajButton;
    private javax.swing.JScrollPane viewYourDatajScrollPane1;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JComboBox<String> yearComboBox1;
    // End of variables declaration//GEN-END:variables
}