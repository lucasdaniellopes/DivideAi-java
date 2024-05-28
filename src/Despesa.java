package src;

public abstract class Despesa {
    protected int id;
    protected String descricao;
    protected double valor;
    protected String data;

    public Despesa(int id, String descricao, double valor, String data) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public abstract void visualizar();
}
