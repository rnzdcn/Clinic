/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import static Clinic.viewpatientsInformation.tmp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class editPatients extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static String tmp;

    public editPatients() {
        initComponents();
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);
        String sql5 = "select * from clinicmanagement.patients where studentid =?";

        try {
            pst = conn.prepareStatement(sql5);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            if (rs.next()) {
                String edit1 = rs.getString("studentid");
                editpatientstudID.setText(edit1);
                String edit2 = rs.getString("firstname");
                editpatientfirst.setText(edit2);
                String edit3 = rs.getString("lastname");
                editpatientlast.setText(edit3);
                String edit4 = rs.getString("middlename");
                editpatientmiddle.setText(edit4);
                String edit5 = rs.getString("age");
                editpatientage.setText(edit5);
                String edit6 = rs.getString("gender");
                editpatientgender.setSelectedItem(edit6);
                Date edit7 = rs.getDate("date");
                editpatientdate.setDate(edit7);
                String edit8 = rs.getString("contactnumber");
                editpatientcontact.setText(edit8);
                String edit9 = rs.getString("time");
                editpatienttime.setText(edit9);
                String edit10 = rs.getString("bednumber");
                editpatientbed.setText(edit10);
                String edit11 = rs.getString("sick");
                editpatientsick.setText(edit11);
                String edit12 = rs.getString("guardiannumber");
                editpatientguardian.setText(edit12);

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

    }

    public static void setRow(String row) {
        tmp = row;
    }

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
        editpatientfirst = new javax.swing.JTextField();
        editpatientstudID = new javax.swing.JTextField();
        editpatientlast = new javax.swing.JTextField();
        editpatientmiddle = new javax.swing.JTextField();
        editpatientage = new javax.swing.JTextField();
        editpatientsick = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        editpatientbed = new javax.swing.JTextField();
        editpatientguardian = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        editpatienttime = new javax.swing.JTextField();
        editpatientcontact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        editpatientgender = new javax.swing.JComboBox();
        editpatientdate = new com.toedter.calendar.JDateChooser();
        ERemptystudid = new javax.swing.JLabel();
        ERemptydate = new javax.swing.JLabel();
        ERemptyfirst = new javax.swing.JLabel();
        ERemptylast = new javax.swing.JLabel();
        ERemptymiddle = new javax.swing.JLabel();
        ERemptyage = new javax.swing.JLabel();
        ERemptycontact = new javax.swing.JLabel();
        ERemptytime = new javax.swing.JLabel();
        ERemptybed = new javax.swing.JLabel();
        ERemptysick = new javax.swing.JLabel();
        ERemptyguardian = new javax.swing.JLabel();

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
        jLabel1.setText("Edit Record");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 434, -1));

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
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewFIRST.png"))); // NOI18N
        jLabel6.setText("First Name");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewLAST.png"))); // NOI18N
        jLabel7.setText("Last Name");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewMIDDLE.png"))); // NOI18N
        jLabel8.setText("Middle Name");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 30));

        jLabel10.setBackground(new java.awt.Color(10, 46, 54));
        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewGENDER.png"))); // NOI18N
        jLabel10.setText("Gender");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 30));

        jLabel11.setBackground(new java.awt.Color(10, 46, 54));
        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewAGE.png"))); // NOI18N
        jLabel11.setText("Age");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        editpatientfirst.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientfirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientfirst.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientfirstActionPerformed(evt);
            }
        });
        editpatientfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientfirstKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 190, 30));

        editpatientstudID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientstudID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientstudID.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientstudID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientstudIDActionPerformed(evt);
            }
        });
        editpatientstudID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientstudIDKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientstudID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 190, 30));

        editpatientlast.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientlast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientlast.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientlastActionPerformed(evt);
            }
        });
        editpatientlast.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientlastKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, 30));

        editpatientmiddle.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientmiddle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientmiddle.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientmiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientmiddleActionPerformed(evt);
            }
        });
        editpatientmiddle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientmiddleKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientmiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 190, 30));

        editpatientage.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientage.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientageActionPerformed(evt);
            }
        });
        editpatientage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientageKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 190, 30));

        editpatientsick.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientsick.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientsick.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientsick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientsickActionPerformed(evt);
            }
        });
        editpatientsick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientsickKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientsick, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 210, 30));

        jLabel12.setBackground(new java.awt.Color(10, 46, 54));
        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSICK.png"))); // NOI18N
        jLabel12.setText("Sick/Illness");
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 130, 30));

        jLabel13.setBackground(new java.awt.Color(10, 46, 54));
        jLabel13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewBED.png"))); // NOI18N
        jLabel13.setText("Bed Number");
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 130, 30));

        editpatientbed.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientbed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientbed.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientbedActionPerformed(evt);
            }
        });
        editpatientbed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientbedKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 210, 30));

        editpatientguardian.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientguardian.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientguardian.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientguardian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientguardianActionPerformed(evt);
            }
        });
        editpatientguardian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientguardianKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientguardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 140, 30));

        jLabel9.setBackground(new java.awt.Color(10, 46, 54));
        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewGUARDIAN.png"))); // NOI18N
        jLabel9.setText("Guardian Contact Number");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 210, 30));

        jLabel14.setBackground(new java.awt.Color(10, 46, 54));
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewTIME.png"))); // NOI18N
        jLabel14.setText("Time Admit");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, 30));

        editpatienttime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatienttime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatienttime.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatienttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatienttimeActionPerformed(evt);
            }
        });
        editpatienttime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatienttimeKeyPressed(evt);
            }
        });
        jPanel2.add(editpatienttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 210, 30));

        editpatientcontact.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientcontact.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editpatientcontact.setPreferredSize(new java.awt.Dimension(60, 20));
        editpatientcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientcontactActionPerformed(evt);
            }
        });
        editpatientcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editpatientcontactKeyPressed(evt);
            }
        });
        jPanel2.add(editpatientcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 210, 30));

        jLabel15.setBackground(new java.awt.Color(10, 46, 54));
        jLabel15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCONTACT.png"))); // NOI18N
        jLabel15.setText("Contact Number");
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 140, 30));

        jLabel16.setBackground(new java.awt.Color(10, 46, 54));
        jLabel16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCALENDAR.png"))); // NOI18N
        jLabel16.setText("Date ");
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, 30));

        jButton3.setBackground(new java.awt.Color(237, 74, 65));
        jButton3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewClose.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 120, 40));

        jButton4.setBackground(new java.awt.Color(87, 191, 109));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSAVE.png"))); // NOI18N
        jButton4.setText("Save");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 120, 40));

        editpatientgender.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        editpatientgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        editpatientgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientgenderActionPerformed(evt);
            }
        });
        jPanel2.add(editpatientgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 190, 30));

        editpatientdate.setDateFormatString("yyyy-MM-d");
        jPanel2.add(editpatientdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 210, 30));
        jPanel2.add(ERemptystudid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, 10));
        jPanel2.add(ERemptydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 190, 10));
        jPanel2.add(ERemptyfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, 10));
        jPanel2.add(ERemptylast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 10));
        jPanel2.add(ERemptymiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, 10));
        jPanel2.add(ERemptyage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 10));
        jPanel2.add(ERemptycontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 190, 10));
        jPanel2.add(ERemptytime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 190, 10));
        jPanel2.add(ERemptybed, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 190, 10));
        jPanel2.add(ERemptysick, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 190, 10));
        jPanel2.add(ERemptyguardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 190, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editpatientfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientfirstActionPerformed

    private void editpatientstudIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientstudIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientstudIDActionPerformed

    private void editpatientlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientlastActionPerformed

    private void editpatientmiddleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientmiddleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientmiddleActionPerformed

    private void editpatientageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientageActionPerformed

    private void editpatientsickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientsickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientsickActionPerformed

    private void editpatientbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientbedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientbedActionPerformed

    private void editpatientguardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientguardianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientguardianActionPerformed

    private void editpatienttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatienttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatienttimeActionPerformed

    private void editpatientcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientcontactActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Main close = new Main();
        close.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (editpatientstudID.getText().trim().isEmpty() && editpatientfirst.getText().trim().isEmpty() && editpatientlast.getText().trim().isEmpty() && editpatientmiddle.getText().trim().isEmpty()
                && editpatientage.getText().trim().isEmpty() && editpatientcontact.getText().trim().isEmpty() && editpatienttime.getText().trim().isEmpty()
                && editpatientbed.getText().trim().isEmpty() && editpatientsick.getText().trim().isEmpty() && editpatientguardian.getText().trim().isEmpty()) //di pa naayos yung pag walang nilagay sa calender mag eerror hindi magawa
        //tinamad na
        {
            ERemptystudid.setText("Student ID is empty");
            ERemptyfirst.setText("first name is empty");
            ERemptylast.setText("last name is empty");
            ERemptymiddle.setText("middle name is empty");
            ERemptyage.setText("Age is empty");
            ERemptycontact.setText("contact number is empty");
            ERemptytime.setText("time admit is empty");
            ERemptybed.setText("bed number is empty");
            ERemptysick.setText("sickness is empty");
            ERemptyguardian.setText("Guardian contact number is empty");

        } else if (editpatientstudID.getText().trim().isEmpty()) {
            ERemptystudid.setText("record number  is empty");
        } else if (editpatientfirst.getText().trim().isEmpty()) {
            ERemptyfirst.setText("first name is empty");
        } else if (editpatientlast.getText().trim().isEmpty()) {
            ERemptylast.setText("last name is empty");
        } else if (editpatientmiddle.getText().trim().isEmpty()) {
            ERemptymiddle.setText("middle name is empty");
        } else if (editpatientage.getText().trim().isEmpty()) {
            ERemptyage.setText("Age is empty");
        } else if (editpatientcontact.getText().trim().isEmpty()) {
            ERemptycontact.setText("contact number is empty");
        } else if (editpatienttime.getText().trim().isEmpty()) {
            ERemptytime.setText("time admit is empty");
        } else if (editpatientbed.getText().trim().isEmpty()) {
            ERemptybed.setText("bed number is empty");
        } else if (editpatientsick.getText().trim().isEmpty()) {
            ERemptysick.setText("sickness is empty");
        } else if (editpatientguardian.getText().trim().isEmpty()) {
            ERemptyguardian.setText("Guardian contact number is empty");
        } else {

            String sql = null;
            PreparedStatement pst = null;

            try {
                // kulang pa sa tmp yung sa where para maedit kahit yung first column

                sql = "update clinicmanagement.patients  set studentid=?, firstname=?, lastname=?, middlename=?, age=?, gender=?, date=?, contactnumber=?, time=?, bednumber=?, sick=?, guardiannumber=? where studentid='"+tmp+"'";
                pst = conn.prepareStatement(sql);

                pst.setInt(1, Integer.parseInt(editpatientstudID.getText()));
                pst.setString(2, editpatientfirst.getText());
                pst.setString(3, editpatientlast.getText());
                pst.setString(4, editpatientmiddle.getText());
                pst.setInt(5, Integer.parseInt(editpatientage.getText()));
                pst.setString(6, editpatientgender.getSelectedItem().toString());
                pst.setString(7, ((JTextField) editpatientdate.getDateEditor().getUiComponent()).getText());
                 pst.setString(8, editpatientcontact.getText());
//                pst.setInt(8, Integer.parseInt(editpatientcontact.getText()));
                pst.setInt(9, Integer.parseInt(editpatienttime.getText()));
                pst.setInt(10, Integer.parseInt(editpatientbed.getText()));
                pst.setString(11, editpatientsick.getText());
                pst.setString(12, editpatientguardian.getText());
//                pst.setInt(12, Integer.parseInt(editpatientguardian.getText()));

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Successfully Edit", "Success", JOptionPane.INFORMATION_MESSAGE);
                new Main().update();
                pst.close();
                rs.close();
                setVisible(false);
                new Main().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "studentID is already use");
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void editpatientgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpatientgenderActionPerformed

    private void editpatientstudIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientstudIDKeyPressed
        ERemptystudid.setText("");
    }//GEN-LAST:event_editpatientstudIDKeyPressed

    private void editpatientfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientfirstKeyPressed
        ERemptyfirst.setText("");
    }//GEN-LAST:event_editpatientfirstKeyPressed

    private void editpatientlastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientlastKeyPressed
        ERemptylast.setText("");
    }//GEN-LAST:event_editpatientlastKeyPressed

    private void editpatientmiddleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientmiddleKeyPressed
        ERemptymiddle.setText("");
    }//GEN-LAST:event_editpatientmiddleKeyPressed

    private void editpatientageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientageKeyPressed
        ERemptyage.setText("");
    }//GEN-LAST:event_editpatientageKeyPressed

    private void editpatientcontactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientcontactKeyPressed
        ERemptycontact.setText("");
    }//GEN-LAST:event_editpatientcontactKeyPressed

    private void editpatienttimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatienttimeKeyPressed
        ERemptytime.setText("");
    }//GEN-LAST:event_editpatienttimeKeyPressed

    private void editpatientbedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientbedKeyPressed
        ERemptybed.setText("");
    }//GEN-LAST:event_editpatientbedKeyPressed

    private void editpatientsickKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientsickKeyPressed
        ERemptysick.setText("");
    }//GEN-LAST:event_editpatientsickKeyPressed

    private void editpatientguardianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editpatientguardianKeyPressed
        ERemptyguardian.setText("");
    }//GEN-LAST:event_editpatientguardianKeyPressed

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
            java.util.logging.Logger.getLogger(editPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ERemptyage;
    private javax.swing.JLabel ERemptybed;
    private javax.swing.JLabel ERemptycontact;
    private javax.swing.JLabel ERemptydate;
    private javax.swing.JLabel ERemptyfirst;
    private javax.swing.JLabel ERemptyguardian;
    private javax.swing.JLabel ERemptylast;
    private javax.swing.JLabel ERemptymiddle;
    private javax.swing.JLabel ERemptysick;
    private javax.swing.JLabel ERemptystudid;
    private javax.swing.JLabel ERemptytime;
    private javax.swing.JTextField editpatientage;
    private javax.swing.JTextField editpatientbed;
    private javax.swing.JTextField editpatientcontact;
    private com.toedter.calendar.JDateChooser editpatientdate;
    private javax.swing.JTextField editpatientfirst;
    private javax.swing.JComboBox editpatientgender;
    private javax.swing.JTextField editpatientguardian;
    private javax.swing.JTextField editpatientlast;
    private javax.swing.JTextField editpatientmiddle;
    private javax.swing.JTextField editpatientsick;
    private javax.swing.JTextField editpatientstudID;
    private javax.swing.JTextField editpatienttime;
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
    // End of variables declaration//GEN-END:variables
}
