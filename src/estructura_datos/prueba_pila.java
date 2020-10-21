/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import estructura_datos.pilas.Pila;

/**
 *
 * @author eperez50
 */
public class prueba_pila {

    public void prueba() {

        System.out.println("--------------------Pila--------------------");
        Pila pila = new Pila();
        System.out.println("push -> 1");
        pila.push(1);

        System.out.println("push -> 2");
        pila.push(2);

        System.out.println("push -> 3");
        pila.push(3);

        System.out.println("push -> 4");
        pila.push(4);

        System.out.println("Esta vacia la pila?:" + pila.vacia());
        System.out.println("Tamaño de la pila:" + pila.getTope());

        System.out.println("pop -> " + pila.pop());
        System.out.println("Tope:" + pila.getTope());

        System.out.println("pop -> " + pila.pop());
        System.out.println("Tope:" + pila.getTope());

        System.out.println("pop -> " + pila.pop());
        System.out.println("Tope:" + pila.getTope());

        System.out.println("pop -> " + pila.pop());
        System.out.println("Tope:" + pila.getTope());

        System.out.println("Esta vacia la pila?:" + pila.vacia());
    }
}
