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
        
        int dato;
        char respuesta;
        
            listaLigada<String>lista = new listaLigada<>();
            System.out.println("=====Creando una lista de reproduccion=====");
            for(;;){
                System.out.println("Escriba el nombre de la cancion: ");
                entrada = bufer.readLine();
                lista.add(entrada);
                System.out.println("¿Quieres insertar más datos? ");
                entrada = bufer.readLine();
                respuesta = entrada.charAt(0);
                if(respuesta == 'n' || respuesta == 'N')
                    break;
            }
            
            System.out.println("=================================");    
            System.out.println("¿Quieres insertar una nueva canción? ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if(respuesta == 'n' || respuesta == 'N'){
             
            System.out.println("=================================");
            for(;;){
            System.out.println("Inserción de un nuevo nodo");
            System.out.println("Escribe la cancion que quieres agregar: ");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            System.out.println("Escriba la posición en donde quieres poner tu canción: ");
            entrada = bufer.readLine();
            lista.add(entrada, dato);
            System.out.println("¿Quieres insertar más datos? ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if(respuesta == 'n' || respuesta == 'N')
                break;
            }
            }
            System.out.println("=================================");
            System.out.println("Contenido de tu lista de reproduccion: ");
            lista.printList();
            
            
            
    }
     
}
