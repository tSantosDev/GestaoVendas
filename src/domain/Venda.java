package domain;

public class Venda {
    private Cliente cliente;
    private Produto produto;
    private Pagamento pagamento;

    public Venda(Cliente cliente, Produto produto, Pagamento pagamento) {
        this.cliente = cliente;
        this.produto = produto;
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
