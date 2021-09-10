/*
12. Dada uma sequência de 10 números inteiros, faça um programa que leia a sequência,
armazene-a em um vetor e mostre o menor número encontrado no vetor, a posição no vetor em que
o maior número se encontra, mostre o vetor inicial, mostre o vetor ordenado em ordem crescente,
mostre a soma dos números do vetor e desenvolva no final uma função para buscar um número
qualquer dentro do vetor.
 */
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vet[] = {3, 12, 32, 9, 11, 55, 87, 37, 44, 41};
        int i, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, posicao = 0, soma = 0;

        for (i = 0; i < vet.length; i++) {
            System.out.print(" |" + vet[i] + "| ");
            if (vet[i] < menor) {
                menor = vet[i];
            }
            if (vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }
            soma += vet[i];
        }
        int aux;
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        System.out.println("\n--------------------------------");
        System.out.println("Menor valor do vetor: " + menor);
        System.out.println("--------------------------------");
        System.out.println("Posição do maior valor: " + posicao);
        System.out.println("--------------------------------");
        System.out.println("Vetor inicial: " + vet[0]);
        System.out.println("--------------------------------");
        System.out.println("Vetor ordem crescente:");
        System.out.println("");
        for (i = 0; i < 10; i++) {
            System.out.print(" |" + vet[i] + "| ");
        }
        System.out.println("\n--------------------------------");
        System.out.println("Soma dos vetores: " + soma);

        // BUSCANDO UM VALOR NO VETOR
        System.out.println("Pesquise se o valor está no vetor: ");
        int x = leia.nextInt();
        int res = 0;
        
        for (i = 0; i < vet.length; i++) {
            if (x == vet[i]) {
                res = x;
                break;
            }
        }
        if (res == x) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

    }
}
