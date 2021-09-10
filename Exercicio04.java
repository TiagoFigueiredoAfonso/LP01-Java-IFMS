/*
4) Calcule a soma dos 50 primeiros termos da série T, determinado por: 
T= 3/500 + 5/490 + + 7/480 + 9/470 + 11/460 + 13/450 + ...
 */


import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
         double s = 0;
         int cont = 0, j = 500;
        Scanner leia = new Scanner(System.in);

        for (int i = 3; i <= 101; i+=2) {
            cont++;
            System.out.println(i+ "/" + j +"   "+ cont +"º valor");
            s = s + ((double)i/(double)j); 
            j = j - 10;
            
        }
      System.out.println("O resultado da soma é: " + s);
       
    }
}
