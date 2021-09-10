
// 11. Faça um programa que gere a seguinte matriz:

public class ex11 {

    public static void main(String args[]) {

        int mat[][] = new int[8][8];
        int cont = 0;
        int cont2 = 33;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (cont < 32) {
                    cont++;
                    mat[i][j] = cont;
                } else {
                    cont2--;
                    mat[i][j] = cont2;
                }
                System.out.print("\t |" + mat[i][j] + "| ");
            }
            System.out.println("");
        }

    }
}
