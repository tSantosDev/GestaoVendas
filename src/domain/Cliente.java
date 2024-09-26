package domain;

public abstract class Cliente {
    private String nome;
    private Cliente cliente;

    public Cliente(String nome, Cliente cliente) {
        this.nome = nome;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void calculaDesconto();
}
