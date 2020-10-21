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
public interface IPila {
    
    public boolean llena();
    public boolean vacia();
    public void push (int elem);
    public int pop();
    
}
