package domain;

public class ClienteRegular extends Cliente {
    public static final double PORCENTAGEM_DESCONTO = 0.06;

    public ClienteRegular(String nome) {
        super(nome);
    }

    @Override
    public double calculaDesconto(Produto produto) {
        return produto.getPreco() - (produto.getPreco()*PORCENTAGEM_DESCONTO);
    }
}
