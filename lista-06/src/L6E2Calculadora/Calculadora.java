package L6E2Calculadora;

public class Calculadora {

    private Double total, n1, n2;
    
    public void somar() {
        total = n1 + n2;
    }

    public void subtrair() {
        total = n1 - n2;
    }

    public void multiplicar() {
        total = n1 * n2;
    }

    public void dividir() {
        total = n1 / n2;
    }
    
    public Double getTotal() {
        return this.total;
    }                
    
    public void setN1(Double numero) {
        this.n1 = numero;
        //Eu crio a pv e peço pra ela guardar um valor chamando o método set, dentro dela eu crio uma variável que nascerá e morrerá no método
        //this.variavel que eu quiser pega pra ela o valor da variável.
    }
    
    public void setN2(Double numero) {
        this.n2 = numero;
    }

}
