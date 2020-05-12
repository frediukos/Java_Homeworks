package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayOfWords {

    public static void main(String[] args) {
        String[] array = {"One", "Two", "One", "Eleven", "Eight", "Eight"};

        // Map, HashMap: key - value. (Example: "Cat", 3 - String, Integer. 12, 20 - Integer, Integer)

        Map<String, Integer> collection = new HashMap<>(); // 4

        for (String i: array) {
            collection.put(i, 0);
        }
        //collection.put(array[0], "Cats");

//        if (array.length == collection.size()) {
//            System.out.println("No duplicates");
//        } else {
//            System.out.println("Duplicates");
//        }

        // traverse
        //System.out.println(collection.keySet());
//        Set<Object> uniqueElements = new HashSet<>();
//        uniqueElements.add(collection);
//        for (Object i: uniqueElements) {
//            System.out.println(i);
//        }
        Set<String> uniqueElements = collection.keySet();

        for (String i: uniqueElements) {
            System.out.println(i);
        }

        Map<String, Integer> collection2 = new HashMap<>();
        for (String i: array) {
            if (collection2.containsKey(i)) {
                collection2.put(i, collection2.get(i) + 1);
            } else {
                collection2.put(i, 1);
            }

        }

        for (String i: uniqueElements) {
            System.out.println( i + " = " + collection2.get(i));
        }

        System.out.println(collection2);
    }
}
