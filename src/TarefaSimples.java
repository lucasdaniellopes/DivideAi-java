package src;

public class TarefaSimples extends Tarefa{
    public TarefaSimples(int id, String descricao, int prioridade) {
        super(id, descricao, prioridade);
    }

    @Override
    public void concluir() {
        this.concluida = true;
    }

    @Override
    public void visualizar() {
        System.out.println("Tarefa: " + descricao + " | Prioridade: " + prioridade + " | Concluída: " + concluida);
    }
}


