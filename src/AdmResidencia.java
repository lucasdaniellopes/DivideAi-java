package src;

import java.util.ArrayList;

public class AdmResidencia extends Morador {
    private ArrayList<Morador> moradores;
    private ArrayList<Tarefa> tarefasCompartilhadas;
    private ArrayList<Despesa> despesasCompartilhadas;

    public AdmResidencia(String nome) {
        super(nome);
        this.moradores = new ArrayList<>();
        this.tarefasCompartilhadas = new ArrayList<>();
        this.despesasCompartilhadas = new ArrayList<>();
    }


    public void adicionarMorador(Morador morador) {
        moradores.add(morador);
    }

    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        tarefasCompartilhadas.add(tarefa);
        notificarMembros("Nova tarefa compartilhada: " + tarefa.descricao);
    }

    private void notificarMembros(String s) {
    }

    @Override
    public void removerTarefa(int id) {
        tarefasCompartilhadas.removeIf(tarefa -> tarefa.id == id);
    }

    @Override
    public void atualizarTarefa(int id, Tarefa tarefaAtualizada) {
        for (int i = 0; i < tarefasCompartilhadas.size(); i++) {
            if (tarefasCompartilhadas.get(i).id == id) {
                tarefasCompartilhadas.set(i, tarefaAtualizada);
                break;
            }
        }
    }

    @Override
    public void marcarTarefaComoConcluida(int id) {
        for (Tarefa tarefa : tarefasCompartilhadas) {
            if (tarefa.id == id) {
                tarefa.concluir();
                break;
            }
        }
    }

    @Override
    public void visualizarTarefas() {

    }

    @Override
    public void registrarDespesa(Despesa despesa) {

    }

    @Override
    public void removerDespesa(int id) {

    }

    @Override
    public void visualizarDespesas() {

    }
}
