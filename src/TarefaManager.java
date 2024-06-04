package src;

public interface TarefaManager {
   void adicionarTarefa(Tarefa tarefa);

   void removerTarefa(int id);

   void atualizarTarefa(int id, Tarefa tarefaAtualizada);

   void marcarTarefaComoConcluida(int id);

   void visualizarTarefas();
}