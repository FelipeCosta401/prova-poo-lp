package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario atual: ");
        double salario = scanner.nextDouble();

        double aumento = 0;
        double novoSalario = 0;
        double percentualAumento = 0;

        if (salario <= 1000.00) {
            aumento = salario * 0.20;
            percentualAumento = 20;
        } else if (salario <= 3000.00) {
            aumento = salario * 0.15;
            percentualAumento = 15;
        } else if (salario <= 8000.00) {
            aumento = salario * 0.10;
            percentualAumento = 10;
        } else {
            aumento = salario * 0.05;
            percentualAumento = 5;
        }

        novoSalario = salario + aumento;

        System.out.printf("Novo salario: R$ %.2f\n", novoSalario);
        System.out.printf("Aumento: R$ %.2f\n", aumento);
        System.out.printf("Percentual de aumento: %.0f%%\n", percentualAumento);

        scanner.close();
    }
}
