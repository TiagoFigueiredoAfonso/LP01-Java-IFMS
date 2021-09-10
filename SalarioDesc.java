package aula01;

/*
 5-Faça um programa que receba o salário de um funcionário, 
calcule e mostre o novo salário com desconto de 5% e com aumento de 20%. 
 */

import java.util.Scanner;

public class SalarioDesc {

    public static void main(String args[]) {
        double sal, desc, aum;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário: ");
        sal = leia.nextInt();
        //valor descontado
        desc = sal - (sal * (0.05));//sal * 0.95
        System.out.println("Valor com desconto de 5%: " + desc);
        //valor com aumento
        aum = sal + (sal * (0.20));//sal * 1.2
        System.out.println("Valor com aumento de 20%: " + aum);

    }
    //100% + 20% = 120%/100 = 1.2
    //100% - 5% = 95%/100 = 0.95%
    //a forma como o professor escreveu
}
