package Estrutura;

public class MLP {
   
    
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
    public void Ajuste(Camada camada){//Seta peso/bias anterior = peso/bias Atual!
        for(int i=0; i<camada.tamCamada;i++){
            camada.Neuronios[i].biasAnterior = camada.Neuronios[i].pesoBias;
            for(int j=0;j<camada.tamCamada;j++){
                camada.Neuronios[i].pesoAnterior[j] = camada.Neuronios[i].pesos[j];
            }
        }
    }
    
    public double erroAdaline(Camada camada1, Camada camada2){
        double aux=0;
        for(int i=0;i<camada1.tamCamada;i++){
            aux += camada1.Neuronios[i].valor*camada2.Neuronios[0].pesos[i];
        }
        return aux;
    }
    
    public int classificar(double valor){
        double valorclass = valor * 3;
        if(valorclass < 1  ){
            return 1;
        }
        if(valorclass < 2  ){
            return 2;
        }
        if(valorclass < 3  ){
            return 3;
        }
        return 0;
    }
    
}
