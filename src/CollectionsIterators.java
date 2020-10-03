
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsIterators {

    public static void concurrentmodificationlistiterate() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // get the iterator
        Iterator<String> it = list.iterator();

        //manipulate list while iterating
        while (it.hasNext()) {
            System.out.println("list is:" + list);
            String str = it.next();
            System.out.println(str);
            if (str.equals("2")) {
                list.remove("5");
            }
            if (str.equals("3")) {
                list.add("3 found");
            }
            //below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
            if (str.equals("4")) {
                list.set(1, "4");
            }
        }
    }

    public static void listiterate() {
        try {
            List<String> arrlist = new ArrayList<>();

            // Adding elemnet to srclst 
            arrlist.add("Utkarsh");
            arrlist.add("Pratap");
            arrlist.add("Singh");
//            Collections.sort(arrlist);

            //using for-each loop
            for (String obj : arrlist) {
                System.out.println("By for each-" + obj);
            }
            arrlist.forEach((obj) -> {
                System.out.println("By Lambda-" + obj);
            });
//            using iterator
            Iterator<String> it = arrlist.iterator();
            while (it.hasNext()) {
                String obj = it.next();
                System.out.println("By Iterator-" + obj);
            }
            // Print the list 
            System.out.println("List: " + arrlist);
            // creating object of type Enumeration<String> 
            Enumeration<String> e = Collections.enumeration(arrlist);
            // Print the Enumeration 
            System.out.println("\nEnumeration over list: ");
            // print the enumeration 
            while (e.hasMoreElements()) {
                System.out.println("Value is: " + e.nextElement());
            }
            long startTime = System.currentTimeMillis();

            long total = 0;
            for (int i = 0; i < 10000000; i++) {
                total += i;
            }

            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println(elapsedTime);

        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Exception thrown : " + e);
        }
    }

    public static void hashmapiterate() {
        Map<String, String> hm = new HashMap<>();
        {
            hm.put("One", "1");
            hm.put("Two", "2");
            hm.put("Three", "3");
            hm.put("Four", "4");
            hm.put("Five", "5");
            hm.put("Six", "6");
        }
        System.out.println("HashMap before iterator: " + hm);
        Enumeration<String> e = Collections.enumeration(hm.keySet());
        while (e.hasMoreElements()) {
            String key = e.nextElement();
            String value = hm.get(key);
            System.out.println("key: " + key + ", value: " + value);
            if (key.equals("Three")) {
                hm.put("new", "new3");
            }
        }
        System.out.println("HashMap after iterator: " + hm);

    }

    public static void concurrenthashmap() {
        Map<String, String> myMap = new ConcurrentHashMap();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: " + myMap);
        Iterator<String> it = myMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            if (key.equals("3")) {
                myMap.put(key, "new3");
                break;
            }
        }
        System.out.println("ConcurrentHashMap after iterator: " + myMap);

        //HashMap
        myMap = new HashMap<>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: " + myMap);
        Iterator<String> it1 = myMap.keySet().iterator();

        while (it1.hasNext()) {
            String key = it1.next();
            if (key.equals("3")) {
                myMap.put(key, "new3");
                break;
            }
        }
        System.out.println("HashMap after iterator: " + myMap);
    }

    public static void main(String[] argv) throws Exception {
//        listiterate();
//        hashmapiterate();
//        concurrentmodificationlistiterate();
        concurrenthashmap();

    }
}
