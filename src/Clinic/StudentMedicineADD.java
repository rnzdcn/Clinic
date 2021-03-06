/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jomari
 */
public class StudentMedicineADD extends javax.swing.JDialog {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st = null;
    int id;
    private Object arg0 = null;

    /**
     * Creates new form StudentMedicineADD
     */
    public StudentMedicineADD() {
        initComponents();

        conn = connection.ConnecrDb();
        ASstudID.requestFocus();
        this.setLocationRelativeTo(null);
        updateTable();
        id();
        updateTable1();
        showTime();
        ASdate.getCalendar();
        //  ASdate.setMinSelectableDate(new Date());

        //cell not editable     
        LMtable.setDefaultEditor(Object.class, null);
        LMtable.getTableHeader().setDefaultRenderer(new HeaderColor());
        LMtable.setRowHeight(25);

        //for modal
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

        getRootPane().
                setBorder(BorderFactory.createLineBorder(Color.WHITE));

//        Border line = BorderFactory.createLineBorder(Color.WHITE);
//        Border empty = new EmptyBorder(0, 20, 0, 0);
//        CompoundBorder border = new CompoundBorder(line, empty);
//        Isearch.setBorder(border);
    }

    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);

        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            //table design
            setFont(new Font("Poppins", Font.PLAIN, 12));
            setBackground(new java.awt.Color(153, 255, 204));
            return this;
        }
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
                AStime.setText(f.format(d));
            }
        }).start();
    }

    public void updateTable1() {
        try {
            String sql1 = "select id as 'MEDICINE ID',medicinename as 'MEDICINE NAME', quantity as 'QUANTITY', status as 'STATUS'  from clinicmanagement.inventory where status = 'Available' ";
            pst = conn.prepareStatement(sql1);
            rs = pst.executeQuery();
            LMtable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
    }

    public void update1() {
        updateTable();
    }

    public void id() {
        try {
            String sql = "select max(studreportno) from clinicmanagement.studentmedicine";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getInt(1);
                id++;
                ASreportnum.setText(Integer.toString(id));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    public void updateTable() {
        try {
            String sql = "select * from clinicmanagement.inventory";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            LMtable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
    }

    public void update() {
        updateTable();

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
        jLabel6 = new javax.swing.JLabel();
        ASfirst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ASstudID = new javax.swing.JTextField();
        ASlast = new javax.swing.JTextField();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ASquantityempty = new javax.swing.JLabel();
        ASquantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        availableempty = new javax.swing.JLabel();
        AStime = new javax.swing.JLabel();
        ASreportnum = new javax.swing.JLabel();
        ASavailable = new javax.swing.JLabel();
        ASmedicine = new javax.swing.JLabel();

        jLabel9.setBackground(new java.awt.Color(204, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel9.setText("Student ID");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jLabel9.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 30));

        jLabel6.setBackground(new java.awt.Color(10, 46, 54));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewFIRST.png"))); // NOI18N
        jLabel6.setText("First Name");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 30));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ASfirstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ASfirstKeyTyped(evt);
            }
        });
        jPanel2.add(ASfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 190, 30));

        jLabel7.setBackground(new java.awt.Color(10, 46, 54));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewLAST.png"))); // NOI18N
        jLabel7.setText("Last Name");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 30));

        jLabel14.setBackground(new java.awt.Color(10, 46, 54));
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewTIME.png"))); // NOI18N
        jLabel14.setText("Time ");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 30));

        jLabel16.setBackground(new java.awt.Color(10, 46, 54));
        jLabel16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewCALENDAR.png"))); // NOI18N
        jLabel16.setText("Date ");
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ASstudIDKeyTyped(evt);
            }
        });
        jPanel2.add(ASstudID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 190, 30));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ASlastKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ASlastKeyTyped(evt);
            }
        });
        jPanel2.add(ASlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 190, 30));

        jLabel8.setBackground(new java.awt.Color(10, 46, 54));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewMedicinename.png"))); // NOI18N
        jLabel8.setText("Medicine Name");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 130, 30));

        ASadd.setBackground(new java.awt.Color(87, 191, 109));
        ASadd.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ASadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSAVE.png"))); // NOI18N
        ASadd.setText("ADD");
        ASadd.setBorder(null);
        ASadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASaddActionPerformed(evt);
            }
        });
        jPanel2.add(ASadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 120, 40));

        jLabel10.setBackground(new java.awt.Color(10, 46, 54));
        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel10.setText("Description");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 130, 30));

        ASdescription.setColumns(5);
        ASdescription.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASdescription.setRows(3);
        ASdescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ASdescriptionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ASdescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 190, 80));

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
        jPanel2.add(AScancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 120, 40));

        ASdateempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASdateempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASdateempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 190, 20));

        ASstudIDempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASstudIDempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASstudIDempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 190, 20));

        ASfirstempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASfirstempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASfirstempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 190, 20));

        AStimeempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        AStimeempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(AStimeempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 190, 20));

        ASdescriptionempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASdescriptionempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASdescriptionempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 190, 20));

        ASmedicineempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASmedicineempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASmedicineempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 190, 20));

        ASlastempty.setFont(new java.awt.Font("Poppins", 2, 10)); // NOI18N
        ASlastempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASlastempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 190, 20));

        ASdate.setDateFormatString("yyyy-MM-d");
        jPanel2.add(ASdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 190, 30));

        LMtable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        LMtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MEDICINE ID", "MEDICINE NAME", "QUANTITY", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LMtable.setRowHeight(25);
        LMtable.setSelectionBackground(new java.awt.Color(87, 191, 109));
        LMtable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        LMtable.setShowGrid(true);
        LMtable.getTableHeader().setResizingAllowed(false);
        LMtable.getTableHeader().setReorderingAllowed(false);
        LMtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(LMtable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 80));

        jLabel3.setBackground(new java.awt.Color(10, 46, 54));
        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/managepatients.png"))); // NOI18N
        jLabel3.setText("LIST OF MEDICINE");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jLabel11.setBackground(new java.awt.Color(10, 46, 54));
        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addnewpatientsimage/addnewSTUDID.png"))); // NOI18N
        jLabel11.setText("Report #");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        jLabel12.setBackground(new java.awt.Color(10, 46, 54));
        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/addMedicineIMG/addnewmedicineQuantity.png"))); // NOI18N
        jLabel12.setText("Quantity");
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 130, 30));

        ASquantityempty.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        ASquantityempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(ASquantityempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 190, 20));

        ASquantity.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASquantity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ASquantity.setPreferredSize(new java.awt.Dimension(60, 20));
        ASquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASquantityActionPerformed(evt);
            }
        });
        ASquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ASquantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ASquantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ASquantityKeyTyped(evt);
            }
        });
        jPanel2.add(ASquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 190, 30));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/availablequantity.png"))); // NOI18N
        jLabel2.setText("Available Stocks");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 130, 30));

        availableempty.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        availableempty.setForeground(new java.awt.Color(237, 74, 65));
        jPanel2.add(availableempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 190, 20));

        AStime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        AStime.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(AStime, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 190, 30));

        ASreportnum.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        ASreportnum.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(ASreportnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, 30));

        ASavailable.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        ASavailable.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(ASavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 190, 30));

        ASmedicine.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ASmedicine.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(ASmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 470));

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

    private void ASaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASaddActionPerformed
        //error ni run na  empty lahat dahil sa float availables

        try {
            //  String avail = ASavailable.getText();
            Float availables = Float.parseFloat(ASavailable.getText());
            if (ASstudID.getText().trim().isEmpty() || ASfirst.getText().trim().isEmpty() && ASlast.getText().trim().isEmpty()
                    && AStime.getText().trim().isEmpty() && ASmedicine.getText().trim().isEmpty() && ASdescription.getText().trim().isEmpty()
                    && ASquantity.getText().trim().isEmpty() && ASavailable.getText().trim().isEmpty() && ((JTextField) ASdate.getDateEditor().getUiComponent()).getText().isEmpty()) //&& AStime.getDate().toString().isEmpty()
            {

                JOptionPane.showMessageDialog(null, "Enter all details before proceeding");
                ASstudIDempty.setText("Student ID is empty");
                ASfirstempty.setText("first name is empty");
                ASlastempty.setText("last name is empty");
                ASdateempty.setText("date is empty");
                AStimeempty.setText("time number is empty");
//          ASmedicineempty.setText("medicine name is empty");
                ASdescriptionempty.setText("description number is empty");
                ASquantityempty.setText("quantity input is empty");
//          availableempty.setText("Available stock is empty");

            } else if (ASstudID.getText().trim().isEmpty()) {
                ASstudIDempty.setText("student number  is empty");
            } else if (ASfirst.getText().trim().isEmpty()) {
                ASfirstempty.setText("firstname is empty");
            } else if (ASlast.getText().trim().isEmpty()) {
                ASlastempty.setText("lastname is empty");
            } else if (((JTextField) ASdate.getDateEditor().getUiComponent()).getText().isEmpty()) {
                ASdateempty.setText("Date recieved is empty");
//            } else if (ASdate.getDate().toString().isEmpty()) {
//                 ASdateempty.setText("middle name is empty");
//            } else if (AStime.getText().trim().isEmpty()) {
//                 AStimeempty.setText("time is empty");
            } else if (ASmedicine.getText().trim().isEmpty()) {
                ASmedicineempty.setText("medicine is empty");
            } else if (ASdescription.getText().trim().isEmpty()) {
                ASdescriptionempty.setText("description is empty");
            } else if (ASquantity.getText().trim().isEmpty()) {
                ASquantityempty.setText("Quantity is empty");
            } else if (ASavailable.getText().trim().isEmpty()) {
                availableempty.setText("available is empty");
//            } else if (availables < 0) {
//             JOptionPane.showMessageDialog(rootPane, "Out of stocks!");           
            } else if (Float.parseFloat(ASquantity.getText()) > availables) {
                JOptionPane.showMessageDialog(rootPane, "Insufficient stocks! unable to add!");

            } else {

                String sql = "Insert into clinicmanagement.studentmedicine (studreportno, studentid, firstname, lastname, date, time, medicine, description,quantity) values (?,?,?,?,?,?,?,?,?)";
                try {
                    pst = conn.prepareStatement(sql);
                    Float a = Float.parseFloat(ASquantity.getText());

                    pst.setInt(1, Integer.parseInt(ASreportnum.getText()));
                    pst.setInt(2, Integer.parseInt(ASstudID.getText()));
                    pst.setString(3, ASfirst.getText());
                    pst.setString(4, ASlast.getText());
                    pst.setString(5, ((JTextField) ASdate.getDateEditor().getUiComponent()).getText());
                    pst.setString(6, AStime.getText());
                    pst.setString(7, ASmedicine.getText());
                    pst.setString(8, ASdescription.getText());
                    pst.setFloat(9, a);
                    pst.execute();

                    JOptionPane.showMessageDialog(null, "Successfully Added");

                    StudentMedicine intent = new StudentMedicine();
                    intent.setVisible(true);
                    setVisible(false);

                } catch (SQLException | NumberFormatException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                }

                //quantity stock
                PreparedStatement ps;
                String quantity_Out = ASquantity.getText();
                String id_Product_In = ASmedicine.getText();
                String update_In = "update clinicmanagement.inventory set quantity=quantity-" + quantity_Out + " where medicinename='" + id_Product_In + "';";
                try {
                    ps = conn.prepareStatement(update_In);
                    ps.executeUpdate(update_In);
                    updateTable();
                } catch (Exception e) {

                }

                //quantity zero not available
                String quantityzero = "update clinicmanagement.inventory set status= 'Not available' where quantity<=0";
                try {
                    ps = conn.prepareStatement(quantityzero);
                    ps.executeUpdate(quantityzero);
                    updateTable();

                    // JOptionPane.showMessageDialog(rootPane, "Stock Out Successfully!");
                } catch (Exception e) {

                }

////             String deletedzero = "delete from clinicmanagement.inventory where quantity=0 output deleted.* into clinicmanagement.zeroquantity ";
////            try {
////                ps = conn.prepareStatement(deletedzero);
////                  ps.executeUpdate(deletedzero);
////                  updateTable();
////
////              //  JOptionPane.showMessageDialog(rootPane, "Stock Out Successfully!");
////
////            } catch (Exception e) {
//
//            }JOptionPane.showMessageDialog(null, "Successfully Added");
//                new StudentMedicine().setVisible(true);
//                setVisible(false);  
//            
            }

        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Please select medicine in the table");
        }

    }//GEN-LAST:event_ASaddActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void AScancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AScancelActionPerformed
        StudentMedicine c = new StudentMedicine();
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
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) || (c == KeyEvent.VK_CAPS_LOCK || (c == KeyEvent.VK_SHIFT))) {
            ASlast.setEditable(true);

        } else {
            ASlast.setEditable(false);
            getToolkit().beep();

        }

        ASlastempty.setText("");
    }//GEN-LAST:event_ASlastKeyPressed

    private void ASdescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASdescriptionKeyPressed
        ASdescriptionempty.setText("");
    }//GEN-LAST:event_ASdescriptionKeyPressed

    private void ASstudIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASstudIDKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_MINUS)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please type only student number");
            evt.consume();

        }
    }//GEN-LAST:event_ASstudIDKeyTyped

    private void ASfirstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASfirstKeyReleased

    }//GEN-LAST:event_ASfirstKeyReleased

    private void ASlastKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASlastKeyReleased

    }//GEN-LAST:event_ASlastKeyReleased

    private void ASquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASquantityActionPerformed

    private void ASquantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASquantityKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASquantityKeyPressed

    private void LMtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMtableMouseClicked
//         String update_In = "Select * from clinicmanagement.inventory where quantity='0' and status='Available";
//              JOptionPane.showMessageDialog(null, "Select");
//            try {
//                pst = conn.prepareStatement(update_In);       
//                pst.executeUpdate(update_In);
//                updateTable();
//                 } catch (Exception e) {
//
//            }
        try {
            int qnty = 0;

            int row = LMtable.getSelectedRow();
            String Table_click = (LMtable.getModel().getValueAt(row, 0).toString());
            String sql = "select *  from clinicmanagement.inventory  where id='" + Table_click + "' and status='Available' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("medicinename");
                ASmedicine.setText(add1);
                int add2 = Integer.parseInt(rs.getString("quantity"));
                ASavailable.setText(Integer.toString(add2));
                JOptionPane.showMessageDialog(null, "You select medicine:" + "\n" + add1 + "\n" + "Quantity:" + "\n" + add2);
            } else {

                JOptionPane.showMessageDialog(null, "Not Available Medicine");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_LMtableMouseClicked

    private void ASquantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASquantityKeyReleased
        String PATTERN = "^(?!0)[0-9]{0,6}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ASquantity.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Invalid Input");
            ASquantityempty.setText("Dont input letters quantity stocks 6numbers only");
            ASquantity.setText("");
        } else {

        }
    }//GEN-LAST:event_ASquantityKeyReleased

    private void ASfirstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASfirstKeyTyped
        //Letter only 
        if (!Character.isAlphabetic(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();

        } else if (ASfirst.getText().trim().length() == 0 && Character.isLowerCase(evt.getKeyChar())) {
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_ASfirstKeyTyped

    private void ASlastKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASlastKeyTyped
        //Letter only 
        if (!Character.isAlphabetic(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();

        } else if (ASlast.getText().trim().length() == 0 && Character.isLowerCase(evt.getKeyChar())) {
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_ASlastKeyTyped

    private void ASquantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ASquantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ASquantityKeyTyped

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
    private javax.swing.JLabel ASavailable;
    private javax.swing.JButton AScancel;
    private com.toedter.calendar.JDateChooser ASdate;
    private javax.swing.JLabel ASdateempty;
    private javax.swing.JTextArea ASdescription;
    private javax.swing.JLabel ASdescriptionempty;
    private javax.swing.JTextField ASfirst;
    private javax.swing.JLabel ASfirstempty;
    private javax.swing.JTextField ASlast;
    private javax.swing.JLabel ASlastempty;
    private javax.swing.JLabel ASmedicine;
    private javax.swing.JLabel ASmedicineempty;
    private javax.swing.JTextField ASquantity;
    private javax.swing.JLabel ASquantityempty;
    private javax.swing.JLabel ASreportnum;
    private javax.swing.JTextField ASstudID;
    private javax.swing.JLabel ASstudIDempty;
    private javax.swing.JLabel AStime;
    private javax.swing.JLabel AStimeempty;
    public static final javax.swing.JTable LMtable = new javax.swing.JTable();
    private javax.swing.JLabel availableempty;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
