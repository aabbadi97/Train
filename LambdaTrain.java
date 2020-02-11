import java.util.Scanner;
public class LambdaTrain {

    public static ArrayProcessor counter( double value ) {
        return array -> {
            int count=0;
            for (int i=0;i<array.length;i++){
                if (array[i]==value)
                    count++;
            }
            return count;
        }
    ;}

    public static final ArrayProcessor maxeur = array -> {
        double max=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    };

    public static final ArrayProcessor mineur = array -> {
        double min=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    };

    public static final ArrayProcessor sommeur = array -> {
        double total=0;
        for (int i=0;i<array.length;i++){
            total+=array[i];
        }
        return total;
    };

    public static final ArrayProcessor moyenneur = array -> sommeur.apply(array)/array.length;



    public static void main(String[] args){

        double [] list1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] list2 = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14 };


        System.out.println("La somme des valeurs de la list1 est : S=" + sommeur.apply(list1));

        System.out.println("La moyenne des valeurs de la list1 est : Moy="+ moyenneur.apply(list1));

        System.out.println("Le Maximum de la list2 est: Max="+ maxeur.apply(list2));

        System.out.println("Le Minimum de la list2 est: Min=" + mineur.apply(list2));

        System.out.println();

        Scanner S = new Scanner(System.in);

        System.out.println("entrer la valeur à compter dans la liste 1");
        double valeur1 = S.nextDouble();

        System.out.println("entrer la valeur à compter dans la liste 2");
        double valeur2 = S.nextDouble();

        System.out.println("Le Conteur de la valeur " + valeur1 + " dans la list1 est : " + counter(valeur1).apply(list1));

        System.out.println("Le Conteur de la valeur " + valeur2 + " dans la list2 est : " + counter(valeur2).apply(list2));

    }
}