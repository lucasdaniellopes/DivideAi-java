package src;

public interface TarefaManager {
   void adicionarTarefa(Tarefa tarefa);

   void removerTarefa(int id);

   void marcarTarefaComoConcluida(int id);

   void visualizarTarefas();
}