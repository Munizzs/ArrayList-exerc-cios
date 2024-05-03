package Busca;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Linear {
    
    public static void Execao(int vet[], int num) throws Exception {
        int cont = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != num) {
                cont++;
            }
        }

        if (cont == vet.length) {
            throw new Exception("Numero informado inexistente no array.");
        }
    }
    
    public static int Buscar(int vet[],int num) throws Exception
    {
        Execao(vet, num);
        
        int i = 0;
            while(num != vet[i])
            {
               i++; 
            }              
        return i;
    }       
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Quantas posições você deseja:");
        int tamanhoArray = sc.nextInt();
        
        int buscar[] = new int [tamanhoArray];
        
        for(int i = 0;i<buscar.length;i++)
        {
            buscar[i] = rand.nextInt(0,50);
        }
        
        System.out.println("\nDigite o numero que voce deseja pegar a posição:");
        int numero = sc.nextInt();      
        
        int posicao = Buscar(buscar,numero);
        
        int contador=0;
        
        for(int s : buscar){           
            System.out.println(contador+"- "+s);
            contador++;
        }
        
        System.out.printf("\nO numero %d esta na posição %d\n",contador,posicao);
        }
        
    }

