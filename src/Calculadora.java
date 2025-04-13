import java.util.Scanner;

/**
 * Classe que implementa uma calculadora com quatro operações básicas.
 */
public final class Calculadora {

    private Calculadora() {
        // Construtor privado para impedir instanciação
    }

    /**
     * Soma dois números.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da soma.
     */
    public static double somar(double a, double b) {
        return a + b;
    }

    /**
     * Subtrai dois números.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da subtração.
     */
    public static double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da multiplicação.
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dois números.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado da divisão.
     * @throws IllegalArgumentException se b for zero.
     */
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Método principal que executa a calculadora.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        String operacao = scanner.next();

        double resultado;

        switch (operacao) {
            case "+":
                resultado = somar(numero1, numero2);
                break;
            case "-":
                resultado = subtrair(numero1, numero2);
                break;
            case "*":
                resultado = multiplicar(numero1, numero2);
                break;
            case "/":
                try {
                    resultado = dividir(numero1, numero2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}