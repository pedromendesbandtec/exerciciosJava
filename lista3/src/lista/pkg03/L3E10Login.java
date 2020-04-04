package lista.pkg03;

import java.util.Scanner;

public class L3E10Login {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String user = "admin";
        String senha = "#Bandtec";

        System.out.println("Digite seu nome de usuário: ");
        String userDigitado = leitor.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaDigitado = leitor.nextLine();

        while (!(userDigitado.equals(user) && senhaDigitado.equals(senha))) {
            System.out.println("Login e/ou senha inválidos. Digite novamente.");

            System.out.println("Digite seu nome de usuário: ");
            userDigitado = leitor.nextLine();

            System.out.println("Digite sua senha: ");
            senhaDigitado = leitor.nextLine();
        }

        System.out.println("Login realizado com sucesso!");

    }

}
