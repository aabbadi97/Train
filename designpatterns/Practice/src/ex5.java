//demander à l'utilisateur d'inserer une lettre puis determiner si cette lettre est voyelle ou constante.

import java.util.Scanner;
public class ex5 {
    public static void main(String[] args)
    {
        boolean T=true;
        while (T){
            Scanner in = new Scanner(System.in);
            System.out.println("entrer une lettre maj ou miniscule");
            String x = in.next();

            if (x.length()>1 || (x.charAt(0)<65) || (x.charAt(0)>90 && x.charAt(0)<97) || (x.charAt(0)>122)){
              System.out.println("erreur vous devez inserer une seule lettre soit majuscule ou miniscule");
            }
            else{
                T=false;
                if (x.equals("a") ||x.equals("A") ||x.equals("e") || x.equals("E") || x.equals("i") || x.equals("I") || x.equals("o") || x.equals("O") || x.equals("u") || x.equals("U")){
                    System.out.print("voyelle");
                }
                else{
                    System.out.println("consonne");
                }
            }
        }
    }

}

