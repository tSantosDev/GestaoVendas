package domain;

public class ClienteVip extends Cliente{
    public static final double CASHBACK = 0.07;

    public ClienteVip(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public void calculaDesconto() {

    }
}
