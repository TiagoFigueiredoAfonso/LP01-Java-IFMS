/*
4. Faça um programa que preencha um vetor com dez números inteiros, e os mostre na ordem
inversa à de leitura.
 */
public class ex04 {
    public static void main(String[] args) {
        
        int vet[] = new int[10];
        
        System.out.println("---Ordem Crescente---");
        for(int i = 0; i< vet.length; i++){
            vet[i] = i;
            System.out.print("|"+vet[i]+"|");
        }
        
        System.out.println("\n");
        System.out.println("---Ordem Decrescente---");
        for(int i = vet.length-1; i >= 0; i--){
            System.out.print("|"+vet[i]+"|");
        }
        System.out.println("");
    }
}
