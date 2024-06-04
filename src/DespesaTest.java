package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DespesaTest {

    @Test
    public void testConstrutorDespesa() {
        int id = 1;
        String descricao = "Aluguel";
        double valor = 1000.0;
        String data = "2024-06-04";
        Despesa despesa = new Despesa(id, descricao, valor, data) {
            @Override
            public void visualizar() {
                System.out.println("ID: " + id);
                System.out.println("Descrição: " + descricao);
                System.out.println("Valor: R$ " + valor);
                System.out.println("Data: " + data);
            }
        };

        assertEquals(id, despesa.id);
        assertEquals(descricao, despesa.descricao);
        assertEquals(valor, despesa.valor, 0.01);
        assertEquals(data, despesa.data);
    }
}
