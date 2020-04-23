package desafiocontacorrente;

public class ProgramaContaCorrente {

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente("Maria Eduarda");

        System.out.println(cc1.exibirBarra());
        System.out.println(cc1.depositar(2000.00, 22, 04, 2020));
        System.out.println(cc1.exibirExtrato());
        
        System.out.println(cc1.exibirBarra());
        System.out.println(cc1.sacar(1000.00, 25, 04, 2020));
        System.out.println(cc1.exibirExtrato());
        
        System.out.println(cc1.exibirBarra());
        System.out.println(cc1.exibirHistorico());

        ContaCorrente cc2 = new ContaCorrente("Pedro Ficuciello");

        System.out.println(cc2.exibirBarra());
        System.out.println(cc2.depositar(600.00, 01, 04, 2020));
        System.out.println(cc2.exibirExtrato());
        
        System.out.println(cc2.exibirBarra());
        System.out.println(cc2.sacar(300.00, 12, 04, 2020));
        System.out.println(cc2.exibirExtrato());
        
        System.out.println(cc2.exibirBarra());
        System.out.println(cc2.sacar(400.00, 17, 04, 2020));
        System.out.println(cc2.exibirExtrato());
        
        System.out.println(cc2.exibirBarra());
        System.out.println(cc2.depositar(200.00, 18, 04, 2020));
        System.out.println(cc2.exibirExtrato());
        
        System.out.println(cc2.exibirBarra());
        System.out.println(cc2.sacar(400.00, 20, 04, 2020));
        System.out.println(cc2.exibirExtrato());
        
        System.out.println(cc2.exibirBarra());
        System.out.println(cc2.sacar(250.00, 23, 04, 2020));
        System.out.println(cc2.exibirExtrato());
        
        System.out.println(cc2.exibirBarra());
        System.out.println(cc2.exibirHistorico());
    }

}
