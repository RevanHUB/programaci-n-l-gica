package com.revanhub._vaciar_repetidos;

/**
 *
 * @author RAVE
 */
public class App {
    
    public static int[] array = {
        0,1,1,2,3,4,6,5,5,8
    };
    
    public static int contarHuecosUtilizables(int[] array) {
        int repetido = 0;
        int contador = 0;
        try {
            for (int i = 0; i <= array.length - 1; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] == array[i]) {
                        repetido++;
                        System.out.println("Comparando Array[i] " + array[i] + " con Array[j] " + array[j]);
                    } else {
                        repetido--;
                    }
                }        
            }
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }

        return repetido;
    }

    public static void main(String[] args) {
        System.out.println(contarHuecosUtilizables(array));
    }
}
