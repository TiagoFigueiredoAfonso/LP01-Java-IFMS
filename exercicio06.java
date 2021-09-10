package aula02;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String args[]) {
        double sal, sal2, res, x = 1;
        Scanner leia = new Scanner(System.in);

        /* salário 1 */
        System.out.print("Salário 1 : ");
        sal = leia.nextInt();
        if (sal > 2500) {
            res = sal - (sal * 0.16);
            System.out.println("RS " + res);
        } else if (sal >= 1801 && sal <= 2500) {
            res = sal - (sal * 0.13);
            System.out.println("RS " + res);
        } else if (sal >= 1001 && sal <= 1800.99) {
            res = sal - (sal * 0.13);
            System.out.println("R$ " + res);
        } else if (sal >= 701 && sal <= 1000.99) {
            res = sal - (sal * 0.6);
            System.out.println("R$ " + res);
        } else if (sal >= 401 && sal <= 700.99) {
            res = sal - (sal * 0.3);
            System.out.println("R$ " + res);
        } else {
            System.out.println("SEM REDUÇÃO");
        }

        /* salário 2*/
        System.out.print("Salário 2: ");
        sal2 = leia.nextInt();

        if (sal2 > 2500) {
            res = sal2 - (sal2 * 0.16);
            System.out.println("RS " + res);
        } else if (sal2 >= 1801 && sal2 <= 2500) {
            res = sal - (sal * 0.13);
            System.out.println("RS " + res);
        } else if (sal2 >= 1001 && sal2 <= 1800.99) {
            res = sal - (sal * 0.13);
            System.out.println("R$ " + res);
        } else if (sal2 >= 701 && sal2 <= 1000.99) {
            res = sal2 - (sal2 * 0.6);
            System.out.println("R$ " + res);
        } else if (sal >= 401 && sal <= 700.99) {
            res = sal2 - (sal2 * 0.3);
            System.out.println("R$ " + res);
        } else {
            System.out.println("SEM REDUÇÃO");
        }
        /* ordem descrescente */
        System.out.println("Salários em Ordem Descrescente: ");
        if (sal > sal2) {

            System.out.println("R$ " + sal);
            System.out.println("R$ " + sal2);
        } else {
            System.out.println("R$ " + sal2);
            System.out.println("R$ " + sal);

        }
    }

}
