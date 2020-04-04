package lista.pkg05;

import java.util.Scanner;

public class ExercicioAlternativo {

    public static void main(String[] args) {

        Scanner leitorS = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomePiloto = leitorS.nextLine();

        Integer voo = 0;
        Double totalVoo = 0.0;

        while (!(voo < 0)) {
            System.out.println("De quantas horas foi seu último vôo?: ");
            Integer horasVoo = leitor.nextInt();

            if (horasVoo == 0 || horasVoo > 6) {
                System.out.println("Quantidade inválida! Não será registrada!");
            } else if (horasVoo > 0 && horasVoo <= 6) {
                voo++;
                totalVoo += horasVoo;
                System.out.println(String.format("%s agora tem um total de %.2f horas de vôo.", nomePiloto, totalVoo));
            } else {
                System.out.println(String.format("%s se aposentou após fazer %d vôos acumulando %.2f horas.", nomePiloto, voo, totalVoo));
                break;
            }
        }
    }

}
