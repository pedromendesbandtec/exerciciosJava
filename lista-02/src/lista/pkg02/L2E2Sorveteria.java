package lista.pkg02;

import java.util.Scanner;

public class L2E2Sorveteria {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        String nomeSorvete;
        
        System.out.println("Digite o produto que deseja: Casquinha, Sundae e Milkshake.");
        nomeSorvete = leitor.nextLine();
        
        switch (nomeSorvete) {
            case "Casquinha":
                System.out.println("A casquinha custa R$2,00.");
                break;
                
            case "Sundae":
                System.out.println("O sundae custa R$5,00.");
                break;
                
            case "Milkshake":
                System.out.println("O milkshake custa R$7,00.");
                break;
                
            default:
                System.out.println("Opção indisponível!");
                break;
        }
    }
}
