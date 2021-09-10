
/*
 ) Faça um programa que leia um número inteiro entre 0 e 6 e escreva o dia correspondente.
Considere Domingo como o dia 0. Caso o usuário digite um número fora desse intervalo, deverá
aparecer uma mensagem informando que não existe dia com este número. 
 */
package aula03;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        System.out.print("Valor: ");
        num = leia.nextInt();
        switch (num) {
            case 0:
                System.out.println("Valor zero, Domingo");
                break;
            case 1:
                System.out.println("Valor 1, Segunda-Feira");
                break;
            case 2:
                System.out.println("Valor 2, Terça-Feira");
                break;
            case 3:
                System.out.println("Valor 3, Quarta-Feira");
                break;
            case 4:
                System.out.println("Valor 4, Quinta-Feira");
                break;
            case 5:
                System.out.println("Valor 5, Sexta-Feira");
                break;
            case 6:
                System.out.println("Valor 6, Sábado");
                break;
            default:
                System.out.println("Valor Inválido");
                break;
        }
    }

}
