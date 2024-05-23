import java.util.Scanner;

public class FuncoesExercicio03 {
    /**
     * <h1> Teamcubation - Funções</h1>
     * 3.Verificação de Número Primo: <br><br>
     * Escreva uma função que receba um número como entrada e retorne verdadeiro se o número for primo e falso caso contrário. No método principal, solicite ao usuário um número e exiba se ele é primo ou não.
     * <p><br>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   22/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numeroEhPrimo(numero) == true) {
            System.out.printf("%d eh primo!", numero);
        } else {
            System.out.printf("%d não eh primo!", numero);
        }
        scanner.close();
    }

    private static boolean numeroEhPrimo(int numero) {
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
