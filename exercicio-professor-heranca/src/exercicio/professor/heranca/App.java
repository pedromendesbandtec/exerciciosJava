package exercicio.professor.heranca;

public class App {

    public static void main(String[] args) {
        Professor p = new Professor("Diego Brito", 1212, 30, 100.00);
        Coordenador c = new Coordenador("Célia Taniwaki",1010, 20, 100.00, 10, 150.00, "Linguagem de Programação");
        
        System.out.println(p);
        System.out.println(c);

    }

}
