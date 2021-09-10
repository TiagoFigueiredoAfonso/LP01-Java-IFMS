/*
1) Faça um programa que leia um conjunto de números (X) e imprima sua soma(Soma) e sua média
(Media). Admita que o valor 9999 é utilizado como sentinela para fim de leitura. O valor usado como
 sentinela não deve fazer parte dos cálculos. ( Aula 5 - Videoaula WHILE 2)
Ex.: 1, 2, 3, 4 => Soma=10 Media=2,5
 */

import java.util.Scanner;

public class exe01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double num = 0, soma = 0, med = 0, ac = 0;
        int cont = 1;

        System.out.println(cont + "º valor: ");
        num = leia.nextDouble();

        while (num != 9999) {
            ac = ac + num;
            med = ac / cont;
            cont++;
            System.out.print(cont + "º valor: ");
            num = leia.nextDouble();

        }

        System.out.println("Soma total: " + ac);
        System.out.println("Média: " + med);
    }
}
