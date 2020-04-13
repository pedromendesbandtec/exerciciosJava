package L7E2ExercTermometro;

public class Termometro {

    private Double temperaturaAtual;
    private Double temperaturaMax;
    private Double temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public void aumentaTemperatura() {
        temperaturaAtual = temperaturaAtual + 1;
        if (temperaturaAtual >= temperaturaMax) {
            temperaturaAtual = temperaturaMax;
            System.out.println(String.format("Temperatura subiu! Temperatura atualizada: %.1f", temperaturaAtual));
        } else {
            System.out.println(String.format("Temperatura subiu! Temperatura atualizada: %.1f", temperaturaAtual));
        }
    }

    public void diminuiTemperatura() {
        temperaturaAtual = temperaturaAtual - 1;
        if (temperaturaAtual <= temperaturaMin) {
            temperaturaAtual = temperaturaMin;
            System.out.println(String.format("Temperatura caiu! Temperatura atualizada: %.1f", temperaturaAtual));
        } else {
            System.out.println(String.format("Temperatura caiu! Temperatura atualizada: %.1f", temperaturaAtual));
        }
    }

    public void exibeCalculos() {
        System.out.println(String.format("---------------------------------------"));
        System.out.println(String.format("Temperatura Máxima: %.1fºC", temperaturaMax));
        System.out.println(String.format("Temperatura Mínima: %.1fºC", temperaturaMin));
        System.out.println(String.format("Temperatura Atual: %.1fºC", temperaturaAtual));

    }

    public void exibeFahreinheit(Double tempFahreinheit) {
        tempFahreinheit = temperaturaAtual * 1.8 + 32;
        System.out.println(String.format("Temperatura em Fahreinheit: %.1fºF", tempFahreinheit));
    }

    public Double getTempAtual() {
        return temperaturaAtual;
    }

    public void setTempAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTempMax() {
        return temperaturaMax;
    }

    public void setTempMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getTempMin() {
        return temperaturaMin;
    }

    public void setTempMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

}
