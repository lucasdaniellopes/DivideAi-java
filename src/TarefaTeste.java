package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TarefaTeste {

    @Test
    public void testConstrutorTarefaCompleto() {
        String nome = "Tarefa 1";
        int id = 1;

        Tarefa tarefa = new Tarefa(id, nome) {
            @Override
            public void concluir() {
                setConcluida(true);
            }

            @Override
            public void visualizar() {
                System.out.println("ID: " + getId());
                System.out.println("Nome: " + getNome());
                System.out.println("Concluída: " + getConcluida());
            }
        };

        assertEquals(nome, tarefa.getNome());
        assertEquals(id, tarefa.getId());
        assertFalse(tarefa.getConcluida());
    }

    @Test
    public void testConstrutorTarefaSimples() {
        String nome = "Tarefa Simples";

        Tarefa tarefa = new Tarefa(0, nome) {
            @Override
            public void concluir() {
                setConcluida(true);
            }

            @Override
            public void visualizar() {
                System.out.println("Nome: " + getNome());
                System.out.println("Concluída: " + getConcluida());
            }
        };

        assertEquals(nome, tarefa.getNome());
    }

    @Test
    public void testConcluirTarefa() {
        String nome = "Tarefa a Concluir";

        Tarefa tarefa = new Tarefa(0, nome) {
            @Override
            public void concluir() {
                setConcluida(true);
            }

            @Override
            public void visualizar() {
                System.out.println("Nome: " + getNome());
                System.out.println("Concluída: " + getConcluida());
            }
        };

        assertFalse(tarefa.getConcluida());
        tarefa.concluir();
        assertTrue(tarefa.getConcluida());
    }

    @Test
    public void testVisualizarTarefa() {
        String nome = "Tarefa Visualizar";
        int id = 1;

        Tarefa tarefa = new Tarefa(id, nome) {
            @Override
            public void concluir() {
                setConcluida(true);
            }

            @Override
            public void visualizar() {
                System.out.println("ID: " + getId());
                System.out.println("Nome: " + getNome());
                System.out.println("Concluída: " + getConcluida());
            }
        };

        // Redireciona a saída do System.out para um ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        tarefa.visualizar();

        // Restaura o System.out original
        System.setOut(originalOut);

        String expectedOutput = """
                ID: 1
                Nome: Tarefa Visualizar
                Concluída: false
                """;

    }
}
