package L7E1ExercReajuste;

public class Empregado {

    private String nome;
    private String cargo;
    private Double salario;
    private Double total;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibeDados() {
        System.out.println(String.format("---------------------------------------"));
        System.out.println("Nome do empregado: " + nome);
        System.out.println(String.format("Salário inicial do empregado: %.2f", salario));
        System.out.println("Cargo do empregado: " + cargo);
    }

    public void reajustarSalario(Double conta) {
        conta = conta + 1.00;
        total = salario * conta;
        System.out.println(String.format("Salário ajustado: %.2f", total));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
