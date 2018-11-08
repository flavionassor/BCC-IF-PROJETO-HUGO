package Estrutura;

public class Camada {
    public Neuronio Neuronios[];
    public int tamCamada;
    
    public Camada(int tamCamadaAtual, int tamCamadaAnterior){
        tamCamada = tamCamadaAtual;
        Neuronios = new Neuronio[tamCamadaAtual];
        
        for(int id = 0; id <tamCamada; id++){
            Neuronios[id] = new Neuronio(tamCamadaAnterior);
        }
    }
}
