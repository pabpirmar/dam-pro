import java.util.Scanner;
/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class Vocales {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadena = teclado.nextLine();
        int resultado = contarVocales(cadena);
        System.out.println("El numero de vocales es: " + resultado);

    }

    /**
     * Funcion que cuenta las vocales de una cadena
     * @param sCadena int de la cadena
     * @return int del resultado
     */
    static int contarVocales(String sCadena) {
        if (sCadena == null || sCadena.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            switch (caracter) {
                case 'a': case 'á': case 'e': case 'é': case 'i': case 'í': case 'o': case 'ó': case 'u': case 'ú':
                    resultado = resultado +1;
            }

        }

        return resultado;
    }

    /**
     * Funcion2 que cuenta las vocales
     * @param sCadena int de la cadena
     * @return int del resultado
     */
    static int contarVocales2(String sCadena) {
        if (sCadena == null || sCadena.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (caracter == 'a' || caracter == 'á' || caracter == 'e' || caracter == 'é' || caracter == 'i' ||
                    caracter == 'í' || caracter == 'o' || caracter == 'ó' || caracter == 'u' || caracter == 'ú') {
                resultado = resultado +1;
            }
        }

        return resultado;
    }
}
