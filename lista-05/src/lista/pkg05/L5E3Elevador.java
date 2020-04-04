package lista.pkg05;

public class L5E3Elevador extends javax.swing.JFrame {

    L5E3ClasseElevador elevador1 = new L5E3ClasseElevador();
    L5E3ClasseElevador elevador2 = new L5E3ClasseElevador();

    public L5E3Elevador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHomem = new javax.swing.JButton();
        btnMulher = new javax.swing.JButton();
        btnCrianca = new javax.swing.JButton();
        lblPassageiros = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        btnHomem1 = new javax.swing.JButton();
        btnMulher1 = new javax.swing.JButton();
        btnCrianca1 = new javax.swing.JButton();
        lblPassageiros1 = new javax.swing.JLabel();
        lblPeso1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHomem.setText("Entrar Homem");
        btnHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomemActionPerformed(evt);
            }
        });

        btnMulher.setText("Entrar Mulher");
        btnMulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulherActionPerformed(evt);
            }
        });

        btnCrianca.setText("Entrar Criança");
        btnCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriancaActionPerformed(evt);
            }
        });

        lblPassageiros.setText("Total de Passageiros no Elevador: ");

        lblPeso.setText("Peso Total no Elevador: ");

        btnHomem1.setText("Entrar Homem");
        btnHomem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomem1ActionPerformed(evt);
            }
        });

        btnMulher1.setText("Entrar Mulher");
        btnMulher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulher1ActionPerformed(evt);
            }
        });

        btnCrianca1.setText("Entrar Criança");
        btnCrianca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrianca1ActionPerformed(evt);
            }
        });

        lblPassageiros1.setText("Total de Passageiros no Elevador: ");

        lblPeso1.setText("Peso Total no Elevador: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHomem)
                        .addGap(18, 18, 18)
                        .addComponent(btnMulher)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrianca))
                    .addComponent(lblPassageiros1)
                    .addComponent(lblPeso1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHomem1)
                        .addGap(18, 18, 18)
                        .addComponent(btnMulher1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrianca1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblPassageiros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHomem)
                    .addComponent(btnMulher)
                    .addComponent(btnCrianca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHomem1)
                    .addComponent(btnMulher1)
                    .addComponent(btnCrianca1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassageiros1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeso1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulherActionPerformed
        elevador1.entrarMulher();
        lblPassageiros.setText("Total de passageiros no Elevador: " + elevador1.totalPessoasElevador);
        lblPeso.setText("Peso Total no Elevador: " + elevador1.totalPesoElevador);
    }//GEN-LAST:event_btnMulherActionPerformed

    private void btnCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriancaActionPerformed
        elevador1.entrarCrianca();
        lblPassageiros.setText("Total de passageiros no Elevador: " + elevador1.totalPessoasElevador);
        lblPeso.setText("Peso Total no Elevador: " + elevador1.totalPesoElevador);
    }//GEN-LAST:event_btnCriancaActionPerformed

    private void btnMulher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulher1ActionPerformed
        elevador2.entrarMulher();
        lblPassageiros1.setText("Total de passageiros no Elevador: " + elevador2.totalPessoasElevador);
        lblPeso1.setText("Peso Total no Elevador: " + elevador2.totalPesoElevador);
    }//GEN-LAST:event_btnMulher1ActionPerformed

    private void btnCrianca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrianca1ActionPerformed
        elevador2.entrarCrianca();
        lblPassageiros1.setText("Total de passageiros no Elevador: " + elevador2.totalPessoasElevador);
        lblPeso1.setText("Peso Total no Elevador: " + elevador2.totalPesoElevador);
    }//GEN-LAST:event_btnCrianca1ActionPerformed

    private void btnHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomemActionPerformed
        elevador1.entrarHomem();
        lblPassageiros.setText("Total de passageiros no Elevador: " + elevador1.totalPessoasElevador);
        lblPeso.setText("Peso Total no Elevador: " + elevador1.totalPesoElevador);
    }//GEN-LAST:event_btnHomemActionPerformed

    private void btnHomem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomem1ActionPerformed
        elevador2.entrarHomem();
        lblPassageiros1.setText("Total de passageiros no Elevador: " + elevador2.totalPessoasElevador);
        lblPeso1.setText("Peso Total no Elevador: " + elevador2.totalPesoElevador);
    }//GEN-LAST:event_btnHomem1ActionPerformed

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
            java.util.logging.Logger.getLogger(L5E3Elevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L5E3Elevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L5E3Elevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L5E3Elevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L5E3Elevador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrianca;
    private javax.swing.JButton btnCrianca1;
    private javax.swing.JButton btnHomem;
    private javax.swing.JButton btnHomem1;
    private javax.swing.JButton btnMulher;
    private javax.swing.JButton btnMulher1;
    private javax.swing.JLabel lblPassageiros;
    private javax.swing.JLabel lblPassageiros1;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    // End of variables declaration//GEN-END:variables
}
