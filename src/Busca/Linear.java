package Busca;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Linear {
    public static int Buscar(int vet[],int num)
    {
        int i = 0;
            while(num != vet[i])
            {
               i++; 
            }              
        return i;
    }       
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Quantas posições você deseja:");
        int tam = sc.nextInt();
        
        int buscar[] = new int [tam];
        
        for(int i = 0;i<buscar.length;i++)
        {
            buscar[i] = rand.nextInt(0,50);
        }
        
        System.out.println("\nDigite o numero que voce deseja pegar a posição:");
        int x = sc.nextInt();      
        
        int i = Buscar(buscar,x);
        
        int g=0;
        
        for(int s : buscar){
            
            System.out.println(g+"- "+s);
            g++;
        }
        
        System.out.printf("\nO numero %d esta na posição %d\n",x,i);
        }
        
    }

