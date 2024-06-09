package src;

public abstract class Tarefa {
    protected int id;
    protected String nome;
    protected boolean concluida;

    public Tarefa(int id, String nome) {
        this.id = id;
        this.concluida = false;
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

    public boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
