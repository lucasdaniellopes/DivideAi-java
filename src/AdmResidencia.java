package src;

import java.util.ArrayList;

// Classe AdmResidencia
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
        this.moradores.add(morador);
    }

    @Override
    public void adicionarTarefa(Tarefa tarefa) {
       this.tarefasCompartilhadas.add(tarefa);
        notificarMembros("Nova tarefa compartilhada: " + tarefa.nome);
    }

    private void notificarMembros(String mensagem) {
        for (Morador morador : moradores) {
            morador.notificar(mensagem);
        }
    }

    @Override
    public void removerTarefa(int id) {
        for (Tarefa tarefa : tarefasCompartilhadas) {
            if (tarefa.getId() == id) {
                tarefasCompartilhadas.remove(tarefa);
                return;
            }
        }
        System.out.println("Tarefa com ID " + id + " não encontrada.");
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
        for (Tarefa tarefa : tarefasCompartilhadas) {
            tarefa.visualizar();
        }
    }

    @Override
    public void registrarDespesa(Despesa despesa) {
        despesasCompartilhadas.add(despesa);
        notificarMembros("Nova despesa compartilhada: " + despesa.descricao);
    }

    @Override
    public void removerDespesa(int id) {
        despesasCompartilhadas.removeIf(despesa -> despesa.id == id);
    }

    @Override
    public void visualizarDespesas() {
        for (Despesa despesa : despesasCompartilhadas) {
            despesa.visualizar();
        }
    }

    public ArrayList<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(ArrayList<Morador> moradores) {
        this.moradores = moradores;
    }

    public ArrayList<Tarefa> getTarefasCompartilhadas() {
        return tarefasCompartilhadas;
    }

    public void setTarefasCompartilhadas(ArrayList<Tarefa> tarefasCompartilhadas) {
        this.tarefasCompartilhadas = tarefasCompartilhadas;
    }

    public ArrayList<Despesa> getDespesasCompartilhadas() {
        return despesasCompartilhadas;
    }

    public void setDespesasCompartilhadas(ArrayList<Despesa> despesasCompartilhadas) {
        this.despesasCompartilhadas = despesasCompartilhadas;
    }
}
