
import java.util.Scanner;

/*
10. Escreva um programa que lê uma matriz M(5,5) e calcule as somas:
a) da linha 4 de M
b) da coluna 2 de M
c) da diagonal principal
d) da diagonal secundária
e) de todos os elementos da matriz M 
 */
public class ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[5][5];
        int cont = 0, somaTot=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                cont++;
                mat[i][j] = cont;
                somaTot += mat[i][j];
                System.out.print("\t|" + i + "|" + j + "| " + mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("=================================================================================");
        int soma1 = 0;
        System.out.println("Linha Quatro");
        for (int j = 0; j < 5; j++) {
            soma1 += mat[4][j];
            System.out.print(mat[4][j] + " ");
        }
        System.out.println("\nSoma da Linha Quatro: " + soma1);
        System.out.println("--------------------------------------");

        int soma2 = 0;
        System.out.println("Coluna Dois: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mat[i][2] + " ");
            soma2 += mat[i][2];
        }
        System.out.println("\nSoma Coluna Dois " + soma2);
        System.out.println("--------------------------------------");

        System.out.println("Diagonal Principal");
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(mat[i][i] + " ");
            soma += mat[i][i];
        }
        System.out.println("\nSoma Diagonal Principal: " + soma);
        System.out.println("--------------------------------------");
        System.out.println("Diagonal Secundária");
        int soma3 = 0;
        for (int i = 0; i < 5; i++) {
            soma3 = mat[0][4] + mat[1][3] + mat[2][2] + mat[3][1] + mat[4][0];
        }
        System.out.println(mat[0][4] + " " + mat[1][3] + " " + mat[2][2] + " " + mat[3][1] + " " + mat[4][0]);
        System.out.println("Soma Diagonal Secundária: " + soma3);
        System.out.println("--------------------------------------");
        System.out.println("Soma Total da Matriz: " + somaTot);
    }
}
