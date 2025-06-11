package src;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dados de entrada
        System.out.print("Preço unitário do produto: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = scanner.nextDouble();

        double totalCompra = precoUnitario * quantidade;

        if (dinheiroRecebido >= totalCompra) {
            double troco = dinheiroRecebido - totalCompra;
            System.out.println("TROCO = " + troco);
        } else {
            double falta = totalCompra - dinheiroRecebido;
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + falta + " REAIS");
        }
    }
}
