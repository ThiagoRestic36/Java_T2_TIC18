package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = Ler.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = Ler.nextDouble();

        CalculadoraSimples calculadora = new CalculadoraSimples();
        calculadora.resultado(numero1, numero2);

        Ler.close();
    }
}