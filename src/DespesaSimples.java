package src;

public class DespesaSimples extends Despesa{
    public DespesaSimples(int id, String descricao, double valor, String data) {
        super(id, descricao, valor, data);
    }

    @Override
    public void visualizar() {
        System.out.println("Despesa: " + descricao + " | Valor: " + valor + " | Data: " + data);
    }
}
