/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos.pilas;

/**
 *
 * @author eperez50
 */
public class Pila implements IPila {

    private int tope = -1;
    private int[] pila = new int[5];
    final int MAX = 4;

    public boolean llena() {
        return (tope == MAX);
    }

    public void push(int elem) {
        if (this.llena()) {
            System.out.println("Error. Pila llena !");
            return;
        } else {
            tope++;
            pila[tope] = elem;
        }
    }

    public boolean vacia() {
        return (tope == -1);
    }

    public int pop() {
        int x;
        if (this.vacia()) {
            System.out.println("Error. Pila vacia !");
            return -1;
        } else {
            x = pila[tope];
            tope--;
        }
        return x;
    }

    public int getTope() {
        return tope;
    }
    
}
