package setexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> set1 = new TreeSet<>();

        set1.add("Mango");
        set1.add("Guava");
        set1.add("Grapes");
        set1.add("Pineapple");
        set1.add("Orange");
        set1.add("Watermelon");
        set1.add("Mango");

        System.out.println("set1 is : "+set1);

        set1.remove("Orange");
        System.out.println("set1 after remove : "+set1);

        System.out.println("traverse using foreach");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
