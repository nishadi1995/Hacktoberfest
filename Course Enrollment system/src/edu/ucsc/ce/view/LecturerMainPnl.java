/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

import java.awt.Color;

/**
 *
 * @author Jinadi
 */
public class LecturerMainPnl extends javax.swing.JPanel {

    /**
     * Creates new form StudentMainPnl
     */
    public LecturerMainPnl() {
        initComponents();
           setBackground(new Color(0, 0, 0, 102));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Entypo_e722(2)_128.png"))); // NOI18N
        jLabel1.setText("Student details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 340, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Entypo_e700(3)_128.png"))); // NOI18N
        jLabel2.setText("Add Student");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 340, 88));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Entypo_e729(1)_128.png"))); // NOI18N
        jLabel3.setText("Remove Student");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 340, 94));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Entypo_d83d(0)_128.png"))); // NOI18N
        jLabel4.setText("Update Student");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 340, 100));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
