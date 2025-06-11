package src;

import java.util.Scanner;

public class Main {public static void main (String[] args) {

        Scanner prompt = new Scanner(System.in);

        System.out.println("Informe quantos minutos o cliente fez de ligacao: ");
        int min = prompt.nextInt();

        float preco = 50;

        if(min<=100){
            System.out.println("Valor a pagar: R$"+preco);
        } else {
            int minutosExcedidos = min-100;
            System.out.println("Valor a pagar: R$"+(preco + (minutosExcedidos * 2)));
        }

    }
}
