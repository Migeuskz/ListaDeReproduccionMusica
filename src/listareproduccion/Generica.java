/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listareproduccion;

/**
 *
 * @author Mikey
 */
public class Generica<T>{
    //T es un tipo de dato abstracto que será reemplazado al momento de usar la clase
    T objeto;//Objeto es tipo T
    
    //Constructor
    public Generica(T o){
        this.objeto = o;
    }
    
    public T getObjeto(){
        return this.objeto;
    }
    
    public void setObjeto(T o){
        this.objeto = o;
    }
    
    //Muestra el tipo de dato efectivo con el que trabaja el objeto de esta clase
    public void getType(){
        System.out.println("El tipo T efectivo es: " + this.objeto.getClass().getName());
    }
}
