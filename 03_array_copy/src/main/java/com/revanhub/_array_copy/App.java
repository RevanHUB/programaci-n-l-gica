

package com.revanhub._array_copy;

import java.util.Arrays;

/**
 * @author RAVE
 */
public class App {
    
    public static Alumnos pepe = new Alumnos("Pedro");
    public static Alumnos carlos =new Alumnos("Carlos");
    public static Alumnos chema = new Alumnos("Chemita");
    public static Alumnos marcos = new Alumnos("Marcos");
    
    public static Alumnos[] alumnos = {
        pepe,
        carlos,
        chema,
        marcos
    };
    
    
   public static final int LONGITUD = alumnos.length;
    
    public static Alumnos[] copiaDeAlumnos = new Alumnos[LONGITUD];

    public static void main(String[] args) {
        copiaDeAlumnos = Arrays.copyOf(alumnos, LONGITUD);

      
        
        
          System.arraycopy(alumnos, 0, copiaDeAlumnos, 0, LONGITUD);
          copiaDeAlumnos[0].setNombre("Hermione");
         
        System.out.println("--------------");
      
         for (int i = 0; i < copiaDeAlumnos.length; i++) {
            System.out.println(copiaDeAlumnos[i].getNombre());
        }
         
         
    }
}
