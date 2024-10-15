package test;

import domain.*;
import service.RelatorioVenda;

public class VendaTest01 {
    public static void main(String[] args) {
        Cliente cliente = new ClienteVip("Giovanna");
        Produto produto = new Produto("Iphone 15", 6500, 5);
        Pagamento pagamento = new Pix();
        Venda venda = new Venda(cliente, produto, pagamento, 2);

        if (venda.getProduto() == null || venda.getQuantidadeProduto() <= 0) {
            throw new RuntimeException("Nenhum produto adicionado ou quantidade do produto a ser comprado é inválida");
        }
        if (venda.getProduto().getEstoque() < venda.getQuantidadeProduto()) {
            throw new RuntimeException("Estoque do produto é menor que a quantidade que deseja comprar");
        }

        RelatorioVenda relatorioVenda = new RelatorioVenda(venda);
        venda.finalizarVenda();
        System.out.println("----------------------");
        relatorioVenda.imprimirRelatorioVenda();
    }
}
