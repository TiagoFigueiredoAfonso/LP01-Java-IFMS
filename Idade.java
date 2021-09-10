package aula01;

/*
2- Faça um programa que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias. 
Considere que cada ano tem 365 dias e cada mês 30
dias.
 */

import java.util.Scanner;

public class Idade {

    public static void main(String args[]) {
        int ano, mes, dia, atual, res;
        Scanner leia = new Scanner(System.in);
        System.out.println("Vamos calcular seu tempo de vida em dias.");
        System.out.print("Digite o ano atual: ");
        atual = leia.nextInt();
        System.out.print("Ano de nascimento: ");
        ano = leia.nextInt();
        System.out.print("Mês de nascimento: ");
        mes = leia.nextInt();
        System.out.print("Dia do nascimento: ");
        dia = leia.nextInt();
        res = (atual - ano) * 365;
        System.out.println("Você já viveu " + res + " dias.");
    }
}
