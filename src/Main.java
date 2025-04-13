import java.util.Scanner;

public class Main {

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
                resultado = Calculadora.somar(numero1, numero2);
                break;
            case "-":
                resultado = Calculadora.subtrair(numero1, numero2);
                break;
            case "*":
                resultado = Calculadora.multiplicar(numero1, numero2);
                break;
            case "/":
                try {
                    resultado = Calculadora.dividir(numero1, numero2);
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
