package L7E3ExercCinema;

public class EntradaDeCinema {

    private Integer hora;
    private Integer sala;
    private Integer valor;
    private String nome;
    private Double valorDesconto;

    public EntradaDeCinema(Integer hora, Integer sala, Integer valor, String nome) {
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }

    public void calculaDesconto(Integer idade, Boolean estudante) {
        if (idade < 12) {
            valorDesconto = valor * 0.5;
            System.out.println(String.format("Valor a pagar: %.2f", valorDesconto));
        } else if (idade >= 12 && idade <= 15 && estudante == true) {
            valorDesconto = valor * 0.6;
            System.out.println(String.format("Valor a pagar: %.2f", valorDesconto));
        } else if (idade >= 16 && idade <= 20 && estudante == true) {
            valorDesconto = valor * 0.7;
            System.out.println(String.format("Valor a pagar: %.2f", valorDesconto));
        } else if (idade > 20 && estudante == true) {
            valorDesconto = valor * 0.8;
            System.out.println(String.format("Valor a pagar: %.2f", valorDesconto));
        } else {
            System.out.println("Valor a pagar: "+ valor);
        }
    }

    public void calculaDescontoHorario() {
        if (hora < 16) {
            valorDesconto = valorDesconto * 0.9;
            System.out.println(String.format("Valor a pagar antes das 16h: %.2f", valorDesconto));
        }
    }

    public void exibeDados() {
        System.out.println(String.format("---------------------------------------"));
        System.out.println(String.format("Hora do filme: %d", hora));
        System.out.println(String.format("Sala do filme: %d", sala));
        System.out.println(String.format("Valor do filme: %d", valor));
        System.out.println(String.format("Nome do filme: %s", nome));
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

}
