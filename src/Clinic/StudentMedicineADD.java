/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jomari
 */
public class StudentMedicineADD extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st=null;
    private Object arg0;
    /**
     * Creates new form StudentMedicineADD
     */
    public StudentMedicineADD() {
        initComponents();
        
        conn = connection.ConnecrDb();  ASstudID.requestFocus();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AStime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ASfirst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ASstudID = new javax.swing.JTextField();
        ASlast = new javax.swing.JTextField();
        ASmedicine = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ASadd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ASdescription = new javax.swing.JTextArea();
        AScancel = new javax.swing.JButton();
        ASdateempty = new javax.swing.JLabel();
        ASstudIDempty = new javax.swing.JLabel();
        ASfirstempty = new javax.swing.JLabel();
        AStimeempty = new javax.swing.JLabel();
        ASdescriptionempty = new javax.swing.JLabel();
        ASmedicineempty = new javax.swing.JLabel();
        ASlastempty = new javax.swing.JLabel();
        ASdate = new com.toedter.calendar.JDateChooser();

        jLabel9.setBackground(new java.awt.Color(204, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel9.setText("Student ID");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jLabel9.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 191, 109));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/addstudentHeader.png"))); // NOI18N
        jLabel1.setText("Add Student");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 400, 70));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewClose.png"))); // NOI18N
        jButton5.setText("CLOSE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        jPanel2.setBackground(new java.awt.Color(10, 46, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel5.setText("Student ID");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 30));

        AStime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        AStime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AStime.setPreferredSize(new java.awt.Dimension(60, 20));
        AStime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AStimeActionPerformed(evt);
            }
        });
        AStime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AStimeKeyPressed(evt);
            }
        });
        jPanel2.add(AStime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 190, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewFIRST.png"))); // NOI18N
        jLabel6.setText("First Name");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        ASfirst.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASfirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ASfirst.setPreferredSize(new java.awt.Dimension(60, 20));
        ASfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASfirstActionPerformed(evt);
            }
        });
        ASfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ASfirstKeyPressed(evt);
            }
        });
        jPanel2.add(ASfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewLAST.png"))); // NOI18N
        jLabel7.setText("Last Name");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 30));

        jLabel14.setBackground(new java.awt.Color(10, 46, 54));
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewTIME.png"))); // NOI18N
        jLabel14.setText("Time ");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 30));

        jLabel16.setBackground(new java.awt.Color(10, 46, 54));
        jLabel16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCALENDAR.png"))); // NOI18N
        jLabel16.setText("Date ");
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 30));

        ASstudID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASstudID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ASstudID.setPreferredSize(new java.awt.Dimension(60, 20));
        ASstudID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASstudIDActionPerformed(evt);
            }
        });
        ASstudID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ASstudIDKeyPressed(evt);
            }
        });
        jPanel2.add(ASstudID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 30));

        ASlast.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASlast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ASlast.setPreferredSize(new java.awt.Dimension(60, 20));
        ASlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASlastActionPerformed(evt);
            }
        });
        ASlast.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ASlastKeyPressed(evt);
            }
        });
        jPanel2.add(ASlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, 30));

        ASmedicine.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASmedicine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ASmedicine.setPreferredSize(new java.awt.Dimension(60, 20));
        ASmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASmedicineActionPerformed(evt);
            }
        });
        ASmedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ASmedicineKeyPressed(evt);
            }
        });
        jPanel2.add(ASmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 190, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewMedicinename.png"))); // NOI18N
        jLabel8.setText("Medicine Name");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 130, 30));

        ASadd.setBackground(new java.awt.Color(87, 191, 109));
        ASadd.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ASadd.setForeground(new java.awt.Color(255, 255, 255));
        ASadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSAVE.png"))); // NOI18N
        ASadd.setText("ADD");
        ASadd.setBorder(null);
        ASadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASaddActionPerformed(evt);
            }
        });
        jPanel2.add(ASadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, 40));

        jLabel10.setBackground(new java.awt.Color(10, 46, 54));
        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel10.setText("Description");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 130, 30));

        ASdescription.setColumns(5);
        ASdescription.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASdescription.setRows(5);
        ASdescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ASdescriptionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ASdescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 190, -1));

        AScancel.setBackground(new java.awt.Color(237, 74, 65));
        AScancel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        AScancel.setForeground(new java.awt.Color(255, 255, 255));
        AScancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewClose.png"))); // NOI18N
        AScancel.setText("CANCEL");
        AScancel.setBorder(null);
        AScancel.setIconTextGap(0);
        AScancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AScancelActionPerformed(evt);
            }
        });
        jPanel2.add(AScancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 40));

        ASdateempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASdateempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASdateempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, 20));

        ASstudIDempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASstudIDempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASstudIDempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 190, 20));

        ASfirstempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASfirstempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASfirstempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, 20));

        AStimeempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        AStimeempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(AStimeempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 190, 20));

        ASdescriptionempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASdescriptionempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASdescriptionempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 190, 20));

        ASmedicineempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASmedicineempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASmedicineempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 190, 20));

        ASlastempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASlastempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASlastempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 190, 20));
        jPanel2.add(ASdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ASstudIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASstudIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASstudIDActionPerformed

    private void ASfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASfirstActionPerformed

    private void ASlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASlastActionPerformed

    private void AStimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AStimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AStimeActionPerformed

    private void ASmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASmedicineActionPerformed

    private void ASaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASaddActionPerformed
      if (ASstudID.getText().trim().isEmpty() && ASfirst.getText().trim().isEmpty() && ASlast.getText().trim().isEmpty() 
       && AStime.getText().trim().isEmpty() && ASmedicine.getText().trim().isEmpty() && ASdescription.getText().trim().isEmpty()) 
//      && AStime.getDate().toString().isEmpty()
       {
            ASstudIDempty.setText("Student ID is empty");
            ASfirstempty.setText("first name is empty");
            ASlastempty.setText("last name is empty");
            //ASdateempty.setText("date is empty");
            AStimeempty.setText("time number is empty");
            ASmedicineempty.setText("medicine admit is empty");
            ASdescriptionempty.setText("description number is empty");
            
             } else if (ASstudID.getText().trim().isEmpty()) {
               ASstudIDempty.setText("student number  is empty");
            } else if (ASfirst.getText().trim().isEmpty()) {
               ASfirstempty.setText("firstname is empty");
            } else if (ASlast.getText().trim().isEmpty()) {
                ASlastempty.setText("lastname is empty");
//            } else if (ASdate.getDate().toString().isEmpty()) {
//                 ASdateempty.setText("middle name is empty");
             } else if (AStime.getText().trim().isEmpty()) {
                 AStimeempty.setText("time is empty");
             } else if (ASmedicine.getText().trim().isEmpty()) {
                 ASmedicineempty.setText("medicine is empty");
             } else if (ASdescription.getText().trim().isEmpty()) {
                 ASdescriptionempty.setText("description is empty");
            }else{
             String sql = "Insert into clinicmanagement.studentmedicine (studentid, firstname, lastname, date, time, medicine, description) values (?,?,?,?,?,?,?)";
        try{
              pst = conn.prepareStatement(sql);
       
                    
               pst.setInt(1, Integer.parseInt(ASstudID.getText()));
               pst.setString(2, ASfirst.getText());
               pst.setString(3, ASlast.getText());
               pst.setString(4, ((JTextField)ASdate.getDateEditor().getUiComponent()).getText());
               pst.setInt(5, Integer.parseInt(AStime.getText()));
               pst.setString(6, ASmedicine.getText());
               pst.setString(7, ASdescription.getText());
               pst.execute();

           
              JOptionPane.showMessageDialog(null,"Successfully Added");
               new StudentMedicine().setVisible(true);
               setVisible(false);
                
               
       }
       catch(Exception e)
       {
    JOptionPane.showMessageDialog(null, "studentID is already use");
       }     
             }
    
         
           
    }//GEN-LAST:event_ASaddActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void AScancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AScancelActionPerformed
        Menu c = new Menu();
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AScancelActionPerformed

    private void ASstudIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASstudIDKeyPressed
        ASstudIDempty.setText("");
    }//GEN-LAST:event_ASstudIDKeyPressed

    private void ASfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASfirstKeyPressed
        ASfirstempty.setText("");
    }//GEN-LAST:event_ASfirstKeyPressed

    private void ASlastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASlastKeyPressed
        ASlastempty.setText("");
    }//GEN-LAST:event_ASlastKeyPressed

    private void AStimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AStimeKeyPressed
        AStimeempty.setText("");
    }//GEN-LAST:event_AStimeKeyPressed

    private void ASmedicineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASmedicineKeyPressed
        ASmedicineempty.setText("");
    }//GEN-LAST:event_ASmedicineKeyPressed

    private void ASdescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASdescriptionKeyPressed
        ASdescriptionempty.setText("");
    }//GEN-LAST:event_ASdescriptionKeyPressed

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
            java.util.logging.Logger.getLogger(StudentMedicineADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMedicineADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMedicineADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMedicineADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMedicineADD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ASadd;
    private javax.swing.JButton AScancel;
    private com.toedter.calendar.JDateChooser ASdate;
    private javax.swing.JLabel ASdateempty;
    private javax.swing.JTextArea ASdescription;
    private javax.swing.JLabel ASdescriptionempty;
    private javax.swing.JTextField ASfirst;
    private javax.swing.JLabel ASfirstempty;
    private javax.swing.JTextField ASlast;
    private javax.swing.JLabel ASlastempty;
    private javax.swing.JTextField ASmedicine;
    private javax.swing.JLabel ASmedicineempty;
    private javax.swing.JTextField ASstudID;
    private javax.swing.JLabel ASstudIDempty;
    private javax.swing.JTextField AStime;
    private javax.swing.JLabel AStimeempty;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
