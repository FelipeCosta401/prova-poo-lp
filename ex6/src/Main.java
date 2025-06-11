package src;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Informe o nivel de glicose no sangue: ");
        int nivelGlicose = prompt.nextInt();

        if(nivelGlicose <= 100) System.out.println("Classificacao: normal");
        if(nivelGlicose > 100 && nivelGlicose <=140) System.out.println("Classificacao: elevado");
        if(nivelGlicose > 140) System.out.println("Classificacao: diabetes");

    }
}
