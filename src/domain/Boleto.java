package domain;

public class Boleto implements Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento efetuado no boleto");
    }
}
