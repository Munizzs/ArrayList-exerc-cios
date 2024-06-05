package ReservaRestaurante;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciamentoReserva gr = new GerenciamentoReserva();
        
        System.out.println("----------------Reserva----------------");
        
        int opcao = 0;
        
        do{
        
        System.out.println("\n1. Adicionar\n2. Lista\n3. Alterar\n4. Remover\n0. Sair\n");
        opcao = sc.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Digite o numero da mesa:");
                int numMesa = sc.nextInt();
                System.out.println("Digite o nome do responsavel:");
                sc.nextLine();
                String responsavel = sc.nextLine();
                System.out.println("Digite a quantidade de pessoas:");
                int qtdPessoa = sc.nextInt();
                
                Reserva r = new Reserva(numMesa,responsavel,qtdPessoa);
                
                gr.Adicionar(r);
            break;  
            case 2:
                gr.Listar();
            break; 
            case 3:
                System.out.println("Digite a posição:");
                int posicao = sc.nextInt();
                System.out.println("Digite o numero da mesa:");
                int Mesa = sc.nextInt();
                System.out.println("Digite o nome do responsavel:");
                sc.nextLine();
                String resp = sc.nextLine();
                System.out.println("Digite a quantidade de pessoas:");
                int qtdPes = sc.nextInt();
                
                Reserva r2 = new Reserva(Mesa,resp,qtdPes);
                
                gr.Alterar(posicao, r2);
            break; 
            case 4:
                System.out.println("Digite a posição:");
                int pos = sc.nextInt();
                gr.Remover(pos);
            break; 
        }
        
        }while(opcao != 0);
    }
}
