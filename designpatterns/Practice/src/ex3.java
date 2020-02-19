//demander à lutilisateur 3 nbres puis les sorter.

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("entrer a");
        int a = in.nextInt();
        System.out.println("entrer b");
        int b = in.nextInt();
        System.out.println("entrer c");
        int c = in.nextInt();

        if (a>b)
        {
            if (a>c)
            {
                System.out.println("The greatest is a=" + a);
            }
            else{
                System.out.println("The greatest is c=" + c );
            }
        }
        else
        {
            if (b>c)
            {
                System.out.println("The greatest is b=" +b);
            }
            else{
                System.out.println("The greatest is c=" +c);
            }
        }
    }

}
