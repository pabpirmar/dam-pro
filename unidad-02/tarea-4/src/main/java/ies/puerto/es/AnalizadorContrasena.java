package ies.puerto.es;

import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class AnalizadorContrasena {

    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cadena");
        String sCadena = teclado.nextLine();
        String resultado = generarInforme(sCadena);
        System.out.println(resultado);
    }

    /**
     * Funcion que cuenta el numero de mayusculas de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de mayusculas
     */
    static int contarMayusculas(String sCadena) {
        int numero = 0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isAlphabetic(caracter) && Character.isUpperCase(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de minusculas de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de minusculas
     */
    static int contarMinusculas(String sCadena) {
        int numero = 0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isAlphabetic(caracter) && !Character.isUpperCase(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de digitos de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de digitos
     */
    static int contarDigitos(String sCadena) {
        int numero = 0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de simbolos de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de simbolos
     */
    static int contarSimbolos(String sCadena) {
        int numero = 0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (!Character.isLetterOrDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta la longitud minima de una cadena
     * @param sCadena String cadena de texto
     * @return false/true si cumple con la longitud minima
     */
    static boolean tieneLongitudMinima(String sCadena) {
        if (sCadena.length()<8) {
            return false;
        }
        return true;
    }

    /**
     * Funcion que verifica si la contrasenia es valida
     * @param sCadena String cadena de texto
     * @return false/true si es valido
     */
    static boolean esContrasenaValida(String sCadena) {
        if (!tieneLongitudMinima(sCadena)) {
            return false;
        }
        if (contarMayusculas(sCadena) < 1) {
            return false;
        }
        if (contarMinusculas(sCadena) < 1) {
            return false;
        }
        if (contarDigitos(sCadena) < 1) {
            return false;
        }
        if (contarSimbolos(sCadena) < 1) {
            return false;
        }

        return true;
    }

    static String generarInforme(String sCadena) {
        return  "Dígitos:"+contarDigitos(sCadena) + "Resultado:"+esContrasenaValida(sCadena);
    }
}

