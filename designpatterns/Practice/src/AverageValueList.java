import java.util.*;
public class AverageValueList {
    public  Double average(List<Integer> list) {
        return list.stream().mapToDouble(i->i).average().getAsDouble();

    }
    public static void main(String[] args){
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(3);
        lst.add(4);
        lst.add(6);
        lst.add(8);
        lst.add(4);
        lst.add(3);
        lst.add(11);

        AverageValueList A = new AverageValueList();
        final Double average = A.average(lst);
        System.out.print(average);
    }
}
