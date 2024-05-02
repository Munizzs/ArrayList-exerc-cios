package Busca;

import java.util.Random;
import java.util.Scanner;

public class Binaria {

    public static int[] ordem(int vet[], int tam) {
        Random rand = new Random();

//        vet[0] = 7;
//        vet[1] = 5;
//        vet[2] = 1;
//        vet[3] = 9;
//        vet[4] = 3;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(0, 50);
        }

        for (int i = 0; i < vet.length; i++) {
            //int min = i;
            for (int j = i + 1; j < vet.length; j++) {              
                if (vet[i] > vet[j]) {
                    int temp = vet[j];
                    vet[j] = vet[i];
                    vet[i] = temp;
                } 
            }
        }
        return vet;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas posições você deseja:");
        int tamanhoArray = sc.nextInt();

        int buscar[]=new int[tamanhoArray];

//        System.out.println("\nDigite o numero que voce deseja pegar a posição:");
//        int numero = sc.nextInt();

        int vet[] = ordem(buscar, tamanhoArray);

        int contador = 0;

        for (int s : vet) {
            System.out.println(contador + "- " + s);
            contador++;
        }
    }
}
