package src;

import java.util.ArrayList;

public class MoradorSimples extends Morador {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Despesa> despesas;

    public MoradorSimples(String nome) {
        super(nome);
        this.tarefas = new ArrayList<>();
        this.despesas = new ArrayList<>();
    }




    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public void removerTarefa(int id) {
        tarefas.removeIf(tarefa -> tarefa.id == id);
    }

    @Override
    public void atualizarTarefa(int id, Tarefa tarefaAtualizada) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).id == id) {
                tarefas.set(i, tarefaAtualizada);
                break;
            }
        }
    }

    @Override
    public void marcarTarefaComoConcluida(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.id == id) {
                tarefa.concluir();
                break;
            }
        }
    }

    @Override
    public void visualizarTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.visualizar();
        }
    }

    @Override
    public void registrarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    @Override
    public void removerDespesa(int id) {
        despesas.removeIf(despesa -> despesa.id == id);
    }

    @Override
    public void visualizarDespesas() {
        for (Despesa despesa : despesas) {
            despesa.visualizar();
        }
    }

    @Override
    public void gerarRelatorioTarefas() {
        System.out.println("Relatório de Tarefas:");
        for (Tarefa tarefa : tarefas) {
            tarefa.visualizar();
        }
    }

    @Override
    public void gerarRelatorioDespesas() {
        System.out.println("Relatório de Despesas:");
        for (Despesa despesa : despesas) {
            despesa.visualizar();
        }
    }
}

