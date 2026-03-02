import java.util.Scanner;

public class ati3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int produto;

        System.out.print("Digite o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextInt();

        produto = numero1 * numero2;

        System.out.println("O produto é: " + produto);

        sc.close();
    }
}