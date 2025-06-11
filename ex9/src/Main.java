package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do produto: ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco = 0;

        if (codigoProduto == 1) {
            preco = 5.00;
        } else if (codigoProduto == 2) {
            preco = 3.50;
        } else if (codigoProduto == 3) {
            preco = 4.80;
        } else if (codigoProduto == 4) {
            preco = 8.90;
        } else if (codigoProduto == 5) {
            preco = 7.32;
        }

        double total = preco * quantidade;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        scanner.close();
    }

}
