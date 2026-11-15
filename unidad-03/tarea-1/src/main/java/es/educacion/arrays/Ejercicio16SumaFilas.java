package es.educacion.arrays;

/**
 * Clase que suma las filas de un array
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class Ejercicio16SumaFilas {
    private Ejercicio16SumaFilas() { }

    /**
     * Funcion que suma las filas de un array
     * @param matriz int [] de una matriz
     * @return int de la suma
     */
    public static int[] sumarFilas(int[][] matriz) {
       if (matriz == null){
           throw new IllegalArgumentException();
       }
        int[] sumas = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == null){
                throw new IllegalArgumentException();
            }
            for (int num : matriz[i]) {
                sumas[i] = sumas[i] + num;
            }
        }
        return sumas;
    }
}
