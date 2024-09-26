package domain;

public class Cartao implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento efetuado no cartão");
    }
}
