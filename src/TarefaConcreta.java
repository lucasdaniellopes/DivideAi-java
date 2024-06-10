package src;

public class TarefaConcreta extends Tarefa {

    public TarefaConcreta(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void concluir() {
        this.concluida = true;
        System.out.println("Tarefa concluída: " + this.nome);
    }

    @Override
    public void visualizar() {
        System.out.println("remover tarefa: " + this.nome);
    }
}
