package Exercicio2;

public class Moto extends Veiculo{
   public static void main(String[] args) {
        Veiculo moto1 = new Veiculo();
        moto1.cor = "Vermelho";
        moto1.modelo = "Honda";
        moto1.capacidadeTanque = 100;
        System.out.println("Modelo: " + moto1.modelo + ", " + "Cor: " + moto1.cor + ", " +  "Capacidade do Tanque: "  + moto1.capacidadeTanque + ".");
    }
}
