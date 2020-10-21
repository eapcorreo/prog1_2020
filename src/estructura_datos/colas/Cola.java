/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos.colas;

/**
 *
 * @author eperez50
 */

public class Cola implements ICola {

    private Object[] cola;
    private int frente = -1;
    private int fin = -1;
    private int size;

    public Cola(int s) {
        size = s - 1;
        cola = new Object[s];
    }

    public boolean vacia() {
        return (frente == -1);
    }

    public boolean llena() {
        return (fin == size);
    }

    public void insertar(Object elem) {
        if (frente == -1) {
            frente++;
        } else if (fin == size) {
            System.out.println("Error. Cola llena !");
            return;
        }
        fin++;
        cola[fin] = elem;
    }
    
    public Object eliminar(){
        Object ret;
        if (frente == -1) {
            System.out.println("Error. Cola vacia !");
            return null;
        }
        else {
              ret = cola[frente];
              frente++;
              if (frente > fin) {
                  frente=-1;
                  fin=-1;
              }
        }
        return ret;
    }
    
    public int ocupacion() {
        int ocupa = 0;
        if (vacia()) {
            return 0;
        }
        else {
           ocupa = fin-frente+1;
        }
        return ocupa;
    }
}
