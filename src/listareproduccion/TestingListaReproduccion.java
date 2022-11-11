/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listareproduccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class TestingListaReproduccion{
   public static void main(String[] args) throws IOException {
        BufferedReader bufer =  new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        listaLigada<Integer> lista = new listaLigada<>();
        int dato = 0;
        int opcion = 0;
        char respuesta;
        do{
            System.out.println("Elige el la opción que deseas hacer :) ");
            System.out.println("1: Es para hacer una Lista de reproduccion Nueva: ");
            System.out.println("2: Mostrar tu lista final");
            System.out.println("3: comming soon!");
            entrada = bufer.readLine();
            opcion = Integer.parseInt(entrada);
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el Numero de tu lista agregada: ");
                    entrada = bufer.readLine();
                    lista.add(dato);
                    for(;;){//ciclo infinito
                    System.out.println("Escribe un dato entero: ");
                    entrada = bufer.readLine();
                    dato = Integer.parseInt(entrada);
                    lista.add(dato);
                    System.out.println("Se ha agregado el daño a la lista");
                    System.out.println("¿Quieres agregar más datos?(s/n): ");
                    entrada = bufer.readLine();
                    respuesta = entrada.charAt(0);
                    if(respuesta == 'n' || respuesta == 'N')
                        break;
                    }
                    //Agregando al Nodo!
                    lista.add(dato);
                    break;
                case 2:
                    lista.printList();
                    System.out.println("=================================");
                    System.out.println("Contenido de la lista ligada: ");
                    lista.printList();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Lo siento pero esa opción no existe :(");
                    break;
            }
        }while(opcion!=3);
        
            
            
    }
     
}
