package L08E3Boletim;

public class ProgramaAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1192077, "Maria Eduarda");
        Disciplina materia1 = new Disciplina();

        Aluno aluno2 = new Aluno(1192057, "Pedro Henrique");
        Disciplina materia2 = new Disciplina();

        materia1.setNome("Sistemas Operacionais");
        materia1.setQuantFalta(0);
        materia1.setNotaContinuada(8.0);
        materia1.setNotaSemestral(9.5);
        materia1.calcularMedia();
        materia1.verificarAprovado();

        aluno1.adiciona(materia1);

        materia2.setNome("Análise de Sistemas");
        materia2.setQuantFalta(9);
        materia2.setNotaContinuada(4.5);
        materia2.setNotaSemestral(3.1);
        materia2.calcularMedia();
        materia2.verificarAprovado();

        aluno2.adiciona(materia2);

        System.out.println("---------------------------------------------");
        System.out.println(aluno1.exibirBoletim("Sistemas Operacionais"));
        System.out.println("---------------------------------------------");
        System.out.println(aluno2.exibirBoletim("Análise de Sistemas"));

    }

}
