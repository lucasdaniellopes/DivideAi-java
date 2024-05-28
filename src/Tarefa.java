package src;

public abstract class Tarefa {
    protected int id;
    protected String descricao;
    protected boolean concluida;
    protected int prioridade;

    public Tarefa(int id, String descricao, int prioridade) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = prioridade;
    }

    public abstract void concluir();
    public abstract void visualizar();
}
