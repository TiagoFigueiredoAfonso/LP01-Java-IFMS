/*
2) Faça um programa que leia a idade de várias pessoas e calcule e mostre a quantidade de
pessoas por faixa etária. Interrompa a leitura quando for digitado um valor negativo para a idade,
sendo que essa idade negativa não deve fazer parte do cálculo. As faixas etárias são: até 10 anos,
de 11 a 20 anos, de 21 a 30 anos, acima de 30 anos.
 */

import java.util.Scanner;

public class exe02 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        int idade, ac=0, dez=0, vinte=0, trinta=0, maior=0;
        
        
        System.out.print("Idade: ");
        idade = leia.nextInt();
        
        while (idade >= 0 ){
            if(idade > 0 && idade <=10){
                dez++;
            }else if (idade > 10 && idade <21){
                vinte++;
            }else if(idade > 20 && idade < 31){
                trinta++;
            }else {
                maior++;
            }
            System.out.print("Idade: ");
            idade = leia.nextInt();
            
            
        }
        System.out.println("Idade até 10 anos: " + dez);
        System.out.println("Idade dos 10 aos 20: " + vinte);
        System.out.println("Idade dos 20 aos 30: " + trinta);
        System.out.println("Acima dos 30: " + maior);
        
    }
}
