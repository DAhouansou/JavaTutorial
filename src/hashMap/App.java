package hashMap;

import java.util.HashMap;

public class App {
    public static void main (String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        map.put(6, "Hello");

        String text = map.get(6);

        System.out.println(text);
    }
}
