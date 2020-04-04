package lista.pkg01;

import java.util.Scanner;

public class L1E5CalculadoraSalario {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite seu salário: ");
        Double salarioBru = leitor.nextDouble();
        
        System.out.println("Digite a porcentagem de impostos que será pago: ");
        Double imposto = leitor.nextDouble();
        
        Double salarioLiq = salarioBru - (salarioBru*(imposto/100));
        
        System.out.println("Seu salário líquido é de "+salarioLiq);
    }
}
