package HashMap;

import java.util.HashMap;

/**
 * Map
 */
public class Map {

    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(2, 4);
        m.put(1, m.getOrDefault(1,0)+1);
        System.out.println(m.toString());
    }
}