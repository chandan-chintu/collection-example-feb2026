package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // wrapper class
        //int a=10; int b=-10; int c=null
        //Integer d=null;
        //declaring arraylist
        List<Integer> list1 = new ArrayList<>();

        //adding elements
        list1.add(34);
        list1.add(56);
        //list1.add(null);
        list1.add(12);
        list1.add(9);
        list1.add(66);
        list1.add(34);
        list1.add(98);
        list1.add(32);
        list1.add(56);

        System.out.println("list1 is : "+list1);
// add lines
        // remove data
        list1.remove(1);
        System.out.println("list1 after removing index 1 : "+list1);
        list1.remove(4);
        System.out.println("list1 after removing index 4 : "+list1);

        // search
        System.out.println("list1 element at 3rd index : "+list1.get(3));
        System.out.println("list1 element at 5th index : "+list1.get(5));
//add lines
        // size
        System.out.println("list1 size is : "+list1.size());

        // sort
        Collections.sort(list1);// ascending order
        System.out.println("list1 in ascending order : "+list1);

        Collections.sort(list1, Collections.reverseOrder());//descending order
        System.out.println("list1 in descending order : "+list1);

        // traverse using foreach
        System.out.println("traverse using foreach");
        for(Integer l1 : list1){
            System.out.println(l1);
        }
    }
}
