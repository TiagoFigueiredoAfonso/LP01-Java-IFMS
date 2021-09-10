
import java.util.Scanner;

/*
1) Faça um programa com menu utilizando os métodos solicitados no desenvolvimento das
funcionalidades desejadas. [4,0 pontos]
 */
public class exe01 {

    static Scanner leia = new Scanner(System.in);

    // Zerando a MATRIZ
    public static void zerarMatriz(double mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = 0;
            }
        }
    }

    public static void menu() {
        System.out.println(""
                + "        1- Zerar folha de pagamento.\n"
                + "        2 - Cadastrar folha de pagamento de um mês específico.\n"
                + "        3 – Imprimir folha de pagamento de um mês específico.\n"
                + "        4 – Imprimir a folha de pagamento completa.\n"
                + "        5 – Custo da folha de pagamento.\n"
                + "        0 – Sair.");
    }

    //entrada da MATRIZ COMPLETA
    public static void entrada(double mat[][]) {

        for (int i = 0; i < mat.length; i++) {
            System.out.println((i + 1) + "º funcionário");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print((j + 1) + "º coluna: ");
                mat[i][j] = leia.nextDouble();
            }
        }
    }

    public static double total(double mat[][]) {
        double total = 0.0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                total += mat[i][j];
            }
        }
        return total;
    }

    //entrada da MATRIZ ESPECIFICA

    public static double entradaEspecifica(double mat[][], int l, int c) {
        double saida = 0;
        for (int i = l; i <= l; i++) {
            System.out.println((i + 1) + "º funcionário");
            for (int j = c; j <= c; j++) {
                System.out.print((c + 1) + "º coluna: ");
                mat[i][j] = leia.nextDouble();
            }
        }
        return saida;
    }

    // saida MATRIZ MÊS ESPECÍFICO
    public static void saidaEspecifica(double mat[][], int l, int c) {

        for (int i = l; i <= l; i++) {
            System.out.println((i + 1) + "º funcionário: ");
            for (int j = c; j <= c; j++) {
                System.out.print("Coluna:" + c + " \t |" + mat[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    // saida da MATRIZ COMPLETA
    public static void saida(double mat[][]) {

        for (int i = 0; i < mat.length; i++) {
            System.out.println((i + 1) + "º funcionário: ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("\t |" + mat[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    public static void linhaColuna(int linha, int coluna) {
        System.out.println("Linha: ");
        linha = leia.nextInt();
        System.out.println("Coluna: ");
        coluna = leia.nextInt();
    }

    // PROGRAMA PRINCIPAL
    public static void main(String[] args) {

        double matriz[][] = new double[5][6];
        int linha = 0, coluna = 0;

        menu();

        System.out.println("Escolha a opção: ");
        int op = leia.nextInt();
        while (op != 0) {
            if (op == 1) {

                //1- Zerar folha de pagamento
                zerarMatriz(matriz);
                System.out.println("Folha de Pagamento Zerada com Sucesso!");
                entrada(matriz); // Entrada dos valores após zerar 

            } else if (op == 2) {
                //2 - Cadastrar folha de pagamento de um mês específico

                System.out.println("Linha: ");
                linha = leia.nextInt();
                System.out.println("Coluna: ");
                coluna = leia.nextInt();
                entradaEspecifica(matriz, linha, coluna);
            } else if (op == 3) {
                // 3 – Imprimir folha de pagamento de um mês específico

                System.out.println("Linha: ");
                linha = leia.nextInt();
                System.out.println("Coluna: ");
                coluna = leia.nextInt();

                saidaEspecifica(matriz, linha, coluna);
            } else if (op == 4) {
                // 4 – Imprimir a folha de pagamento completa
                saida(matriz);
            } else if (op == 5) {
                //5 – Custo da folha de pagamento
                System.out.println("Custo total: " + total(matriz));

            } else {
                System.out.println("Opção Inválida!");
            }
            menu();
            System.out.println("Escolha a opção: ");
            op = leia.nextInt();
        }
    }
}
