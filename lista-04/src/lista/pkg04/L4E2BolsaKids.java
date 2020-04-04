package lista.pkg04;

public class L4E2BolsaKids extends javax.swing.JFrame {

    public L4E2BolsaKids() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFilhos3 = new javax.swing.JLabel();
        lblFilhos1 = new javax.swing.JLabel();
        lblFilhos2 = new javax.swing.JLabel();
        txtFilhos1 = new javax.swing.JTextField();
        txtFilhos2 = new javax.swing.JTextField();
        txtFilhos3 = new javax.swing.JTextField();
        btnCalculo = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFilhos3.setText("Filhos de 8 a 15 anos: ");

        lblFilhos1.setText("Filhos de 0 a 2 anos: ");

        lblFilhos2.setText("Filhos de 3 a 7 anos: ");

        txtFilhos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilhos1ActionPerformed(evt);
            }
        });

        txtFilhos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilhos2ActionPerformed(evt);
            }
        });

        txtFilhos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilhos3ActionPerformed(evt);
            }
        });

        btnCalculo.setText("Calcula Bolsa");
        btnCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFilhos2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFilhos2)
                            .addComponent(lblFilhos3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFilhos1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFilhos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtFilhos3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblFilhos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFilhos1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFilhos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilhos2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculo))
                .addGap(10, 10, 10)
                .addComponent(lblFilhos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFilhos3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilhos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilhos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilhos1ActionPerformed

    private void txtFilhos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilhos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilhos2ActionPerformed

    private void txtFilhos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilhos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilhos3ActionPerformed

    private void btnCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoActionPerformed
        Double filhoUm = Double.valueOf(txtFilhos1.getText());
        Double filhoDois = Double.valueOf(txtFilhos2.getText());
        Double filhoTres = Double.valueOf(txtFilhos3.getText());
        
        Double filhoUmTot = 15.50 * filhoUm;
        Double filhoDoisTot = 10.50 * filhoDois;
        Double filhoTresTot = 5.50 * filhoTres;
        
        Double total = filhoUmTot + filhoDoisTot + filhoTresTot;
        
        lblResultado.setText (String.format("Sua bolsa kids será de R$%.2f", total));
        
    }//GEN-LAST:event_btnCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(L4E2BolsaKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L4E2BolsaKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L4E2BolsaKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L4E2BolsaKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L4E2BolsaKids().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculo;
    private javax.swing.JLabel lblFilhos1;
    private javax.swing.JLabel lblFilhos2;
    private javax.swing.JLabel lblFilhos3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtFilhos1;
    private javax.swing.JTextField txtFilhos2;
    private javax.swing.JTextField txtFilhos3;
    // End of variables declaration//GEN-END:variables
}
