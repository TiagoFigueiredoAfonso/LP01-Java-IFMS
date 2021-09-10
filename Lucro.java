package aula01;

/*
 7- O custo no varejo de um produto é a soma do custo de produção com a 
margem de lucro do distribuidor e dos impostos. Supondo que a margem de 
lucro do distribuidor seja de 33% e os impostos de 52%, faça um programa 
que receba o custo de produção de um produto e tenha como saída o custo 
final no varejo, o valor da margem de lucro do distribuidor e o valor 
pago de impostos. Considere que o imposto é aplicado sobre a soma
do custo de produção com a margem de lucro do distribuidor.
 */

import java.util.Scanner;

public class Lucro {

    public static void main(String args[]) {
        double custP, margL, imp, res;
        Scanner leia = new Scanner(System.in);
        System.out.print("Custo da produção: ");
        custP = leia.nextInt();
        //lucro distribuidor de 33%
        margL = custP * 0.33;
        System.out.println("Valor da margem de lucro do distribuidor: " + margL);
        //impotos de de 52%
        imp = custP * 0.52;
        System.out.println("Valor dos impostos sobre o custo da produção: " + imp);
        //resultado dos impostos sobre o custo da produção
        res = custP + (margL + imp);
        //valor do produto no varejo
        System.out.println("Valor do produto no varejo: " + res);

    }
}
