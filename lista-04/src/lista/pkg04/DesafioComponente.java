package lista.pkg04;

import java.util.Random;

public class DesafioComponente {

    Integer dado;
    String cor;
    String status;

    Random aleatorio = new Random();

    void atualizarStatus() {
        if (dado >= 0 && dado <= 20) {
            status = "Suave";
            cor = "#00008B";
        } else if (dado > 20 && dado <= 70) {
            status = "Atenção";
            cor = "#8B008B";
        } else {
            status = "Crítico";
            cor = "#8B0000";
        }
    }

    void atualizarDados() {
        dado = aleatorio.nextInt(101);
        this.atualizarStatus();
    }
}
