package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TarefaTeste {
    private TarefaConcreta tarefaAdicionar;
    private TarefaConcreta tarefaVisualizar;
    private TarefaConcreta tarefaConcluir;

    @BeforeEach
    public void setUp() {
        tarefaAdicionar = new TarefaConcreta(1, "Lavar roupa");
        tarefaVisualizar = new TarefaConcreta(2, "Lavar louça");
        tarefaConcluir = new TarefaConcreta(3, "Almoço");
    }

    @Test
    public void testAdicionarTarefa() {
        assertEquals(1, tarefaAdicionar.getId());
        assertEquals("Lavar roupa", tarefaAdicionar.getNome());
        assertFalse(tarefaAdicionar.getConcluida());
        System.out.println("Adicionar tarefa: " + tarefaAdicionar.getNome());
    }

    @Test
    public void testVisualizarTarefa() {
        System.out.println("Visualizar tarefa: " + tarefaVisualizar.getNome());
        tarefaVisualizar.visualizar();
    }

    @Test
    public void testConcluirTarefa() {
        tarefaConcluir.concluir();
        assertTrue(tarefaConcluir.getConcluida());
    }
}
