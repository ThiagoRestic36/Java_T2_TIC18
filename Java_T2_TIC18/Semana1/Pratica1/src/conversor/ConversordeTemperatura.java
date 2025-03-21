package conversor;
import java.util.Scanner;

public class ConversordeTemperatura {
	
	public void Conversao() {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = Ler.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius:");
            double TCelsius = Ler.nextDouble();
            double TFahrenheit = cel_Fah(TCelsius);
            System.out.println("A temperatura em Fahrenheit é: " + TFahrenheit);
        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            double TFahrenheit = Ler.nextDouble();
            double TCelsius = fah_Cel(TFahrenheit);
            System.out.println("A temperatura em Celsius é: " + TCelsius);
        } else {
            System.out.println("Escolha inválida.");
        }

        Ler.close();
    }

    private double cel_Fah(double TCelsius) {
        return (TCelsius * 9/5) + 32;
    }

    private double fah_Cel(double TFahrenheit) {
        return (TFahrenheit - 32) * 5/9;
    }

}
