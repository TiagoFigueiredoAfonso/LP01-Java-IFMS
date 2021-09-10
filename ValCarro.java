package aula01;

/*
 6-Faça um programa que leia o preço de dois carros efetue as trocas 
dos valores de forma que o carro A passe a possuir o valor do carro B 
e o carro B passe a possuir o valor do carro A. Apresente no final os 
valores trocados.
 */

import java.util.Scanner;

public class ValCarro {

    public static void main(String args[]) {
        double car1, car2, aux;
        Scanner leia = new Scanner(System.in);
        System.out.print("Valor do primeiro carro:");
        car1 = leia.nextInt();
        System.out.print("Valor do segundo carro: ");
        car2 = leia.nextInt();
        
        aux = car1;
        car1 = car2;
        car2  =  aux;
        
        System.out.println("O valor do primeiro carro é " + car1);
        System.out.println("O valor do segundo carro é " + car2);

    }
}
