package lista.pkg02;

import java.util.Scanner;

public class L2E1Pizzada {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner (System.in);
        
        System.out.println("Digite o valor de uma pizza: ");
        Double valPizza = leitor.nextDouble();
        
        System.out.println("Digite o sabor da pizza: ");
        String saborPizza = leitorS.nextLine();
        
        System.out.println("Digite quantas pessoas irão rachar a conta: ");
        Integer pessoasRachar = leitor.nextInt();
        
        System.out.println("Digite o máximo que as pessoas irão contribuir: ");
        Double maxRachar = leitor.nextDouble();
        
        Double totalRachar = maxRachar * pessoasRachar;
        Double divRachar = totalRachar / pessoasRachar;
        
        if (valPizza <= totalRachar) {
            System.out.println("A pizza de "+saborPizza+" será dividida entre "+pessoasRachar+" pessoas. R$"+divRachar+" para cada.");
        } else {
            System.out.println("Deu ruim no racha. A pizza deveria custar no máximo R$"+totalRachar);
        }
        
        
    }
    
}
