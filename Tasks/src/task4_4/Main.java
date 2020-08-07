package task4_4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Number> startMap = new HashMap<>();
        startMap.put("Ivan", 20);
        startMap.put("Petr", 20);
        startMap.put("Tihon", 21);
        startMap.put("Ippolit", 21);
        startMap.put("Dazdraperma", 21);
        startMap.put("Serezha Zverev", 57);
        startMap.put("Roza Syabitova", 800);

        for (String keys : startMap.keySet()
        ) {
            System.out.println(keys + " " + startMap.get(keys));
        }

        //Map<Number, Collection<String>> newMap =
        Map<Number, Collection<String>> newMap = reverseMap(startMap);

        for (Number keys : newMap.keySet()
        ) {
            System.out.println(keys + " " + newMap.get(keys));
        }
    }

    public static <K, V> Map<V, Collection<K>> reverseMap(Map<K, V> map) {
        Map<V, Collection<K>> newMap = new HashMap<>();

        //убрал этот цикл, все теперь в одном
        /*for (V i : new HashSet<>(map.values())
        ) {
            newMap.put(i, new ArrayList<>());
        }*/

        //Collection<K> list= newMap.get(20);
        for (K j : map.keySet()
        ) {
            if (!newMap.containsKey(map.get(j))) {
                newMap.put(map.get(j), new ArrayList<>());
            }

            Collection<K> list= new ArrayList(newMap.get(map.get(j)));
            list.add(j);
            newMap.put(map.get(j), list);

        }


        return newMap;
    }
}