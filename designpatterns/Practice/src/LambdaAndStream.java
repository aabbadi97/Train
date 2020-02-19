import java.util.*;
public class LambdaAndStream {
    static List<String> villes = new ArrayList<>();

    public static List<String> getVilles(){
        villes.add("Maroc, Casablanca");
        villes.add("France, Paris");
        villes.add("Maroc, Agadir");
        villes.add("USA, Washington");
        villes.add("Maroc, Rabat");
        villes.add("England, London");
        villes.add("Maroc, Tanger");

        return villes;
    }

    public static void main(String[] args){

        List<String> myCountry = getVilles();

        System.out.println("Cities from Morocco : ");

        myCountry.stream()
                .filter(elt->elt.startsWith("Maroc"))
                .map(elt->elt.toUpperCase())
                .sorted()
                .forEach(elt->System.out.println(elt));


    }
}
