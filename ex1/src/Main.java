package src;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float primeiraNota= s.nextFloat();

        System.out.println("Informe a primeira nota: ");
        float segundaNota = s.nextFloat();

        float mediaFinal = (primeiraNota+segundaNota) / 2;

        System.out.println("NOTA FINAL: "+mediaFinal);
        if(mediaFinal < 60) System.out.println("REPROVADO");

    }
}