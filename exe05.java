/*
5) Faça um programa que leia um número inteiro entre 0 e 6 e escreva o dia correspondente.
Considere Domingo como o dia 0. Caso o usuário digite um número fora desse intervalo, deverá
aparecer uma mensagem informando que não existe dia com este número, e deve ser solicitado que
o usuário entre com o dia correto. ( Verificação de entrada – Assistir: Aula 5 – Videoaula DO
WHILE) 
 */

import java.util.Scanner;

public class exe05 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int dia;
        
        do{
        System.out.println("Digite um número entre 0 e 6: ");
        dia = leia.nextInt();
        switch (dia){
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
         }
        }while(dia < 0 || dia > 6);
    }
}
