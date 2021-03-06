/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

import edu.ucsc.ce.controllers.Facultycontroller;
import edu.ucsc.ce.controllers.LecturerController;
import edu.ucsc.ce.models.FacultyDTO;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jinadi
 */
public class FacultyForm extends javax.swing.JPanel {

    /**
     * Creates new form CourseSettingForm
     */
    public FacultyForm() {
        initComponents();
        facID();
        setDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCalendarCombo1 = new org.freixas.jcalendar.JCalendarCombo();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel13.setText("ID");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 160, 70));

        txtID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 300, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 70));

        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 310, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel12.setText("Date");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 80));

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
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 150, 30));

        jLabel21.setBackground(new java.awt.Color(153, 153, 153));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("           Cancel");
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 150, 30));
        add(jCalendarCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 310, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        jLabel20.setBackground(Color.BLACK);
        jLabel20.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        jLabel20.setBackground(Color.GRAY);
        jLabel20.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jLabel20.setBackground(Color.BLACK);
        jLabel20.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        jLabel20.setBackground(Color.GRAY);
        jLabel20.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        AddFaculty();
    }//GEN-LAST:event_jLabel20MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void facID() {
        try {
            String lecID = Facultycontroller.getLastLabID();
            if (lecID == null) {
                txtID.setText("Fac001");
            } else {
                String id = lecID.substring(lecID.length() - 1, lecID.length());
                txtID.setText(lecID.substring(0, lecID.length() - 1) + (Integer.parseInt(id) + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddLecturerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddLecturerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AddFaculty() {
        try {
           
            FacultyDTO facultyDTO = new FacultyDTO(txtID.getText(), txtName.getText(), (String)jCalendarCombo1.getSelectedItem());
            boolean add = Facultycontroller.addFaculty(facultyDTO);
             if (add) {
                JOptionPane.showMessageDialog(null, "Faculty Added sucessfully");
            } else {
                JOptionPane.showMessageDialog(null, "OOPz!Try Again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacultyForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacultyForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setDate() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        jCalendarCombo1.setDateFormat(format);
    }
}
