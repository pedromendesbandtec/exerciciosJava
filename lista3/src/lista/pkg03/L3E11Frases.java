package lista.pkg03;

public class L3E11Frases extends javax.swing.JFrame {
    
    
    String msgPos = "Nunca é tarde demais.";
    String msgNeg = "Só dará errado se você tentar.";
    String msgVerd = "O professor Yoshi é parecido com o ex-jogador Caio Ribeiro.";

    public L3E11Frases() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMsgPos = new javax.swing.JToggleButton();
        btnMsgNeg = new javax.swing.JToggleButton();
        btnVerd = new javax.swing.JToggleButton();
        lblFrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMsgPos.setText("Mensagem Positiva");
        btnMsgPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMsgPosActionPerformed(evt);
            }
        });

        btnMsgNeg.setText("Mensagem Negativa");
        btnMsgNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMsgNegActionPerformed(evt);
            }
        });

        btnVerd.setText("Verdade");
        btnVerd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMsgPos)
                            .addComponent(btnMsgNeg)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnVerd)))
                        .addGap(0, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnMsgPos)
                .addGap(18, 18, 18)
                .addComponent(btnMsgNeg)
                .addGap(18, 18, 18)
                .addComponent(btnVerd)
                .addGap(36, 36, 36)
                .addComponent(lblFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMsgNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMsgNegActionPerformed
        lblFrase.setText(msgNeg);
    }//GEN-LAST:event_btnMsgNegActionPerformed

    private void btnVerdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdActionPerformed
        lblFrase.setText(msgVerd);
    }//GEN-LAST:event_btnVerdActionPerformed

    private void btnMsgPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMsgPosActionPerformed
        lblFrase.setText(msgPos);
    }//GEN-LAST:event_btnMsgPosActionPerformed
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
            java.util.logging.Logger.getLogger(L3E11Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L3E11Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L3E11Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L3E11Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L3E11Frases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnMsgNeg;
    private javax.swing.JToggleButton btnMsgPos;
    private javax.swing.JToggleButton btnVerd;
    private javax.swing.JLabel lblFrase;
    // End of variables declaration//GEN-END:variables
}
