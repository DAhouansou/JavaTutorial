package sortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> LinkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(hashMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(5, "cat");
        map.put(3, "dog");
        map.put(2, "horse");
        map.put(7, "sheep");
        map.put(6, "cow");

        for(Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
