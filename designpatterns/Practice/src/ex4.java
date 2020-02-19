//demander à l'utilisateur un nombre(1 à 7) puis retourner le jour équivalent de ce nombre.

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean T=true;
        while (T){
            System.out.println("entrer un nombre entre 1 et 7");
            int a = in.nextInt();
            if (a>0 && a<8){
                T=false;
                String day= "";
                switch(a){
                    case 1: day="tnin"; break;
                    case 2: day="tlat"; break;
                    case 3: day="larbe3"; break;
                    case 4: day="khmis"; break;
                    case 5: day="jm3a"; break;
                    case 6: day="sbt"; break;
                    case 7: day="l7ed"; break;
                }
                System.out.println("Ce nombre correspond à :" + day);
            }
            else{
                System.out.println("erreur, le nombre doit etre entre 1 et 7");
            }
        }


    }
}
