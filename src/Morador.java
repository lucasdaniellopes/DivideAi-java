package src;

public abstract class Morador implements Notificavel, TarefaManager, DespesaManager {
    protected String nome;

    public Morador(String nome) {
        this.nome = nome;
    }
    public Morador(){
    }

    public String getNome() {
        return nome;
    }

    public abstract void adicionarTarefa(Tarefa tarefa);
    public abstract void removerTarefa(int id);
    public abstract void marcarTarefaComoConcluida(int id);
    public abstract void visualizarTarefas();

    public abstract void registrarDespesa(Despesa despesa);
    public abstract void removerDespesa(int id);
    public abstract void visualizarDespesas();

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + " recebeu notificação: " + mensagem);
    }
}

