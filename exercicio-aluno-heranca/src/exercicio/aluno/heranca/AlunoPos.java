package exercicio.aluno.heranca;

public class AlunoPos extends Aluno {

    private Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }
    
    @Override 
    public Double calculaMedia() {
        Double media = (notaContinuada + notaSemestral + notaMonografia) / 3;
        return media;
    }

    @Override
    public String toString() {
        return "aluno: " + super.toString() + "notaMonografia=" + notaMonografia + '}';
    } 
    
    
}
