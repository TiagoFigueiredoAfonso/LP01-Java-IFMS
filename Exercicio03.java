/*
3) Escreva um programa que leia as opções de 5 a 9, onde: [1,5 ponto] 
• opção = 5 - ler um número inteiro e informar se o número é múltiplo de 9;  
• opção = 6 - ler uma mensagem e informar a quantidade de caracteres;  
• opção = 7 - ler uma mensagem e informar o décimo caractere, caso a mensagem seja menor que dez caracteres, informe o último caractere da mensagem;  
• opção = 8 - ler uma mensagem e apresentar ela invertida (ex: mensagem1 => 1megasnem); 
• opção = 9 - ler o ano de nascimento de uma pessoa e o ano atual, depois informar a idade em minutos da pessoa (considere que o ano tem 365 dias).  
Faça as implementações e saídas necessárias de acordo com o valor da opção informada 
OBS: Se a Opção informada for diferente das solicitadas, informe para o usuário a mensagem: “Entrada Incorreta!”. 

 */


import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int op, num, nasc, ano, mints;
        String frase;
        System.out.println("Escolha uma opção entre 1 a 9: ");
        op = leia.nextInt();
        if (op >= 1 && op <= 4) {

        } else {
            switch (op) {
                case 5:
                    System.out.println("Digite um valor inteiro: ");
                    num = leia.nextInt();
                    if (num % 9 == 0) {
                        System.out.println("É múltiplo de 9 ");
                    } else {
                        System.out.println("Não é múltiplo de 9 ");
                    }
                    break;
                case 6:
                    leia = new Scanner(System.in);
                    System.out.println("Escreva uma mensagem:");
                    frase = leia.nextLine();
                    int tamanho = frase.length();
                    System.out.println("A quantidade de caracteres: " + tamanho);
                    break;
                case 7:
                    leia = new Scanner(System.in);
                    System.out.println("Escreva uma mensagem:");
                    frase = leia.nextLine();
                    
                    if (frase.length() >= 10) {
                        System.out.println("O décimo caractere: " + frase.charAt(10));
                    } else {
                        System.out.println("A última letra: " + frase.substring(frase.length() - 1));
                    }
                    break;
                case 8:
                    leia = new Scanner(System.in);
                    System.out.println("Escreva uma mensagem:");
                    frase = leia.nextLine();
                    
                    System.out.println(new StringBuilder(frase).reverse().toString());
                    
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.print("Ano de nascimento: ");
                    nasc = leia.nextInt();
                    System.out.print("Ano Atual: ");
                    ano = leia.nextInt();

                    int idade;
                    idade = ano - nasc;
                    mints = idade * 525600;
                    System.out.println("Sua idade em minutos: " + mints + " minutos");
                    break;
                default:
                    System.out.println("Entrada Incorreta!");
                    break;
            }
        }
    }
}

