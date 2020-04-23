package L08E1Frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleFruta {

    public static void main(String[] args) {

        List lista = new ArrayList<>();
        Scanner leitor = new Scanner (System.in);

        lista.add("Abacaxi");
        lista.add("Banana");
        lista.add("Melancia");
        lista.add("Kiwi");
        
        System.out.println("Digite o nome de uma fruta: ");
        String fruta = leitor.nextLine();
        
        if (lista.contains(fruta)) {
            System.out.println(String.format("A fruta %s existe na lista.", fruta));
        } else {
            System.out.println(String.format("Não existe a fruta %s na lista.", fruta));
        }
    }

}
