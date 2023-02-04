
package com.revanhub._interchanging_array_pos;

/**
 * @author RevanHub
 */

public class App {


    public static int[][] array = {
        {
            1,2,3,4
        },
        {
            5,6,7,8
        },
        {
            9,10,11,12
        },
        {
            13,14,15,16
        }
        
    };
    public static void leerArray(int[][] array) {
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j]);
            }
             System.out.println("");
         }
    }
    
    public static int[][] transponerArray(int[][] array) {
        int acc = 0;
        int seleccionado = 0;
        int contador = 0;
        for (int i = 0; i <= array.length - 1 ; i++) {
            for (int j = 0; j <= array[i].length - 1 ; j++) {
                if( j == seleccionado) {
                    System.out.println("Seleccionado :" + seleccionado);
                    for (int k = seleccionado; k <= array[i].length - 1; k++) {
                        contador = k + 1;
                        System.out.println("K: " + k);
                        
                        if (contador <= array.length - 1) {
                             acc = array[seleccionado][contador];
                            array[seleccionado][contador] = array[contador][seleccionado];
                            array[contador][seleccionado] = acc;
                            System.out.println("Cambio:  " + array[seleccionado][contador]+ "  por " + acc);
                        }                        
                    }
                    //contador++;
                }
                if (seleccionado == array.length - 1) {
                    seleccionado = 0;
                }
                  seleccionado++;
            }
          
        }
        return array;
    }
    
    public static void main(String[] args) {
        leerArray(array);
        array = transponerArray(array);
        System.out.println("----");
        leerArray(array);
    }
}
