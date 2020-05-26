package exercicio.aluno.heranca;

public class Aluno {

    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public Double calculaMedia() {
        Double media = notaContinuada * 0.4 + notaSemestral * 0.6;
        return media;
    }    

    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    @Override
    public String toString() {
        String retornoToString = String.format("Aluno{ \nRA: %d - Nome: %s - Nota Continuada: %.2f - Nota Semestral: %.2f Média: %.2f }", this.ra, this.nome, this.notaContinuada, this.notaSemestral, this.calculaMedia());
        return retornoToString;
        // return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + ", media=" + calcularMedia() + '}';
    }
    
}
