package src;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Informe a primeira tentativa: ");
        float num1 = prompt.nextFloat();

        System.out.println("Informe a segunda tentativa: ");
        float num2 = prompt.nextFloat();

        System.out.println("Informe a terceira tentativa: ");
        float num3 = prompt.nextFloat();

        float maior = num1;

        if(num2<maior) maior = num2;
        if(num3<maior) maior = num3;

        System.out.println("Maior distancia = "+maior);

    }

}
