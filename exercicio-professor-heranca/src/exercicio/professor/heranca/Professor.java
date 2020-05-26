package exercicio.professor.heranca;

public class Professor {

    protected String nome;
    protected Integer codigo;
    protected Integer horas;
    protected Double valorHora;

    public Professor(String nome, Integer codigo, Integer horas, Double valorHora) {
        this.nome = nome;
        this.codigo = codigo;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public Double calculaSalario() {
        Double salarioProf = (horas * valorHora) * 4.5;
        return salarioProf;
    }

    @Override
    public String toString() {
        String retornoToString = String.format("Professor{ \nNome: %s - Código: %d - Horas: %d - Valor Horas: %.2f - Salário: %.2f }\n", this.nome, this.codigo, this.horas, this.valorHora, this.calculaSalario());
        return retornoToString;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getHoras() {
        return horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

}
