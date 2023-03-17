package Exercicio1;

public class RodarAplicacao {
    public static void main(String[] args) {
        //Exemplo 1
        System.out.println("-------------------------------CARRO----------------------------");
        Carro carro1 = new Carro();
        carro1.setCor("Branco");
        carro1.setModelo("Uno");
        carro1.setCapacidadeTanque(50);
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(10));
        //Exemplo 2
        System.out.println("-------------------------------CARRO----------------------------");
        Carro carro2 = new Carro("Preto","Fiat", 60);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(8));
    }
}
