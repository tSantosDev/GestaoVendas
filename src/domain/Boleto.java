package domain;

public class Boleto extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento efetuado no boleto");
    }
}
