package prova.continuada.pkg01;

import java.util.Scanner;

public class EconomiaCorrigida {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = leitorS.nextLine();
        Double soma = 0.0; // Errei, não deixei como Double, e sim como Integer
        Integer numMes = 1; // Errei isso, deveria ter criado a variável numMes fora do laço, e incrementar dentro.

        for (Integer meses = 0; meses < 12; meses++) {
            System.out.println("Valor depositado no " + numMes++ + "º mês: ");
            Double valDep = leitor.nextDouble(); // Errei, não deixei como Double, e sim como Integer

            // Errei, não fiz o If
            if (valDep == 2.0 || valDep == 5.0 || valDep == 10.0 || valDep == 20.0 || valDep == 50.0 || valDep == 100.0) {
                soma += valDep;
            }
        }
        // Errei, não defini a Double para ter dois números depois da vírgula
        System.out.format("Ao final de 12 meses, %s guardou R$%.2f", nome, soma);
    }
}
