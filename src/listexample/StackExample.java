package listexample;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stck1 = new Stack<>();
        // adding data - push
        stck1.push("Apple");
        stck1.push("Mango");
        stck1.push("Orange");
        stck1.push("Guava");
        stck1.push("Pineapple");
        stck1.push("Watermelon");
//add lines
        System.out.println("stck1 is :"+stck1);

        // removing data - pop
        stck1.pop();
        stck1.pop();
        System.out.println("stck1 after 2 pops : "+stck1);

        System.out.println("traverse using foreach");
        for (String s1 : stck1){
            System.out.println(s1);
        }
    }
}
