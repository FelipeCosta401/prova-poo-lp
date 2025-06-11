package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = scanner.next().charAt(0);

        if (escala == 'C' || escala == 'c') {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", fahrenheit);
        } else if (escala == 'F' || escala == 'f') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("Temperatura equivalente em Celsius: %.2f\n", celsius);
        } else {
            System.out.println("Escala invalida.");
        }

        scanner.close();
    }

}
