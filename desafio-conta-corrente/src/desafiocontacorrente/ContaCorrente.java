package desafiocontacorrente;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private String titular;
    private Double saldo = 0.0;
    private List<Historico> lista;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.lista = new ArrayList<>();
    }

    public String depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor > 0) {
            this.saldo += valor;

            Historico extrato = new Historico(dia, mes, ano, valor, "Depósito");
            this.lista.add(extrato);

            String saque = String.format("Depósito efetuado no valor de: R$%.2f para %s", valor, this.titular);
            return saque;
        }
        String saque = String.format("Não foi possível depositar esse valor de: R$%.2f", valor);
        return saque;
    }

    public String sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor <= this.saldo && valor != 0) {
            this.saldo -= valor;

            Historico extrato = new Historico(dia, mes, ano, valor, "Saque");
            this.lista.add(extrato);

            String saque = String.format("Saque efetuado no valor de: R$%.2f para %s", valor, this.titular);
            return saque;
        }
        String saque = String.format("Não foi possível sacar esse valor de: R$%.2f", valor);
        return saque;
    }

    public String exibirExtrato() {
        String extratoExibido = String.format("Valor em conta: R$%.2f", this.saldo);
        return extratoExibido;
    }

    public List exibirHistorico() {
        return this.lista;
    }

    public String exibirBarra() {
        return "-----------------------------------------------------------------";
    }

    public String getTitular() {
        return this.titular;
    }

    @Override
    public String toString() {
        String retornoToString = String.format("\nConta Corrente de titular: %s \nSaldo: %.2f \nLista pertencente: %s", this.titular, this.saldo, this.lista);
        return retornoToString;
    }

}
