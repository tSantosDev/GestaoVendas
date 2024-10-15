package domain;

public class Cartao extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento efetuado no cartão");
    }
}
