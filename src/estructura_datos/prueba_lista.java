/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import estructura_datos.lista.Lista;

/**
 *
 * @author eperez50
 */
public class prueba_lista {

    public void prueba() {

        System.out.println("--------------------Lista--------------------");
        Lista lista = new Lista();
        System.out.println("insertar -> Brasilia");
        lista.insertar("Brasilia");

        System.out.println("insertar -> Oslo");
        lista.insertar("Oslo");

        System.out.println("insertar -> Ciudad del Cabo");
        lista.insertar("Ciudad del Cabo");

        System.out.println("insertar -> Washington");
        lista.insertar("Washigton");

        System.out.println("insertar -> Lima");
        lista.insertar("Lima");

        System.out.println("Esta vacia la lista?:" + lista.vacia());
        System.out.println("Tamaño de la pila:" + lista.tamano());

        // Buscar
        // Buscar Buenos Aires
        
        // eliminar 
        // eliminar Brasilia
        // eliminar Oslo
        // eliminar Ciudad del Cabo
        // eliminar Washington
        // eliminar Lima

        System.out.println("Esta vacia la lista?:" + lista.vacia());
    }
}
