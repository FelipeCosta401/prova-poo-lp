package src;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int num1 = prompt.nextInt();

        System.out.println("Informe o segundo valor: ");
        int num2 = prompt.nextInt();

        System.out.println("Informe o terceiro valor: ");
        int num3 = prompt.nextInt();

        int menor = num1;

        if(num2<menor) menor = num2;
        if(num3<menor) menor = num3;

        System.out.println("MENOR = "+menor);

    }
}