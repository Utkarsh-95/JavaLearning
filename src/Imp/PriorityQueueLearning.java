package Imp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class PriorityQueueLearning {

    public static void frequency(ArrayList<String> s) {

        HashMap<String, Long> hm = (HashMap<String, Long>) s.stream().collect(Collectors.groupingBy(charCount -> charCount, Collectors.counting()));

//        Iterator itr = hm.entrySet().iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next() + " ");
//        }
//        customized min heap
        PriorityQueue<String> pQueue = new PriorityQueue<>((String t, String t1) -> {
//            System.out.println(t + " " + t1);
            return (int) (hm.get(t) == hm.get(t1) ? t1.compareTo(t) : hm.get(t) - hm.get(t1));//min heap
        });

        hm.entrySet().stream().forEach(e -> {
            pQueue.add(e.getKey());
            if (pQueue.size() > 3) {
                pQueue.poll();
            }
        });

//        Iterator iterator = pQueue.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
        while (!pQueue.isEmpty()) {
            System.out.print(pQueue.poll() + " ");
        }

    }

    public static void secondLargestNumber(Integer... arr) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));

//        for max heap
//        PriorityQueue<Integer> pQueue = new PriorityQueue<>((t, t1) -> {
//            return t1.compareTo(t);
//        });
//      for min heap
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

//        al.stream().map((a) -> {
//            pQueue.add(a);
//            return a;
//        }).filter((item) -> (pQueue.size() > 2)).forEachOrdered((item) -> {
//            //it runs on log(k) complexity
//            pQueue.poll();
//        });
        for (Integer a : al) {
            pQueue.add(a);
            if (pQueue.size() > 2) {
                pQueue.poll();
            }
        }

        // Printing the top element and removing it from the PriorityQueue container 
//        System.out.println(pQueue.poll());
        // Printing the top element again 
        System.out.println("Second Greatest element = " + pQueue.peek());

//        System.out.println("Sum of two largest number = " + (pQueue.poll() + pQueue.peek()));
//        Iterator iterator = pQueue.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
    }

    public static void main(String args[]) {

        secondLargestNumber(1, 2, 5, 8, 11, 0, 22, 88);
        ArrayList<String> als = new ArrayList<>(Arrays.asList("Java", "Java", "Java", "Java", "Java",
                "Python", "Python", "Python", "Python", "Angular", "Angular", "Angular", "JQuery"));
        frequency(als);

    }
}
