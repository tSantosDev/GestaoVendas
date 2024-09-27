package domain;

public class ClienteVip extends Cliente{
    public static final double CASHBACK = 0.07;
    public static final double PORCENTAGEM_DESCONTO = 0.1;

    public ClienteVip(String nome) {
        super(nome);
    }

    @Override
    public double calculaDesconto(Produto produto) {
        return produto.getPreco() - (produto.getPreco()*PORCENTAGEM_DESCONTO);
    }
}
