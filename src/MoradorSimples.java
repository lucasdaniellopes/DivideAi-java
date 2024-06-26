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
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefas.remove(tarefa);
                return;
            }
        }
        System.out.println("Tarefa com ID " + id + " não encontrada.");
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

}
