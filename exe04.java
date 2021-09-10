/*
Faça um programa que leia dois nomes e mostre:  (Obs: deverá ser feito somente um programa,
um único arquivo java)
 */
package aula03;

import java.util.Scanner;

public class exe04 {

    public static void main(String[] args) {

        String nome1, nome2;
        Scanner leia = new Scanner(System.in);
        System.out.print("Primeiro nome: ");
        nome1 = leia.next();
        System.out.print("Segundo nome: ");
        nome2 = leia.next();

        /* O a comparação booleana*/
        boolean teste;
        teste = nome1.equals(nome2);

        if (teste) {
            System.out.println("São nomes iguais");
        } else {
            System.out.println("São nomes diferentes");
        }

        /* A contagem dos caracteres*/
        int tamanho1 = nome1.length();
        int tamanho2 = nome2.length();
        System.out.println(nome1 + " possui " + tamanho1 + " caracteres");
        System.out.println(nome2 + " possui " + tamanho2 + " caracteres");

        /* Transformar em MAIUSCULAS*/
        String maisc1 = nome1.toUpperCase();
        String maisc2 = nome2.toUpperCase();
        System.out.println(nome1 + " em letras maiúsculas: " + maisc1 );
        System.out.println(nome2 + " em letras maiúsculas: " + maisc2);
        
        String minus1 = nome1.toLowerCase();
        String minus2 = nome2.toLowerCase();
        System.out.println(nome1 + " em letras minúsculas: " + minus1 );
        System.out.println(nome2 + " em letras minúsculas: " + minus2);
        
        /* Isolando o primeiro caracter*/
        System.out.println("A primeira letra do nome " + nome1 + " é a letra " + nome1.charAt(0));
        System.out.println("A primeira letra do nome " + nome2 + " é a letra " + nome2.charAt(0));
        
        /* A última letra do nome */
        System.out.println("A última letra do nome " + nome1 +" é a letra " +  nome1.substring(nome1.length()-1));
        System.out.println("A última letra do nome " + nome2 +" é a letra " +  nome2.substring(nome2.length()-1));
        
        /* Concatenando Strings */
        
        System.out.println(nome1 + " contatenado com " + nome2);
        
    }

}

