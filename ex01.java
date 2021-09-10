/*
 Faça um programa que leia um número inteiro entre 1 e 12 e escreva o mês correspondente.
Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando
que não existe mês com este número. 
 */
package aula03;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        System.out.print("Valor: ");
        num = leia.nextInt();
        switch (num) {
            case 12:
                System.out.println("Mês 12, Dezembro");
                break;
            case 11:
                System.out.println("Mês 11, Novembro");
                break;
            case 10:
                System.out.println("Mês, 10 Outubro");
                break;
            case 9:
                System.out.println("Mês, 9, Setembro");
                break;
            case 8:
                System.out.println("Mês, 8 Agosto");
                break;
            case 7:
                System.out.println("Mês 7, Julho");
                break;
            case 6:
                System.out.println("Mês 6, Junho");
                break;
            case 5:
                System.out.println("Mês 5, Maio");
                break;
            case 4:
                System.out.println("Mês 4, Abril");
                break;
            case 3:
                System.out.println("Mês 3, Março");
                break;
            case 2:
                System.out.println("Mês 2, Fevereiro");
                break;
            case 1:
                System.out.println("Mês 1, Janeiro");
                break;
            default:
                System.out.println("Mês, Inválido");
                break;
        }
    }
}
