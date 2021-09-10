/*
Faça um programa que apresente um menu de opções para o cálculo das seguintes operações
entre dois números (reais): adição (OP 1), subtração (OP 2), multiplicação (OP 3) e divisão (OP 4).
Adicione também na calculadora a Média entre três números reais (OP5) e o fatorial de um número
inteiro (OP6) . O programa deve possibilitar ao usuário a escolha da operação desejada, a exibição
do resultado e a volta ao menu de opções. O programa só termina quando for escolhida a opção de
saída (OP 0). Caso o usuário digite um número fora desse intervalo, deverá aparecer uma
mensagem informando que não existe a opção.
 */
import java.util.Scanner;

public class exe03 {

    static Scanner leia = new Scanner(System.in);

    // Bloco de Entrada Double
    public static double entrada() {
        double valor;
        System.out.print("Valor: ");
        valor = leia.nextDouble();
        return valor;
    }

    // Bloco de Entrada Int
    public static int entradaint() {
        int valor;
        System.out.print("Valor: ");
        valor = leia.nextInt();
        return valor;
    }

    // Calculo da Media
    public static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Calculo de Fatorial
    public static int fatorial(int n1) {
        int fat = 1;
        for (int n = 1; n <= n1; n++) {
            fat = fat * n;
        }
        return fat;
    }

    // Calculo da Soma
    public static double soma(double n1, double n2) {
        return n1 + n2;
    }

    // Calculo da Subtracao
    public static double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    // Calculo da Multiplicacao
    public static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    // Calculo da Divisao
    public static double divisao(double n1, double n2) {
        return n1 / n2;
    }

    // Bloco Mensagem
    public static void mensagem(String msg) {
        System.out.printf(msg);
    }

    // Função pra Impressão do Menu, que possui como retorno a leitura da opção desejada.
    public static int menu() {
        int op;
        System.out.println("\n----MENU-----"
                + "\n1 - SOMA"
                + "\n2 - SUBTRAÇÃO"
                + "\n3 - MULTIPLICAÇÃO"
                + "\n4 - DIVISÃO"
                + "\n5 - MÉDIA"
                + "\n6 - FATORIAL"
                + "\n0 - SAIR"
                + "\nEscolha uma das opções: ");
        op = leia.nextInt();
        return op;
    }

    // Programa Principal
    public static void main(String[] args) {
        double n1 = 0, n2 = 0, n3 = 0, res;
        int op;
        op = menu();
        while (op != 0) {

            switch (op) {
                case 1:
                    res = soma(entrada(), entrada());
                    mensagem("Soma: " + res + "\n");
                    break;
                case 2:
                    res = subtracao(entrada(), entrada());
                    mensagem("Subtração: " + res + "\n");
                    break;
                case 3:
                    res = multiplicacao(entrada(), entrada());
                    mensagem("Multiplicação: " + res + "\n");
                    break;
                case 4:
                    res = divisao(entrada(), entrada());
                    mensagem("Divisão: " + res + "\n");
                    break;
                case 5:
                    res = media(entrada(), entrada(), entrada());
                    mensagem("Média: " + res + "\n");
                    break;
                case 6:
                    res = fatorial(entradaint());
                    mensagem("Fatorial: " + res + "\n");
                    break;
                default:
                    mensagem("Opção inválida!\n");
                    break;
            }
            op = menu();
        }
    }
}
