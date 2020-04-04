package lista.pkg01;

import java.util.Scanner;

public class L1E2Idade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Olá "+nome+"! Qual o ano de seu nascimento?");
        Integer anoNasc = leitor.nextInt();
        
//        Integer soma = 2030-anoNasc;
//        
//        System.out.println("Em 2030 você terá "+soma+" anos.");   

        System.out.println("Em 2030 você terá: " + (2030 - anoNasc) + " anos.");
    }
}
