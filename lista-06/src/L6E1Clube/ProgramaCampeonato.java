package L6E1Clube;

import java.util.Scanner;

public class ProgramaCampeonato {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Clube pontuacao1 = new Clube();
        Clube pontuacao2 = new Clube();

        System.out.println("Começa o torneio de melhor de 5!");

        for (Integer i = 1; i <= 5; i++) {
            System.out.println("São Paulo Futebol Clube x Liverpool Football Club");
            String resultado = leitor.nextLine();

            switch (resultado) {
                case "vitoria":
                    pontuacao1.vitorias();
                    pontuacao2.derrotas();
                    System.out.println("São Paulo Futebol Clube: "+ pontuacao1.getPonto().toString() +" pontos!\nLiverpool Football Club: "
                            +pontuacao2.getPonto().toString()+" pontos!");
                    break;

                case "empate":
                    pontuacao1.empates();
                    pontuacao2.empates();
                    System.out.println("São Paulo Futebol Clube: "+ pontuacao1.getPonto().toString() +" pontos!\nLiverpool Football Club: "
                            +pontuacao2.getPonto().toString()+" pontos!");
                    break;

                case "derrota":
                    pontuacao1.derrotas();
                    pontuacao2.vitorias();
                    System.out.println("São Paulo Futebol Clube: "+ pontuacao1.getPonto().toString() +" pontos!\nLiverpool Football Club: "
                            +pontuacao2.getPonto().toString()+" pontos!");
                    break;
                    
                default:
                    System.out.println("Digite um resultado válido.");
                    i--;
                    break;
            }

        }
        
        System.out.println("Final de Temporada: \nSão Paulo Futebol Clube: " +pontuacao1.getPonto().toString()+ " pontos, " 
                +pontuacao1.getVitoria().toString()+ " vitórias, " +pontuacao1.getEmpate().toString()+ " empates e " +pontuacao1.getDerrota().toString()+ 
                " derrotas.");
        
        System.out.println("Liverpool Football Club: " +pontuacao2.getPonto().toString()+ " pontos, " +pontuacao2.getVitoria().toString()+ " vitórias, " 
                +pontuacao2.getEmpate().toString()+" empates e " +pontuacao2.getDerrota().toString()+ " derrotas.");

    }

}
