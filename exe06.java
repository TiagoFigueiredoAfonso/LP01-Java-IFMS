/*
6) Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade,
sexo (M/F) e salário.
Faça um programa que informe:
a. a média de idade do grupo;
b. a quantidade de homens com salário maior R$1500,00.
c. A soma dos salários
d. o maior e o menor salário do grupo;
Encerre a entrada de dados quando for digitada uma idade negativa.
 */

import java.util.Scanner;

public class exe06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade, med, salM = 0, salF = 0, salTotM = 0, salTotF = 0, salTot, idadeM = 0, idadeF = 0, idadeTotM = 0, idadeTotF = 0, idadeMed, pessoasTot, qtdMsal = 0, salMaiorM = 0, salMenorM = 999999999, salMaiorF = 0, salMenorF = 999999999, totMaior, totMenor = 0, masc = 0, fem = 0;
        String sexo;

        do {
            System.out.println("Informe o sexo(M/F): ");
            sexo = leia.next();
            if ("m".equals(sexo)) {
                masc++;
                
                System.out.println("M - Informe o salário: ");
                salM = leia.nextInt();
                
                
                if (salM > salMaiorM) {
                    salMaiorM = salM;
                }
                if (salM < salMenorM) {

                    salMenorM = salM;
                }

                if (salM > 1500) {
                    qtdMsal++;
                } else {
                }
                salTotM += salM;
                System.out.println("Informe a idade: ");
                idadeM = leia.nextInt();
                if(idadeM < 0){break;}//condição de parada
                idadeTotM += idadeM;

            } else {
                fem++;
                System.out.println("F - Informe o salário: ");
                salF = leia.nextInt();
                if (salF > salMaiorF) {
                    salMaiorF = salF;
                }
                if (salF < salMenorF) {

                    salMenorF = salF;
                }
                salTotF += salF;
                System.out.println("Informe a idade: ");
                
                idadeF = leia.nextInt();
                if(idadeF < 0){break;}//condição de parada
                idadeTotF += idadeF;
            }
        }while(idadeM > 0 || idadeF > 0);
        
        // calculo do maior e menor salario do grupo
        if(salMaiorM > salMaiorF){
            totMaior = salMaiorM;
        }else {
            totMaior = salMaiorF;
        }
        if(salMenorM < salMenorF){
            totMenor = salMenorM;
        }else {
            totMenor = salMenorF;
        }
        // soma dos salários
        salTot = salTotM + salTotF;
        // total de pessoas entrevistadas
        pessoasTot = masc + fem;
        // a. a média de idade do grupo;
        idadeMed = (idadeTotM + idadeTotF) / pessoasTot;

        System.out.println("A - a média de idade do grupo: " + idadeMed);
        System.out.println("B - a quantidade de homens com salário maior R$1500,00: " + qtdMsal);
        System.out.println("C - A soma dos salários: " + salTot);
        System.out.println("D - Maior salário grupo: " + totMaior);
        System.out.println("D - Menor salário grupo: " + totMenor);

    }
}
