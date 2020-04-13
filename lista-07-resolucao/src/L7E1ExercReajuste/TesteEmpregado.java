package L7E1ExercReajuste;

public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado empreg1 = new Empregado("João", "Analista", 2000.00);
        empreg1.exibeDados();
        empreg1.reajustarSalario(0.20);
        
        Empregado empreg2 = new Empregado("Pedro", "Estagiário de TI", 1800.00);
        empreg2.exibeDados();
        empreg2.reajustarSalario(0.50);

    }

}
