package ListaDeReprodução;

import java.util.Stack;

public class ListaReproducao {
    private Stack<Musica> itens = new Stack<>();
    
    public void adicionar(Musica musica){
        itens.push(musica);
    }
    
    public void tocarProxima(){
        itens.pop();
    }
    
    public void exibirLista(){
        for (Musica show : itens) {
            System.out.printf("\nNome: %s\nArtista: %s\nURL: %s\n\n",show.nome,show.artsta,show.codYutube);
        }
    }
}
