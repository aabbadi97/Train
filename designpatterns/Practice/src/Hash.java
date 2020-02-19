//hashmap et hashset training.

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
public class Hash {
    public static void main(String[] args){
        HashMap<Integer,String> HM = new HashMap<Integer,String>();
        HashSet<String> HS = new HashSet<String>();
        HM.put(1,"val 1");
        HM.put(2,"val 2");
        HM.put(3,"val 3");
        HM.put(4,"val 4");
        HM.put(5,"val 5");
        HM.put(6,"val 6");
        HM.put(7,"val 7");

        Set<Map.Entry<Integer,String>> set= HM.entrySet();

        for(Map.Entry<Integer,String> map : set){
            System.out.print(map.getKey()+":");
            System.out.println(map.getValue());
        }

        HS.add("value 1");
        HS.add("value 2");
        HS.add("value 3");
        HS.add("value 4");
        HS.add("value 5");
        HS.add("value 6");
        HS.add("value 7");
        System.out.println(HS);

    }
}
