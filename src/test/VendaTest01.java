package test;

import domain.*;
import service.RelatorioVenda;

public class VendaTest01 {
    public static void main(String[] args) {
        Cliente cliente = new ClienteVip("Giovanna");
        Produto produto = new Produto("Iphone 15", 6500, 1);
        Pagamento pagamento = new Pix();
        Venda venda = new Venda(cliente, produto, pagamento, 1);
        if (venda.getProduto() == null || venda.getQuantidadeProduto() <= 0) return;
        RelatorioVenda relatorioVenda = new RelatorioVenda(venda);
        venda.finalizarVenda();
        System.out.println("----------------------");
        relatorioVenda.imprimirRelatorioVenda();
    }
}
