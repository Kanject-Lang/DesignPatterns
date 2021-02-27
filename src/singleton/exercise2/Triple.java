package singleton.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Triple {
    private static Map<Integer, Triple> tripleMap = new ConcurrentHashMap<>(3);

    private Triple(int index) {
        System.out.println("创建了一个Triple[" + index + "]实例");
    }
    public static Triple getInstance(int index) {
        if (index >= 0 && index <= 2) {
            Triple triple = tripleMap.get(index);
            if (triple == null) {
                tripleMap.put(index, new Triple(index));
                return tripleMap.get(index);
            } else {
                return triple;
            }
        }
        return null;
    }
}
