package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        // HashSet does not retain order.
        Set<String> set1 = new HashSet<String>();

        set1.add("dog");
        set1.add("cat");
        set1.add("cow");
        set1.add("mouse");
        set1.add("horse");

        // Adding duplicate items does nothing
        set1.add("horse");


        //System.out.println(set1);

        //LinkedHashSet remembers the order you added items in
        Set<String> set2 = new LinkedHashSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("cow");
        set2.add("mouse");
        set2.add("horse");

        set2.add("mouse");

        //System.out.println(set2);




        Set<String> set3 = new TreeSet<String>();

        if(set3.isEmpty()) {
            System.out.println("Set3 is empty");
        }

        set3.add("dog");
        set3.add("cat");
        set3.add("cow");
        set3.add("mouse");
        set3.add("horse");

        set3.add("mouse");

        System.out.println(set3);

        if(set3.isEmpty()) {
            System.out.println("Set3 is empty");
        }


        /////////////////// Iteration ///////////////////

        for(String element: set3) {
            System.out.println(element);
        }


        //////// Does set contain a given item? /////////////////
        if(set3.contains("sheep")) {
            System.out.println("Contains sheep");
        }

        if(set3.contains("cow")) {
            System.out.println("Contains cow");
        }




        Set<String> set4 = new TreeSet<String>();

        set4.add("dog");
        set4.add("cat");
        set4.add("rat");
        set4.add("moose");
        set4.add("panda");

        //////////////intersection////////////////////

        Set<String> intersection = new HashSet<String>(set3);


        intersection.retainAll(set4);
        System.out.println(intersection);

        ////////////////Differance///////////////////

        Set<String> difference = new HashSet<String>(set3);

        difference.removeAll(set4);
        System.out.println(difference);
    }
}
