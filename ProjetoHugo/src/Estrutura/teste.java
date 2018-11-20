package Estrutura;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class teste extends javax.swing.JFrame {
    Camada camada1,camada2,camada3, camada4;
    public Double arquivo[][];
    
            
    public teste() {
        arquivo = new Double[180][180];
        initComponents();
        camada1 = new Camada(13, 3);
        camada2 = new Camada(3, 13);
        camada3 = new Camada(3, 3);
        camada4 = new Camada(1, 3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("TREINO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("diretorio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("abrir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("classificar");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton4)))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MLP mlp = new MLP();
        
          camada1.Neuronios[0].valor = arquivo[0][0];
          camada1.Neuronios[1].valor = arquivo[0][1];
          camada1.Neuronios[2].valor = arquivo[0][2];
          camada1.Neuronios[3].valor = arquivo[0][3];
          camada1.Neuronios[4].valor = arquivo[0][4];
          camada1.Neuronios[5].valor = arquivo[0][5];
          camada1.Neuronios[6].valor = arquivo[0][6];
          camada1.Neuronios[7].valor = arquivo[0][7];
          camada1.Neuronios[8].valor = arquivo[0][8];
          camada1.Neuronios[9].valor = arquivo[0][9];
          camada1.Neuronios[10].valor = arquivo[0][10];
          camada1.Neuronios[11].valor = arquivo[0][11];
          camada1.Neuronios[12].valor = arquivo[0][12];
          
//        camada1.Neuronios[0].valor = 1;
//        camada1.Neuronios[1].valor = 1;
//        camada2.Neuronios[0].pesos[0] = 0.5;
//        camada2.Neuronios[0].pesos[1] = 0.4;
//        camada2.Neuronios[1].pesos[0] = 0.9;
//        camada2.Neuronios[1].pesos[1] = 1;
//        camada2.Neuronios[0].pesoAnterior[0] = 0.5;
//        camada2.Neuronios[0].pesoAnterior[1] = 0.4;
//        camada2.Neuronios[1].pesoAnterior[0] = 0.9;
//        camada2.Neuronios[1].pesoAnterior[1] = 1;
//        camada2.Neuronios[0].pesoBias = 0.8;
//        camada2.Neuronios[1].pesoBias = -0.1;
//        camada2.Neuronios[0].biasAnterior = 0.8;
//        camada2.Neuronios[1].biasAnterior = -0.1;
//        camada3.Neuronios[0].pesos[0] = -1.2;
//        camada3.Neuronios[0].pesos[1] = 1.1;
//        camada3.Neuronios[0].pesoAnterior[0] = -1.2;
//        camada3.Neuronios[0].pesoAnterior[1] = 1.1;
//        camada3.Neuronios[0].pesoBias = 0.3;
//        camada3.Neuronios[0].biasAnterior = 0.3;;;
        
        
        mlp.atvSigmoidal(camada1, camada2);
        mlp.atvSigmoidal(camada2, camada3);
        mlp.atvSigmoidal(camada3, camada4);
        
        mlp.saidaGradiente(camada4);       
        mlp.ajustePeso(camada3, camada4);

        mlp.saidaGradienteOculto(camada3, camada4);
        mlp.ajustePeso(camada2, camada3);        
        mlp.ajustePeso(camada1, camada2);    
        mlp.Ajuste(camada4);
        mlp.Ajuste(camada3);
        mlp.Ajuste(camada2);
        while((camada4.Neuronios[0].valor > 0.15) || (camada4.Neuronios[0].valor < -0.15)){
            mlp.atvSigmoidal(camada1, camada2);
            mlp.atvSigmoidal(camada2, camada3);
            mlp.atvSigmoidal(camada3, camada4);

            mlp.saidaGradiente(camada4);       
            mlp.ajustePeso(camada3, camada4);

            mlp.saidaGradienteOculto(camada3, camada4);
            mlp.ajustePeso(camada2, camada3);        
            mlp.ajustePeso(camada1, camada2);    
            mlp.Ajuste(camada4);
            mlp.Ajuste(camada3);
            mlp.Ajuste(camada2);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser file = new JFileChooser();
          file.setFileSelectionMode(JFileChooser.FILES_ONLY);
          int i= file.showSaveDialog(null);
        if (i==1){
            jTextField1.setText("");
        } else {
           jTextField1.setText(file.getSelectedFile().getPath());
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nome = jTextField1.getText();
        String aux[];
        int l=0;
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            //primeira abertura do arquivo -- Serve para ver tamanho da matriz e economizar espaço na memoria!
            String linha = lerArq.readLine(); // lê a primeira linha
        while (linha != null) { 
            aux = linha.split(" ");
            for(int i=0; i<14; i++){
                arquivo[l][i] = Double.parseDouble(aux[i]);
            }
            linha = lerArq.readLine(); // lê da segunda até a última linha
            l++;
        }         
            
        arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MLP mlp = new MLP();
        int epoca=1; 
        while((camada4.Neuronios[0].valor > 0.15) || (camada4.Neuronios[0].valor < -0.15)){
            mlp.atvSigmoidal(camada1, camada2);
            mlp.atvSigmoidal(camada2, camada3);
            mlp.atvSigmoidal(camada3, camada4);

            mlp.saidaGradiente(camada4);       
            mlp.ajustePeso(camada3, camada4);

            mlp.saidaGradienteOculto(camada3, camada4);
            mlp.ajustePeso(camada2, camada3);        
            mlp.ajustePeso(camada1, camada2);    
            mlp.Ajuste(camada4);
            mlp.Ajuste(camada3);
            mlp.Ajuste(camada2);
            epoca++;
            System.out.println("epoca: " + epoca);
            System.out.println("valor: " + camada4.Neuronios[0].valor);
            
        }
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
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
