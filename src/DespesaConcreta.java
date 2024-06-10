package src;

public class DespesaConcreta extends Despesa {

    public DespesaConcreta(int id, String descricao, double valor, String data) {
        super(id, descricao, valor, data);
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizar despesa: " + this.descricao + ", Valor: " + this.valor + ", Data: " + this.data);
    }
}
