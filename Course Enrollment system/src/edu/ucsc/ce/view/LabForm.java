/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Jinadi
 */
public class LabForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomeForm
     */
    public LabForm() {
        initComponents();
        enchan();
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
        pnlDash = new javax.swing.JPanel();
        lblrepo = new javax.swing.JLabel();
        lblDash = new javax.swing.JLabel();
        lblStude = new javax.swing.JLabel();
        lblLec = new javax.swing.JLabel();
        lblins = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        lblSett = new javax.swing.JLabel();
        lblExam = new javax.swing.JLabel();
        lblsub = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlMain = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDash.setBackground(new java.awt.Color(0, 0, 0));
        pnlDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblrepo.setBackground(new java.awt.Color(102, 102, 102));
        lblrepo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblrepo.setForeground(new java.awt.Color(255, 255, 255));
        lblrepo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e653(1)_48.png"))); // NOI18N
        lblrepo.setText("   Report");
        lblrepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblrepoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblrepoMouseExited(evt);
            }
        });
        pnlDash.add(lblrepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 50));

        lblDash.setBackground(new java.awt.Color(204, 0, 204));
        lblDash.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblDash.setForeground(new java.awt.Color(255, 255, 255));
        lblDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/FontAwesome_f009(14)_48.png"))); // NOI18N
        lblDash.setText("    DashBoard");
        lblDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDashMouseExited(evt);
            }
        });
        pnlDash.add(lblDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 50));

        lblStude.setBackground(new java.awt.Color(102, 102, 102));
        lblStude.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblStude.setForeground(new java.awt.Color(255, 255, 255));
        lblStude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/FontAwesome_f0c0(12)_48.png"))); // NOI18N
        lblStude.setText("    Student");
        lblStude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStudeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStudeMouseExited(evt);
            }
        });
        pnlDash.add(lblStude, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        lblLec.setBackground(new java.awt.Color(102, 102, 102));
        lblLec.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblLec.setForeground(new java.awt.Color(255, 255, 255));
        lblLec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e657(3)_48.png"))); // NOI18N
        lblLec.setText("    Lecturer");
        lblLec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLecMouseExited(evt);
            }
        });
        pnlDash.add(lblLec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 50));

        lblins.setBackground(new java.awt.Color(102, 102, 102));
        lblins.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblins.setForeground(new java.awt.Color(255, 255, 255));
        lblins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/octicons_f037(4)_48.png"))); // NOI18N
        lblins.setText("   Instructor");
        lblins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblinsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblinsMouseExited(evt);
            }
        });
        pnlDash.add(lblins, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 50));

        lblPayment.setBackground(new java.awt.Color(102, 102, 102));
        lblPayment.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblPayment.setForeground(new java.awt.Color(255, 255, 255));
        lblPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e651(0)_48.png"))); // NOI18N
        lblPayment.setText("   Payment");
        lblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPaymentMouseExited(evt);
            }
        });
        pnlDash.add(lblPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 50));

        lblSett.setBackground(new java.awt.Color(102, 102, 102));
        lblSett.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblSett.setForeground(new java.awt.Color(255, 255, 255));
        lblSett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e8fa(5)_48.png"))); // NOI18N
        lblSett.setText("   Settings");
        lblSett.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSettMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSettMouseExited(evt);
            }
        });
        pnlDash.add(lblSett, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 200, 50));

        lblExam.setBackground(new java.awt.Color(102, 102, 102));
        lblExam.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblExam.setForeground(new java.awt.Color(255, 255, 255));
        lblExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e651(0)_48.png"))); // NOI18N
        lblExam.setText("   Exam");
        lblExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExamMouseExited(evt);
            }
        });
        pnlDash.add(lblExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 50));

        lblsub.setBackground(new java.awt.Color(102, 102, 102));
        lblsub.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblsub.setForeground(new java.awt.Color(255, 255, 255));
        lblsub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e89c(7)_48.png"))); // NOI18N
        lblsub.setText("   Subject");
        lblsub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblsubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblsubMouseExited(evt);
            }
        });
        pnlDash.add(lblsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 50));

        jLabel1.setText("profile");
        pnlDash.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 90));

        jPanel1.add(pnlDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 710));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e7f0(10)_48.png"))); // NOI18N
        jLabel3.setText("Lab Managing");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 280, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 72, 710, 10));

        pnlMain.setOpaque(false);
        jPanel1.add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 740, 420));

        jLabel17.setBackground(new java.awt.Color(153, 153, 153));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("           Update");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 150, 30));

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("            Add");
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 150, 30));

        jLabel19.setBackground(new java.awt.Color(153, 153, 153));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("    delete");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/background-xx.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashMouseEntered
        lblDash.setFont(new Font("Segoe UI", Font.BOLD, 20));

    }//GEN-LAST:event_lblDashMouseEntered

    private void lblDashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashMouseExited
        lblDash.setFont(new Font("Segoe UI Light", Font.BOLD, 18));

    }//GEN-LAST:event_lblDashMouseExited

    private void lblStudeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudeMouseEntered
        lblStude.setFont(new Font("Segoe UI", Font.BOLD, 20));

    }//GEN-LAST:event_lblStudeMouseEntered

    private void lblLecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLecMouseEntered
        lblLec.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblLecMouseEntered

    private void lblinsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinsMouseEntered
        lblins.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblinsMouseEntered

    private void lblPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseEntered
        lblPayment.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblPaymentMouseEntered

    private void lblsubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsubMouseEntered
        lblsub.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblsubMouseEntered

    private void lblrepoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblrepoMouseEntered
        lblrepo.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblrepoMouseEntered

    private void lblExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExamMouseEntered
        lblExam.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblExamMouseEntered

    private void lblSettMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettMouseEntered
        lblSett.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblSettMouseEntered

    private void lblStudeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudeMouseExited
        lblStude.setFont(new Font("Segoe UI Light", Font.BOLD, 18));    // TODO add your handling code here:
    }//GEN-LAST:event_lblStudeMouseExited

    private void lblLecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLecMouseExited
    lblLec.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblLecMouseExited

    private void lblinsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinsMouseExited
    lblins.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblinsMouseExited

    private void lblPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseExited
    lblPayment.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblPaymentMouseExited

    private void lblsubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsubMouseExited
    lblsub.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblsubMouseExited

    private void lblrepoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblrepoMouseExited
    lblrepo.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblrepoMouseExited

    private void lblExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExamMouseExited
           lblExam.setFont(new Font("Segoe UI Light", Font.BOLD, 18)); // TODO add your handling code here:
    }//GEN-LAST:event_lblExamMouseExited

    private void lblSettMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettMouseExited
    lblSett.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblSettMouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        jLabel20.setBackground(Color.BLACK);
        jLabel20.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        jLabel20.setBackground(Color.GRAY);
        jLabel20.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jLabel17.setBackground(Color.BLACK);
        jLabel17.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jLabel17.setBackground(Color.GRAY);
        jLabel17.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jLabel19.setBackground(Color.BLACK);
        jLabel19.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        jLabel19.setBackground(Color.GRAY);
        jLabel19.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
         pnlMain.removeAll();
        AddLabPanel form = new  AddLabPanel();
        form.setSize(pnlMain.getSize());
        pnlMain.add(form);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       pnlMain.removeAll();
        LabUpdateForm form = new  LabUpdateForm();
        form.setSize(pnlMain.getSize());
        pnlMain.add(form);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblExam;
    private javax.swing.JLabel lblLec;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblSett;
    private javax.swing.JLabel lblStude;
    private javax.swing.JLabel lblins;
    private javax.swing.JLabel lblrepo;
    private javax.swing.JLabel lblsub;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

    private void enchan() {

    }
}
