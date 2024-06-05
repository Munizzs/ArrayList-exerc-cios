package ListaDeCompra;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLista {

    private List<Lista> listaCompra = new ArrayList<>();

    public void Adicionar(Lista lista) {
        listaCompra.add(lista);
    }

    public void Listar(int quantidade, double preco) {
        int cont = 1;
        if (listaCompra.isEmpty()) {
            System.out.println("\nLista Vazia.");
        } else {
            for (Lista l : listaCompra) {
                double precoTotal = l.getPreco()*l.getQuantidade();
                System.out.printf("\n%d - %s | quantidade: %d | R$%.2f | Total: R$%.2f", cont, l.getNome(), l.getQuantidade(), l.getPreco(),precoTotal);
                cont++;
            }
        }
    }

    public void Alterar(int posicao, Lista lista) {
        if (listaCompra.isEmpty()) {
            System.out.println("\nNão é possivel alterar lista vazia.");
        } else {
            listaCompra.set(posicao - 1, lista);
        }
    }

    public void Remover(int posicao) {
        if (listaCompra.isEmpty()) {
            System.out.println("\nNão é possivel remover lista vazia.");
        } else {
            listaCompra.remove(posicao - 1);
        }
    }
}
