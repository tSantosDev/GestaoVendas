package service;

import domain.Venda;

public class RelatorioVenda {
    private static Venda venda;

    public RelatorioVenda(Venda venda) {
        RelatorioVenda.venda = venda;
    }

    public void imprimirRelatorioVenda() {
        System.out.println("Relatório de venda: ");
        System.out.println("Nome do cliente: " + venda.getCliente().getNome());
        System.out.println("Produto: " + venda.getProduto().getNome());
        System.out.println("Preço unitário: " + venda.getProduto().getPreco());
        System.out.println("Quantidade de produto comprado: " + venda.getQuantidadeProduto());
        System.out.println("Estoque atualizado: " + venda.getProduto().getEstoque());
    }
}
