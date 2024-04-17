package ControleDeReserva;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControleReserva cr = new ControleReserva();
        
        System.out.println("---Controle de Reserva---");
        
        int o = 0;
        
        do{
            System.out.println("\n1. Nova Reserva\n2. Chamar proximo\n3. Lista Reservas\n0. Sair\n");
            o=sc.nextInt();
            
            switch(o){
                
            case 1:
                System.out.println("\nDigite o responsavel:");
                sc.nextLine();
                String res = sc.nextLine();
                
                System.out.println("\nQuantos lugares:");
                int lug = sc.nextInt();
                
                Reserva r = new Reserva(res,lug);
                cr.novaReserva(r);
            break;
            
            case 2:
                cr.proximo();
            break;
            
            case 3:
                cr.lista();
            break;
            }
        }while(o!=0);
    }
}
