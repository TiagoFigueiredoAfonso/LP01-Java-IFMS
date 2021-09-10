
import java.util.Scanner;

/*
2) Faça um programa que leia três vetores de 6 posições de inteiros (A, B e C) e que tenha como
saída:

• O vetor E resultante da intercalação dos valores presentes nos vetores A, B e C . [3,0
pontos]
 */
public class exe02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int A[] = {1, 2, 3, 4, 5, 6};
        int B[] = {10, 20, 30, 40, 50, 60};
        int C[] = {100, 200, 300, 400, 500, 600};
        int D[] = new int[6];

        //• O vetor D resultante da multiplicação dos elementos de índices opostos, ou seja, o primeiro
        //elemento do vetor A deve ser multiplicado com o último elemento do vetor B, e o resultado
        //colocado na primeira posição do vetor D, e assim por diante.
        int cont = 6;
        for (int i = 0; i < D.length; i++) {
            D[i] += A[i] * B[cont = cont - 1];
        }
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + "| ");
        }
        System.out.println();

        //• O vetor E resultante da intercalação dos valores presentes nos vetores A, B e C .
        System.out.println("--------------------------------------------");
       
        int E[] = new int[18];
        int x = 0, y = 1, z = 2;
        for (int i = 0; i < 6; i++) {

            E[x] = A[i];
            x += 3;
            E[y] = B[i];
            y += 3;
            E[z] = C[i];
            z += 3;

        }
        for (int i = 0; i < E.length; i++) {
            System.out.print(E[i] + "| ");
        }
        System.out.println();
    }
}
