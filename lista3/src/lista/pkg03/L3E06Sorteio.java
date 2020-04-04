package lista.pkg03;

import java.util.Random;
import java.util.Scanner;

public class L3E06Sorteio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random aleat = new Random();

        System.out.println("Digite um número de 0 a 100: ");
        Integer numDigitado = leitor.nextInt();
        Integer numAleat;
        Integer pares = 0;
        Integer impares = 0;
        Integer rodada = 0;
        Boolean achou = false;

        for (Integer i = 1; i <= 200; i++) {
            numAleat = aleat.nextInt(100);
            
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            
            if (numAleat.equals(numDigitado)) {
                rodada = i;
                achou = true;
                break;
            }
        }
        
        System.out.println("Número encontrado: "+achou+"\nPares: "+pares+"\nImpares: "+impares+"\nRodada do Sorteio: "+rodada);

    }

}
