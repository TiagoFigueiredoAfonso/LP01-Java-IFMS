import java.util.Scanner;

/*
5. Dada uma sequência de 12 números inteiros, faça um programa que leia a sequência, armazenea em um vetor e mostre o menor número encontrado no vetor e a posição do vetor em que o menor
número se encontra.
 */
public class ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double vet[] = new double[12], menor = Double.MAX_VALUE;
        int i, posicao=0;
        
        for(i=0; i < vet.length; i++){
            System.out.print((i+1)+"º valor: ");
            vet[i] = leia.nextDouble();
            if(vet[i] < menor){
                menor = vet[i];
                posicao = i;
            }
        }
        System.out.println("----------------------------");
        System.out.println("Menor valor: " + menor+", na posição: "+ posicao);
    }
    
}
