
/*
7. Tentando descobrir se um dado era viciado, um dono de um cassino o lançou 10 vezes. Faça um
programa que leia os 10 resultados dos lançamentos, e determine o número de ocorrências de cada
face
 */
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int  aux;
        int lance[] = new int [10];
        int a[] = new int[10];
        
        
        System.out.println("Números Aleatórios: ");
        for(int i=0; i< lance.length;i++){
            aux = (int)Math.round(Math.random() * 6);
            if( aux == 0){
                aux = 1;
            }
            lance[i] = aux;
            a[i] = aux;
            System.out.print("|"+a[i]+ "|");
        }
        System.out.println("");
    }
}
