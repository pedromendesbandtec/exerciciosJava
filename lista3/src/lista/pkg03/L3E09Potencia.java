package lista.pkg03;

import java.util.Scanner;

public class L3E09Potencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Descubra a potenciação!\nDigite uma base: ");
        Integer base = leitor.nextInt();

        System.out.println("Agora digite seu expoente: ");
        Integer expoente = leitor.nextInt();

        Integer total = base;

        for (Integer i = 1; i < expoente; i++) {
            total *= base;
        }

        System.out.println(String.format("O resultado é: %d", total));
    }

}
