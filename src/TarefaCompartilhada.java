package src;

import java.util.ArrayList;

public class TarefaCompartilhada extends Tarefa{
    private ArrayList<String> membros;

    public TarefaCompartilhada(int id, String descricao, int prioridade) {
        super(id, descricao, prioridade);
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(String membro) {
        membros.add(membro);
    }

    @Override
    public void concluir() {
        this.concluida = true;
    }

    @Override
    public void visualizar() {
        System.out.println("Tarefa Compartilhada: " + descricao + " | Prioridade: " + prioridade + " | Concluída: " + concluida);
        System.out.println("Membros: " + String.join(", ", membros));
    }
}
