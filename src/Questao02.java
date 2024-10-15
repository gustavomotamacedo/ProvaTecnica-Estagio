import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String entrada = sc.nextLine();
        sc.close();

        int ocorrenciasDeA = contarOcorrenciasDeA(entrada);

        if (ocorrenciasDeA > 0) {
            System.out.println("A letra 'a' ocorre " + ocorrenciasDeA + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }
    }

    // Método para contar ocorrências de 'a' (maiúscula ou minúscula)
    public static int contarOcorrenciasDeA(String str) {
        int contagem = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contagem++;
            }
        }
        return contagem;
    }
}
