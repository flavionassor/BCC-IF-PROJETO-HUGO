package Estrutura;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {
    Camada camada1,camada2,camada3, camada4;
    double U,erro,aux, erroAceito = 0.3;
    public Double arquivo[][], acerto;
    ArrayList vetorT;// Vetor de itens Utilizados para treinamento!
    int epoca, epocaT;
    
    public TelaPrincipal() {//construtor padrão!
        arquivo = new Double[180][180];
        initComponents();
        camada1 = new Camada(13, 2);
        camada2 = new Camada(2, 13);
        camada3 = new Camada(2, 2);
        camada4 = new Camada(1, 2);
    }
    public TelaPrincipal(Double arquivo[][]) {//Construtor para inicialização dos dados no arquivo!
        Random r = new Random();
        double valorDinamico = -1 + (1 - -1) * r.nextDouble();
        acerto = (double) 0;
        epocaT =0;//Epoca Treinamento
        vetorT = new ArrayList();//Vetor Treinamento
        this.arquivo = arquivo;        
        initComponents();
        //Criando Tabela do tamanho necessario para alocação dos dados recebidos do arquivo!
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        String[] linha = new String[]{"",};
        for(int i=0;i<180;i++){
            model.addRow(linha);
            model2.addRow(linha);
        }  
        //fim criação tabela
        
        //Inicio da criação das camadas!
        camada1 = new Camada(13, 13);
        camada2 = new Camada(2, 13);
        camada3 = new Camada(2, 2);
        camada4 = new Camada(1, 2); 
        //fim criação das camadas!
        
        int count = 1; //Contador para identificar Amostras!     
        //Inicio Set de dados dentro da tabela!
        int j=2;
        for( j=j;j<15;j++){
                camada2.Neuronios[0].pesos[j-2] = (1 - 0) * r.nextDouble();
                camada2.Neuronios[0].pesoAnterior[j-2] = camada2.Neuronios[0].pesos[j-2];
            }
            for( j=j;j<28;j++){
                camada2.Neuronios[1].pesos[j-15] = (1 - 0) * r.nextDouble();
                camada2.Neuronios[1].pesoAnterior[j-15] = camada2.Neuronios[0].pesos[j-15];
            }
            for( j=j;j<30;j++){
                camada3.Neuronios[0].pesos[j-28] = (1 - 0) * r.nextDouble();
                camada3.Neuronios[0].pesoAnterior[j-28] = camada2.Neuronios[0].pesos[j-28];
            }
            for( j=j;j<32;j++){
                camada3.Neuronios[1].pesos[j-30] = (1 - 0) * r.nextDouble();
                 camada3.Neuronios[1].pesoAnterior[j-30] = camada2.Neuronios[0].pesos[j-30];
            }
            for( j=j;j<34;j++){
                camada4.Neuronios[0].pesos[j-32] = (1 - 0) * r.nextDouble();
                camada4.Neuronios[0].pesoAnterior[j-32] = camada2.Neuronios[0].pesos[j-32];
            }
            camada2.Neuronios[0].Gradiente = -1 + (1 - -1) * r.nextDouble();
            camada2.Neuronios[1].Gradiente = -1 + (1 - -1) * r.nextDouble();
            camada3.Neuronios[0].Gradiente = -1 + (1 - -1) * r.nextDouble();
            camada3.Neuronios[1].Gradiente = -1 + (1 - -1) * r.nextDouble();
            camada4.Neuronios[0].Gradiente = -1 + (1 - -1) * r.nextDouble();
            
            camada2.Neuronios[0].pesoBias = -1 + (1 - -1) * r.nextDouble();
            camada2.Neuronios[1].pesoBias = -1 + (1 - -1) * r.nextDouble();
            camada3.Neuronios[0].pesoBias = -1 + (1 - -1) * r.nextDouble();
            camada3.Neuronios[1].pesoBias = -1 + (1 - -1) * r.nextDouble();
            camada4.Neuronios[0].pesoBias = -1 + (1 - -1) * r.nextDouble();
 
        for(int i=0;i<178;i++){            
            jTable1.setValueAt(count, i, 0);
            jTable2.setValueAt(count, i, 0);
            count++;
            jTable1.setValueAt(this.arquivo[i][0], i, 1);            
            j=2;
            for( j=j;j<15;j++){
//                camada2.Neuronios[0].pesos[j-2] = (1 - 0) * r.nextDouble();
//                camada2.Neuronios[0].pesoAnterior[j-2] = camada2.Neuronios[0].pesos[j-2];
                jTable1.setValueAt(camada2.Neuronios[0].pesos[j-2], i, j);
            }
            for( j=j;j<28;j++){
//                camada2.Neuronios[1].pesos[j-15] = (1 - 0) * r.nextDouble();
//                camada2.Neuronios[1].pesoAnterior[j-15] = camada2.Neuronios[0].pesos[j-15];
                jTable1.setValueAt(camada2.Neuronios[1].pesos[j-15], i, j);
            }
            for( j=j;j<30;j++){
//                camada3.Neuronios[0].pesos[j-28] = (1 - 0) * r.nextDouble();
//                camada3.Neuronios[0].pesoAnterior[j-28] = camada2.Neuronios[0].pesos[j-28];
                jTable1.setValueAt(camada3.Neuronios[0].pesos[j-28], i, j);
            }
            for( j=j;j<32;j++){
//                camada3.Neuronios[1].pesos[j-30] = (1 - 0) * r.nextDouble();
//                camada3.Neuronios[1].pesoAnterior[j-30] = camada2.Neuronios[0].pesos[j-30];
                jTable1.setValueAt(camada3.Neuronios[1].pesos[j-30], i, j);
            }
            for( j=j;j<34;j++){
//                camada4.Neuronios[0].pesos[j-32] = (1 - 0) * r.nextDouble();
//                camada4.Neuronios[0].pesoAnterior[j-32] = camada2.Neuronios[0].pesos[j-32];
                jTable1.setValueAt(camada4.Neuronios[0].pesos[j-32], i, j);
            }
            
        }
        //Fim de set dados dentro da tabela!
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Treinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Classificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Classe", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n3", "n3", "n4", "n4", "n5", "n5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Taxa Acerto: ");

        jTextField1.setEnabled(false);

        jLabel2.setText("Tempo Processamento: ");

        jTextField2.setEnabled(false);

        jLabel3.setText("Quantidade de épocas no treinamento: ");

        jTextField3.setEnabled(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Classe", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n1", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n2", "n3", "n3", "n4", "n4", "n5", "n5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random r = new Random();//Classe para valores aleatorios!
        
        int aleatorio = 0, verif=0;// variaveis auxiliares !
        ArrayList vetor = new ArrayList();//Vetor auxiliar de itens utilizados para treinamento!
        
        while(vetor.size() <= 20){//Quantidade de amostras utilizadas nas classes aleatorias!
            verif =0;
            if(vetor.size() <= 7){//Classe 1
                aleatorio = r.nextInt(60);
                for(int i=0; i< vetor.size(); i++){
                    if(vetor.get(i).equals(aleatorio)){
                        verif = 1;
                    }
                }
                if(verif == 0){
                    vetor.add(aleatorio);
                    vetorT.add(aleatorio);
                }
            }
            if((vetor.size() <= 15) && (vetor.size() > 7)){  //Classe 2              
                aleatorio = 60 +  r.nextInt(71);
                for(int i=0; i< vetor.size(); i++){
                    if(vetor.get(i).equals(aleatorio)){
                        verif = 1;
                    }
                }
                if(verif == 0){
                    vetor.add(aleatorio);
                    vetorT.add(aleatorio);
                }
                
            }
            if((vetor.size() <= 20) && (vetor.size() > 15)){    //Classe 3            
                aleatorio = 131 + r.nextInt(47);
                for(int i=0; i< vetor.size(); i++){
                    if(vetor.get(i).equals(aleatorio)){
                        verif = 1;
                    }
                }
                if(verif == 0){
                    vetor.add(aleatorio);
                    vetorT.add(aleatorio);
                }
                
            }
            
        }       
        
        MLP mlp = new MLP();//Chamada da classe Com funções de calculo!
        
        long tempoInicio = System.currentTimeMillis();//Inicializando contagem do tempo de processamento!


        while(!vetor.isEmpty()){//Vetor de itens para ser utilizado no treinamento!
            
            //Setando valores no neuronio sensorial!
            camada1.Neuronios[0].valor = arquivo[(Integer) vetor.get(0)][1];
            camada1.Neuronios[1].valor = arquivo[(Integer) vetor.get(0)][2];
            camada1.Neuronios[2].valor = arquivo[(Integer) vetor.get(0)][3];
            camada1.Neuronios[3].valor = arquivo[(Integer) vetor.get(0)][4];
            camada1.Neuronios[4].valor = arquivo[(Integer) vetor.get(0)][5];
            camada1.Neuronios[5].valor = arquivo[(Integer) vetor.get(0)][6];
            camada1.Neuronios[6].valor = arquivo[(Integer) vetor.get(0)][7];
            camada1.Neuronios[7].valor = arquivo[(Integer) vetor.get(0)][8];
            camada1.Neuronios[8].valor = arquivo[(Integer) vetor.get(0)][9];
            camada1.Neuronios[9].valor = arquivo[(Integer) vetor.get(0)][10];
            camada1.Neuronios[10].valor = arquivo[(Integer) vetor.get(0)][11];
            camada1.Neuronios[11].valor = arquivo[(Integer) vetor.get(0)][12];
            camada1.Neuronios[12].valor = arquivo[(Integer) vetor.get(0)][13];
            //fim set valores do neuronio!
            
            //Atividade sigmoidal entre camadas!
            mlp.atvSigmoidal(camada1, camada2);
            mlp.atvSigmoidal(camada2, camada3);
            mlp.atvSigmoidal(camada3, camada4);            
            //Fim Atividade sigmoidal!
            
            //Calculo do erro(Não funciona) erro aumentando de valor!
//            U = mlp.erroAdaline(camada3,camada4);
//            aux = arquivo[(Integer) vetor.get(0)][0] - U;
//            erro = U;
//            System.out.println("erro: " + erro);
            
            //Calculo do gradiente do neuronio da ultima camada!
            mlp.saidaGradiente(camada4, arquivo[(Integer) vetor.get(0)][0]); 
            //fim
            
            //ajusta pesso entre as camadas com gradiente ja calculado!
            mlp.ajustePeso(camada3, camada4);
            //fim

            //Calculo dos Gradientes camada oculta
            mlp.saidaGradienteOculto(camada3, camada4);
            //Ajusta Peso Apos o calculo do gradiente
            mlp.ajustePeso(camada2, camada3);
            
            //Calculo dos Gradientes camada oculta
            mlp.saidaGradienteOculto(camada2, camada3); 
            //Ajusta Peso Apos o calculo do gradiente
            mlp.ajustePeso(camada1, camada2);  
            
            //Seta Valores anteriores <- Atuais
            mlp.Ajuste(camada4);
            mlp.Ajuste(camada3);
            mlp.Ajuste(camada2);
            //fim
            
                    
            epoca = 1;
            while(epoca < 200){
                epoca++;
                //Atividade sigmoidal entre camadas!
                mlp.atvSigmoidal(camada1, camada2);
                mlp.atvSigmoidal(camada2, camada3);
                mlp.atvSigmoidal(camada3, camada4);            
                //Fim Atividade sigmoidal!

                //Calculo do erro(Não funciona) erro aumentando de valor!
    //            U = mlp.erroAdaline(camada3,camada4);
    //            aux = arquivo[(Integer) vetor.get(0)][0] - U;
    //            erro = U;
    //            System.out.println("erro: " + erro);

                //Calculo do gradiente do neuronio da ultima camada!
                mlp.saidaGradiente(camada4,arquivo[(Integer) vetor.get(0)][0]); 
                //fim

                //ajusta pesso entre as camadas com gradiente ja calculado!
                mlp.ajustePeso(camada3, camada4);
                //fim

                //Calculo dos Gradientes camada oculta
                mlp.saidaGradienteOculto(camada3, camada4);
                //Ajusta Peso Apos o calculo do gradiente
                mlp.ajustePeso(camada2, camada3);

                //Calculo dos Gradientes camada oculta
                mlp.saidaGradienteOculto(camada2, camada3); 
                //Ajusta Peso Apos o calculo do gradiente
                mlp.ajustePeso(camada1, camada2);  

                //Seta Valores anteriores <- Atuais
                mlp.Ajuste(camada4);
                mlp.Ajuste(camada3);
                mlp.Ajuste(camada2);
                //fim                
            }            
            vetor.remove(0);//Remove do vetor auxiliar item de treinamento já utilizado!
            epocaT += 200;
        }
        jTextField2.setText(Long.toString(System.currentTimeMillis()-tempoInicio)+ "ms");//Fim calculo tempo de processamento!
        jTextField3.setText(Integer.toString(epocaT));//fim calculo de epocas!
        System.out.println("valor pos treino!" + camada4.Neuronios[0].valor);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MLP mlp = new MLP();
        int verif =0;
        for(int i=177; i>=0;i--){//Roda Vetor classificando os itens!
            for(int j = 0; j<vetorT.size(); j++){
                if(vetorT.get(j).equals(i)){//Verifica se o item foi utilizado no treinamento!
                    verif =1;
                }
            }
            if(verif==0){
                
                camada1.Neuronios[0].valor = arquivo[i][1];
                camada1.Neuronios[1].valor = arquivo[i][2];
                camada1.Neuronios[2].valor = arquivo[i][3];
                camada1.Neuronios[3].valor = arquivo[i][4];
                camada1.Neuronios[4].valor = arquivo[i][5];
                camada1.Neuronios[5].valor = arquivo[i][6];
                camada1.Neuronios[6].valor = arquivo[i][7];
                camada1.Neuronios[7].valor = arquivo[i][8];
                camada1.Neuronios[8].valor = arquivo[i][9];
                camada1.Neuronios[9].valor = arquivo[i][10];
                camada1.Neuronios[10].valor = arquivo[i][11];
                camada1.Neuronios[11].valor = arquivo[i][12];
                camada1.Neuronios[12].valor = arquivo[i][13];
                
                epoca =0;
                while(epoca < 5){
                    //Atividade sigmoidal entre camadas!
                    mlp.atvSigmoidal(camada1, camada2);
                    mlp.atvSigmoidal(camada2, camada3);
                    mlp.atvSigmoidal(camada3, camada4);            
                    //Fim Atividade sigmoidal!

                    //Calculo do erro(Não funciona) erro aumentando de valor!
        //            U = mlp.erroAdaline(camada3,camada4);
        //            aux = arquivo[(Integer) vetor.get(0)][0] - U;
        //            erro = U;
        //            System.out.println("erro: " + erro);

                    //Calculo do gradiente do neuronio da ultima camada!
                    mlp.saidaGradiente(camada4,arquivo[i][0]); 
                    //fim

                    //ajusta pesso entre as camadas com gradiente ja calculado!
                    mlp.ajustePeso(camada3, camada4);
                    //fim

                    //Calculo dos Gradientes camada oculta
                    mlp.saidaGradienteOculto(camada3, camada4);
                    //Ajusta Peso Apos o calculo do gradiente
                    mlp.ajustePeso(camada2, camada3);

                    //Calculo dos Gradientes camada oculta
                    mlp.saidaGradienteOculto(camada2, camada3); 
                    //Ajusta Peso Apos o calculo do gradiente
                    mlp.ajustePeso(camada1, camada2); 

                    //Seta Valores anteriores <- Atuais
                    mlp.Ajuste(camada4);
                    mlp.Ajuste(camada3);
                    mlp.Ajuste(camada2);
                    
                    //fim
                    epoca++;
                    int j=2;
                    for( j=j;j<15;j++){
                        jTable2.setValueAt(camada2.Neuronios[0].pesos[j-2], i, j);
                    }
                    for( j=j;j<28;j++){
                        jTable2.setValueAt(camada2.Neuronios[1].pesos[j-15], i, j);
                    }
                    for( j=j;j<30;j++){
                        jTable2.setValueAt(camada3.Neuronios[0].pesos[j-28], i, j);
                    }
                    for( j=j;j<32;j++){
                        jTable2.setValueAt(camada3.Neuronios[1].pesos[j-30], i, j);
                    }
                    for( j=j;j<34;j++){
                        jTable2.setValueAt(camada4.Neuronios[0].pesos[j-32], i, j);
                    }       
                }
                //System.out.println("valor " + camada4.Neuronios[0].valor);
     
                
                //Classificação!
                int classificacao =0;                
                classificacao = mlp.classificar(camada4.Neuronios[0].valor);
                arquivo[i][0]  = (double) classificacao;
                jTable2.setValueAt(arquivo[i][0], i, 1);
                //fim
            }
            verif = 0; 
        }
        
        //Preenche indices da tabela 2!
        int count =0;
        verif =0;
        for(int i=0;i<180;i++){
            jTable1.setValueAt(count, i, 0);
            count++;
            for(int j=0; j<vetorT.size(); j++){
                if(vetorT.get(j).equals(i)){
                    verif = 1;
                }
            }
            if(verif==0){
                for(int j=0;j<14;j++){
                    jTable2.setValueAt(this.arquivo[i][j], i, j+1);
                }                
            }else{
                for(int j=0;j<14;j++){
                    jTable2.setValueAt("classificado", i, j+1);
                }
            }
            verif = 0;
        }
        //fim atribuição!
        
        //Calculo de taxa de acerto!
        for(int i=0; i<178;i++){
            if(jTable1.getValueAt(i, 1).equals(jTable2.getValueAt(i, 1))){
                acerto += 1;
            }
        }
        acerto = acerto /178;
        acerto = acerto *100;
        
        jTextField1.setText(Double.toString(Math.floor(acerto)) + "%");
        //fim
        
        
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
