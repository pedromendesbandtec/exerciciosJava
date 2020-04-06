package L6E2Calculadora;

import java.util.Scanner;

public class ProgramaCalculo {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Calculadora calculo = new Calculadora();
        
        System.out.println("Digite um número: ");
        Double n1 = leitor.nextDouble();
        calculo.setN1(n1);

        System.out.println("Digite um número: ");
        Double n2 = leitor.nextDouble();
        calculo.setN2(n2);
        
        calculo.somar();
        System.out.println("A soma dos números é: "+calculo.getTotal());
        
        calculo.subtrair();
        System.out.println("A subtração dos números é: "+calculo.getTotal());
        
        calculo.multiplicar();
        System.out.println("A multiplicação dos números é: "+calculo.getTotal());
        
        calculo.dividir();
        System.out.println("A divisão dos números é: "+calculo.getTotal());

    }

}
