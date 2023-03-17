package Exercicio2;

public class Carro extends Veiculo{
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();
        carro1.cor = "Preto";
        carro1.modelo = "Uno";
        carro1.capacidadeTanque = 100;
        System.out.println("Modelo: " + carro1.modelo + ", " + "Cor: " + carro1.cor + ", " +  "Capacidade do Tanque: "  + carro1.capacidadeTanque + ".");
    }
}
