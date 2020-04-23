package L08E3Boletim;

public class Disciplina {

    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;
    private Integer quantFalta;
    private Boolean aprovado = false;
    private Double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaContinuada() {
        return this.notaContinuada;
    }

    public void setNotaSemestral(Double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }

    public Double getNotaSemestral() {
        return this.notaSemestral;
    }

    public void setQuantFalta(Integer quantFalta) {
        this.quantFalta = quantFalta;
    }

    public Integer getQuantFalta() {
        return this.quantFalta;
    }

    public void verificarAprovado() {
        if (this.media >= 6.0 && this.quantFalta <= 15) {
            this.aprovado = true;
        }
    }

    public String getAprovado() {
        if (this.aprovado == true) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }

    }

    public void calcularMedia() {
        this.media = (this.notaContinuada * 0.4) + (this.notaSemestral * 0.6);
    }

    public Double getMedia() {
        return this.media;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + ", quantFalta=" + quantFalta + ", aprovado=" + aprovado + ", media=" + media + '}';
    }

}
