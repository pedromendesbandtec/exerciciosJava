package L08E3Boletim;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Integer ra;
    private String nome;
    private List<Disciplina> listaDisciplinas;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        listaDisciplinas = new ArrayList<>();
    }

    public String exibirBoletim(String nomeDisciplina) {
        for (Integer i = 0; i < listaDisciplinas.size(); i++) {
            
            Disciplina materiaSelecionada = (Disciplina) listaDisciplinas.get(i);
            
            if (materiaSelecionada.getNome().equals(nomeDisciplina)) {
                
                String mensagem;
                mensagem = "Nome da disciplina: " + materiaSelecionada.getNome()+"\nNota continuada: " + materiaSelecionada.getNotaContinuada()
                        + "\nNota integrada: " + materiaSelecionada.getNotaSemestral() +"\nQuantidade de faltas: " + materiaSelecionada.getQuantFalta()
                        + "\nMedia final: " + materiaSelecionada.getMedia() + "\nSituação: " + materiaSelecionada.getAprovado();
                return mensagem;
            }
        }
         return "Disciplina não encontrada";
    }

    public void adiciona(Disciplina nomeDisciplina) {
        this.listaDisciplinas.add(nomeDisciplina);
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", listaDisciplinas=" + listaDisciplinas + '}';
    }
}
