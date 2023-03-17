package Exercicio1;

public class Carro {
//Atributos
    String cor;
    String modelo;
    int capacidadeTanque;

//Construtor aqui

    public Carro(){
    
    }
    
    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
