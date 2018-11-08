package Estrutura;

import java.util.Random;

public class Neuronio {
    public double Bias,pesoBias, Gradiente, valor;
    public double pesos[];
    
    public Neuronio(int tamCamadaAnterior){     
        Random r = new Random();
        double valorDinamico = -1 + (1 - -1) * r.nextDouble();
        pesos = new double[tamCamadaAnterior];
        pesoBias = valorDinamico;
        Gradiente = valorDinamico;
        valor = valorDinamico;
        Bias = 1;
        for(int i = 0; i < pesos.length; i++){
            pesos[i] = valorDinamico;
        }
    }
}
