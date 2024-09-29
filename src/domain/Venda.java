package domain;

public class Venda {
    private Cliente cliente;
    private Produto produto;
    private Pagamento pagamento;
    private int quantidadeProdutoComprado;

    public Venda(Cliente cliente, Produto produto, Pagamento pagamento, int quantidadeProdutoComprado) {
        this.cliente = cliente;

        if (produto.getEstoque() < quantidadeProdutoComprado) {
            System.out.println("Estoque do produto " + produto.getNome() + " menor que a quantidade que deseja comprar.");
            return;
        }

        this.produto = produto;

        if (quantidadeProdutoComprado <= 0) {
            System.out.println("Quantidade do produto inválido");
            return;
        }

        this.quantidadeProdutoComprado = quantidadeProdutoComprado;
        this.pagamento = pagamento;
    }

    public void finalizarVenda() {
        double valorTotal = calcularTotalVenda();
        System.out.println("O valor total da compra é de: " + valorTotal);
        this.pagamento.processarPagamento();
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

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
