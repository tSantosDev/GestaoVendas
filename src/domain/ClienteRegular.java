package domain;

public class ClienteRegular extends Cliente {
    public static final double CASHBACK = 0.04;

    public ClienteRegular(String nome, String tipoCliente) {
        super(nome, tipoCliente);
    }

    @Override
    public void calculaDesconto() {

    }
}
