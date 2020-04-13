package L7E3ExercCinema;

public class TesteEntradaDeCinema {

    public static void main(String[] args) {
        EntradaDeCinema entrada1 = new EntradaDeCinema(14, 25, 30, "Scarface");
//        hora, sala, valor, nome;
        entrada1.exibeDados();
        entrada1.calculaDesconto(10, true);
        entrada1.calculaDescontoHorario();

        entrada1.exibeDados();
        entrada1.calculaDesconto(13, true);
        entrada1.calculaDescontoHorario();

        EntradaDeCinema entrada2 = new EntradaDeCinema(20, 13, 20, "Psicopata Americano");
//        hora, sala, valor, nome;
        entrada2.exibeDados();
        entrada2.calculaDesconto(18, true);
        entrada2.calculaDescontoHorario();

        entrada2.exibeDados();
        entrada2.calculaDesconto(21, true);
        entrada2.calculaDescontoHorario();
        
        EntradaDeCinema entrada3 = new EntradaDeCinema(17, 10, 50, "O Poderoso Chefão");
//        hora, sala, valor, nome;
        entrada3.exibeDados();
        entrada3.calculaDesconto(20, false);
        entrada3.calculaDescontoHorario();
    }
    

}
