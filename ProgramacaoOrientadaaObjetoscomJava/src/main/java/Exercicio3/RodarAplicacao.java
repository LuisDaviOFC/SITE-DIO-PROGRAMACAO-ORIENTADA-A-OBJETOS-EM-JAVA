package Exercicio3;

public class RodarAplicacao {
    public static void main(String[] args) {
        //Extanciei ela mesmo
        Funcionario funcionario1 = new Funcionario();
        //Upcasts
        Funcionario gerente1 = new Gerente();
        Funcionario vendedor1 = new Vendedor();
        Funcionario faxineiro1 = new Faxineiro();
        //Downcast
        Vendedor vendedor2 = (Vendedor)new Funcionario(); 
    }
}
