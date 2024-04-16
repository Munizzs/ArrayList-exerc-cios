package GerenciadorDeTarefas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorTarefas gf = new GerenciadorTarefas();
        int posicao = 0;
        
        System.out.println("---Gerenciador de Tarefas---\n");
        
        int o = 0;
        
        do{
        
        System.out.println("\nescolha a opção desejada:\n\n1. Nova Tarefa\n2. Listar Tarefas\n3. Remover Tarefas\n4. Alterar Tarefa\n5. Marcar Concluidas\n0. Sair");
        o = sc.nextInt();
        
        switch(o){
            case 1:
                System.out.println("\nDigite o codigo da nova tarefa:");
                sc.nextLine();
                String codigo = sc.nextLine();             
                
                System.out.println("\nDigite a descrição:");
                String descricao=sc.nextLine();              
                
                boolean concluido = false;
                
                Tarefa t = new Tarefa(codigo,descricao,concluido);   
                
                gf.novaTarefa(t);
                
            break;
            
            case 2:
                gf.lista();
            break; 
            
            case 3:
                System.out.println("\nDigite a posição:");
                posicao = sc.nextInt();
                
                gf.remover(posicao);
            break;
            
            case 4:
                System.out.println("\nDigite a posição:");
                posicao = sc.nextInt();
                
                System.out.println("\nDigite o codigo da nova tarefa:");
                sc.nextLine();
                String nCodigo = sc.nextLine();               
                
                System.out.println("\nDigite a descrição:");
                String nDescricao=sc.nextLine();
                
                gf.alterar(posicao, nCodigo, nDescricao);
            break;
            
            case 5:
                System.out.println("\nDigite a posição:");
                posicao = sc.nextInt();
                
                gf.concluir(posicao);
            break;
        }
        
        }while(o!=0);
    }
}
