package mapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(105,"Guava");
        map1.put(103,"Mango");
        map1.put(101,"Apple");
        map1.put(102,"pineapple");
        map1.put(107,"Watermelon");
        map1.put(110,"Orange");
        map1.put(104,"Grapes");
        map1.put(108,"Grapes");
        map1.put(null,"Banana");
        map1.put(104,"Pomegrante");// old value gets removed and new value gets added

        System.out.println("map1 is : "+map1);

        map1.remove(108);
        System.out.println("map1 after remove : "+map1);

        System.out.println("traverse using  - entryset");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"---"+m1.getValue());
        }
    }
}
