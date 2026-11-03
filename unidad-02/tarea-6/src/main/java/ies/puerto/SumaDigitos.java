package ies.puerto;

import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca los numeros");
        String sNumero = teclado.nextLine();
        double resultado = SumarDigitos(sNumero);
        System.out.println("La suma es: "+resultado);
    }

    /**
     * Funcion que suma los digitos
     * @param numeros String de un numero
     * @return double de la suma
     */
    public static int SumarDigitos(String numeros) {
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
        return (int) suma;
    }
}
