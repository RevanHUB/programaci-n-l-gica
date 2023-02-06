package com.revanhub._vaciar_repetidos;

/**
 *
 * @author RAVE
 */
public class App {
    
    public static int[] array = {
        0,1,1,2,3,4,6,5,5,8,9,9,9,7,7,7,7
    };
    

    public static int[] sinRepetidos(int[] array) {
            int repetido = 0;
            int huecos = 0;
            int[] sinRepetir = new int[0];
            System.out.println("Limpiando array:");
            System.out.println("--------------------");
            try {
               int limpio = 0;
               int acc = -100000;
               //int longitud = (array.length - 1);
                //int pos = (int) (Math.random() * 1 + longitud);
               while (limpio <= array.length) {
                   
                   //System.out.println(longitud);
                  // pos = (int) (Math.random() * 0 + longitud);
                   for (int j = 0; j <= array.length - 1; j++) {
                       if (array[j] != -1) {
                           if (acc != array[j]) {
                                limpio++;
                                acc = array[j];
                            } else {
                                array[j] = -1;
                            }
                       }
                } 
                    if (limpio == 1000) { // lo limpio 100 veces, para confirmar que se limpia bien. 
                        break;
                    }
               }

                for (int i = 0; i <= array.length - 1; i++) {
                    if(array[i] == -1) {
                        huecos++;
                    }
                }
                sinRepetir = new int[array.length - huecos];
                int contadorHueco = 0;
                for (int i = 0; i <= array.length - 1; i++) {
                    if (array[i] != -1) {
                        sinRepetir[contadorHueco] = array[i];
                        contadorHueco++;
                    }
                }
            } catch(Exception e) {
                System.out.println("Error obtenido durante el proceso: " + e);
            }
           
           return sinRepetir;
    }
    
    

    public static void main(String[] args) {
        System.out.println("Sin limpiar:");
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
       int[] sinRepetir = sinRepetidos(array);
        for (int i = 0; i < sinRepetir.length; i++) {
            System.out.println(sinRepetir[i]);
        }
    }
}
