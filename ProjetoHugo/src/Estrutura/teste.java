package Estrutura;

public class teste extends javax.swing.JFrame {
    Camada camada1,camada2,camada3;

    public teste() {
        initComponents();
        camada1 = new Camada(2, 2);
        camada2 = new Camada(2, 2);
        camada3 = new Camada(1, 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Função Sigmoidal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gradiente Saida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ajusta Peso");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calculo Gradiente Oculto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MLP mlp = new MLP();
        camada1.Neuronios[0].valor = 1;
        camada1.Neuronios[1].valor = 1;
        camada2.Neuronios[0].pesos[0] = 0.5;
        camada2.Neuronios[0].pesos[1] = 0.4;
        camada2.Neuronios[1].pesos[0] = 0.9;
        camada2.Neuronios[1].pesos[1] = 1;
        camada2.Neuronios[0].pesoAnterior[0] = 0.5;
        camada2.Neuronios[0].pesoAnterior[1] = 0.4;
        camada2.Neuronios[1].pesoAnterior[0] = 0.9;
        camada2.Neuronios[1].pesoAnterior[1] = 1;
        camada2.Neuronios[0].pesoBias = 0.8;
        camada2.Neuronios[1].pesoBias = -0.1;
        camada2.Neuronios[0].biasAnterior = 0.8;
        camada2.Neuronios[1].biasAnterior = -0.1;
        camada3.Neuronios[0].pesos[0] = -1.2;
        camada3.Neuronios[0].pesos[1] = 1.1;
        camada3.Neuronios[0].pesoAnterior[0] = -1.2;
        camada3.Neuronios[0].pesoAnterior[1] = 1.1;
        camada3.Neuronios[0].pesoBias = 0.3;
        camada3.Neuronios[0].biasAnterior = 0.3;
        
        mlp.atvSigmoidal(camada1, camada2);
        mlp.atvSigmoidal(camada2, camada3);
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MLP mlp = new MLP();
        mlp.saidaGradiente(camada3);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MLP mlp = new MLP();
        mlp.ajustePeso(camada2, camada3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MLP mlp = new MLP();
        mlp.saidaGradienteOculto(camada2, camada3);
        mlp.ajustePeso(camada1, camada2);       
        mlp.Ajuste(camada3);
        mlp.Ajuste(camada2);
        
        System.out.println("5 bias: " + camada3.Neuronios[0].pesoBias);
        System.out.println("3 bias: " + camada2.Neuronios[0].pesoBias);
        System.out.println("4 bias: " + camada2.Neuronios[1].pesoBias);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
