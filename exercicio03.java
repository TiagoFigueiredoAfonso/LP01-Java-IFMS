package aula02;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String args[]) {
        double n1, n2, n3, med;
        Scanner leia = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        n1 = leia.nextInt();
        System.out.print("Segunda nota: ");
        n2 = leia.nextInt();
        System.out.print("Terceira nota: ");
        n3 = leia.nextInt();
        /* Calculo média */
        med = (n1 + n2 + n3) / 3;
        System.out.print("Média final " + med);
        if (med >= 7) {
            System.out.println(" Aprovado");
        } else if (med >= 5.1 && med <= 6.9) {
            System.out.println(" Recuperação");
        } else {
            System.out.println(" Reprovado");
        }
    }
}
