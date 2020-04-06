package L6E3Eleicao;

public class UrnaEletronica {

    private Integer votos = 0;

    public void setVotar() {
        votos += 1;
    }

    public Integer getVotos() {
        return votos;
    }
}
