/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos.lista;

/**
 *
 * @author eperez50
 */
public class Lista implements ILista {

    class Nodo {

        public String dato;
        public Nodo enlace;

        Nodo(String n) {
            dato = n;
            enlace = null;
        }
    }
    Nodo inicio;

    public Lista() {
        inicio = null;
    }

    public boolean vacia() {
        return (inicio == null);
    }

    public int tamano() {
        int n = 0;
        Nodo temporal = inicio;
        while (temporal != null) {
            n++;
            temporal = temporal.enlace;
        }
        return n;
    }

    public boolean buscar(String elemento) {
        Nodo temporal = inicio;
        while (temporal != null) {
            if (elemento.equals(temporal.dato)) {
                return true;
            } else {
                temporal = temporal.enlace;
            }
        }
        return false;
    }

    public String recorrer() {
        return "";
    }

    public void insertar(String elemento) {
        Nodo n = new Nodo(elemento);
        // donde se inserta???
        // al frente?
        // al final?
        // en el medio?
    }

    public boolean eliminar(String elemento) {
        // elimina a un elemento especifico
        return false;
    }

    public String eliminar() {  // elimina el primer elemento
        String temporal = inicio.dato;
        inicio = inicio.enlace;
        return temporal;
    }
}
