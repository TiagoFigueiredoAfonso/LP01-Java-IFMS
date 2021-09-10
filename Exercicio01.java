/*
1) Faça um programa que calcule a média final de oito alunos em uma disciplina, informe o conceito referente a média final e tudo que for solicitado. Para calcular a média final é necessário calcular a média simples das notas de dois bimestres. Cada bimestre é formado por duas notas (Prova e Lista) e a média bimestral é calculada considerando que a prova possui peso 8 e a lista peso 2. Todas as notas devem ser informadas pelo usuário e o programa deve ter como saída: [3,5 pontos] 
• A média de cada bimestre do aluno. 
• A média final do aluno. 
• Mostrar o conceito referente a média final, como informado na Tabela 1. 
• A quantidade de alunos por conceito. 
• A média da turma por bimestre na disciplina. 
• A média final da turma na disciplina. 
 
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double prova1, lista1, prova2, lista2, med1, med2, medFinal, medFB1 = 0, medFB2 = 0, medFToT = 0;
        int aluno = 0, alunoConceito = 0, a = 0, b = 0, c = 0, d = 0;

        for (int i = 1; i <= 8; i++) {
            aluno++;
            System.out.println("-------------------------------");
            System.out.println(aluno + "º Aluno =>  1º Bimestre");
            System.out.println("Nota da 1º Prova: ");
            prova1 = leia.nextDouble();

            System.out.println("Nota da 1º Lista: ");
            lista1 = leia.nextDouble();

            // Cálculo da Média Ponderada
            med1 = (((prova1 * 8) + (lista1 * 2)) / 10);

            // Média Final da Turma do 1º Bimestre 
            medFB1 = (medFB1 + med1) / 2;

            System.out.println("------------------");
            System.out.println("2º Bimestre");
            System.out.println("Nota da 2º Prova: ");
            prova2 = leia.nextDouble();

            System.out.println("Nota da 2º Lista: ");
            lista2 = leia.nextDouble();

            // Cálculo da Média Ponderada Segundo Semestre
            med2 = (((prova2 * 8) + (lista2 * 2)) / 10);

            // Média Final do 1º Bimestre
            System.out.println("A média do 1º Bimestre: " + med1);
            // Média Final do 2º Bimestre
            System.out.println("A média do 2º Bimestre: " + med2);

            // Cálculo da Média Final de dois bimestres
            medFinal = (med1 + med2) / 2;
            System.out.println("Média final dos Bimestres: " + medFinal);

            // Média Final da Turma 2º Bimestre 
            medFB2 = (medFB2 + medFinal) / 2;

            // Média Final Total da turma
            medFToT = (medFB1 + medFB2) / 2;

            if (medFinal >= 8.5 && medFinal <= 10) {
                a++;
            } else if (medFinal >= 7 && medFinal < 8.5) {
                b++;
            } else if (medFinal >= 5 && medFinal < 7) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Quantidade de alunos Conceito 'A' => Ótimo:" + a);
        System.out.println("Quantidade de alunos Conceito 'B' => 'Bom':" + b);
        System.out.println("Quantidade de alunos Conceito 'C'=> 'Regular':" + c);
        System.out.println("Quantidade de alunos Conceito 'D'=> 'Insuficiente':" + d);
        System.out.println("\n");
        System.out.println("Média final turma no 1º Bimestre: " + medFB1);
        System.out.println("Média final turma no 2º Bimestre: " + medFB2);
        System.out.println("Média final total na disciplina: " + medFToT);
    }
}
