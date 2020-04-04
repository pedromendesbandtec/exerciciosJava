package lista.pkg02;

import java.util.Scanner;

public class L2E5IndiceMassaCorporal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        Double altura = leitorS.nextDouble();

        System.out.println("Digite seu peso: ");
        Double peso = leitorS.nextDouble();

        System.out.println("Digite seu sexo: ");
        String sexo = leitor.nextLine();

        Double imc = peso / (altura * altura);

        if ("Feminino".equals(sexo)) {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso " + imc);
            } else if (imc >= 19.1 && imc < 25.8) {
                System.out.println("No peso normal " + imc);
            } else if (imc >= 25.8 && imc < 27.3) {
                System.out.println("Marginalmente acima do peso " + imc);
            } else if (imc >= 27.3 && imc < 32.3) {
                System.out.println("Acima do peso ideal " + imc);
            } else {
                System.out.println("Obeso " + imc);
            }
        } else if ("Masculino".equals(sexo)) {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso " + imc);
            } else if (imc >= 20.7 && imc < 26.4) {
                System.out.println("No peso normal " + imc);
            } else if (imc >= 26.4 && imc < 27.8) {
                System.out.println("Marginalmente acima do peso " + imc);
            } else if (imc >= 27.8 && imc < 31.1) {
                System.out.println("Acima do peso ideal " + imc);
            } else {
                System.out.println("Obeso " + imc);
            }
        }

    }

}
