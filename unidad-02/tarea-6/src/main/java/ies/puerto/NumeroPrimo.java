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
        boolean resultado = esPrimo(sNumero);
        System.out.println("¿El numero es primo?: "+resultado);
    }

    /**
     * Funcion que comprueba si un numero es primo
     * @param sNumero String de un numero
     * @return boolean true/false
     */
    public static boolean esPrimo(String sNumero) {
        if (sNumero == null || sNumero.isEmpty()) {
            return false;
        }
        int iNumero = Integer.parseInt(sNumero);
        if (iNumero < 2) {
            return false;
        }
        for (int i = 2; i * i <= iNumero; i++) {
            if (iNumero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
