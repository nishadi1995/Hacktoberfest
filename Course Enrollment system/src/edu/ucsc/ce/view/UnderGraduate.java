/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

/**
 *
 * @author Jinadi
 */
public class UnderGraduate extends javax.swing.JPanel {

    /**
     * Creates new form UnderGraduate
     */
    public UnderGraduate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUnder = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbYearOf = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        txtZ = new javax.swing.JTextField();
        txtrank = new javax.swing.JTextField();

        pnlUnder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlUnder.setOpaque(false);
        pnlUnder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel11.setText("AL Result");
        pnlUnder.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setText("Year of Exam");
        pnlUnder.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel12.setText("Z-score");
        pnlUnder.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 170, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setText("Rank");
        pnlUnder.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 150, 50));

        cmbYearOf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlUnder.add(cmbYearOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 230, 40));

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        pnlUnder.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 260, 110));

        txtZ.setText("jTextField1");
        pnlUnder.add(txtZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 140, 40));

        txtrank.setText("jTextField1");
        pnlUnder.add(txtrank, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(pnlUnder, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUnder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbYearOf;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlUnder;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtZ;
    private javax.swing.JTextField txtrank;
    // End of variables declaration//GEN-END:variables
}
