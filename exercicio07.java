package aula02;

import java.util.Scanner;

public class exercicio07 {

    public static void main(String args[]) {
        double ra, av1, av2, ml1, ml2, bm1, bm2, mdF;
        Scanner leia = new Scanner(System.in);

        /* primeira parte do programa*/
        System.out.print("Insira o RA: ");
        ra = leia.nextInt();
        System.out.print("Nota da P1: ");
        av1 = leia.nextInt();
        System.out.print("Nota da Lista 1: ");
        ml1 = leia.nextInt();


        /* nota do primeiro bimestre*/
        bm1 = (av1 * 0.7) + (ml1 * 0.3);

        /* segunda parte do programa*/
        System.out.print("Nota da P2: ");
        av2 = leia.nextInt();
        System.out.print("Nota da Lista 2: ");
        ml2 = leia.nextInt();

        /* média do segundo bimestre*/
        bm2 = (av2 * 0.7) + (ml2 * 0.3);

        /* média final */
        mdF = (bm1 + bm2) / 2;
        
        /* calculo do conceito*/
        if (mdF >= 9.0) {

            System.out.println("RA: " + ra);
            System.out.println("Média Final: " + mdF);
            System.out.println("Conceito 'A' - Aprovado");
        } else if (mdF >= 7.5 && mdF < 9.0) {

            System.out.println("RA: " + ra);
            System.out.println("Média Final: " + mdF);
            System.out.println("Conceito 'B' - Aprovado");
        } else if (mdF >= 6.0 && mdF < 7.5) {

            System.out.println("RA: " + ra);
            System.out.println("Média Final: " + mdF);
            System.out.println("Conceito 'C' - Aprovado");
        } else if (mdF >= 4.0 && mdF < 6.0) {

            System.out.println("RA: " + ra);
            System.out.println("Média Final: " + mdF);
            System.out.println("Conceito 'D' - Reprovado");
        } else {

            System.out.println("RA: " + ra);
            System.out.println("Média Final: " + mdF);
            System.out.println("Conceito 'E' - Reprovado");
        }
    }
}
