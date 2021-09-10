/*
4) Faça um programa que apresente um menu de opções para o cálculo das seguintes operações
entre dois números: adição (OP 1), subtração (OP 2), multiplicação (OP 3) e divisão (OP 4). O
programa deve possibilitar ao usuário a escolha da operação desejada, a exibição do resultado e a
volta ao menu de opções. O programa só termina quando for escolhida a opção de saída (OP 0).
Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando
que não existe a opção e a execução do programa deve continuar. 
 */

import java.util.Scanner;

public class exe04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int op = 0, v1 = 0, v2 = 0, res = 0;
        
        

        do {
            System.out.println(
                    "-------------------\n"
                    +"1 - Adição \n"
                    + "2 - Subtração\n"
                    + "3 - Multiplicação\n"
                    + "4 - Divisão\n"
                    + "0 - Sair\n");
            System.out.print("Escolha a opção: ");
            op = leia.nextInt();
            if (op >= 1 && op <= 4) {
                System.out.print("Primeiro valor: ");
                v1 = leia.nextInt();
                System.out.print("Segundo valor: ");
                v2 = leia.nextInt();
            }
                if (op == 1) {

                    System.out.println("O resultado da soma: " + (res = v1 + v2));
                } else if (op == 2) {
                    System.out.println("O resultado da subtração: " + (res = v1 - v2));
                } else if (op == 3) {
                    System.out.println("O resultado da multiplicação: " + (res = v1 * v2));
                } else if (op == 4) {
                    System.out.println("O resultado da divisão: " + (res = v1 / v2));
                }

        }while (op != 0);
    }
}
