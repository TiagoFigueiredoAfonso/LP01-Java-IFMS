/*
1. Faça um programa que inicialize com zero um vetor de tamanho 10 e imprima na tela.
 */

public class ex01 {

    public static void main(String[] args) {

        int vet[] = new int[10];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
            System.out.print("|" + vet[i] + "| ");
        }
        System.out.println();
    }
}
