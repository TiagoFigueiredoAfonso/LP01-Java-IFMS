/*
 2) Faça um programa que leia o valor de nove carros comprados por uma empresa. O programa deve ter as saídas a seguir: [3,5 pontos] 
• O valor total da compra dos carros. 
• O valor total da compra descontando o imposto de 42%. 
• O lucro da concessionária que vendeu os carros, considere que é 21% sobre o valor da compra descontando o imposto.  
• O carro com maior preço. 
• Considere que a manutenção dos carros nos próximos 5 anos custa: 10% do valor total de cada carro com preço inferior a R$45000,00 e 18% para os demais. Informe o total gasto nas manutenções de todos os carros. 
• A média dos gastos da empresa por carro: considere o valor total gasto na compra dos carros e na manutenção dos próximos 5 anos.

 */


import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        double valor, valorTot = 0, valorDesc = 0, vendaDesc = 0, valorMaior = 0, manutencao = 0, manuTot = 0, manu = 0, AcManut = 0;
        String carro, carroMaior = null;

        for (int i = 1; i <= 9; i++) {
            System.out.println("-----------------");
            System.out.println("Nome do " + i + "º veículo: ");
            carro = leia.next();
            System.out.println("Valor de compra: ");
            valor = leia.nextDouble();

            //Cálculo do Valor Total dos carros
            valorTot += valor;

            //Cálculo do Valor de 42% descontado
            valorDesc = valorTot * 0.58;

            // Calculo do lucro da venda e desconto de impostos
            vendaDesc = (valorTot * 1.21) * 0.58;

            // Cálculo do carro com maior valor
            if (valorMaior < valor) {
                valorMaior = valor;
                carroMaior = carro;
            }

            if (valor < 45000) {
                manutencao = valor * 1.10;
                System.out.println("Acréscimo de 10% R$ " + df.format(manutencao));
                // Total manutenção nos próximos 5 anos
                manuTot = manutencao - valor;
                // acumulador do total de manutenção
                manu += manuTot;
                // total de (manutenção * 5 anos) + imposto sobre compra = total de gastos
                AcManut = (manuTot * 5) + (valor * 0.42);
                System.out.println("Valor total de gastos na compra e manutenção nos próximos 5 anos R$ " + df.format(AcManut));
            } else {
                manutencao = valor * 1.18;
                System.out.println("Acréscimo de 18% R$ " + df.format(manutencao));
                // Total manutenção nos próximos 5 anos
                manuTot = manutencao - valor;
                // acumulador do total de manutenção
                manu += manuTot;
                // total de (manutenção * 5 anos) + imposto sobre compra = total de gastos
                AcManut = (manuTot * 5) + (valor * 0.42);
                System.out.println("Valor total de gastos na compra e manutenção nos próximos 5 anos R$ " + df.format(AcManut));
            }

        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Valor Total de compra: R$ " + df.format(valorTot));
        System.out.println("Valor de compra com desconto de 42%: R$ " + df.format(valorDesc));
        System.out.println("Valor de 21% sobre o valor de compra:R$ " + df.format(vendaDesc));
        System.out.println("O carro com maior valor: " + carroMaior + " R$ " + df.format(valorMaior));
        System.out.println("Valor da manutençao de todos os carros nos próximos 5 anos : R$ " + df.format(manu));

    }

}
