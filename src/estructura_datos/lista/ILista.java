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
public interface ILista{ 
     public void insertar(String elemento);
     public boolean eliminar(String elemento);
     public String eliminar();
     public boolean buscar(String elemento);
     public String recorrer();
     public boolean vacia();
     public int tamano();
 } 
