package Busca;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Quantas posi��es voc� deseja:");
        int tamList = sc.nextInt();
        
        ArrayList<Integer> buscar = new ArrayList<>(tamList);
        
        for(int i = 0;i<buscar.size();i++)
        {
            buscar.add(rand.nextInt(1,101));
        }
        
        System.out.println("\nDigite o numero que voce deseja pegar a posi��o:");
        int x = sc.nextInt();
      
   
        for(int i=0;i<buscar.size();i++)
        {

            if(x == buscar.get(i))           
                System.out.printf("\nO numero %d esta na posi��o %d",x,i);
        }
        
        }
        
    }

