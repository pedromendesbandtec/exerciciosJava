package lista.pkg03;

import java.util.Random;
import java.util.Scanner;

public class L3E02Loteria {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        Random gerador = new Random ();
        
        System.out.println("Digite um número de 0 a 10: ");
        Integer num = leitor.nextInt();
        Integer aleat;
        Integer cont = 0;
        
        do {
            aleat = gerador.nextInt(10);
            System.out.println("Número sorteado: "+aleat);
            cont++;
        } while (!num.equals(aleat));
        
        System.out.println("O computador acertou o número "+num+" em "+cont+" tentativas.\n");
        
        if (cont <= 3) {
            System.out.println("Você é MUITO sortudo!");
        } else if (cont >= 3 && cont <= 10) {
            System.out.println("Você é sortudo!");
        } else {
            System.out.println("É melhor você ser trabalhador.");
        }
    }
}
