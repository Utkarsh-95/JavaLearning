/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imp;

import java.util.concurrent.*;
import java.util.*;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class BlockingQueueEx {

    public static void main(String[] args) throws InterruptedException {

        // define capacity of ArrayBlockingQueue 
        int capacity = 5;

        // create object of ArrayBlockingQueue 
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);

        // Add elements to ArrayBlockingQueue using put method 
        queue.put("StarWars");
        queue.put("SuperMan");
        queue.put("Flash");
        queue.put("BatMan");
        queue.put("Avengers");
//        queue.put("Avengers End Game");

        // print Queue 
        System.out.println("queue contains " + queue);

        // remove some elements 
//        queue.remove();
//        queue.remove();
//
//        // Add elements to ArrayBlockingQueue 
//        // using put method 
//        queue.put("CaptainAmerica");
//        queue.put("Thor");

        System.out.println("queue contains " + queue);
    }
}
