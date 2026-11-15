package es.educacion.arrays;

// Ejercicio 13. Devuelve cuántas veces aparece un valor. Se admiten negativos y ceros. Null: IllegalArgumentException.
// TODO: escribir el Javadoc de la clase, del método, sus parámetros y retorno.
public final class Ejercicio13Frecuencia {
    private Ejercicio13Frecuencia() { }

    // Contrato: Devuelve cuántas veces aparece un valor. Se admiten negativos y ceros. Null: IllegalArgumentException.
    public static int frecuencia(int[] numeros, int objetivo) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int cantidadFrecuencia = 0;
        for (int numero:numeros){
            if (numero == objetivo){
                cantidadFrecuencia++;
            }
        }
        return cantidadFrecuencia;
    }
}
