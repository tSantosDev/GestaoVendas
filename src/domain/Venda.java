package domain;

public class Venda {
    private Cliente cliente;
    private Produto produto;
    private ProcessaPagamento processaPagamento;
    private int quantidadeProdutoComprado;

    public Venda(Cliente cliente, Produto produto, ProcessaPagamento processaPagamento, int quantidadeProdutoComprado) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidadeProdutoComprado = quantidadeProdutoComprado;
        this.processaPagamento = processaPagamento;
    }

    public void finalizarVenda() {
        double valorTotal = calcularTotalVenda();
        System.out.println("O valor total da compra é de: " + valorTotal);
        this.processaPagamento.processarPagamento();
        atualizandoEstoque();
    }

    private void atualizandoEstoque() {
        int estoqueAtualizado = this.produto.getEstoque() - this.quantidadeProdutoComprado;
        this.produto.setEstoque(estoqueAtualizado);
    }

    private double calcularTotalVenda() {
        return this.produto.getPreco() * this.quantidadeProdutoComprado;
    }

    public int getQuantidadeProduto() {
        return this.quantidadeProdutoComprado;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProdutoComprado = quantidadeProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ProcessaPagamento getPagamento() {
        return processaPagamento;
    }

    public void setPagamento(ProcessaPagamento processaPagamento) {
        this.processaPagamento = processaPagamento;
    }
}
