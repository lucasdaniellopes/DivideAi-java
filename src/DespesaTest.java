package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DespesaTest {
    private DespesaConcreta despesaAdicionar;
    private DespesaConcreta despesaVisualizar;
    private DespesaConcreta despesaPaga;

    @BeforeEach
    public void setUp() {
        despesaAdicionar = new DespesaConcreta(1, "Conta de Luz", 450.0, "30/06/2024");
        despesaVisualizar = new DespesaConcreta(2, "Conta de Luz", 450.0, "30/06/2024");
        despesaPaga = new DespesaConcreta(3, "Aluguel", 1000.0, "25/06/2024");
    }

    @Test
    public void testDespesas() {
        System.out.println("Adicionar despesa: " + despesaAdicionar.descricao + ", Valor: " + despesaAdicionar.valor + ", Data: " + despesaAdicionar.data);
        assertEquals(1, despesaAdicionar.id);
        assertEquals("Conta de Luz", despesaAdicionar.descricao);
        assertEquals(450.0, despesaAdicionar.valor);
        assertEquals("30/06/2024", despesaAdicionar.data);

        assertEquals(2, despesaVisualizar.id);
        assertEquals("Conta de Luz", despesaVisualizar.descricao);
        assertEquals(450.0, despesaVisualizar.valor);
        assertEquals("30/06/2024", despesaVisualizar.data);
        despesaVisualizar.visualizar();

        assertEquals(3, despesaPaga.id);
        assertEquals("Aluguel", despesaPaga.descricao);
        assertEquals(1000.0, despesaPaga.valor);
        assertEquals("25/06/2024", despesaPaga.data);
        System.out.println("Despesa paga: " + despesaPaga.descricao + ", Valor: " + despesaPaga.valor + ", Data: " + despesaPaga.data);
    }
}
