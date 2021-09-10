/*
8. Escreva um programa que leia um número inteiro A e uma matriz V 4x4 de números. Conte
quantos valores iguais a A estão na matriz.
 */
import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int mat[][] = new int[2][2], a = 0, cont = 0;

        System.out.println("Valor A: ");
        a = leia.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Matriz: ");
                mat[i][j] = leia.nextInt();
                if (mat[i][j] == a) {
                    cont++;
                }
            }
        }
        System.out.println("-------MATRIZ--------");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("|"+mat[i][j] + "| ");
            }
            System.out.println("");
        }
        System.out.println("Quantidade de valores igual a 'A': " + cont);
    }
}
