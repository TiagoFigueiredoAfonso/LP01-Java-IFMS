package aula02;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String args[]) {
        double nivel, hora, res = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Nível: ");
        nivel = leia.nextInt();
        System.out.print("Horas trabalhadas: ");
        hora = leia.nextInt();
        if (nivel == 1) {
            res = hora * 99;
            System.out.println("Nível 1, recebe R$ " + res);
        } else if (nivel == 2) {
            res = hora * 110;
            System.out.println("Nível 2, recebe R$ " + res);
        } else if (nivel == 3) {
            res = hora * 180;
            System.out.println("Nível 3, recebe R$ " + res);
        }else {
            System.out.println("Valor Inválido");
        }

    }

}
