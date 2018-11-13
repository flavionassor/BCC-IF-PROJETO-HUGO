package Estrutura;

public class MLP {
    
    public void conexaoCamadas(Camada camada1, Camada camada2){
        for(int idCamada1 = 0; idCamada1 < camada1.tamCamada; idCamada1++){
            for(int idCamada2 = 0; idCamada2 < camada2.tamCamada; idCamada2++){
            camada2.Neuronios[idCamada2].pesos[idCamada1] = camada1.Neuronios[idCamada1].valor;
            }
        }
    }
    
    public void atvSigmoidal (Camada camada1, Camada camada2){//Funçao de Ativação sigmoidal!
        double aux;
        for(int i=0 ; i<camada2.tamCamada; i++){
            aux = 0;
            for(int j=0; j<camada1.tamCamada; j++){
                aux += camada1.Neuronios[j].valor * camada2.Neuronios[i].pesos[j];
            }
            aux += camada2.Neuronios[i].Bias * camada2.Neuronios[i].pesoBias;
            aux = aux * -1;// Valor do beta(Constante de inclinação)!
            aux = Math.pow(Math.E, aux);
            aux += 1;
            aux = 1/aux;
            camada2.Neuronios[i].valor = aux;
        }
    }
    
    public void saidaGradiente(Camada camada){
        double gradiente = camada.Neuronios[0].valor * (1-camada.Neuronios[0].valor) * (0 - camada.Neuronios[0].valor);
        camada.Neuronios[0].Gradiente = gradiente;
    }
    
    public void ajustePeso(Camada camada1, Camada camada2){
        double aprendizado = 0.1;
        for(int i=0; i<camada2.tamCamada; i++){
            for(int j=0; j<camada1.tamCamada; j++){
                camada2.Neuronios[i].pesos[j] = aprendizado * camada1.Neuronios[j].valor 
                        * camada2.Neuronios[i].Gradiente;
                camada2.Neuronios[i].pesos[j] += camada2.Neuronios[i].pesoAnterior[j];
            }
            camada2.Neuronios[i].pesoBias = (aprendizado * camada2.Neuronios[i].Bias * camada2.Neuronios[i].Gradiente) 
                    + camada2.Neuronios[i].biasAnterior;
        }
    }
    
    public void saidaGradienteOculto(Camada camada1, Camada camada2){
        double aux;
        for(int j=0; j<camada2.tamCamada; j++){
            for(int i=0; i<camada1.tamCamada; i++){
                camada1.Neuronios[i].Gradiente = camada1.Neuronios[i].valor * (1 - camada1.Neuronios[i].valor)
                    * (camada2.Neuronios[j].Gradiente * camada2.Neuronios[j].pesoAnterior[i]);
                
            }
        }  
    }
    public void Ajuste(Camada camada){
        for(int i=0; i<camada.tamCamada;i++){
            camada.Neuronios[i].biasAnterior = camada.Neuronios[i].pesoBias;
            for(int j=0;j<camada.tamCamada;j++){
                camada.Neuronios[i].pesoAnterior[j] = camada.Neuronios[i].pesos[j];
            }
        }
    }
}
