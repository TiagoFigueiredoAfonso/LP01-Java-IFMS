/*
3. Faça um programa que calcule a média aritmética das notas de 10 alunos de uma disciplina e
determine o número de alunos que tiveram nota superior à média calculadao
 */
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double vet[] = new double[5], acumul = 0.0, media = 0.0;
        int aluno = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + "º nota: ");
            vet[i] = leia.nextDouble();
            acumul += vet[i];
            media = acumul / 5;

        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                aluno++;
            }
        }
        System.out.printf("Média: %.1f%n" , media);
        System.out.println("Quantidade de alunos acima da média: " + aluno);

    }
}
