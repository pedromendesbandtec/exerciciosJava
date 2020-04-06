package L6E1Clube;

public class Clube {

    private Integer vitoria = 0;
    private Integer empate = 0;
    private Integer derrota = 0;
    private Integer ponto = 0;

    public void vitorias() {
        vitoria += 1;
        ponto += 3;
    }

    public void empates() {
        empate += 1;
        ponto += 1;
    }

    public void derrotas() {
        derrota += 1;
    }

    public Integer getVitoria() {
        return vitoria;
    }

    public Integer getEmpate() {
        return empate;
    }

    public Integer getDerrota() {
        return derrota;
    }

    public Integer getPonto() {
        return ponto;
    }

}
