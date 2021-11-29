/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import static Clinic.updateMedicine.tmp;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jomari
 */
public class updateAdmin extends javax.swing.JFrame {
     Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static String tmp;
    
    
    public updateAdmin() {
        initComponents();
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);
        String sql2 = "select * from clinicmanagement.admin where username =?";
        try{
            pst = conn.prepareStatement(sql2);
            pst.setString(1,tmp);
            rs = pst.executeQuery();
            if(rs.next()){
                String edit1 = rs.getString("username");
                EAuser.setText(edit1);
                String edit2 = rs.getString("firstname");
                EAfirst.setText(edit2);
                String edit3 = rs.getString("lastname");
                EAlast.setText(edit3);
                String edit4 = rs.getString("password");
                EApassword.setText(edit4);
                String edit5 = rs.getString("confirmpassword");
                EAconfirm.setText(edit5);
                String edit6 = rs.getString("code");
                EAcode.setText(edit6);
                
  
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        EAedit = new javax.swing.JButton();
        EAfirst = new javax.swing.JTextField();
        EAlast = new javax.swing.JTextField();
        EAuser = new javax.swing.JTextField();
        EApassword = new javax.swing.JPasswordField();
        EAconfirm = new javax.swing.JPasswordField();
        EAcode = new javax.swing.JPasswordField();
        EAuserempty = new javax.swing.JLabel();
        EAfirstempty = new javax.swing.JLabel();
        EAlastempty = new javax.swing.JLabel();
        EAcodeempty = new javax.swing.JLabel();
        EApassempty = new javax.swing.JLabel();
        EAconfirmempty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(87, 191, 109));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/nurseadminn.png"))); // NOI18N
        jLabel1.setText("Update Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 360, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        jPanel1.setBackground(new java.awt.Color(10, 46, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(10, 46, 54));
        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/confirmPass.png"))); // NOI18N
        jLabel3.setText("Confirm Password");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 30));

        jLabel4.setBackground(new java.awt.Color(10, 46, 54));
        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/firstname.png"))); // NOI18N
        jLabel4.setText("First Name");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 30));

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerpassword.png"))); // NOI18N
        jLabel5.setText("Password");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/lastname.png"))); // NOI18N
        jLabel6.setText("Last Name");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registercode.png"))); // NOI18N
        jLabel7.setText("Security Code");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerUsername.png"))); // NOI18N
        jLabel8.setText("Username");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 30));

        jButton2.setBackground(new java.awt.Color(237, 74, 65));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerback.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 40));

        EAedit.setBackground(new java.awt.Color(87, 191, 109));
        EAedit.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        EAedit.setForeground(new java.awt.Color(255, 255, 255));
        EAedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/RegisterIMG/registerCreate.png"))); // NOI18N
        EAedit.setText("UPDATE");
        EAedit.setBorder(null);
        EAedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAeditActionPerformed(evt);
            }
        });
        jPanel1.add(EAedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, 40));

        EAfirst.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EAfirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EAfirst.setPreferredSize(new java.awt.Dimension(60, 20));
        EAfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAfirstActionPerformed(evt);
            }
        });
        EAfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EAfirstKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EAfirstKeyReleased(evt);
            }
        });
        jPanel1.add(EAfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 190, 30));

        EAlast.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EAlast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EAlast.setPreferredSize(new java.awt.Dimension(60, 20));
        EAlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAlastActionPerformed(evt);
            }
        });
        EAlast.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EAlastKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EAlastKeyReleased(evt);
            }
        });
        jPanel1.add(EAlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 190, 30));

        EAuser.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EAuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EAuser.setPreferredSize(new java.awt.Dimension(60, 20));
        EAuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAuserActionPerformed(evt);
            }
        });
        EAuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EAuserKeyPressed(evt);
            }
        });
        jPanel1.add(EAuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 190, 30));

        EApassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EApassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EApassword.setPreferredSize(new java.awt.Dimension(60, 20));
        EApassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EApasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EApasswordKeyReleased(evt);
            }
        });
        jPanel1.add(EApassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 190, 30));

        EAconfirm.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EAconfirm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EAconfirm.setPreferredSize(new java.awt.Dimension(60, 20));
        EAconfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EAconfirmKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EAconfirmKeyReleased(evt);
            }
        });
        jPanel1.add(EAconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, 30));

        EAcode.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EAcode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EAcode.setPreferredSize(new java.awt.Dimension(60, 20));
        EAcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EAcodeKeyPressed(evt);
            }
        });
        jPanel1.add(EAcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 190, 30));

        EAuserempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        EAuserempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(EAuserempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 20));

        EAfirstempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        EAfirstempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(EAfirstempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 190, 20));

        EAlastempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        EAlastempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(EAlastempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 20));

        EAcodeempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        EAcodeempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(EAcodeempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 190, 20));

        EApassempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        EApassempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(EApassempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 190, 20));

        EAconfirmempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        EAconfirmempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel1.add(EAconfirmempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        manageAdmin s = new manageAdmin();
        s.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void EAeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAeditActionPerformed
        if (EAfirst.getText().trim().isEmpty() && EAlast.getText().trim().isEmpty() && EAuser.getText().trim().isEmpty()   &&  EApassword.getText().trim().isEmpty() && EAconfirm.getText().trim().isEmpty() 
              && EAcode.getText().trim().isEmpty()) {
            EAfirstempty.setText("fistname is empty");
            EAlastempty.setText("lastname is empty");
            EAuserempty.setText("username is empty");
            EApassempty.setText("password is empty");
            EAconfirmempty.setText("confirm password is empty");
            EAcodeempty.setText("code is empty");

        } else if (EAfirst.getText().trim().isEmpty()) {
            EAfirstempty.setText("fistname is empty");
        } else if (EAlast.getText().trim().isEmpty()) {
            EAlastempty.setText("lastname is empty");
        } else if (EAuser.getText().trim().isEmpty()) {
            EAuserempty.setText("username is empty");
        } else if (EApassword.getText().trim().isEmpty()) {
            EApassempty.setText("password is empty");
        } else if (EAconfirm.getText().trim().isEmpty()) {
            EAconfirmempty.setText("confirm password is empty");
        } else if (EAcode.getText().trim().isEmpty()) {
            EAcodeempty.setText("code is empty");
        }else if(EApassword.getText().length()<6){
            JOptionPane.showMessageDialog(null, "password must be 6 character .");
        }else if(EAuser.getText().length()<6){
            JOptionPane.showMessageDialog(null, "username must be 6 character .");

        } else {
            String Pass = EApassword.getText();
            String Cpass = EAconfirm.getText();
            if(Pass.equals(Cpass)){
            String sql=null;
           PreparedStatement pst=null;

        try{
           //nakavarchar lahat sa database ng admin di ko pa inaayos tinatamad pa 
            
            sql = "update clinicmanagement.admin  set  username=?, firstname=?, lastname=? ,password=?, confirmpassword=? , code=? where username='"+tmp+"'";
            pst = conn.prepareStatement(sql);

            
                    pst.setString(1, EAuser.getText());
                    pst.setString(2, EAfirst.getText());
                    pst.setString(3, EAlast.getText());
                    pst.setString(4, EApassword.getText());
                    pst.setString(5, EAconfirm.getText());
                    pst.setString(6, EAcode.getText());
                  
                    pst.executeUpdate();

           
              JOptionPane.showMessageDialog(null,"Successfully Update","Success",JOptionPane.INFORMATION_MESSAGE);
               new manageAdmin().update();
                pst.close();
                rs.close();
                setVisible(false);
                new manageAdmin().setVisible(true);
                
               
       }
       catch(Exception e)
       {
        JOptionPane.showMessageDialog(null, "username is already use");
       }  finally{
            try{
                rs.close();
                pst.close();   
            }
            catch(Exception e){
                
            }
        }
   
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Passwords does not match.");
        
        
        }
        }
               
          

    }//GEN-LAST:event_EAeditActionPerformed

    private void EAfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAfirstActionPerformed

    private void EAfirstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAfirstKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_A ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_B ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_C ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_D ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_E ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_G ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_H ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_I ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_J ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_K ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_L ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_M ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_N){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_O ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_P ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_Q ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_R ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_S ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_T ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_U ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_V ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_W ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_X ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_Y ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_Z ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_SHIFT ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_SPACE){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ENTER ){
        }

        else{
            JOptionPane.showMessageDialog(null, "Invalid Character.");
            EAfirst.setText("");

        }      // TODO add your handling code here:

    }//GEN-LAST:event_EAfirstKeyReleased

    private void EAlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAlastActionPerformed

    private void EAlastKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAlastKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_A ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_B ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_C ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_D ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_E ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_G ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_H ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_I ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_J ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_K ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_L ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_M ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_N){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_O ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_P ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_Q ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_R ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_S ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_T ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_U ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_V ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_W ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_X ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_Y ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_Z ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_SHIFT ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_SPACE){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ENTER ){
        }

        else{
            JOptionPane.showMessageDialog(null, "Invalid Character.");
            EAlast.setText("");

            // TODO add your handling code here:
        }
    }//GEN-LAST:event_EAlastKeyReleased

    private void EAuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAuserActionPerformed

    private void EApasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EApasswordKeyReleased
        if(EApassword.getText().length()>15){
            JOptionPane.showMessageDialog(null, "Password must be 15 characters only.");
        }

    }//GEN-LAST:event_EApasswordKeyReleased

    private void EAconfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAconfirmKeyReleased
        if(EAconfirm.getText().length()>15){
            JOptionPane.showMessageDialog(null, "Password must be 15 characters only.");
        }

    }//GEN-LAST:event_EAconfirmKeyReleased

    private void EAfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAfirstKeyPressed
        EAfirstempty.setText("");
    }//GEN-LAST:event_EAfirstKeyPressed

    private void EAlastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAlastKeyPressed
        EAlastempty.setText("");
    }//GEN-LAST:event_EAlastKeyPressed

    private void EAuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAuserKeyPressed
        EAuserempty.setText("");
    }//GEN-LAST:event_EAuserKeyPressed

    private void EApasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EApasswordKeyPressed
        EApassempty.setText("");
    }//GEN-LAST:event_EApasswordKeyPressed

    private void EAconfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAconfirmKeyPressed
       EAconfirmempty.setText("");
    }//GEN-LAST:event_EAconfirmKeyPressed

    private void EAcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EAcodeKeyPressed
        EAcodeempty.setText("");
    }//GEN-LAST:event_EAcodeKeyPressed

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
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField EAcode;
    private javax.swing.JLabel EAcodeempty;
    private javax.swing.JPasswordField EAconfirm;
    private javax.swing.JLabel EAconfirmempty;
    private javax.swing.JButton EAedit;
    private javax.swing.JTextField EAfirst;
    private javax.swing.JLabel EAfirstempty;
    private javax.swing.JTextField EAlast;
    private javax.swing.JLabel EAlastempty;
    private javax.swing.JLabel EApassempty;
    private javax.swing.JPasswordField EApassword;
    private javax.swing.JTextField EAuser;
    private javax.swing.JLabel EAuserempty;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
