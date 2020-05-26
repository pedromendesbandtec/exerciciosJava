package exercicio.aluno.heranca;

public class ProgramaAlunoHeranca {
    
    public static void main(String[] args) {
//        Aluno a = new Aluno(1212,"Maria Eduarda Tavares Sampaio",10.0,7.5);        
//        System.out.println(String.format("O aluno %s tem a média %.2f", a.getNome(), a.calculaMedia()));
//        System.out.println(a);
//        
//        Aluno b = new Aluno(2323,"Pedro Henrique Ficuciello Mendes",5.0,3.5);
//        System.out.println(String.format("O aluno %s tem a média %.2f", b.getNome(), b.calculaMedia()));
//        System.out.println(b);
        
        AlunoPos ap = new AlunoPos (4545, "Dudinha Gatah", 8.5, 7.5, 10.0);
        System.out.println(String.format("O aluno de pós graduação %s tem a média %.2f", ap.getNome(), ap.calculaMedia()));
        System.out.println(ap);
    }
    
}
