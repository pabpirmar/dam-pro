package es.educacion.arrays;

import java.util.Arrays;

// Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    // Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
    public static int[] sinDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int [] noRepetidos = Arrays.copyOf(numeros, numeros.length);
        int[] sinDuplicados = new int[numeros.length];
        int cantidadUnicos = 0;


        for (int i = 0; i < numeros.length; i++) {
            int numeroActual = numeros[i];
            boolean yaExiste = false;

            for (int j = 0; j < cantidadUnicos; j++) {
                if (sinDuplicados[j] == numeroActual) {
                    yaExiste = true;
                    break;
                }
            }
            if (!yaExiste) {
                sinDuplicados[cantidadUnicos] = numeroActual;
                cantidadUnicos++;
            }
        }
        return Arrays.copyOf(sinDuplicados, cantidadUnicos);
    }
}
