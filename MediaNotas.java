package aula01;

/*
Faça um programa que leia três notas, calcule e mostre a média 
aritmética entre elas.
 */

import java.util.Scanner;

public class MediaNotas {

    public static void main(String args[]) {
        int nota1, nota2, nota3, media;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3 = leia.nextInt();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média final é: " + media);
    }
}
