/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author eperez50
 */
public class prueba_queue_iterator {
    public void prueba() {
        
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("John");
        waitingQueue.add("Brad");
        waitingQueue.add("Angelina");
        waitingQueue.add("Julia");

        System.out.println("--------------------Queue iterate--------------------");
        
        System.out.println("\n=== Iterating over a Queue using iterator() ===");
        Iterator<String> waitingQueueIterator = waitingQueue.iterator();
        while (waitingQueueIterator.hasNext()) {
            String name = waitingQueueIterator.next();
            System.out.println(name);
        }

        System.out.println("\n=== Iterating over a Queue using Java 8 forEach() ===");
        waitingQueue.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("\n=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===");
        waitingQueueIterator = waitingQueue.iterator();
        waitingQueueIterator.forEachRemaining(name -> {
            System.out.println(name);
        });

        System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
        for(String name: waitingQueue) {
            System.out.println(name);
        }
    }
}