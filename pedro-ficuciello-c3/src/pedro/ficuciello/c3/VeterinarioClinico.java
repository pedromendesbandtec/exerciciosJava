package pedro.ficuciello.c3;

public class VeterinarioClinico {

    protected Integer codigo;
    protected String nome;
    protected Integer qtdConsulta;
    protected Double valorConsulta;

    public VeterinarioClinico(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }

    public Double calcularSalario() {
        Double salario = qtdConsulta * valorConsulta;
        return salario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtdConsulta() {
        return qtdConsulta;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }
    
    @Override
    public String toString() {
        String retornoToString = String.format ("\nVeterinário Clínico\n"
                + "Código(CRMV): %d"
                + "\nNome: %s"
                + "\nQuantidade de Consultas: %d"
                + "\nValor da Consulta: R$%.2f"
                + "\nSalário: R$%.2f",
                this.codigo, this.nome, this.qtdConsulta, this.valorConsulta, this.calcularSalario() );
        return retornoToString;
    }

}
