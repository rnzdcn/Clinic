/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author jomari
 */
public class loading extends javax.swing.JFrame {

    /**
     * Creates new form loading
     */
    public loading() {
        initComponents();
        this.setLocationRelativeTo(null);
        
         getRootPane().
                setBorder(BorderFactory.createLineBorder(Color.WHITE));
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
        hg = new javax.swing.JLabel();
        Myprogress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        num = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 46, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hg.setBackground(new java.awt.Color(87, 191, 109));
        hg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinic/image/loading.png"))); // NOI18N
        jPanel1.add(hg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 90, 70));
        jPanel1.add(Myprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 400, 20));

        jLabel2.setBackground(new java.awt.Color(87, 191, 109));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLINIC MANAGEMENT SYSTEM");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 74));

        num.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        num.setForeground(new java.awt.Color(255, 255, 255));
        num.setText("jLabel3");
        jPanel1.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     loading load=new loading();
     load.setVisible(true);
     try{
         for(int i=0; i<=100; i++)        
         {
             Thread.sleep(100);
             load.Myprogress.setValue(i);
             load.num.setText(i+"%");
         }
    
    }catch (Exception e)
    {
        
    }
     new signup().setVisible(true);
     load.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Myprogress;
    private javax.swing.JLabel hg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel num;
    // End of variables declaration//GEN-END:variables
}
