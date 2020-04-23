package desafiocontacorrente;

public class Historico {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Double valor;
    private String operacao;

    public Historico(Integer dia, Integer mes, Integer ano, Double valor, String operacao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.operacao = operacao;
    }

    public Integer getDia() {
        return this.dia;
    }

    public Integer getMes() {
        return this.mes;
    }

    public Integer getAno() {
        return this.ano;
    }

    public Double getValor() {
        return this.valor;
    }

    public String getOperacao() {
        return this.operacao;
    }

    @Override
    public String toString() {
        String retornoToString = String.format("\nHistórico: \nData: %d/%d/%d \nValor: R$%.2f \nOperação realizada: %s \n", this.dia, this.mes, this.ano, this.valor, this.operacao);
        return retornoToString;
    }

}
