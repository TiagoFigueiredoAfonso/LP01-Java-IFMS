package aula01;

/*
4-Faça um programa que receba três notas e seus respectivos pesos, 
calcule e mostre a média ponderada dessas notas.
 */

import java.util.Scanner;

public class Medpond {

    public static void main(String args[]) {
        int n1, n2, n3, media;
        Scanner leia = new Scanner(System.in);
        System.out.println("Respectivos pesos: 2,4,6");
        System.out.print("Primeira nota: ");
        n1 = leia.nextInt();
        System.out.print("Segunda nota: ");
        n2 = leia.nextInt();
        System.out.print("Terceira nota: ");
        n3 = leia.nextInt();
        media = (n1 * 2 + n2 * 4 + n3 * 6) / 12;
        System.out.println("A média é: " + media);
    }
}
