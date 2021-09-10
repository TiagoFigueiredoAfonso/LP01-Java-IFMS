/*
7) Elabore um programa que leia as notas de 10 alunos. Cada aluno possui duas notas, e para cada
aluno deve ser calculado a média do semestre. As notas informadas pelo usuário devem estar no
 intervalo entre zero e dez inclusive (0 ≤ Nota ≤ 10), caso seja informado uma nota inválida o
 programa deve solicitar uma nova nota. ( Aula 5 – Videoaula DO WHILE )
 */

import java.util.Scanner;

public class exe07 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int aluno=0, nota1, nota2=0;
        double med;
        
        for(int c=1;c<=10; c++){
            aluno++;
            System.out.println("---------------------------");
            System.out.println(aluno + "º aluno:");
            do{
            System.out.println("1º nota: ");
            nota1 = leia.nextInt();
            }while(nota1 <0 || nota1 >10);
            do{
            System.out.println("2º nota: ");
            nota2 = leia.nextInt();
            }while(nota2 < 0 || nota2 > 10);
            med = (nota1+nota2)/2;
            System.out.println("A média semestral do " +aluno+"º aluno: " + med);
        }
    }
}
