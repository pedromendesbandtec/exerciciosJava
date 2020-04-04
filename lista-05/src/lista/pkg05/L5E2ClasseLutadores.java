package lista.pkg05;

public class L5E2ClasseLutadores {

    Integer vidaLutador1 = 100;
    Integer vidaLutador2 = 100;
    String mensagem;

    void apanharLutador1() {
        if (vidaLutador1 == 0 || vidaLutador2 == 0) {
        } else {
            if (vidaLutador1 < 10) {
                vidaLutador1 = 0;
            } else {
                vidaLutador1 -= 10;
            }
        }
    }

    void apanharLutador2() {
        if (vidaLutador2 == 0 || vidaLutador1 == 0) {
        } else {
            if (vidaLutador2 < 10) {
                vidaLutador2 = 0;
            } else {
                vidaLutador2 -= 10;
            }
        }
    }

    void concentrarForca1() {
        if (vidaLutador1 == 0 || vidaLutador2 == 0) {
        } else {
            vidaLutador1 += 2;
        }
    }

    void concentrarForca2() {
        if (vidaLutador2 == 0 || vidaLutador1 == 0) {
        } else {
            vidaLutador2 += 2;
        }
    }
    void retornoLutador1() {
        if (vidaLutador1 == 0) {
            mensagem = "Lutador 1 perdeu";
        }
    }
    void retornoLutador2() {
        if (vidaLutador2 == 0) {
            mensagem = "Lutador 2 perdeu";
        }
    }
}
