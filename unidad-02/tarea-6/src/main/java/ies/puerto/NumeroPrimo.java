package ies.puerto;

import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        String sNumero = teclado.nextLine();
        boolean bNumero = esPrimo(sNumero);
        System.out.println("¿El numero es primo?: "+bNumero);
    }

    /**
     * Funcion que calcula si un numero es primo
     * @param sNumero String de un numero
     * @return boolean del resultado
     */
    public static boolean esPrimo(String sNumero) {
        if (sNumero == null || sNumero.isEmpty()) {
            return false;
        }
        int numero = Integer.parseInt(sNumero);
        if (numero ==  2 || numero == 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0){
            return false;
        }
            for (int i = 5; i * i <= numero; i += 6) {
                if (numero % i == 0 || numero % (i + 2) == 0) {
                    return false;
                }
            }
        return true;
    }

}
