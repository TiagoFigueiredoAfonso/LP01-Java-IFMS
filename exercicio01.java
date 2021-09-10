package aula02;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String args[]) {
        int n1, n2;
        Scanner leia = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        n1 = leia.nextInt();
        System.out.print("Segundo valor: ");
        n2 = leia.nextInt();
        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else {
            System.out.println(n1 + " é menor que " + n2);
        }
    }
}
