package lista.pkg05;

import java.util.Random;

public class L5E1ClasseDadinho {

    Random gerador = new Random();

    Integer dado1, dado2;
    Integer vitoriaDado1 = 0;
    Integer vitoriaDado2 = 0;
    String resultado, resultadoDesafio;

    void sortearDados() {
        dado1 = gerador.nextInt(7);
        dado2 = gerador.nextInt(7);
    }
    
    void retornoLabel() {
        if (dado1 > dado2) {
            vitoriaDado1++;
            resultado = "O Dadinho 1 venceu";    
        } else if (dado2 > dado1) {
            vitoriaDado2++;
            resultado = "O Dadinho 2 venceu";
        } else {
            resultado = "Empate";
        }
    }
    
    void desafioPlacar() {
        resultadoDesafio = "Vitórias do Dadinho 1: " + vitoriaDado1 + " / Vitórias do Dadinho 2: " + vitoriaDado2;
    }

}
