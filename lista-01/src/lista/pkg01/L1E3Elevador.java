package lista.pkg01;

import java.util.Scanner;

public class L1E3Elevador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o limite de peso de um elevador: ");
        Double pesoElevador = leitor.nextDouble();
        
        System.out.println("Digite o limite de pessoas em um elevador: ");
        Integer pessoasElevador = leitor.nextInt();
        
        System.out.println("Digite o peso da 1ª pessoa no elevador: ");
        Double pessoaUm = leitor.nextDouble();
        
        System.out.println("Digite o peso da 2ª pessoa no elevador: ");
        Double pessoaDois = leitor.nextDouble();
        
        System.out.println("Digite o peso da 3ª pessoa no elevador: ");
        Double pessoaTres = leitor.nextDouble();
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "+pessoasElevador+" pessoas.\nO peso total no elevador é de "+(pessoaUm+pessoaDois+pessoaTres)+" sendo que ele suporta "+pesoElevador);
        
        //Casas decimais no CONSOLE digitar com vírgula,
        //Casas decimais no CÓDIGO digitar com ponto.
    }
}
