package aula02;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String args[]) {
        int idade;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();
        if (idade <= 10) {
            System.out.println("Infantil");
        } else if (idade > 10 && idade < 18) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
    }

}
