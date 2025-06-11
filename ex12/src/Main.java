package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int horaInicial = scanner.nextInt();

        System.out.print("Digite a hora final: ");
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("DURACAO DO JOGO: " + duracao + " hora(s)");

        scanner.close();
    }
}
