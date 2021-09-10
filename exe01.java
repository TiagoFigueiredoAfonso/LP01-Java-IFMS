/*
1) Desenvolva um programa que receba o valor de um veículo, calcule e exiba o preço de venda do
veículo, sabendo que terá um acréscimo de 30%. Os dados deverão ser lidos no programa principal
e o cálculo deve ser feito por um módulo chamado “carros”. No programa principal deve ser escrito o
valor final do veículo calculado pelo módulo.
 */

import java.util.Scanner;

public class exe01 {

    static Scanner leia = new Scanner(System.in);
    
    // Calculo do Valor
    public static double precoVenda(double n1) {
        return n1 * 1.3;
    }
    // Bloco da Mensagem
    public static void mensagem(String msg) {
        System.out.print(msg);
    }
    // Valor de Entrada
    public static double entrada() {
        double valor;
        System.out.print("Valor de Entrada: ");
        valor = leia.nextDouble();
        return valor;
    }
    
    // Programa Principal 
    public static void main(String[] args) {
        double num, saida;

        num = entrada();
        saida = precoVenda(num);
        mensagem("Valor Final: " + saida+"\n");

    }
}
