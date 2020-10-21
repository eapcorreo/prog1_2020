/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import estructura_datos.colas.Cola;

/**
 *
 * @author eperez50
 */
public class prueba_cola {

    public void prueba() {

        System.out.println("--------------------Cola--------------------");
        Cola cola = new Cola(5);
        System.out.println("insertar -> 1");
        cola.insertar(1);

        System.out.println("insertar -> 2");
        cola.insertar(2);

        System.out.println("insertar -> 3");
        cola.insertar(3);

        System.out.println("insertar -> 4");
        cola.insertar(4);
        
        System.out.println("Esta vacia la cola?: " + cola.vacia());
        System.out.println("Tamaño de la cola: " + cola.ocupacion());

        System.out.println("eliminar -> " + cola.eliminar());
        System.out.println("Ocupacion: " + cola.ocupacion());

        System.out.println("eliminar -> " + cola.eliminar());
        System.out.println("Ocupacion: " + cola.ocupacion());

        System.out.println("eliminar -> " + cola.eliminar());
        System.out.println("Ocupacion: " + cola.ocupacion());

        System.out.println("eliminar -> " + cola.eliminar());
        System.out.println("Ocupacion: " + cola.ocupacion());

        System.out.println("Esta vacia la cola: " + cola.vacia());
    }
}
