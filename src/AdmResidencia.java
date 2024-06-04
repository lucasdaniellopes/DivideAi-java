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
        tarefasCompartilhadas.add(tarefa);
        notificarMembros("Nova tarefa compartilhada: " + tarefa.nome);
    }

    private void notificarMembros(String mensagem) {
        for (Morador morador : moradores) {
            morador.notificar(mensagem);
        }
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

    @Override
    public void gerarRelatorioTarefas() {
        System.out.println("Relatório de Tarefas Compartilhadas:");
        for (Tarefa tarefa : tarefasCompartilhadas) {
            tarefa.visualizar();
        }
    }

    @Override
    public void gerarRelatorioDespesas() {
        System.out.println("Relatório de Despesas Compartilhadas:");
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
