//Bubble Sorting implementation:

import java.util.Arrays;
import java.util.Scanner;
public class ex6_sorting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("entrer le nbre d elements à sorter");
        int n = in.nextInt();
        int[] T = new int[n];
        System.out.println("entrer tous les elements à sorter");
        for (int k=0; k<n; k++){
            T[k]=in.nextInt();
        }

        for (int j = T.length-1;j>=2;--j){
            for(int i=0;i<j;++i){
                if(T[i] > T[i+1]){
                    int d=T[i];
                    T[i]=T[i+1];
                    T[i+1]=d;
                }
            }
        }
        System.out.print(Arrays.toString(T));
    }
}
