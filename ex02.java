/*
2. Faça um programa que leia um vetor de tamanho 10 e mostre na tela, o conteúdo de cada
posição do vetor.
 */

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vet[] = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + "º Valor: ");
            vet[i] = leia.nextInt();
        }
        System.out.println("-------------------");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Índice " + i + "º ,valor: " + vet[i]);
        }
    }
}
