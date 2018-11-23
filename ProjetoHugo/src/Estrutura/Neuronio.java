package Estrutura;

import java.util.Random;

public class Neuronio {
    public double biasAnterior,Bias,pesoBias, Gradiente, valor;
    public double pesos[], pesoAnterior[];
    
    public Neuronio(int tamCamadaAnterior){     
        Random r = new Random();
        double valorDinamico = 0 + (1 - 0) * r.nextDouble();
        pesos = new double[tamCamadaAnterior];
        pesoAnterior = new double[tamCamadaAnterior];
        pesoBias = valorDinamico;
        Gradiente = valorDinamico;
        valor = valorDinamico;
        Bias = -1;
        biasAnterior = Bias;
        for(int i = 0; i < pesos.length; i++){
            pesos[i] = valorDinamico;
            pesoAnterior[i] = pesos[i];
        }
    }
}
