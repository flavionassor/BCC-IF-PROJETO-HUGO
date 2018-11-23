/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 13161000252
 */
public class TelaPrincipal extends javax.swing.JFrame {
    Camada camada1,camada2,camada3, camada4;
    double U,erro,aux, erroAceito = 0.3;
    public Double arquivo[][];
    int epoca;
    
    public TelaPrincipal() {
        arquivo = new Double[180][180];
        initComponents();
        camada1 = new Camada(13, 3);
        camada2 = new Camada(3, 13);
        camada3 = new Camada(3, 3);
        camada4 = new Camada(1, 3);
    }
    public TelaPrincipal(Double arquivo[][]) {
        this.arquivo = arquivo;        
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] linha = new String[]{"",};
        for(int i=0;i<180;i++){
            model.addRow(linha);
        }      
        for(int i=0;i<180;i++){
            for(int j=1;j<14;j++){
                jTable1.setValueAt(this.arquivo[i][j], i, j-1);
            }
        }
        camada1 = new Camada(13, 3);
        camada2 = new Camada(3, 13);
        camada3 = new Camada(3, 3);
        camada4 = new Camada(1, 3);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Treinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Classificar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Álcool", "Ácido  málico", "Ash ", "Alcalinidade  do  ash", "Magnésio", "Fenóis  totais", "Flavonóides", "Fenóis  não  flavonóideis", "Proantocianinas", "Intensidade  da  cor", "Matiz", "nullPercentuais  de  outros  vinhos  diluídos", "Prolina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Álcool", "Ácido  málico", "Ash ", "Alcalinidade  do  ash", "Magnésio", "Fenóis  totais", "Flavonóides", "Fenóis  não  flavonóideis", "Proantocianinas", "Intensidade  da  cor", "Matiz", "nullPercentuais  de  outros  vinhos  diluídos", "Prolina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        MLP mlp = new MLP();
        int count=0;
        //while(count <9){
            camada1.Neuronios[0].valor = arquivo[0][1];
            camada1.Neuronios[1].valor = arquivo[0][2];
            camada1.Neuronios[2].valor = arquivo[0][3];
            camada1.Neuronios[3].valor = arquivo[0][4];
            camada1.Neuronios[4].valor = arquivo[0][5];
            camada1.Neuronios[5].valor = arquivo[0][6];
            camada1.Neuronios[6].valor = arquivo[0][7];
            camada1.Neuronios[7].valor = arquivo[0][8];
            camada1.Neuronios[8].valor = arquivo[0][9];
            camada1.Neuronios[9].valor = arquivo[0][10];
            camada1.Neuronios[10].valor = arquivo[0][11];
            camada1.Neuronios[11].valor = arquivo[0][12];
            camada1.Neuronios[12].valor = arquivo[0][13];

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
  //        camada3.Neuronios[0].biasAnterior = 0.3;

          mlp.atvSigmoidal(camada1, camada2);
          mlp.atvSigmoidal(camada2, camada3);
          mlp.atvSigmoidal(camada3, camada4);

          mlp.saidaGradiente(camada4);       
          mlp.ajustePeso(camada3, camada4);

          mlp.saidaGradienteOculto(camada3, camada4);
          mlp.saidaGradienteOculto(camada2, camada3);
          mlp.ajustePeso(camada2, camada3);        
          mlp.ajustePeso(camada1, camada2);    
          mlp.Ajuste(camada4);
          mlp.Ajuste(camada3);
          mlp.Ajuste(camada2);

          U = mlp.erroAdaline(camada3,camada4);
          aux = arquivo[0][0] - U;
          aux = Math.pow(aux, 2);
          erro = erro + aux;       
          System.out.println("erro: " + erro);
          epoca = 1;
          
          while(erro >= erroAceito){
              U = mlp.erroAdaline(camada3,camada4);
              aux = arquivo[0][0] - U;
              aux = Math.pow(aux, 2);
              erro = erro + aux;
              System.out.println("erro: " + erro);
              epoca++;
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
          System.out.println("epoca: " + epoca);
          //count ++;
        //}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}