package aula01;


import java.util.Scanner;

public class Soma {

    public static void main(String args[]) {
        //Declarar variáveis
        int num1, num2, resultado;
        Scanner leia = new Scanner(System.in);

        //Ler os dados
        System.out.print("Digite o primeiro valor:");
        //leia(num1)
        num1 = leia.nextInt();
        System.out.print("Digite o segundo valor:");
        //leia(num2)
        num2 = leia.nextInt();
        resultado = num1 + num2;
        System.out.println("A soma é " + resultado);
    }
}
