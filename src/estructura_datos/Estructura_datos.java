/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

/**
 *
 * @author eperez50
 */
public class Estructura_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        prueba_pila ppila = new prueba_pila();
        ppila.prueba();
        
        prueba_cola pcola = new prueba_cola();
        pcola.prueba();
        
        prueba_stack pstack = new prueba_stack();
        pstack.prueba();
        
        prueba_stack_iterator pstackite = new prueba_stack_iterator();
        pstackite.prueba();
        
        prueba_queue pqueue = new prueba_queue();
        pqueue.prueba();
        
        prueba_queue_iterator pqueueite = new prueba_queue_iterator();
        pqueueite.prueba();

    }
    
}
