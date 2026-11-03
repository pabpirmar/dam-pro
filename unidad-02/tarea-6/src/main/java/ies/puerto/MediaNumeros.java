package ies.puerto;
import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class MediaNumeros {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca los numeros para calcular la media");
        String sNumero = teclado.nextLine();
        double resultado = calcularMedia(sNumero);
        System.out.println("La media es: "+resultado);
    }

    /**
     * Funcion que calcula la media de una cadena de numeros
     * @param numeros String de un numero
     * @return double de la media de los numeros
     */
    public static double calcularMedia(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }
        double suma = 0;

        for (int i = 0; i < numeros.length(); i++) {
            char cNumero = numeros.charAt(i);
            String sNumero = String.valueOf(cNumero);
            int numero = Integer.parseInt(sNumero);
            suma = suma + numero;
        }
        int totalNumeros = numeros.length();
        return suma / numeros.length();
    }

}