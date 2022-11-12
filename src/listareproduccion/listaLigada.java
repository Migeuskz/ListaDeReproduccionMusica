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
    private Nodo inicio;//Apuntador a la cabecera de la lista (primer nodo)
    private Nodo fin;//Apuntador a la cola de la lista (último nodo)
    private int tam;//tamaño de la lista (número de nodos en la lista)
    private Nodo actual;//Apuntador al nodo sleccionado actualmente 
    
    public listaLigada(){
        this.inicio = null;
        this.actual = null;
        this.fin = null;
        this.tam = 0;
    }
    
    public void add(T dato){
        Nodo nuevoNodo = new Nodo(dato);
        this.tam++;
        this.fin = nuevoNodo;//se mueve el apuntador al último nodo
        
        if(inicio == null ){//la lista está vacía, creamos el primer nodo
            inicio = nuevoNodo;
            actual = inicio;
        }
        else{
            actual.setSiguiente(nuevoNodo);//actual.sig apunta al nuevoNodo (enlace entre nodos)
            actual = nuevoNodo;//ahora actual es el nuevo Nodo
        }
    }
    
    public void add(T dato,int posicion){
        Nodo nuevoNodo = new Nodo(dato);
        int i = 1;
        actual = inicio;
        while(i < posicion -1){
            actual = actual.getSiguiente();
            i++;
        }
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);//es el que enlaza
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    
    //Metodo para eliminar un Nodo del inicio
    public int borrarInicio(){
        int elemento = (int) inicio.getDato();
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.getSiguiente();
        }
        return elemento;
    }
    
    public void printList(){
        int posicion = 1;
        actual = inicio;
        while(actual != null){
            T elemento =(T) actual.getDato();
            System.out.println("Dato= " + elemento + " almacenado en nodo: " + posicion);
            actual = actual.getSiguiente();
            posicion++;
        }
    }
    
}
