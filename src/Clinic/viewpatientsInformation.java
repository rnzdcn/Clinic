/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import static Clinic.Inventory.Itable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jomari
 */
public class viewpatientsInformation extends javax.swing.JDialog {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static String tmp;

    /**
     * Creates new form viewpatientsInformation
     */
    public viewpatientsInformation() {
        initComponents();
        this.setLocationRelativeTo(null);
        conn = connection.ConnecrDb();
        String sql5 = "select * from clinicmanagement.patients where studentid =?";
        try {
            pst = conn.prepareStatement(sql5);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            if (rs.next()) {
                String view1 = rs.getString("studentid");
                viewpatientstudid.setText(view1);
                String view2 = rs.getString("firstname");
                viewpatientfirst.setText(view2);
                String view3 = rs.getString("lastname");
                viewpatientlast.setText(view3);
                String view4 = rs.getString("middlename");
                viewpatientmiddle.setText(view4);
                String view5 = rs.getString("age");
                viewpatientage.setText(view5);
                String view6 = rs.getString("gender");
                viewpatientgender.setText(view6);
                String view7 = rs.getString("date");
                viewpatientdate.setText(view7);
                String view8 = rs.getString("contactnumber");
                viewpatientcontact.setText(view8);
                String view9 = rs.getString("time");
                viewpatienttime.setText(view9);
                String view10 = rs.getString("bednumber");
                viewpatientbed.setText(view10);
                String view11 = rs.getString("sick");
                viewpatientsick.setText(view11);
                String view12 = rs.getString("guardiannumber");
                viewpatientguardian.setText(view12);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "this Data is incomplete");
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }

        }

//for modal
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

        getRootPane().
                setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }

    public void printComponent(Component component) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Print Component ");

        pj.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                component.print(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        if (pj.printDialog() == false) {
            return;
        }

        try {
            pj.print();
        } catch (PrinterException ex) {
            // handle exception
        }
    }
    public void printComponent() {

        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Patients Information ");

        pj.setPrintable(new Printable() {
            
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) pg;
                g2.scale(pf.getImageableWidth()/jPanel2.getWidth(), pf.getImageableHeight()/jPanel2.getHeight());
                g2.translate(pf.getImageableX(), pf.getImageableY());
                jPanel2.print(g2);
                return Printable.PAGE_EXISTS;
            }
        });

        if (pj.printDialog() == false) {
            return;
        }

        try {
            pj.print();
        } catch (PrinterException ex) {
            // handle exception
        }
    }

    public static void setRow(String row) {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        viewpatientfirst = new javax.swing.JLabel();
        viewpatientstudid = new javax.swing.JLabel();
        viewpatientlast = new javax.swing.JLabel();
        viewpatientmiddle = new javax.swing.JLabel();
        viewpatientage = new javax.swing.JLabel();
        viewpatientgender = new javax.swing.JLabel();
        viewpatientdate = new javax.swing.JLabel();
        viewpatientcontact = new javax.swing.JLabel();
        viewpatienttime = new javax.swing.JLabel();
        viewpatientbed = new javax.swing.JLabel();
        viewpatientsick = new javax.swing.JLabel();
        viewpatientguardian = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 500));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(87, 191, 109));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 100));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/viewinformationHeader.png"))); // NOI18N
        jLabel1.setText("View Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(10, 46, 54));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 360));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel5.setText("Student ID:");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewFIRST.png"))); // NOI18N
        jLabel6.setText("First Name:");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewLAST.png"))); // NOI18N
        jLabel7.setText("Last Name:");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewMIDDLE.png"))); // NOI18N
        jLabel8.setText("Middle Name:");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));

        jLabel10.setBackground(new java.awt.Color(10, 46, 54));
        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewGENDER.png"))); // NOI18N
        jLabel10.setText("Gender:");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 30));

        jLabel11.setBackground(new java.awt.Color(10, 46, 54));
        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewAGE.png"))); // NOI18N
        jLabel11.setText("Age:");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, 30));

        jLabel12.setBackground(new java.awt.Color(10, 46, 54));
        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSICK.png"))); // NOI18N
        jLabel12.setText("Sick/Illness:");
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 130, 30));

        jLabel13.setBackground(new java.awt.Color(10, 46, 54));
        jLabel13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewBED.png"))); // NOI18N
        jLabel13.setText("Bed Number:");
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 130, 30));

        jLabel9.setBackground(new java.awt.Color(10, 46, 54));
        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewGUARDIAN.png"))); // NOI18N
        jLabel9.setText("Guardian Contact Number:");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 210, 30));

        jLabel14.setBackground(new java.awt.Color(10, 46, 54));
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewTIME.png"))); // NOI18N
        jLabel14.setText("Time Admit:");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, 30));

        jLabel15.setBackground(new java.awt.Color(10, 46, 54));
        jLabel15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCONTACT.png"))); // NOI18N
        jLabel15.setText("Contact Number:");
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 140, 30));

        jLabel16.setBackground(new java.awt.Color(10, 46, 54));
        jLabel16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCALENDAR.png"))); // NOI18N
        jLabel16.setText("Date:");
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, 30));

        jButton3.setBackground(new java.awt.Color(87, 191, 109));
        jButton3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/printer.png"))); // NOI18N
        jButton3.setText("Print");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 120, 40));

        jButton4.setBackground(new java.awt.Color(237, 74, 65));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewClose.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.setToolTipText("");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 120, 40));

        viewpatientfirst.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientfirst.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientfirst.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewpatientfirst.setToolTipText("");
        jPanel2.add(viewpatientfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 180, 30));

        viewpatientstudid.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientstudid.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientstudid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewpatientstudid.setToolTipText("");
        jPanel2.add(viewpatientstudid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 180, 30));

        viewpatientlast.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientlast.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientlast.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewpatientlast.setToolTipText("");
        jPanel2.add(viewpatientlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, 30));

        viewpatientmiddle.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientmiddle.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientmiddle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewpatientmiddle.setToolTipText("");
        jPanel2.add(viewpatientmiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 180, 30));

        viewpatientage.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientage.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewpatientage.setToolTipText("");
        jPanel2.add(viewpatientage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, 30));

        viewpatientgender.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientgender.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientgender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewpatientgender.setToolTipText("");
        jPanel2.add(viewpatientgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 180, 30));

        viewpatientdate.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientdate.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(viewpatientdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 190, 30));

        viewpatientcontact.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientcontact.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientcontact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(viewpatientcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 190, 30));

        viewpatienttime.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatienttime.setForeground(new java.awt.Color(255, 255, 255));
        viewpatienttime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(viewpatienttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 190, 30));

        viewpatientbed.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientbed.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientbed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(viewpatientbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 190, 30));

        viewpatientsick.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientsick.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientsick.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(viewpatientsick, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 190, 30));

        viewpatientguardian.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        viewpatientguardian.setForeground(new java.awt.Color(255, 255, 255));
        viewpatientguardian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(viewpatientguardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        printComponent();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Main viewP = new Main();
        viewP.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(viewpatientsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewpatientsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewpatientsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewpatientsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewpatientsInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel viewpatientage;
    private javax.swing.JLabel viewpatientbed;
    private javax.swing.JLabel viewpatientcontact;
    private javax.swing.JLabel viewpatientdate;
    private javax.swing.JLabel viewpatientfirst;
    private javax.swing.JLabel viewpatientgender;
    private javax.swing.JLabel viewpatientguardian;
    private javax.swing.JLabel viewpatientlast;
    private javax.swing.JLabel viewpatientmiddle;
    private javax.swing.JLabel viewpatientsick;
    private javax.swing.JLabel viewpatientstudid;
    private javax.swing.JLabel viewpatienttime;
    // End of variables declaration//GEN-END:variables
}
