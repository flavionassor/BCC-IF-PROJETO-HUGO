package Estrutura;

public class MLP {
    
    public void conexaoCamadas(Camada camada1, Camada camada2){
        for(int idCamada1 = 0; idCamada1 < camada1.tamCamada; idCamada1++){
            for(int idCamada2 = 0; idCamada2 < camada2.tamCamada; idCamada2++){
            camada2.Neuronios[idCamada2].pesos[idCamada1] = camada1.Neuronios[idCamada1].valor;
            }
        }
    }
    
    
}
