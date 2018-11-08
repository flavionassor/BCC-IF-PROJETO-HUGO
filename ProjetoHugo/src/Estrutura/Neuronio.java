package Estrutura;

import java.util.Random;

public class Neuronio {
    public double Bias, Gradiente, valor;
    public double pesos[];
    
    public Neuronio(int tamCamadaAnterior){     
        Random r = new Random();
        double valorDinamico = -1 + (1 - -1) * r.nextDouble();
        pesos = new double[tamCamadaAnterior];
        Bias = valorDinamico;
        Gradiente = valorDinamico;
        valor = valorDinamico;
        
        for(int i = 0; i < pesos.length; i++){
            pesos[i] = valorDinamico;
        }
    }
}
