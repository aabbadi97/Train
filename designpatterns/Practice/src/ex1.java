
//verifier si un nombre null , positif , négatif .
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("entrer nombre");
        int input = in.nextInt();

        if (input > 0) {
            System.out.print("ce nombre est positif");
        } else if (input == 0) {
            System.out.print("ce nombre est nul");
        } else {
            System.out.print("ce nombre est negatif");
        }
    }

}