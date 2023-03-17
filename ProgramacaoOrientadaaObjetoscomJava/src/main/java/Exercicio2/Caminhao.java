package Exercicio2;

public class Caminhao extends Veiculo{
      public static void main(String[] args) {
        Veiculo caminhao1 = new Veiculo();
        caminhao1.cor = "Vermelho";
        caminhao1.modelo = "Truck";
        caminhao1.capacidadeTanque = 100;
        System.out.println("Modelo: " + caminhao1.modelo + ", " + "Cor: " + caminhao1.cor + ", " +  "Capacidade do Tanque: "  + caminhao1.capacidadeTanque + ".");
    }
}
