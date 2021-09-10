/*
 Faça os cálculos de acordo com o valor de op informado, crie um menu para o usuário selecionar a
opção correta e mostre os resultados. Caso o usuário digite um número fora desse intervalo, deverá
aparecer uma mensagem informando que não existe a opção. 
 */
package aula03;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        int n1, n2, op, res;
        Scanner leia = new Scanner(System.in);
        System.out.print(
                "1 operação de soma;\n"
                + "2 operação de subtração;\n"
                + "3 operação de multiplicação;\n"
                + "4 operação de divisão;\n"
                + "5 informa se o primeiro número é divisível por 7.\n"
                + "6 informa se o segundo número é par ou ímpar. \n"
                + "Escolha a operação: ");
        op = leia.nextInt();
        if (op >= 1 && op <= 4) {
            System.out.print("Primeiro Valor: ");
            n1 = leia.nextByte();
            System.out.print("Segundo Valor: ");
            n2 = leia.nextByte();
            switch (op) {
                case 1:
                    res = n1 + n2;
                    System.out.println("A soma é " + res);
                    break;
                case 2:
                    res = n1 - n2;
                    System.out.println("A subtração é " + res);
                    break;
                case 3:
                    res = n1 * n2;
                    System.out.println("A multiplicação é " + res);
                    break;
                case 4:
                    res = n1 / n2;
                    System.out.println("A divisão é " + res);
                    break;

            }
        } else if (op == 5 || op == 6) {
            switch (op) {
                case 5:
                    System.out.print("Primeiro Valor: ");
                    n1 = leia.nextInt();
                    if (n1 % 7 == 0) {
                        System.out.println("É divisível");
                    } else {
                        System.out.println("Não é divisível");
                    }
                    break;
                case 6:
                    System.out.print("Segundo Valor: ");
                    n2 = leia.nextInt();
                    if (n2 % 2 == 0) {
                        System.out.println("É par");
                    } else {
                        System.out.println("É ímpar");
                    }
                    break;

            }
        } else {

            System.out.println("Opção Inválida");
        }

    }

}
