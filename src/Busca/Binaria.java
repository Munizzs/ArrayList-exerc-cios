package Busca;

import java.util.Random;
import java.util.Scanner;

public class Binaria {
    
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

    public static int[] Ordem(int vet[]) {
        Random rand = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(0, 50);
        }

        for (int i = 0; i < vet.length; i++) {
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

    public static int Buscar(int vet[], int num) throws Exception {

        int busca[] = Ordem(vet);
        
        Execao(vet, num);

        int ini = 0;
        int fim = busca.length;
        int op = 0;

        while (busca[op] != num) {

            op = (ini + fim) / 2;

            if (busca[op] != num) {
                if (busca[op] > num) {
                    fim = op;
                } else {
                    ini = op;
                }
            }
        }
        return op;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas posições você deseja:");
        int tamanhoArray = sc.nextInt();

        int buscar[] = new int[tamanhoArray];

        System.out.println("\nDigite o numero que voce deseja pegar a posição:");
        int numero = sc.nextInt();

        int x = Buscar(buscar, numero);

        System.out.printf("\nO numero %d esta na posição %d\n", numero, x);
    }
}
