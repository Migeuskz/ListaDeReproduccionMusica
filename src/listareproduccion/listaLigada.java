/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listareproduccion;

/**
 *
 * @author Mikey
 */
public class listaLigada <T>{
    private Nodo head;//Apuntador a la cabecera de la lista (primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (último nodo)
    private int size;//tamaño de la lista (número de nodos en la lista)
    private Nodo actual;//Apuntador al nodo sleccionado actualmente 
    
    public listaLigada(){
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }
    
    //Metodo para agregar un Nodo al inicio de la Lista
    public void add(T dato){
        Nodo nuevoNodo = new Nodo(dato);
        //Creando al Nodo
        this.head = new Nodo(dato, head);
        if(tail == null ){//la lista está vacía, creamos el primer nodo
            tail=head;
        }
        
    }
    
    public void add(T dato,int posicion){
        Nodo nuevoNodo = new Nodo(dato);
        int i = 1;
        actual = head;
        while(i < posicion -1){
            actual = actual.getSiguiente();
            i++;
        }
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);//es el que enlaza
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    //metodo para mostrar los datos
    public void printList(){
        Nodo recorrer = head;
        actual = head;
        while(recorrer != null){
            System.out.println("Dato= " + recorrer.getDato());
            recorrer=recorrer.getSiguiente();
        }
    }
}
