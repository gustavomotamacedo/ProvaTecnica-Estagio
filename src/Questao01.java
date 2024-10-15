import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int entrada = sc.nextInt();
        sc.close();

        if (eFibonacci(entrada)) {
            System.out.println("O número " + entrada + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + entrada + " não pertence à sequência de Fibonacci.");
        }
    }

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean eFibonacci(int n) {
        int a = 0, b = 1;
        if (n == a || n == b) {
            return true;
        }
        int c = a + b;
        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}