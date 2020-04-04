package lista.pkg03;

import java.util.Scanner;

public class L3E01Tabuada {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um número: \n");
        Integer num = leitor.nextInt();
        
        System.out.println("A tabuada do "+num+" é: ");
        for (Integer i = 0; i <= 10; i++) {
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
