/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import static Clinic.Inventory.Itable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author jomari
 */
public class Menu extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st = null;

    public Menu() {
        initComponents();
        conn = connection.ConnecrDb();
        this.setLocationRelativeTo(null);

        currentDate();
        showTime();

        try {
            String f = "select * from clinicmanagement.patients where sick='Headache'";
            pst = conn.prepareStatement(f);
            rs = pst.executeQuery();
            Itable.setModel(DbUtils.resultSetToTableModel(rs));
            int f1 = Itable.getRowCount();

            String g = "select * from clinicmanagement.patients where sick='Cold'";
            pst = conn.prepareStatement(g);
            rs = pst.executeQuery();
            Itable.setModel(DbUtils.resultSetToTableModel(rs));
            int g1 = Itable.getRowCount();

            String h = "select * from clinicmanagement.patients where sick='Diarrhea'";
            pst = conn.prepareStatement(h);
            rs = pst.executeQuery();
            Itable.setModel(DbUtils.resultSetToTableModel(rs));
            int h1 = Itable.getRowCount();

            String i = "select * from clinicmanagement.patients where sick='Flu'";
            pst = conn.prepareStatement(i);
            rs = pst.executeQuery();
            Itable.setModel(DbUtils.resultSetToTableModel(rs));
            int i1 = Itable.getRowCount();

            String j = "select * from clinicmanagement.patients where sick='Allergy'";
            pst = conn.prepareStatement(j);
            rs = pst.executeQuery();
            Itable.setModel(DbUtils.resultSetToTableModel(rs));
            int j1 = Itable.getRowCount();

            String k = "select * from clinicmanagement.patients where sick='Stomachache'";
            pst = conn.prepareStatement(k);
            rs = pst.executeQuery();
            Itable.setModel(DbUtils.resultSetToTableModel(rs));
            int k1 = Itable.getRowCount();

            DefaultPieDataset dataset2 = new DefaultPieDataset();
            dataset2.setValue("Headache", new Integer(f1));
            dataset2.setValue("Cold", new Integer(g1));
            dataset2.setValue("Diarrhea", new Integer(h1));
            dataset2.setValue("Flu", new Integer(i1));
            dataset2.setValue("Allergy", new Integer(j1));
            dataset2.setValue("Stomachache", new Integer(k1));

            JFreeChart chart2 = ChartFactory.createPieChart3D("Common Student Illness", dataset2, true, true, true);
            PiePlot P = (PiePlot) chart2.getPlot();
            ChartPanel CP2 = new ChartPanel(chart2);
            jPanel6.setPreferredSize(new Dimension(500, 250));
            jPanel6.setLayout(new java.awt.BorderLayout());
            jPanel6.add(CP2, BorderLayout.CENTER);
            jPanel6.validate();
            chart2.setBackgroundPaint(Color.WHITE);
            chart2.getTitle().setPaint(new Color(10, 46, 54));
            chart2.getTitle().setFont(new Font("Poppins", Font.PLAIN, 18));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //codes sa bar chart
        try {
            String query = "select date , quantity from clinicmanagement.studentmedicine";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection.ConnecrDb(), query);
            JFreeChart cha = ChartFactory.createBarChart("Number of medicine give", "Date", "quantity", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartPanel CP1 = new ChartPanel(cha);
            jPanel4.setPreferredSize(new Dimension(500, 250));
            jPanel4.setLayout(new java.awt.BorderLayout());
            jPanel4.add(CP1, BorderLayout.CENTER);
            cha.setBackgroundPaint(Color.WHITE);
            cha.getTitle().setPaint(new Color(10, 46, 54));
            cha.getTitle().setFont(new Font("Poppins", Font.PLAIN, 18));
            jPanel4.validate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //line chart codes
        try {
            String query = "select daterecieved,quantity from clinicmanagement.inventory";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection.ConnecrDb(), query);
            JFreeChart cha = ChartFactory.createLineChart3D("Number of medicine Recieved", "Daterecieved", "Quantity", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartPanel CP1 = new ChartPanel(cha);
            jPanel3.setLayout(new java.awt.BorderLayout());
            jPanel3.add(CP1, BorderLayout.CENTER);
            cha.setBackgroundPaint(Color.WHITE);
            cha.getTitle().setPaint(new Color(10, 46, 54));
            cha.getTitle().setFont(new Font("Poppins", Font.PLAIN, 18));
            jPanel3.validate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //codes sa mga total patients at medicine 
        try {
            String sq1 = "select sum(quantity) from clinicmanagement.inventory";
            pst = conn.prepareStatement(sq1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String sum1 = rs.getString("sum(quantity)");
                Mtotalmedicine.setText(sum1);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sq1 = "select count(studentid) from clinicmanagement.patients";
            pst = conn.prepareStatement(sq1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String count2 = rs.getString("count(studentid)");
                Mnumberofpatients.setText(count2);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            String sq1 = "select sum(quantity) from clinicmanagement.studentmedicine";
            pst = conn.prepareStatement(sq1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String sum1 = rs.getString("sum(quantity)");
                givemedicine.setText(sum1);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
                Mtime.setText(f.format(d));
            }
        }).start();
    }

    public void currentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-d");
        Date d = new Date();
        Mcalendar.setText(dateFormat.format(d));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Mtotalmedicine = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        Mnumberofpatients = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Mtime = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        givemedicine = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        button1 = new javax.swing.JPanel();
        indicator1 = new javax.swing.JPanel();
        SMlabel = new javax.swing.JLabel();
        button2 = new javax.swing.JPanel();
        indicator2 = new javax.swing.JPanel();
        PRlabel = new javax.swing.JLabel();
        button3 = new javax.swing.JPanel();
        indicator3 = new javax.swing.JPanel();
        Ilabel = new javax.swing.JLabel();
        button4 = new javax.swing.JPanel();
        indicator4 = new javax.swing.JPanel();
        MAlabel = new javax.swing.JLabel();

        Label1.setBackground(new java.awt.Color(10, 46, 54));
        Label1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("Number of Patients");
        Label1.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 46, 54));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel2.setOpaque(false);
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(10, 46, 54));
        jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Medicine");
        jLabel3.setOpaque(true);
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 166, 30));

        Mtotalmedicine.setBackground(new java.awt.Color(10, 46, 54));
        Mtotalmedicine.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Mtotalmedicine.setForeground(new java.awt.Color(255, 255, 255));
        Mtotalmedicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mtotalmedicine.setOpaque(true);
        Mtotalmedicine.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MtotalmedicineMouseDragged(evt);
            }
        });
        panel2.add(Mtotalmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 40));

        jPanel2.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 190, 120));

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setOpaque(false);
        panel1.setPreferredSize(new java.awt.Dimension(190, 120));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mnumberofpatients.setBackground(new java.awt.Color(10, 46, 54));
        Mnumberofpatients.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Mnumberofpatients.setForeground(new java.awt.Color(255, 255, 255));
        Mnumberofpatients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mnumberofpatients.setOpaque(true);
        Mnumberofpatients.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MnumberofpatientsMouseDragged(evt);
            }
        });
        panel1.add(Mnumberofpatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 40));

        jLabel5.setBackground(new java.awt.Color(10, 46, 54));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Patients");
        jLabel5.setOpaque(true);
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 166, 30));

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 300, 310));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 300, 310));

        userName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/user_icon.png"))); // NOI18N
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 230, -1));

        Mtime.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Mtime.setForeground(new java.awt.Color(255, 255, 255));
        Mtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/MenuTime.png"))); // NOI18N
        jPanel2.add(Mtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 180, 30));

        Mcalendar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Mcalendar.setForeground(new java.awt.Color(255, 255, 255));
        Mcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/Menucalendar.png"))); // NOI18N
        jPanel2.add(Mcalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 180, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 300, 310));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel3.setOpaque(false);
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(10, 46, 54));
        jLabel4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Given Medicine");
        jLabel4.setOpaque(true);
        panel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 166, 30));

        givemedicine.setBackground(new java.awt.Color(10, 46, 54));
        givemedicine.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        givemedicine.setForeground(new java.awt.Color(255, 255, 255));
        givemedicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        givemedicine.setOpaque(true);
        givemedicine.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                givemedicineMouseDragged(evt);
            }
        });
        panel3.add(givemedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 40));

        jPanel2.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 190, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 1010, 600));

        jPanel1.setBackground(new java.awt.Color(87, 191, 109));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/logo.png"))); // NOI18N
        jLabel1.setText("<html>Cavite State University - Silang Campus Clinic Management System</html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 80));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/mainLogout.png"))); // NOI18N
        jButton7.setText("LogOut");
        jButton7.setBorder(null);
        jButton7.setMargin(new java.awt.Insets(10, 14, 10, 14));
        jButton7.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        jPanel16.setBackground(new java.awt.Color(87, 191, 109));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        jPanel19.setBackground(new java.awt.Color(87, 191, 109));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jPanel22.setBackground(new java.awt.Color(87, 191, 109));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jPanel5.setBackground(new java.awt.Color(87, 191, 109));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        button1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indicator1.setBackground(new java.awt.Color(0, 153, 51));
        indicator1.setOpaque(false);

        javax.swing.GroupLayout indicator1Layout = new javax.swing.GroupLayout(indicator1);
        indicator1.setLayout(indicator1Layout);
        indicator1Layout.setHorizontalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator1Layout.setVerticalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button1.add(indicator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        SMlabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        SMlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/medecine_record.png"))); // NOI18N
        SMlabel.setText("Student Medicine");
        button1.add(SMlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 13, 192, -1));

        jPanel5.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 50));

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });
        button2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indicator2.setBackground(new java.awt.Color(0, 153, 51));
        indicator2.setOpaque(false);

        javax.swing.GroupLayout indicator2Layout = new javax.swing.GroupLayout(indicator2);
        indicator2.setLayout(indicator2Layout);
        indicator2Layout.setHorizontalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator2Layout.setVerticalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button2.add(indicator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        PRlabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        PRlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/patient_record.png"))); // NOI18N
        PRlabel.setText("Patients Record");
        button2.add(PRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 204, -1));

        jPanel5.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 50));

        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });
        button3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indicator3.setBackground(new java.awt.Color(0, 153, 51));
        indicator3.setOpaque(false);

        javax.swing.GroupLayout indicator3Layout = new javax.swing.GroupLayout(indicator3);
        indicator3.setLayout(indicator3Layout);
        indicator3Layout.setHorizontalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator3Layout.setVerticalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button3.add(indicator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        Ilabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Ilabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/inventory.png"))); // NOI18N
        Ilabel.setText("Inventory");
        button3.add(Ilabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 204, -1));

        jPanel5.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 50));

        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });
        button4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indicator4.setBackground(new java.awt.Color(0, 153, 51));
        indicator4.setOpaque(false);

        javax.swing.GroupLayout indicator4Layout = new javax.swing.GroupLayout(indicator4);
        indicator4.setLayout(indicator4Layout);
        indicator4Layout.setHorizontalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indicator4Layout.setVerticalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button4.add(indicator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 51));

        MAlabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        MAlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/profile.png"))); // NOI18N
        MAlabel.setText("Manage Admin");
        button4.add(MAlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 14, 204, -1));

        jPanel5.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnumberofpatientsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnumberofpatientsMouseDragged

    }//GEN-LAST:event_MnumberofpatientsMouseDragged

    private void MtotalmedicineMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MtotalmedicineMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_MtotalmedicineMouseDragged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            new signup().setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void givemedicineMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_givemedicineMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_givemedicineMouseDragged

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        Main m = new Main();
        m.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        Inventory i = new Inventory();
        i.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        manageAdmin c = new manageAdmin();
        c.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_button4MouseClicked

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
        onClick(button2);
        onLeaveClick(button1);
        onLeaveClick(button3);
        onLeaveClick(button4);
        PRlabel.setFont(new Font("Poppins", Font.PLAIN, 18));
        indicator1.setOpaque(false);
        indicator2.setOpaque(true);
        indicator3.setOpaque(false);
        indicator4.setOpaque(false);

    }//GEN-LAST:event_button2MouseEntered

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
        onClick(button3);
        onLeaveClick(button2);
        onLeaveClick(button1);
        onLeaveClick(button4);
        Ilabel.setFont(new Font("Poppins", Font.PLAIN, 18));
        indicator1.setOpaque(false);
        indicator2.setOpaque(false);
        indicator3.setOpaque(true);
        indicator4.setOpaque(false);

    }//GEN-LAST:event_button3MouseEntered

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
        onClick(button4);
        onLeaveClick(button2);
        onLeaveClick(button3);
        onLeaveClick(button1);
        MAlabel.setFont(new Font("Poppins", Font.PLAIN, 18));
        indicator1.setOpaque(false);
        indicator2.setOpaque(false);
        indicator3.setOpaque(false);
        indicator4.setOpaque(true);
    }//GEN-LAST:event_button4MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
        PRlabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        onLeaveClick(button2);
        indicator2.setOpaque(false);
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
        Ilabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        onLeaveClick(button3);
        indicator3.setOpaque(false);
    }//GEN-LAST:event_button3MouseExited

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
        MAlabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        onLeaveClick(button4);
        indicator4.setOpaque(false);
    }//GEN-LAST:event_button4MouseExited

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked

        StudentMedicine s = new StudentMedicine();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_button1MouseClicked

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        onClick(button1);
        onLeaveClick(button2);
        onLeaveClick(button3);
        onLeaveClick(button4);
        SMlabel.setFont(new Font("Poppins", Font.PLAIN, 18));
        indicator1.setOpaque(true);
        indicator2.setOpaque(false);
        indicator3.setOpaque(false);
        indicator4.setOpaque(false);
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        SMlabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        onLeaveClick(button1);
        indicator1.setOpaque(false);
    }//GEN-LAST:event_button1MouseExited
    private void onClick(JPanel panel) {
        panel.setBackground(new Color(153, 255, 204));
    }

    private void onLeaveClick(JPanel panel) {
        panel.setBackground(Color.white);
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ilabel;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel MAlabel;
    public static final javax.swing.JLabel Mcalendar = new javax.swing.JLabel();
    private javax.swing.JLabel Mnumberofpatients;
    private javax.swing.JLabel Mtime;
    private javax.swing.JLabel Mtotalmedicine;
    private javax.swing.JLabel PRlabel;
    private javax.swing.JLabel SMlabel;
    private javax.swing.JPanel button1;
    private javax.swing.JPanel button2;
    private javax.swing.JPanel button3;
    private javax.swing.JPanel button4;
    private javax.swing.JLabel givemedicine;
    private javax.swing.JPanel indicator1;
    private javax.swing.JPanel indicator2;
    private javax.swing.JPanel indicator3;
    private javax.swing.JPanel indicator4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    public static final javax.swing.JLabel userName = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint border
        }

    }

}
