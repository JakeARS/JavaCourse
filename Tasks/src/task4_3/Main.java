package task4_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Collection<String> startCollection = new ArrayList<>();

        startCollection.add("Karl");
        startCollection.add("Klara");
        startCollection.add("Karl");
        startCollection.add("Klara");

        for (String i : startCollection
        ) {
            System.out.println(i);
        }

        Collection<String> newCollection = removeDuplicates(startCollection);
        System.out.println(System.lineSeparator() + "Сlear Collection:");

        for (String i : newCollection
        ) {
            System.out.println(i);
        }

    }

    public static <T>Collection<T> removeDuplicates(Collection<T> collection) {
        Collection<T> clearCollection = new HashSet<T>(collection);
        return clearCollection;
    }
}