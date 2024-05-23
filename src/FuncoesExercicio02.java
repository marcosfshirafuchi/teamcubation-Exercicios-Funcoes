import java.util.Scanner;

public class FuncoesExercicio02 {
    /**
     * <h1> Teamcubation - Funções</h1>
     * 2. Conversão de Temperatura: <br><br>
     * Escreva funções para converter temperatura de Celsius para Fahrenheit e de Fahrenheit para Celsius. <br><br>
     * Chame as funções no método main e printe os resultados.
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
        System.out.print("Digite a valor para a temperatura: ");
        double temperatura = scanner.nextDouble();
        System.out.println();
        System.out.println("Opções de conversão de temperatura:");
        System.out.println();
        System.out.println("C = converter de temperatura Fahrenheit para Celcius.");
        System.out.println("F = converter de temperatura Celcius para Fahrenheit.");
        System.out.println();
        System.out.print("Digite a opção de conversão desejada: ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        System.out.println();
        switch (opcao){
            case 'C':
                double celsius =  converterFahrenheitParaCelcius(temperatura);
                impressaoDeTemperatura(opcao,temperatura,celsius);
                break;
            case 'F':
                double fahrenheit =  converterCelciusParaFahrenheit(temperatura);
                impressaoDeTemperatura(opcao,temperatura,fahrenheit);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }

    private static void impressaoDeTemperatura(char opcao, double temperatura, double calculoDaTemperatura) {
        if (opcao=='C'){
            System.out.printf("A temperatura de %.1fºC Celcius para Fahrenheit = %.1fºF\n",temperatura,calculoDaTemperatura);
        }else{
            System.out.printf("A temperatura de %.1fºF Fahrenheit para Celcius = %.1fºC\n",temperatura,calculoDaTemperatura);
        }
    }

    private static double converterFahrenheitParaCelcius(double temperatura) {
        double temperaturaCelcius = (temperatura - 32) / 1.8;
        return temperaturaCelcius;
    }

    private static double converterCelciusParaFahrenheit(double temperatura) {
        double temperaturaFahrenheit = temperatura * 1.8 + 32;
        return temperaturaFahrenheit;
    }
}
