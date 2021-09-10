/*
2) Faça um programa para ler (no programa principal): nota da 1ª prova, nota da 2ª prova e o
número de faltas. A seguir deve ser criado dois métodos:
a) Um método para o cálculo da média: ((p1*4) + (p2*6))/10
b) Um método para o cálculo da situação do aluno que estará “Aprovado” se média >= 6.0 e o
número de faltas <= 25, caso contrário o aluno estará “Reprovado”.
 */
import java.util.Scanner;

public class exe02 {

    public static double nota(double p1, double p2) {
        // Calculo da Media
        double med;
        return med = (p1 * 4 + p2 * 6) / 10;

    }

    public static void mensagem(String msg) {
        // mensagem para o corpo principal
        System.out.println(msg);
    }

    public static void situacao(double medFinal, int faltas) {
        // Situacao de aluno aprovado/reprovado
        if (medFinal > 6 && faltas <= 25) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double p1, p2, medFinal, saida;
        int faltas;

        do {
            System.out.println("Nota 1: ");
            p1 = leia.nextDouble();
            if (p1 < 0) {
                break;
            }
            System.out.println("Nota 2: ");
            p2 = leia.nextDouble();
            medFinal = nota(p1, p2);

            System.out.println("Número de faltas: ");
            faltas = leia.nextInt();

            mensagem("Média " + medFinal);
            mensagem("Total de faltas: " + faltas);

            situacao(medFinal, faltas);
        } while (p1 > 0);
    }

}
