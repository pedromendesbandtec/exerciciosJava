package pedro.ficuciello.c3;

public class App {

    public static void main(String[] args) {
        VeterinarioClinico vetClin1 = new VeterinarioClinico(1212, "Diego Brito", 10 ,80.0);
        VeterinarioClinico vetClin2 = new VeterinarioClinico(2323, "Pedro Ficuciello", 8 ,50.0);
        VeterinarioCirurgiao vetCirur1 = new VeterinarioCirurgiao(3434, "Maria Eduarda", 12, 100.00, 5, 150.00 );
        VeterinarioCirurgiao vetCirur2 = new VeterinarioCirurgiao(4545, "Célia Taniwaki", 20, 140.00, 10, 200.00 );
        
        System.out.println(vetClin1);
        System.out.println(vetClin2);
        System.out.println(vetCirur1);
        System.out.println(vetCirur2);
    }
}
