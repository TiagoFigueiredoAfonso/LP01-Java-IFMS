package aula02;

/**
 *
 * @author thiago
 */
import java.util.Scanner;

public class exercicio02 {

    public static void main(String args[]) {
        int num;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        num = leia.nextInt();
        if (num % 9 == 0) {
            System.out.println(num + " é múltiplo de 9");
        } else {
            System.out.println(num + " não é múltiplo de 9");
        }
    }
}
