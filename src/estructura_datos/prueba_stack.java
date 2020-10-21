/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import java.util.Stack;

/**
 *
 * @author eperez50
 */
public class prueba_stack {
    public void prueba() {
        // Creating a Stack
        Stack<String> stackDeCartas = new Stack<>();

        // Pushing new items to the Stack
        stackDeCartas.push("Sota");
        stackDeCartas.push("Caballo");
        stackDeCartas.push("Rey");
        stackDeCartas.push("As");

        System.out.println("--------------------Stack--------------------");
        
        System.out.println("Stack => " + stackDeCartas);
        System.out.println();

        // Popping items from the Stack
        String cardAtTop = stackDeCartas.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackDeCartas);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stackDeCartas.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackDeCartas);

    }
}
