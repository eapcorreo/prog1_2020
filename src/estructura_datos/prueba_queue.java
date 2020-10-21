/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author eperez50
 */
public class prueba_queue {
    public void prueba() {
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Jennifer");
        waitingQueue.add("Angelina");
        waitingQueue.add("Johnny");
        waitingQueue.add("Sachin");

        System.out.println("--------------------Queue--------------------");
        
        System.out.println("WaitingQueue : " + waitingQueue);

        // Check if a Queue is empty
        System.out.println("esta waitingQueue vacia? : " + waitingQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Tamano de waitingQueue : " + waitingQueue.size());

        // Check if the Queue contains an element
        String name = "Johnny";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue si contiene " + name);
        } else {
            System.out.println("Waiting Queue no contiene " + name);
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstPersonInTheWaitingQueue =  waitingQueue.element();
        System.out.println("Primera persona en la Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("Primera persona en la Waiting Queue : " + firstPersonInTheWaitingQueue);

    }
}

