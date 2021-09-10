
import java.util.Scanner;

/*
3) Faça um programa que leia uma matriz M (5x4), a matriz será utilizada para armazenar as notas
de 4 bimestres (coluna) de 5 alunos (linha). Considere que no momento do preenchimento da matriz,
o usuário comenta os seguintes erros:
• Inverteu o local das notas do terceiro e segundo bimestre dos alunos.
• As notas do primeiro aluno foram trocadas com a do quarto aluno.
• Cada aluno deveria ter ganho um ponto extra no segundo bimestre.
O programa deve ter como saída a matriz com as correções necessárias e um vetor com as médias
finais de cada aluno. Após o cálculo da média final, informe a quantidade de alunos: aprovados
(media>= 7), Reprovados (media <= 5) e de Recuperação (media entre 5.1 a 6.9). 
 */
public class exe03 {

    static Scanner leia = new Scanner(System.in);

    public static void saida(double mat[][]) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(i + "|" + j + " |\t" + mat[i][j] + "| ");
            }
            System.out.println();
        }
    }

    public static void media(double mat[][], int n1, double v[]) {

        double media = 0.0, acumulador = 0.0;
        for (int i = 0; i < mat[n1].length; i++) {
            acumulador += mat[n1][i];
            media = acumulador / 4;
            v[n1] = media;
        }

    }

    public static void situacaoAlunos(double vetor[]) {
        int ap = 0, rep = 0, rec = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 7) {
                ap++;
            } else if (vetor[i] >= 5.1 && vetor[i] <= 6.9) {
                rec++;
            } else {
                rep++;
            }
        }
        System.out.println("Aprovados: " + ap);
        System.out.println("Recuperação: " + rec);
        System.out.println("Reprovados: " + rep);
    }

    public static void main(String[] args) {

        double mat[][] = {
            {6.0, 7.0, 8.0, 4.0},//aluno 1 = índice 0 
            {6.0, 6.0, 7.0, 4.0}, //aluno 2 = índice 1
            {9.0, 7.0, 7.0, 7.0}, //aluno 3 = índice 2
            {6.0, 3.0, 2.0, 4.0}, //aluno 4 = índice 3
            {6.0, 7.0, 8.0, 2.0}, //aluno 5 = índice 4
        };

        saida(mat);

        //• Inverteu o local das notas do terceiro e segundo bimestre dos alunos.
        double aux1[] = new double[5];
        for (int i = 0; i < mat.length; i++) {
            aux1[i] = mat[i][1];
            mat[i][1] = mat[i][2];
            mat[i][2] = aux1[i];
        }
        System.out.println("------------ INVERTEU O 2º  E  3º BIMESTRE ----------------");
        saida(mat);
        //• As notas do primeiro aluno foram trocadas com a do quarto aluno. 
        double aux[] = new double[5];
        for (int j = 0; j < mat[3].length; j++) {
            aux[j] = mat[3][j];
            mat[3][j] = mat[0][j];
            mat[0][j] = aux[j];
        }
        System.out.println("------------- TROCOU NOTAS 1º E 4º ALUNO -----------------");
        saida(mat);

        //• Cada aluno deveria ter ganho um ponto extra no segundo bimestre.
        System.out.println("-------------- PONTO EXTRA NO 2º BIMESTRE ----------------");
        for (int i = 0; i < mat.length; i++) {
            mat[i][1] += 1;

        }
        saida(mat);
        System.out.println("---------------- SAÍDA FINAL COM AS TROCAS --------------");
        saida(mat);

        int n0 = 0, n1 = 1, n2 = 2, n3 = 3, outro = 4;
        double vetTeste[] = new double[5];
        System.out.println("------------------------ MÉDIAS ------------------------");
        media(mat, n0, vetTeste);
        media(mat, n1, vetTeste);
        media(mat, n2, vetTeste);
        media(mat, n3, vetTeste);
        media(mat, outro, vetTeste);

        for (int i = 0; i < vetTeste.length; i++) {
            System.out.println((i + 1) + "º aluno, média: " + vetTeste[i] + " ");
        }
        situacaoAlunos(vetTeste);

    }
}
