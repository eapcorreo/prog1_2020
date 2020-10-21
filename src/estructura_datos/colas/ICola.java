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

public interface ICola{
	public boolean llena();
	public boolean vacia();
	public void insertar (Object elem);
	public Object eliminar();
}
