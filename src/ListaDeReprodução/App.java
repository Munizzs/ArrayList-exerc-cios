package ListaDeReprodução;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws IOException {
        ListaReproducao l = new ListaReproducao();
        Scanner sc = new Scanner(System.in);      
        Musica mm = new Musica();
        String ur = null;
        System.out.println("------Lista de Reprodução\n");
        
        int o =0;
        
        do{
                System.out.println("\n1. Adicionar Música\n2. Tocar Proxima\n3. Listar Musicas\n0. Sair\n"); 
                o=sc.nextInt();
                
                switch(o){
                    case 1:
                        System.out.println("\nQual o nome da musica:");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        
                        System.out.println("\nQual o nome do artista:");
                        String art = sc.nextLine();
                        
                        System.out.println("\nQual a URL:");
                         ur = sc.nextLine();
                        
                        Musica m = new Musica(nome,art,ur);
                        l.adicionar(m);
                        break;
                        
                    case 2:
                        l.tocarProxima();
                        
                            //String code = mm.codYutube;
                            String url = "https://www.youtube.com/watch?v="+ur ;
                            
                            Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:" + url);
                        break;
                        
                    case 3:
                        l.exibirLista();
                        break;
                }
        }while(o!=0);
    }
}
