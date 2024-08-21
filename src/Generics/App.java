package Generics;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("cat");
        list.add("dog");
        list.add("frog");

        String animal1 = list.get(1);
        System.out.println(animal1);



        /////////// Hashmaps can have multiple variable types///////////////////

        HashMap<Integer, String> map = new HashMap<Integer, String>();
    }
}
