package ListaDeCompra;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GerenciadorLista gl = new GerenciadorLista();
        int quantidade = 0;
        double preco = 0;
    
        System.out.println("-----------------Lista de Compras-----------------");
        
        int opcao = 0;
        
        do{
            System.out.println("\n1. Adcionar\n2. Listar\n3. Alterar\n4. Remover\n0. Sair");
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1 -> {
                    System.out.println("\nDigite o nome do produto:");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("\nDigite a quantidade(unidade):");
                    quantidade = sc.nextInt();
                    System.out.println("\nDigite o preço:");
                    preco = sc.nextDouble();
                    
                    Lista l = new Lista(nome,quantidade,preco);
                    
                    gl.Adicionar(l);
                }
                case 2 -> gl.Listar(quantidade,preco);
                case 3 -> {
                    System.out.println("\nDigite a posição:");
                    int posicaoAlterar = sc.nextInt();
                    System.out.println("\nDigite o nome do produto:");
                    sc.nextLine();
                    String nomeAlterar = sc.nextLine();
                    System.out.println("\nDigite a quantidade(unidade):");
                    int quantidadeAlterar = sc.nextInt();
                    System.out.println("\nDigite o preço:");
                    double precoAlterar = sc.nextDouble();
                    
                    Lista l2 = new Lista(nomeAlterar,quantidadeAlterar,precoAlterar);
                                                          
                    gl.Alterar(posicaoAlterar, l2);
                }
                case 4 -> {
                    System.out.println("\nDigite a posição:");
                    int posicaoRemover = sc.nextInt();
                    
                    gl.Remover(posicaoRemover);
                } 
            }
            
        }while(opcao != 0);
    }
}
