package lista.pkg02;

import java.util.Scanner;

public class L2E4Boletim {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        Double n1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double n2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        Double n3 = leitor.nextDouble();
        
        Double media = (n1+n2+n3) / 3;
        
        if (media >= 7) {
            System.out.println("Passou direto com média "+media);
        } else if (media >= 5 && media <=7) {
            System.out.println("Têm direito de fazer uma prova de recuperação pela média de "+ media);
        } else {
            System.out.println("Reprovado direto por conta da média de "+media);
        }
    }
}
