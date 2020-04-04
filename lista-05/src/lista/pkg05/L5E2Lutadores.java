package lista.pkg05;

public class L5E2Lutadores extends javax.swing.JFrame {

    L5E2ClasseLutadores lutar = new L5E2ClasseLutadores();

    public L5E2Lutadores() {
        initComponents();
        
        prgVida1.setValue(100);
        prgVida2.setValue(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prgVida1 = new javax.swing.JProgressBar();
        btnApanhar1 = new javax.swing.JToggleButton();
        btnForca1 = new javax.swing.JToggleButton();
        prgVida2 = new javax.swing.JProgressBar();
        btnApanhar2 = new javax.swing.JToggleButton();
        btnForca2 = new javax.swing.JToggleButton();
        lblBarra1 = new javax.swing.JLabel();
        lblBarra2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prgVida1.setStringPainted(true);

        btnApanhar1.setText("Apanhar");
        btnApanhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApanhar1ActionPerformed(evt);
            }
        });

        btnForca1.setText("Concentrar Força");
        btnForca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForca1ActionPerformed(evt);
            }
        });

        prgVida2.setStringPainted(true);

        btnApanhar2.setText("Apanhar");
        btnApanhar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApanhar2ActionPerformed(evt);
            }
        });

        btnForca2.setText("Concentrar Força");
        btnForca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForca2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(prgVida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnApanhar1)
                                .addGap(18, 18, 18)
                                .addComponent(btnForca1))
                            .addComponent(prgVida1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnApanhar2)
                            .addGap(18, 18, 18)
                            .addComponent(btnForca2)))
                    .addComponent(lblBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(prgVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApanhar1)
                    .addComponent(btnForca1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prgVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApanhar2)
                    .addComponent(btnForca2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApanhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApanhar1ActionPerformed
        lutar.apanharLutador1();
        prgVida1.setValue(lutar.vidaLutador1);
        
        lutar.retornoLutador1();
        lblBarra1.setText(lutar.mensagem);
    }//GEN-LAST:event_btnApanhar1ActionPerformed

    private void btnForca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForca1ActionPerformed
        lutar.concentrarForca1();
        prgVida1.setValue(lutar.vidaLutador1);
    }//GEN-LAST:event_btnForca1ActionPerformed

    private void btnApanhar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApanhar2ActionPerformed
        lutar.apanharLutador2();
        prgVida2.setValue(lutar.vidaLutador2);
        
        lutar.retornoLutador2();
        lblBarra2.setText(lutar.mensagem);
    }//GEN-LAST:event_btnApanhar2ActionPerformed

    private void btnForca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForca2ActionPerformed
        lutar.concentrarForca2();
        prgVida2.setValue(lutar.vidaLutador2);
    }//GEN-LAST:event_btnForca2ActionPerformed

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
            java.util.logging.Logger.getLogger(L5E2Lutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L5E2Lutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L5E2Lutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L5E2Lutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L5E2Lutadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnApanhar1;
    private javax.swing.JToggleButton btnApanhar2;
    private javax.swing.JToggleButton btnForca1;
    private javax.swing.JToggleButton btnForca2;
    private javax.swing.JLabel lblBarra1;
    private javax.swing.JLabel lblBarra2;
    private javax.swing.JProgressBar prgVida1;
    private javax.swing.JProgressBar prgVida2;
    // End of variables declaration//GEN-END:variables
}
