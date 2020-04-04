package prova.continuada.pkg01;

import java.util.Scanner;

public class Economia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = leitorS.nextLine();
        Integer soma = 0;

        for (Integer meses = 0; meses < 12; meses++) {

            Integer numMes = 1;
            System.out.println("Valor depositado no " + numMes + "º mês: ");
            Integer valDep = leitor.nextInt();
            soma += valDep;
        }
        System.out.println("Ao final de 12 meses, " + nome + " guardou R$" + soma);
    }

}
