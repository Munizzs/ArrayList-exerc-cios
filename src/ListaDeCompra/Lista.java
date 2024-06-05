package ListaDeCompra;
public class Lista {
    private String nome;
    private int Quantidade;
    private double preco;

    public Lista(String nome, int Quantidade, double preco) {
        this.nome = nome;
        this.Quantidade = Quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public double getPreco() {
        return preco;
    }
    
    
}
