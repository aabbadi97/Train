//resoudre l'equation : ax²+bx+c=0.

import java.util.Scanner;
public class ex2 {
    public static void main(String[] argrs) {
        Scanner in = new Scanner(System.in);
        System.out.print("entrer a");
        double a = in.nextDouble();
        System.out.print("entrer b");
        double b = in.nextDouble();
        System.out.print("entrer c");
        double c = in.nextDouble();

        double delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.println("pas de solution dans R");
        } else if (delta == 0) {
            System.out.print("une seule solution S=" +  -b / (2 * a));
        } else {
            System.out.println("deux solutions S1=" + (-b - Math.sqrt(delta)) / (2 * a) + " et S2=" + (-b + Math.sqrt(delta)) / (2 * a));
        }
    }
}
