import java.util.Scanner;

public class FuncoesExercicio01 {
    /**
     * <h1> Teamcubation - Funções</h1>
     * 1. Re-construa a calculadora utilizando funções.
     *
     * <p><br>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   22/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        char operacaoMatemarica;
        double resultado = 0;
        System.out.print("Digite a operação matemática desejada (+ , - , * ,/) : ");
        operacaoMatemarica = scanner.next().charAt(0);
        System.out.println("Resultado da operação: ");
        switch (operacaoMatemarica) {
            case '+':
                resultado = somar(numero1, numero2);
                imprimirResultado(numero1, numero2,operacaoMatemarica,resultado);
                break;
            case '-':
                resultado = subtrair(numero1,numero2);
                imprimirResultado(numero1, numero2,operacaoMatemarica,resultado);
                break;
            case '*':
                resultado = multiplicar(numero1,numero2);
                imprimirResultado(numero1, numero2,operacaoMatemarica,resultado);
                break;
            case '/':
                resultado = dividir(numero1,numero2);
                imprimirResultado(numero1, numero2,operacaoMatemarica,resultado);
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
        scanner.close();
    }

    private static void imprimirResultado(double numero1, double numero2,char operacaoMatemarica, double resultado) {
        if (operacaoMatemarica == '+'){
            System.out.printf("%.1f + %.1f = %.1f\n",numero1,numero2,resultado);
        } else if (operacaoMatemarica == '-') {
            System.out.printf("%.1f - %.1f = %.1f\n",numero1,numero2,resultado);
        }else if (operacaoMatemarica == '*') {
            System.out.printf("%.1f * %.1f = %.1f\n",numero1,numero2,resultado);
        }else if (operacaoMatemarica == '/') {
            if (numero2 == 0){
                return;
            }else{
                System.out.printf("%.1f / %.1f = %.1f\n",numero1,numero2,resultado);
            }

        }

    }

    private static double dividir(double numero1, double numero2) {
        if(numero2 ==0){
            System.out.println("Não pode dividir por zero!");
            return 0;
        }
        return numero1 / numero2;
    }

    private static double multiplicar(double numero1, double numero2) {
        return  numero1 * numero2;
    }

    private static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    private static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }
}
