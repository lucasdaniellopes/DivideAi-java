package src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdmTeste {
    private AdmResidencia admResidencia;

    @BeforeEach
    public void setUp() {
        admResidencia = new AdmResidencia("Admin");
    }

    @Test
    public void testAdmResidencia() {
        // Adicionar morador
        Morador morador1 = new MoradorSimples("Mikael");
        admResidencia.adicionarMorador(morador1);
        System.out.println("Adicionar morador: " + morador1.nome);

        // Adicionar outro morador para depois simular a remoção
        Morador morador2 = new MoradorSimples("Nuno");
        admResidencia.adicionarMorador(morador2);

        // Remover morador
        admResidencia.getMoradores().remove(morador2);
        System.out.println("Remover morador: " + morador2.nome);

        // Notificar moradores
        admResidencia.adicionarTarefa(new TarefaConcreta(1, "Nova tarefa"));
        System.out.println("Notificar moradores: Moradores notificados");
    }
}
