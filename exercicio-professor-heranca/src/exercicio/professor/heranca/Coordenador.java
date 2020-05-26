package exercicio.professor.heranca;

public class Coordenador extends Professor {
    
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(String nome, Integer codigo, Integer horas, Double valorHora, Integer qtdHorasCoord, Double valorHoraCoord, String curso) {
        super(nome, codigo, horas, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }
    
    @Override
    public Double calculaSalario() {
        Double salarioCoord = ((horas * valorHora) * 4.5) + ((qtdHorasCoord * valorHoraCoord) * 4.5);
        return salarioCoord;
    }
    
    @Override
    public String toString() {
        String retornoToString = String.format("Coordenador{ \nQuantidade de Horas na Coordenação: %d - Valor das Horas de Coordenação: %.2f - Curso: %s - Salário como Coordenador: %.2f }", this.qtdHorasCoord, this.valorHoraCoord, this.curso, this.calculaSalario());
        return super.toString() + retornoToString;
    }
    
    
}