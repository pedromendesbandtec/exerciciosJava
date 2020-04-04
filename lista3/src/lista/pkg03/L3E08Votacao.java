package lista.pkg03;

import java.util.Scanner;

public class L3E08Votacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        System.out.println("Digite o sabor da pizza que você prefere: \n5 - Mussarela \n25 - Calabresa \n50 - Quatro Queijos");
        
        for (Integer i = 1; i < 11; i++) {
            
            System.out.println("Digite o "+i+"º voto: ");
            Integer voto = leitor.nextInt();
            
            switch (voto) {
                case 5:
                    mussarela++;
                    break;

                case 25:
                    calabresa++;
                    break;

                case 50:
                    quatroQueijos++;
                    break;
                    
                default:
                    System.out.println("Digite algo válido");
                    i--;
            }

        }
        
        System.out.println("Os sabores tiveram os seguintes votos: \nMussarela: "+mussarela+"\tCalabresa: "+calabresa+"\tQuatro Queijos: "+quatroQueijos);
        
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("O sabor de pizza favorito é de Mussarela!");
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("O sabor de pizza favorito é de Calabresa!");
        } else if (quatroQueijos > mussarela && quatroQueijos > calabresa) {
            System.out.println("O sabor de pizza favorito é de Quatro Queijos!");
        } else {
            System.out.println("Votação empatada! Vote novamente.");
        }
    }
}
