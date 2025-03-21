package calculadora;

import java.util.Scanner;

public class CalculadoraSimples {

	public void resultado(double numero1, double numero2) {
        double resultado;
        char option;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite 1 para Somar");
            System.out.println("Digite 2 para Subtrair");
            System.out.println("Digite 3 para Multiplicar*");
            System.out.println("Digite 4 para Dividir");

            System.out.println("Escolha uma opção ou digite 0 para sair: ");
            option = scanner.next().charAt(0);

            switch (option) {
                case '1':
                    resultado = sum(numero1, numero2);
                    System.out.println("A soma entre " + numero1 + " e " + numero2 + " é: " + resultado);
                    break;

                case '2':
                    resultado = subtract(numero1, numero2);
                    System.out.println("A subtração entre " + numero1 + " e " + numero2 + " é: " + resultado);
                    break;

                case '3':
                    resultado = multiply(numero1, numero2);
                    System.out.println("A multiplicação entre " + numero1 + " e " + numero2 + " é: " + resultado);
                    break;

                case '4':
                    resultado = divide(numero1, numero2);
                    System.out.println("A divisão entre " + numero1 + " e " + numero2 + " é: " + resultado);
                    break;

                case '0':
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (option != '0');

        scanner.close();
    }

    private double divide(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
    }

    private double multiply(double numero1, double numero2) {
        return numero1 * numero2;
    }

    private double subtract(double numero1, double numero2) {
        return numero1 - numero2;
    }

    private double sum(double numero1, double numero2) {
        return numero1 + numero2;
    }
}