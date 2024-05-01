package ControleDeReserva;

import java.util.ArrayDeque;
import java.util.Queue;

public class ControleReserva {
    private Queue <Reserva> reservas = new ArrayDeque<>();
    
    public void novaReserva(Reserva reserva){
        reservas.offer(reserva);
    }
    
    public void lista(){
        if(reservas.isEmpty()){
                System.out.println("\nSem reservas");
            }else{
        for(Reserva show: reservas){           
                System.out.printf("\n|%s - %d lugares|\n",show.responsavel,show.lugares);
            }
        }
    }
    
    
    public Reserva proximo(){
        Reserva r = reservas.poll();
        
        return r;
    }
}
