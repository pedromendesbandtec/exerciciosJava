package L6E3Eleicao;

import java.util.Scanner;

public class ProgramaEleicao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        UrnaEletronica urna1 = new UrnaEletronica();
        UrnaEletronica urna2 = new UrnaEletronica();

        System.out.println("Inicio da eleição");

        for (Integer i = 1; i <= 5; i++) {
            System.out.println("Digite 1 ou 2 para votar no respectivo candidato: ");
            Integer voto = leitor.nextInt();

            switch (voto) {
                case 1:
                    urna1.setVotar();
                    System.out.println("Candidato 1 recebeu " +urna1.getVotos()+ " votos");
                    break;
                case 2:
                    urna2.setVotar();
                    System.out.println("Candidato 2 recebeu " +urna2.getVotos()+ " votos");
                    break;
                default:
                    System.out.println("Valor inválido, digite 1 ou 2 para os respectivos candidatos");
                    i--;
                    break;
            }
        }
        if (urna1.getVotos() > urna2.getVotos()) {
            System.out.println("Candidato 1 venceu com " +urna1.getVotos()+ " votos.\nFim da votação!");
        } else if (urna2.getVotos() > urna1.getVotos()) {
            System.out.println("Candidato 2 venceu com " +urna2.getVotos()+ " votos\nFim da votação!");
        } else {
            System.out.println("Votação empatada.\nFim da votação!");
        }
    }

}
