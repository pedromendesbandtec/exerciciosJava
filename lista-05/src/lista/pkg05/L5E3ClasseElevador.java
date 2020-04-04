package lista.pkg05;

public class L5E3ClasseElevador {
    
    Integer totalPesoElevador = 0;
    Integer totalPessoasElevador = 0;

    void entrarHomem() {
        totalPessoasElevador += 1;
        totalPesoElevador += 90;
    }

    void entrarMulher() {
        totalPessoasElevador += 1;
        totalPesoElevador += 65;
    }

    void entrarCrianca() {
        totalPessoasElevador += 1;
        totalPesoElevador += 40;
    }
}