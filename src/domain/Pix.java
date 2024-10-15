package domain;

public class Pix extends Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento efetuado no PIX");
    }
}
