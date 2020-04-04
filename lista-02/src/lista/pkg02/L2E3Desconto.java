package lista.pkg02;

import java.util.Scanner;

public class L2E3Desconto {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto escolhido: ");
        Double valProduto = leitor.nextDouble();
        
        System.out.println("Digite o código de desconto: ");
        Integer codDesconto = leitor.nextInt();
        
        Double desconto1 = valProduto * 0.05;
        Double desconto2 = valProduto * 0.1;
        Double desconto3 = valProduto * 0.2;
        Double desconto4 = valProduto * 0.5;
        
        switch (codDesconto) {
            case 1:
                System.out.println("Desconto de 5%");
                System.out.println("O produto sem desconto custa: R$"+valProduto);
                System.out.println("O produto com desconto custa: R$"+desconto1);                
                break;
                
            case 2:
                System.out.println("Desconto de 10%");
                System.out.println("O produto sem desconto custa: R$"+valProduto);
                System.out.println("O produto com desconto custa: R$"+desconto2);
                break;
                
            case 3: 
                System.out.println("Desconto de 20%");
                System.out.println("O produto sem desconto custa: R$"+valProduto);
                System.out.println("O produto com desconto custa: R$"+desconto3);
                break;
                
            case 4: 
                System.out.println("Desconto de 50%");
                System.out.println("O produto sem desconto custa: R$"+valProduto);
                System.out.println("O produto com desconto custa: R$"+desconto4);
                break;
                
            default: 
                System.out.println("Código inválido");
        }
    }
}