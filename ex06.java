
/*
6. Faça um programa que leia dois vetores de tamanho 6 e que tenha como saída um terceiro vetor
de tamanho 12 formado da intercalação dos valores dos dois vetores iniciais.
 */
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vet1[] = new int[6];
        int vet2[] = new int[6];
        int vet3[] = new int[12];

        System.out.println("Primeiro Vetor: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print((i + 1) + "º valor: ");
            vet1[i] = leia.nextInt();

        }
        System.out.println("Segundo Vetor: ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print((i + 1) + "º valor: ");
            vet2[i] = leia.nextInt();

        }
        int p = 0;
        for (int i = 0; i < vet1.length; i++) {
            vet3[p] = vet1[i];
            p = p + 2;
        }
        int q = 1;
        for (int i = 0; i < vet2.length; i++) {
            vet3[q] = vet2[i];
            q = q + 2;
        }
        System.out.print("Vetor Intercalado: ");
        for (int i = 0; i < vet3.length; i++) {
            System.out.print("|" + vet3[i] + "|");
        }
        System.out.println("");
    }
}
