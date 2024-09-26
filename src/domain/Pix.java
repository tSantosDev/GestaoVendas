package domain;

public class Pix implements Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento efetuado no PIX");
    }
}
