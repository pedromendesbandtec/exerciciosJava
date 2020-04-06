package L6E3Eleicao;

public class TelaEleicao extends javax.swing.JFrame {

    UrnaEletronica urna1 = new UrnaEletronica();
    UrnaEletronica urna2 = new UrnaEletronica();

    public TelaEleicao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCandidato1 = new javax.swing.JButton();
        btnCandidato2 = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        lblVotosCandidato1 = new javax.swing.JLabel();
        lblVotosCandidato2 = new javax.swing.JLabel();
        lblVotosRealizados = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCandidato1.setText("Candidato 1");
        btnCandidato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidato1ActionPerformed(evt);
            }
        });

        btnCandidato2.setText("Candidato 2");
        btnCandidato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidato2ActionPerformed(evt);
            }
        });

        btnEncerrar.setText("Encerrar eleição");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        lblVotosCandidato1.setText("Total de votos para o primeiro candidato: ");

        lblVotosCandidato2.setText("Total de votos para o segundo candidato: ");

        lblVotosRealizados.setText("Total de votos realizados: ");

        lblResultado.setText("Resultado final:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(btnEncerrar)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCandidato1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCandidato2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVotosCandidato1)
                            .addComponent(lblVotosCandidato2)
                            .addComponent(lblVotosRealizados)
                            .addComponent(lblResultado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCandidato1)
                    .addComponent(btnCandidato2))
                .addGap(18, 18, 18)
                .addComponent(btnEncerrar)
                .addGap(18, 18, 18)
                .addComponent(lblVotosCandidato1)
                .addGap(18, 18, 18)
                .addComponent(lblVotosCandidato2)
                .addGap(18, 18, 18)
                .addComponent(lblVotosRealizados)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCandidato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidato1ActionPerformed
        urna1.setVotar();

        lblVotosCandidato1.setText("Total de votos para o primeiro candidato: " + urna1.getVotos());
        lblVotosRealizados.setText("Total de votos realizados: "+(urna1.getVotos()+urna2.getVotos()));
    }//GEN-LAST:event_btnCandidato1ActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        
        if (urna1.getVotos() > urna2.getVotos()) {
            lblResultado.setText("Resultado final: Candidato 1 venceu");
        } else if (urna2.getVotos() > urna1.getVotos() ) {
            lblResultado.setText("Resultado final: Candidato 2 venceu");
        } else {
            lblResultado.setText("Resultado final: Votação empatada");            
        }
        
        btnCandidato1.setVisible(false);
        btnCandidato2.setVisible(false);
        btnEncerrar.setVisible(false);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnCandidato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidato2ActionPerformed
        urna2.setVotar();

        lblVotosCandidato2.setText("Total de votos para o segundo candidato: " + urna2.getVotos());
        lblVotosRealizados.setText("Total de votos realizados: "+(urna2.getVotos()+urna1.getVotos()));
    }//GEN-LAST:event_btnCandidato2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEleicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEleicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEleicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEleicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEleicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCandidato1;
    private javax.swing.JButton btnCandidato2;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblVotosCandidato1;
    private javax.swing.JLabel lblVotosCandidato2;
    private javax.swing.JLabel lblVotosRealizados;
    // End of variables declaration//GEN-END:variables
}
