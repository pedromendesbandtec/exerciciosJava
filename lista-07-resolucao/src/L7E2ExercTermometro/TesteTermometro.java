package L7E2ExercTermometro;

public class TesteTermometro {

    public static void main(String[] args) {
        Termometro term = new Termometro(29.0, 30.0, 20.0);
        //25.0 = Temperatura atual
        //30.0 = Temperatura máxima
        //10.0 = Temperatura mínima
        term.exibeCalculos();
        term.aumentaTemperatura();
        term.exibeFahreinheit(term.getTempAtual());

        term.exibeCalculos();
        term.diminuiTemperatura();
        term.exibeFahreinheit(term.getTempAtual());

        Termometro term1 = new Termometro(20.0, 30.0, 19.0);
        //25.0 = Temperatura atual
        //30.0 = Temperatura máxima
        //10.0 = Temperatura mínima

        term1.exibeCalculos();
        term1.diminuiTemperatura();
        term1.exibeFahreinheit(term1.getTempAtual());

        term1.exibeCalculos();
        term1.aumentaTemperatura();
        term1.exibeFahreinheit(term1.getTempAtual());

    }

}
