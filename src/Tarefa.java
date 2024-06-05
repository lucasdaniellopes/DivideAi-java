package src;

public abstract class Tarefa {
    protected int id;
    protected String nome;
    protected boolean concluida;
    protected int prioridade;

    public Tarefa(String nome, int id, String descricao, int prioridade) {
        this.id = id;
        this.concluida = false;
        this.prioridade = prioridade;
        this.nome = nome;
    }
    public Tarefa(String nome){
        this.nome = nome;
    }
    public abstract void concluir();
    public abstract void visualizar();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
