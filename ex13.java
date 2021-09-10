/*
13. Faça um programa que preencha uma matriz 10 x 4 com as notas de 10 alunos em quatro
provas. O programa deverá calcular a média de cada aluno e armazenar em um vetor. Após as
médias calculadas: informe a quantidade de alunos que possuem exatamente o valor da maior
média; Mostre todas as médias calculadas; mostre todas as notas dos alunos; Mostre a maior
média dos alunos. 
 */
import java.util.Random;

public class ex13 {

    public static void main(String[] args) {
        Random ran = new Random();

        double mat[][] = new double[10][4];

        int i = 0, j = 0;
        double res[] = new double[10];

        for (i = 0; i < 10; i++) {
            System.out.println("----------------------------");
            System.out.println((i + 1) + "º aluno: ");
            for (j = 0; j < 4; j++) {
                mat[i][j] = ran.nextInt(10); // Valores aleatórios com o import random
                System.out.print("|" + i + " " + j + "| " + mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        double vet[] = new double[10];
        // FOR PRIMEIRO ALUNO, CALCULO MEDIA
        double ac1 = 0.0, media1 = 0.0;
        for (i = 0; i < 1; i++) {
            for (j = 0; j < 2; j++) {
                res[0] = (media1 = ((ac1 += mat[i][j]) / 4));// media guardada no vetor
            }
        }

        System.out.println("---------------------------------");
        System.out.printf("Primero Aluno => Média: %.1f%n", media1);

        // FOR SEGUNDO ALUNO, CALCULO MEDIA
        double media2 = 0.0, ac2 = 0.0;
        for (i = 1; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                res[1] = (media2 = ((ac2 += mat[i][j]) / 4));
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Segundo Aluno => Média: %.1f%n", media2);

        // FOR TERCEIRO ALUNO, CALCULO MEDIA
        double media3 = 0.0, ac3 = 0.0;
        for (i = 2; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                res[2] = (media3 = ((ac3 += mat[i][j]) / 4));
            }
        }

        System.out.println("---------------------------------");
        System.out.printf("Terceiro Aluno => Média: %.1f%n", media3);

        // FOR QUARTO ALUNO, CALCULO MEDIA
        double media4 = 0.0, ac4 = 0.0;
        for (i = 3; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                res[3] = (media4 = ((ac4 += mat[i][j]) / 4));
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Quarto Aluno => Média: %.1f%n", media4);

        // FOR QUINTO ALUNO, CALCULO MEDIA
        double media5 = 0.0, ac5 = 0.0;
        for (i = 4; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                res[4] = (media5 = ((ac5 += mat[i][j]) / 4));
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Quinto Aluno => Média: %.1f%n", media5);

        // FOR SEXTO ALUNO, CALCULO MEDIA
        double media6 = 0.0, ac6 = 0.0;
        for (i = 5; i < 6; i++) {
            for (j = 0; j < 4; j++) {
                res[5] = (media6 = ((ac6 += mat[i][j]) / 4));
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Sexto Aluno => Média: %.1f%n", media6);

        // FOR SETIMO ALUNO, CALCULO MEDIA
        double media7 = 0.0, ac7 = 0.0;
        for (i = 6; i < 7; i++) {
            for (j = 0; j < 4; j++) {
                res[6] = (media7 = ((ac7 += mat[i][j]) / 4));
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Sétimo Aluno => Média: %.1f%n", media7);

        // FOR OITAVO ALUNO, CALCULO MEDIA
        double media8 = 0.0, ac8 = 0.0;
        for (i = 7; i < 8; i++) {
            for (j = 0; j < 4; j++) {
                res[7] = (media8 = ((ac8 += mat[i][j]) / 4));
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Oitavo Aluno => Média: %.1f%n", media8);

        // FOR NONO ALUNO, CALCULO MEDIA
        double media9 = 0.0, ac9 = 0.0;
        for (i = 8; i < 9; i++) {
            for (j = 0; j < 4; j++) {
                res[8] = (media9 = ((ac9 += mat[i][j]) / 4));
            }
        }

        System.out.println("---------------------------------");
        System.out.printf("Nono Aluno => Média: %.1f%n", media9);

        // FOR DÉCIMO ALUNO, CALCULO MEDIA
        double media10 = 0.0, ac10 = 0.0;
        for (i = 9; i < 10; i++) {
            for (j = 0; j < 4; j++) {
                res[9] = (media10 = ((ac10 += mat[i][j]) / 4));
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Décimo Aluno => Média: %.1f%n", media10);

        // Vetor com as medias/ maior nota / quantidade de alunos / media da turma
        double maior = 0, mediaTotal = 0;
        int aluno = 0, posicao = 0;
        System.out.println("---------------------------------");
        System.out.println("Todas as médias no Vetor: ");
        for (i = 0; i < res.length; i++) {
            mediaTotal += res[i] / 10;
            System.out.printf((i + 1) + "º nota: %.1f%n", res[i]);

            if (res[i] > maior) {
                posicao = i + 1;
                maior = res[i];
                aluno++;
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Média total da turma %.1f%n", mediaTotal);
        System.out.printf("Maior nota: %.1f", maior);
        System.out.println(", aluno na " + posicao + "º posicão");
        System.out.println("Alunos acima da média: " + aluno);
    }
}
