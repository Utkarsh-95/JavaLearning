
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UseofCollectionsDS {

    public static void List() {
        List<String> list = new ArrayList<>();

        list.add("Zero");
        list.add("One");
        list.add("Two");
        list.add("Three");

        list.remove(2);
        list.add(2, "New"); // add at 2nd index

        System.out.println(list);
    }

    public static void Hashmap() {

        Map<String, Integer> map = new HashMap<>();
//        map.put(new Key("utkarsh"), "ALL");
        map.put("utkarsh", 30);
        map.put("a", 1000);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);

        System.out.println("---------------------------------------------------");
        map.entrySet().stream().forEach(x -> System.out.println(x));
        System.out.println("---------------------------------------------------");
//        for Sorting a collections
//        System.out.println("HashMap before sorting, random order ");
//        Set<Entry<String, Integer>> entries = map.entrySet();
//
//        for (Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey() + " ==> " + entry.getValue());
//        }
//        
        TreeMap<String, Integer> sorted = new TreeMap<>(map);
        Set<Entry<String, Integer>> mappings = sorted.entrySet();

        System.out.println("HashMap after sorting by keys in ascending order ");
        for (Entry<String, Integer> mapping : mappings) {
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }

        System.out.println("HashMap: " + map.toString());

        map.replace("utkarsh", 50);
        map.putIfAbsent("f", Integer.MIN_VALUE);
        // provide value for the key which has 
        // to replace it's current value, 
        // using replace(K key, V value) method 
        map.replace("b", 200);

        // print new mapping 
        System.out.println("New HashMap: " + map.toString());
        Iterator hmIterator = map.entrySet().iterator();

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            int marks = ((int) mapElement.getValue() + 10);
            System.out.println(mapElement.getKey() + " : " + marks);
        }
    }

    public static void HashTable() {
        // creating a hash table 
        Hashtable<String, Integer> marks = new Hashtable<>();

        // enter name/marks pair 
        marks.put("tweener", 345);
        marks.put("krantz", new Integer(100));
        marks.put("burrows", 790);
        marks.put("tancredi", 800);
        marks.put("bellick", 435);

        // check whether a value exists or not 
        if (marks.containsKey("burrows")) {
            System.out.println("Key found in table");
        }

//        marks.clear();
        marks.forEach(
                (k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }

    public static void LinkedList() {

        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add few Elements
        list.add("Element1");
        list.add("Element2");

        // Display LinkList elements
        System.out.println("LinkedList before: " + list);

        /* poll(): Retrieves and removes the head (first element) of this list.*/
        System.out.println("Element removed: " + list.poll());
        System.out.println("Element removed: " + list.pollFirst());
        System.out.println("Element Retrived: " + list.peekLast());

        // Displaying list elements after poll() operation
        System.out.println("LinkedList after: " + list);
    }

    public static void ConvertHashSettoTreeSet() {
        // Create a HashSet
        HashSet<String> hset = new HashSet<>();

        //add elements to HashSet
        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        hset.add("Element4");

        // Displaying HashSet elements
        System.out.println("HashSet contains: " + hset);

        // Creating a TreeSet of HashSet elements
        Set<String> tset = new TreeSet<>(hset);

        // Displaying TreeSet elements
        System.out.println("TreeSet contains: ");
        for (String temp : tset) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
//        List();
//        Hashmap();
//        HashTable();
        LinkedList();
//        ConvertHashSettoTreeSet();
    }
}
