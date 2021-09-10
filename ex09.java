/*
9. Faça um programa que preencha uma matriz A[10][10] de inteiros e realize as seguintes trocas:
• a linha 2 com a linha 8;
• a coluna 4 com a coluna 10;
• a linha 5 com a coluna 10;
 */
public class ex09 {

    public static void main(String args[]) {

        int mat[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
         {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
         {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
         {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
         {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
         {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
         {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
         {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
         {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
         {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}};

        int copia1[] = new int[10];
        int copia2[] = new int[10];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("\t" + i + "" + j + "|" + mat[i][j] + "| ");
            }
            System.out.println("");
        }

        // copiei a linha 2
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                copia1[j] = mat[i][j];
                }
        }     
        // copiei a linha 8
        for (int i = 8; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                copia2[j] = mat[i][j];
            }
        }
        // linha 2 recebeu => linha 8
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                mat[i][j] = copia2[j];
            }
        }
        // linha 8 recebeu => linha 2
        for (int i = 8; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                 mat[i][j] = copia1[j];
            }
        }
        // copiei a coluna 4
        for (int i = 0; i < 10; i++) {
            copia1[i] = mat[i][4];
        }
        // copiei a coluna 10
        for (int i = 0; i < 10; i++) {
            copia2[i] = mat[i][9];
        }
        // colei a coluna 10 na 4
        for (int i = 0; i < 10; i++) {
             mat[i][4] = copia2[i];
        }
        // colei a coluna 4 na 10
        for (int i = 0; i < 10; i++) {
            mat[i][9] = copia1[i];
        }
        // copiei a coluna 5 
        for (int i = 0; i < 10; i++) {
            copia1[i] = mat[i][5];
        }
        // copiei a coluna 10
        for (int i = 0; i < 10; i++) {
            copia2[i] = mat[i][9];
        }
        // colei a coluna 10 na 5
        for (int i = 0; i < 10; i++) {
            mat[i][5] = copia2[i];
        }
        // colei a coluna 5 na 10
        for (int i = 0; i < 10; i++) {
            mat[i][9] = copia1[i];
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("\t" + i + "" + j + "|" + mat[i][j] + "| ");
            }
            System.out.println("");
        }
    }
}

