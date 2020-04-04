package lista.pkg03;

import java.util.Scanner;

public class L3E07Acumulador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer num;
        Integer total = 0;
        
        do {
            System.out.println("Digite um número para ser somado e 0 para saber o total: ");
            num = leitor.nextInt();
            total += num;
            
        } while (!(num.equals(0)));
        
        System.out.println("Total acumulado: "+total);
    }
    
}
