/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import static Clinic.editPatients.tmp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jomari
 */
public class studentmedicineUPDATE extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static String tmp;
    
    /**
     * Creates new form studentmedicineUPDATE
     */
    public studentmedicineUPDATE() {
        initComponents();
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);
        String sqlUS = "select * from clinicmanagement.studentmedicine where studentid =?";
        try{
            pst = conn.prepareStatement(sqlUS);
            pst.setString(1,tmp);
            rs = pst.executeQuery();
            if(rs.next()){
                String edit1 = rs.getString("studentid");
                USstudID.setText(edit1);
                String edit2 = rs.getString("firstname");
                USfirst.setText(edit2);
                String edit3 = rs.getString("lastname");
                USlast.setText(edit3);
                Date edit4 = rs.getDate("date");
                USdate.setDate(edit4);
                String edit5 = rs.getString("time");
                UStime.setText(edit5);
                String edit6 = rs.getString("medicine");
                USmedicine.setText(edit6);                     
                String edit7 = rs.getString("description");
                USdescription.setText(edit7);
               
            }
       }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"this Data is incomplete");
        }
         finally{
            try{
                rs.close();
                pst.close();   
            }
            catch(Exception e){
                
            }
        
        }
        
    
    }
    public static void setRow(String row){
        tmp = row;
    }
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        UStime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        USfirst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        USstudID = new javax.swing.JTextField();
        USlast = new javax.swing.JTextField();
        USmedicine = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        USdescription = new javax.swing.JTextArea();
        jButton27 = new javax.swing.JButton();
        USdate = new com.toedter.calendar.JDateChooser();
        USdescriptionempty = new javax.swing.JLabel();
        USstudIDempty = new javax.swing.JLabel();
        USfirstempty = new javax.swing.JLabel();
        USlastempty = new javax.swing.JLabel();
        USdateempty = new javax.swing.JLabel();
        UStimeempty = new javax.swing.JLabel();
        USmedicineempty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 191, 109));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/editrecordHeader.png"))); // NOI18N
        jLabel1.setText("Update Student");
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
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel5.setText("Student ID");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 30));

        UStime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        UStime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        UStime.setPreferredSize(new java.awt.Dimension(60, 20));
        UStime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UStimeActionPerformed(evt);
            }
        });
        jPanel2.add(UStime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 190, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewFIRST.png"))); // NOI18N
        jLabel6.setText("First Name");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        USfirst.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        USfirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        USfirst.setPreferredSize(new java.awt.Dimension(60, 20));
        USfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USfirstActionPerformed(evt);
            }
        });
        jPanel2.add(USfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewLAST.png"))); // NOI18N
        jLabel7.setText("Last Name");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 30));

        jLabel14.setBackground(new java.awt.Color(10, 46, 54));
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewTIME.png"))); // NOI18N
        jLabel14.setText("Time ");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 30));

        jLabel16.setBackground(new java.awt.Color(10, 46, 54));
        jLabel16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCALENDAR.png"))); // NOI18N
        jLabel16.setText("Date ");
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 30));

        USstudID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        USstudID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        USstudID.setPreferredSize(new java.awt.Dimension(60, 20));
        USstudID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USstudIDActionPerformed(evt);
            }
        });
        jPanel2.add(USstudID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 30));

        USlast.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        USlast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        USlast.setPreferredSize(new java.awt.Dimension(60, 20));
        USlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USlastActionPerformed(evt);
            }
        });
        jPanel2.add(USlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, 30));

        USmedicine.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        USmedicine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        USmedicine.setPreferredSize(new java.awt.Dimension(60, 20));
        USmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USmedicineActionPerformed(evt);
            }
        });
        jPanel2.add(USmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 190, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewMedicinename.png"))); // NOI18N
        jLabel8.setText("Medicine Name");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 130, 30));

        jButton4.setBackground(new java.awt.Color(87, 191, 109));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/update.png"))); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, 40));

        jLabel10.setBackground(new java.awt.Color(10, 46, 54));
        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel10.setText("Description");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 130, 30));

        USdescription.setColumns(5);
        USdescription.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        USdescription.setLineWrap(true);
        USdescription.setRows(5);
        jScrollPane1.setViewportView(USdescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 190, -1));

        jButton27.setBackground(new java.awt.Color(237, 74, 65));
        jButton27.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewClose.png"))); // NOI18N
        jButton27.setText("CANCEL");
        jButton27.setBorder(null);
        jButton27.setIconTextGap(0);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 40));

        USdate.setDateFormatString("yyyy-MM-d");
        jPanel2.add(USdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, 30));
        jPanel2.add(USdescriptionempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 190, 10));

        USstudIDempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        USstudIDempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(USstudIDempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 190, 20));

        USfirstempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        USfirstempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(USfirstempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, 20));

        USlastempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        USlastempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(USlastempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 190, 20));

        USdateempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        USdateempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(USdateempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, 20));

        UStimeempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        UStimeempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(UStimeempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 190, 20));

        USmedicineempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        USmedicineempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(USmedicineempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 190, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void UStimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UStimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UStimeActionPerformed

    private void USfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USfirstActionPerformed

    private void USstudIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USstudIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USstudIDActionPerformed

    private void USlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USlastActionPerformed

    private void USmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USmedicineActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if (USstudID.getText().trim().isEmpty() && USfirst.getText().trim().isEmpty() && USlast.getText().trim().isEmpty() 
         && UStime.getText().trim().isEmpty() && USmedicine.getText().trim().isEmpty() && USdescription.getText().trim().isEmpty()) 
//        && AStime.getDate().toString().isEmpty()
       {
            USstudIDempty.setText("Student ID is empty");
            USfirstempty.setText("first name is empty");
            USlastempty.setText("last name is empty");
           USdateempty.setText("date is empty");
            UStimeempty.setText("time number is empty");
            USmedicineempty.setText("medicine admit is empty");
            USdescriptionempty.setText("description number is empty");
            
             } else if (USstudID.getText().trim().isEmpty()) {
               USstudIDempty.setText("student number  is empty");
            } else if (USfirst.getText().trim().isEmpty()) {
               USstudIDempty.setText("first name is empty");
            } else if (USlast.getText().trim().isEmpty()) {
                USlastempty.setText("last name is empty");
         } else if (USdate.getDate().toString().isEmpty()) {
              USdateempty.setText("middle name is empty");
             } else if (UStime.getText().trim().isEmpty()) {
                 UStimeempty.setText("tine is empty");
             } else if (USmedicine.getText().trim().isEmpty()) {
                 USmedicineempty.setText("medicine is empty");
             } else if (USdescription.getText().trim().isEmpty()) {
                 USdescriptionempty.setText("description admit is empty");
            }else{
            String sql=null;
        PreparedStatement pst=null;

         try{
             //di pa nababago yung sa first column edit pero tmp lang ilalagay
            sql = "update clinicmanagement.studentmedicine  set  firstname=?, lastname=? ,date=?,time=? ,medicine=? , description=? where studentid=?";
            pst = conn.prepareStatement(sql);
       
                    
               pst.setString(1, USfirst.getText());
               pst.setString(2, USlast.getText());
               pst.setString(3, ((JTextField)USdate.getDateEditor().getUiComponent()).getText());
               pst.setInt(4, Integer.parseInt(UStime.getText()));
               pst.setString(5, USmedicine.getText()); 
               pst.setString(6, USdescription.getText()); 
               pst.setInt(7, Integer.parseInt(USstudID.getText()));
               pst.executeUpdate();
           
              JOptionPane.showMessageDialog(null,"Successfully Edit","Success",JOptionPane.INFORMATION_MESSAGE);
               new StudentMedicine ().update();
                pst.close();
                rs.close();
                setVisible(false);
                new StudentMedicine().setVisible(true);
                
               
              }
                catch(Exception e)
              {
                 JOptionPane.showMessageDialog(null, "studentID is already use");
                }     
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        StudentMedicine c = new StudentMedicine();
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton27ActionPerformed

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
            java.util.logging.Logger.getLogger(studentmedicineUPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentmedicineUPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentmedicineUPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentmedicineUPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentmedicineUPDATE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser USdate;
    private javax.swing.JLabel USdateempty;
    private javax.swing.JTextArea USdescription;
    private javax.swing.JLabel USdescriptionempty;
    private javax.swing.JTextField USfirst;
    private javax.swing.JLabel USfirstempty;
    private javax.swing.JTextField USlast;
    private javax.swing.JLabel USlastempty;
    private javax.swing.JTextField USmedicine;
    private javax.swing.JLabel USmedicineempty;
    private javax.swing.JTextField USstudID;
    private javax.swing.JLabel USstudIDempty;
    private javax.swing.JTextField UStime;
    private javax.swing.JLabel UStimeempty;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}