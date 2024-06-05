package ReservaRestaurante;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoReserva {
    private List<Reserva>ListaReserva = new ArrayList<>();
    
    public void Adicionar(Reserva reserva){
        ListaReserva.add(reserva);
    }
    
    public void Listar(){
        int cont = 1;
        if(ListaReserva.isEmpty()){
            System.out.println("\nNenhuma Reserva.");
        }else{     
            for(Reserva show : ListaReserva){            
                System.out.printf("\n%d - Mesa #%d\nResponsavel: %s\nQuantidade: %d\n",cont,show.NumeroMesa,show.NomeResponsavel,show.QuantidadePessoas);
                cont++;
            }        
        }
    }
    
    public void Alterar(int posicao,Reserva reserva){
        if(ListaReserva.isEmpty()){
            System.out.println("\nNão é possivel alterar reserva vazia.");
        }else{
            ListaReserva.set(posicao-1, reserva);
        }
    }
    
    public void Remover(int posicao){
        if(ListaReserva.isEmpty()){
            System.out.println("\nNão é possivel remover reserva vazia.");
        }else{
            ListaReserva.remove(posicao-1);
        }
    }
}
