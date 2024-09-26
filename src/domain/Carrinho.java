package domain;

public class Carrinho {
    private Produto produto;
    private Cliente cliente;
    private int quantidadeProdutoCompra;

    public Carrinho(Produto produto, Cliente cliente, int quantidadeProdutoCompra) {
        this.produto = produto;
        this.cliente = cliente;
        this.quantidadeProdutoCompra = quantidadeProdutoCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidadeProdutoCompra() {
        return quantidadeProdutoCompra;
    }

    public void setQuantidadeProdutoCompra(int quantidadeProdutoCompra) {
        this.quantidadeProdutoCompra = quantidadeProdutoCompra;
    }
}
