package L6E1Clube;

public class TelaClube extends javax.swing.JFrame {

    Clube pontuacao1 = new Clube();
    Clube pontuacao2 = new Clube();

    public TelaClube() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVitoria1 = new javax.swing.JToggleButton();
        btnEmpate1 = new javax.swing.JToggleButton();
        btnDerrota1 = new javax.swing.JToggleButton();
        lblVitoria1 = new javax.swing.JLabel();
        lblEmpate1 = new javax.swing.JLabel();
        lblDerrota1 = new javax.swing.JLabel();
        lblPontuacao1 = new javax.swing.JLabel();
        lblVitoria2 = new javax.swing.JLabel();
        lblEmpate2 = new javax.swing.JLabel();
        lblDerrota2 = new javax.swing.JLabel();
        lblPontuacao2 = new javax.swing.JLabel();
        btnVitoria2 = new javax.swing.JToggleButton();
        btnEmpate2 = new javax.swing.JToggleButton();
        btnDerrota2 = new javax.swing.JToggleButton();
        lblTime2 = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVitoria1.setText("Registrar Vitória");
        btnVitoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitoria1ActionPerformed(evt);
            }
        });

        btnEmpate1.setText("Registrar Empate");
        btnEmpate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpate1ActionPerformed(evt);
            }
        });

        btnDerrota1.setText("Registrar Derrota");
        btnDerrota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerrota1ActionPerformed(evt);
            }
        });

        lblVitoria1.setText("Vitórias: ");

        lblEmpate1.setText("Empates:");

        lblDerrota1.setText("Derrotas:");

        lblPontuacao1.setText("Pontuação: ");

        lblVitoria2.setText("Vitórias: ");

        lblEmpate2.setText("Empates:");

        lblDerrota2.setText("Derrotas:");

        lblPontuacao2.setText("Pontuação: ");

        btnVitoria2.setText("Registrar Vitória");
        btnVitoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitoria2ActionPerformed(evt);
            }
        });

        btnEmpate2.setText("Registrar Empate");
        btnEmpate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpate2ActionPerformed(evt);
            }
        });

        btnDerrota2.setText("Registrar Derrota");
        btnDerrota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerrota2ActionPerformed(evt);
            }
        });

        lblTime2.setText("Liverpool Football Club");

        lblTime1.setText("São Paulo Futebol Clube");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblVitoria1)
                .addGap(87, 87, 87)
                .addComponent(lblEmpate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDerrota1)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblPontuacao2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVitoria2)
                                .addGap(18, 18, 18)
                                .addComponent(btnEmpate2)
                                .addGap(18, 18, 18)
                                .addComponent(btnDerrota2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblVitoria2)
                                .addGap(87, 87, 87)
                                .addComponent(lblEmpate2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDerrota2)
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTime2)
                                    .addComponent(lblTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnVitoria1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lblPontuacao1)))
                        .addGap(18, 18, 18)
                        .addComponent(btnEmpate1)
                        .addGap(18, 18, 18)
                        .addComponent(btnDerrota1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVitoria1)
                    .addComponent(btnEmpate1)
                    .addComponent(btnDerrota1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVitoria1)
                    .addComponent(lblEmpate1)
                    .addComponent(lblDerrota1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPontuacao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVitoria2)
                    .addComponent(btnEmpate2)
                    .addComponent(btnDerrota2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVitoria2)
                    .addComponent(lblEmpate2)
                    .addComponent(lblDerrota2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPontuacao2)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVitoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitoria1ActionPerformed
        pontuacao1.vitorias();
        lblVitoria1.setText("Vitórias: " + pontuacao1.getVitoria().toString());
        lblPontuacao1.setText("Pontuação: "+ pontuacao1.getPonto().toString());
    }//GEN-LAST:event_btnVitoria1ActionPerformed

    private void btnEmpate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpate1ActionPerformed
        pontuacao1.empates();
        lblEmpate1.setText("Empates: " + pontuacao1.getEmpate().toString());
        lblPontuacao1.setText("Pontuação: "+ pontuacao1.getPonto().toString());
    }//GEN-LAST:event_btnEmpate1ActionPerformed

    private void btnDerrota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerrota1ActionPerformed
        pontuacao1.derrotas();
        lblDerrota1.setText("Derrotas: " + pontuacao1.getDerrota().toString());
        lblPontuacao1.setText("Pontuação: "+ pontuacao1.getPonto().toString());
    }//GEN-LAST:event_btnDerrota1ActionPerformed

    private void btnVitoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitoria2ActionPerformed
        pontuacao2.vitorias();
        lblVitoria2.setText("Vitórias: " + pontuacao2.getVitoria().toString());
        lblPontuacao2.setText("Pontuação: "+ pontuacao2.getPonto().toString());
    }//GEN-LAST:event_btnVitoria2ActionPerformed

    private void btnEmpate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpate2ActionPerformed
        pontuacao2.empates();
        lblEmpate2.setText("Empates: " + pontuacao2.getEmpate().toString());
        lblPontuacao2.setText("Pontuação: "+ pontuacao2.getPonto().toString());
    }//GEN-LAST:event_btnEmpate2ActionPerformed

    private void btnDerrota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerrota2ActionPerformed
        pontuacao2.derrotas();
        lblDerrota2.setText("Derrotas: " + pontuacao2.getDerrota().toString());
        lblPontuacao2.setText("Pontuação: "+ pontuacao2.getPonto().toString());
    }//GEN-LAST:event_btnDerrota2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClube.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClube.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClube.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClube.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClube().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDerrota1;
    private javax.swing.JToggleButton btnDerrota2;
    private javax.swing.JToggleButton btnEmpate1;
    private javax.swing.JToggleButton btnEmpate2;
    private javax.swing.JToggleButton btnVitoria1;
    private javax.swing.JToggleButton btnVitoria2;
    private javax.swing.JLabel lblDerrota1;
    private javax.swing.JLabel lblDerrota2;
    private javax.swing.JLabel lblEmpate1;
    private javax.swing.JLabel lblEmpate2;
    private javax.swing.JLabel lblPontuacao1;
    private javax.swing.JLabel lblPontuacao2;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblTime2;
    private javax.swing.JLabel lblVitoria1;
    private javax.swing.JLabel lblVitoria2;
    // End of variables declaration//GEN-END:variables
}
