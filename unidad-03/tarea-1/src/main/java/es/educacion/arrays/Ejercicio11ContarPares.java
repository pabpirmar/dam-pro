package es.educacion.arrays;

// Ejercicio 11. Cuenta los elementos pares, incluidos cero y negativos. Array vacío: 0. Null: IllegalArgumentException.
// TODO: escribir el Javadoc de la clase, del método, sus parámetros y retorno.
public final class Ejercicio11ContarPares {
    private Ejercicio11ContarPares() { }


    public static int contarPares(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int pares = 0;
        for (int numero:numeros) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}
