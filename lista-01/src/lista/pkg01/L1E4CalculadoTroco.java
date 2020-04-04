package lista.pkg01;

import java.util.Scanner;

public class L1E4CalculadoTroco {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valorUnit = leitor.nextDouble();
        
        System.out.println("Digite a quantidade vendida: ");
        Integer qtdeVendida = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente: ");
        Double qtdePaga = leitor.nextDouble();
        
        Double total = valorUnit * qtdeVendida;
        
        System.out.println("Seu troco será de: R$"+(qtdePaga-total));
        //System.out.println("Seu troco será de: R$"+ (valorPago - (valorProduto * quantidade)));
    }
}
