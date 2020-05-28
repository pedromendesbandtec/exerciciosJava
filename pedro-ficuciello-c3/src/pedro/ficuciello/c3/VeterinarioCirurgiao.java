package pedro.ficuciello.c3;

public class VeterinarioCirurgiao extends VeterinarioClinico {

    private Integer qtdCirurgia;
    private Double valorCirurgia;

    public VeterinarioCirurgiao(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta, Integer qtdCirurgia, Double valorCirurgia) {
        super(codigo, nome, qtdConsulta, valorConsulta);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
    }

    @Override
    public Double calcularSalario() {
        Double salario = (qtdConsulta * valorConsulta) + (qtdCirurgia * valorCirurgia);
        return salario;
    }

    public Integer getQtdCirurgia() {
        return qtdCirurgia;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    @Override
    public String toString() {
        String retornoToString = String.format ("\nVeterinário Cirurgião\n"
                + "Código(CRMV): %d"
                + "\nNome: %s"
                + "\nQuantidade de Consultas: %d"
                + "\nValor da Consulta: R$%.2f"
                + "\nQuantidade de Cirurgias: %d"
                + "\nValor da Consulta: R$%.2f"
                + "\nSalário: R$%.2f", 
                this.codigo, this.nome, this.qtdConsulta, this.valorConsulta, this.qtdCirurgia, this.valorCirurgia, this.calcularSalario() );
        return retornoToString;
    }

}
