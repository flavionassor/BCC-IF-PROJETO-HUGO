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
            aux -= camada2.Neuronios[i].Bias * camada2.Neuronios[i].pesoBias;
            aux = aux * -1;// Valor do beta(Constante de inclinação)!
            aux = Math.pow(Math.E, aux);
            aux += 1;
            aux = 1/aux;
            camada2.Neuronios[i].valor = aux;
        }
    }
    
    public void Delta(Camada camada1, Camada camada2){
        double aux=0;
        
        
    }
    
}
