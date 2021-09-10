/*
3) Faça um programa que leia um conjunto de números (X) e imprima a quantidade de números
pares (QPares) e a quantidade de números ímpares (QImpares) lidos. Admita que o valor 9999 é
utilizado como sentinela para fim de leitura. Obs: Os números informados devem estar entre 0 e
8000 inclusive.
 */

import java.util.Scanner;

public class exe03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0, par = 0, impar = 0;

        System.out.print("Digite um número: ");
        num = leia.nextInt();
        if (num >= 0 && num <= 8000) {
            while (num != 9999) {
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

                System.out.print("Digite um número: ");
                num = leia.nextInt();

            }
        } else {
            System.out.println("valor inválido");
        }

        System.out.println("Quantidade de ímpares: " + impar);
        System.out.println("Quantidade de pares: " + par);
    }
}
