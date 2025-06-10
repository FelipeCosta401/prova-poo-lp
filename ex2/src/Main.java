package src;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o coeficiente A: ");
        float coefA= s.nextFloat();

        System.out.println("Informe o coeficiente B: ");
        float coefB = s.nextFloat();

        System.out.println("Informe o coeficiente C: ");
        float coefC = s.nextFloat();

        float delta = (coefB*coefB) - 4*coefA*coefC;

        if(delta < 0) throw new RuntimeException("Equação improcessável!");

        double x1;
        double x2;

        x1 = (-coefB+Math.sqrt(delta)) / (2*coefA);
        x2 = (-coefB-Math.sqrt(delta)) / (2*coefA);

        System.out.println("X1 = "+x1);
        System.out.println("X2 = "+x2);

    }
}