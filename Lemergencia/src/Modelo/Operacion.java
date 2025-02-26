/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Karol
 */
public class Operacion  {
    
   
     public static <T extends Base> Implementacion<T> pilaDuplicada(Implementacion<T> pilaOriginal){
        Implementacion<T> pilaDuplicada=new Implementacion<>();
        Implementacion<T> pilaAuxiliar=new Implementacion<>();
       
        while (!pilaOriginal.estaVacia()) {            
         T elemento = pilaOriginal.desapilar(); 
          pilaAuxiliar.aPilar(elemento);
        }

        while (!pilaAuxiliar.estaVacia()) {    
            
            T elemento=pilaAuxiliar.desapilar();
            T elementoCopiado= (T) elemento.copy();

            pilaDuplicada.aPilar(elemento);
            
            pilaOriginal.aPilar(elementoCopiado);
        }
        
        
        return pilaDuplicada;
    }
        public static <T extends Base> int contarElementos(Implementacion<T> pilaOriginal){
            int cantidadElementos=0;
            Implementacion<T> pilaDuplicada=pilaDuplicada(pilaOriginal);
            
            while (!pilaDuplicada.estaVacia()) {                
                cantidadElementos++;
                pilaDuplicada.desapilar();
            }
                       
            return cantidadElementos;
        } 
}
