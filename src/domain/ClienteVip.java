package domain;

public class ClienteVip extends Cliente{
    public ClienteVip(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public void calculaDesconto() {

    }
}
